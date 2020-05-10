package learning.withInterface;

public class InterfaceRunner {

    public static void main(String[] args) {

        Vehicle vh = new Bicycle();

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

    }

}
