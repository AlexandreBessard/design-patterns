package designPatterns.strategy;

public class Main {

    public static void main(String[] args) {

        Context add = new Context(new OperationAdd());
        Context substract = new Context(new OperationSubstract());

        System.out.println(add.executeStrategy(1, 1));
        System.out.println(substract.executeStrategy(1, 1));

    }

}
