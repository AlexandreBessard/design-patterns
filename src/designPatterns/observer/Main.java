package designPatterns.observer;

/*
This pattern is a one-to-many dependency between objects so that when one object changes state, all its dependents are
notified. This is typically done by calling one of their methods.
 */
public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(10);

        System.out.println("<====> Second state change <====>");

        subject.setState(20);
    }
}
