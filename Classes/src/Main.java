public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "Object-Oriented Programming");

        Car firstCar = new Car();
        firstCar.setModel("Audi");
        System.out.println("Model: " + firstCar.getModel());
        Car secondCar = new Car();
        secondCar.setModel("Mercedes");
        System.out.println("Model: " + secondCar.getModel());

    }
}
