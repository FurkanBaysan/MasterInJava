public class Main {

    public static void main(String[] args) {
        // 8 Primitive Data Types->//byte,short,long,int,float,double,char and boolean.
        // Frequently used of these are -> int,double and boolean.

        System.out.println("--Strings--");
        String myCourse = "OOP with Java"; // usage is similar to Primitive Types.
        System.out.println("My First Udemy Course:" + myCourse);

        System.out.println("--String Concatenation--");
        myCourse = "My first Udemy Course will be" + " " + myCourse + " " + "and the second course will be the Data Structures and Algorithms";
        System.out.println(myCourse);

        System.out.println("--String Concatenation with Unicode Characters--");
        String movie = "The Lord of the Rings";
        movie = movie + " " + "\u00A9 2003";
        System.out.println(movie);

        System.out.println("-- Numbers in Double Quotes are also String--");
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        System.out.println("--Integer,Double append to a String Case--");
        String lastString = "10";
        int integerNumber = 50;
        lastString = lastString + integerNumber;
        System.out.println("integer append to a String:" + " " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("double also append to a string:" + " " + lastString);


        // Remark : Strings in Java are Immutable.
        // That means, we can't change a String after it's constituted.
        //Instead what happens is a new String is created.

        // Eg. lastString =lastString+doubleNumber;
        // lastString points a new location in RAM, and
        // that location lastString points -> the current String data that lastString points +
        // text representation of doubleNumber.
        // Namely, a new String is constituted in another location of RAM and lastString refers that location.


    }
}
