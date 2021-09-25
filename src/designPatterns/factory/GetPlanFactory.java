package designPatterns.factory;

public class GetPlanFactory {

    public Factory.Plan getPlan(PlanType planType) {

        if(planType.equals(PlanType.DOMESTICPLAN)) {
            return new Factory.DomesticPlan();
        }
        if(planType.equals(PlanType.COMMERCIALPLAN)) {
            return new Factory.CommercialPlan();
        }
        if(planType.equals(PlanType.INSTITUTIONALPLAN)) {
            return new Factory.InstitutionalPlan();
        }
        return null;
    }

}
