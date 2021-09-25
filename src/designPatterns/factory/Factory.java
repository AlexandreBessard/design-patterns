package designPatterns.factory;

import static designPatterns.factory.PlanType.COMMERCIALPLAN;

/*
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object
but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the
instance of the class.
 */
public class Factory {

    abstract static class Plan {
        protected double rate;
        abstract void getRate();
        public void calculBill(int units) {
            System.out.println(units * rate);
        }
    }

    static class DomesticPlan extends Plan {
        @Override
        void getRate() {
            super.rate = 3.50;
        }
    }

    static class CommercialPlan extends Plan {
        @Override
        void getRate() {
            super.rate = 7.50;
        }
    }

    static class InstitutionalPlan extends Plan {
        @Override
        void getRate() {
            super.rate = 5.50;
        }
    }

    public static void main(String[] args) {

        GetPlanFactory planFactory = new GetPlanFactory();
        Plan commercial = planFactory.getPlan(COMMERCIALPLAN);
        commercial.getRate();
        commercial.calculBill(10);

    }
}
