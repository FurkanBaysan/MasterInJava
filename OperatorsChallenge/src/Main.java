public class Main {

    public static void main(String[] args) {
        System.out.println("-- Operators Challenge Solution--");

        double firstNumber = 20.00;
        double secondNumber = 80.00;

        double total = (100 * (firstNumber + secondNumber));
        System.out.println("Total:" + total);
        double remainderOperationResult = total % 40.00;
        System.out.println("Mod Operation Result:" + remainderOperationResult);

        boolean isFirstBoolean; // no initializing needed.
        if (remainderOperationResult == 0) {
            isFirstBoolean = true;
        } else
            isFirstBoolean = false;
        // Shortcut of above conditional block -> isFirstBoolean = remainderOperationResult == 0;


        System.out.println("Because of the Mod Operation Result is 0, boolean variable is:" + isFirstBoolean);

        if (remainderOperationResult != 0)
            System.out.println("Got some remainder");
        /*
        Remark : Above of this remark, the expression/condition of
        the conditional block typed be also isFirstBoolean==false or !isFirstBoolean .
         */
    }
}
