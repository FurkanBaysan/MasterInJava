import java.util.ArrayList;

class IntClass { //The object what ArrayList holds
    private int number;

    public IntClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Arrays and ArrayLists Recap --");

        String[] texts = new String[10];
        int[] intNumbers = new int[10];

        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Masterclass");

        //What we can't do is,
        //  ArrayList<int> evenNumbers =
        //  new ArrayList<int>(); // We get an Error.
        // Error: Type argument can not be of primitive type.


        //What we could do for example,
        System.out.println("Solution 1: Writing Our Own Wrapper Class and " +
                "Add objects of that Class");
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(5));
        System.out.println(intClassArrayList.get(0)); //Bu bir IntClass nesnesi dondurur.
        System.out.println(intClassArrayList.get(0).getNumber());

        System.out.println("Solution 2: Autoboxing");
        // Wrapper Classes
        Integer secondNumber = new Integer(5);
        Double fractionalNumber = new Double(12.25);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            numbers.add(Integer.valueOf(i)); // Autoboxing
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "->" + numbers.get(i).intValue());//Unboxing
        }

        System.out.println();

        Integer number = 56; //Integer.valueOf(56) => Autoboxing.
        int thirdNumber = number;// number.intValue() => Unboxing.

        ArrayList<Double> discountRates = new ArrayList<Double>();
        for (double i = 0.0; i <= 10.0; i = i + 0.5) {
            discountRates.add(Double.valueOf(i)); // Autoboxing
            //discountRates.add(i); also compile and run.
        }
        for (int i = 0; i < discountRates.size(); i++) {
            double value = discountRates.get(i).doubleValue(); // Unboxing
            //double value=discountRates.get(i); also compile and run.
            System.out.println(i + " => " + value);
        }
    }
}
