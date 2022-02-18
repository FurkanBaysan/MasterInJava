public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "-- Sorted Array Exercise --");
        int[] inputHolderArray;
        inputHolderArray = SortedArray.getIntegers(5);
        System.out.println("\t" + "Printing Unsorted Array");
        SortedArray.printArray(inputHolderArray);
        SortedArray.sortIntegers(inputHolderArray);
        System.out.println("\t" + "Printing Sorted Array");
        SortedArray.printArray(inputHolderArray);
        System.out.println("\t" + "-- Minimum Element Exercise --");
        int returnedCount = MinimumElement.readInteger();
        int[] returnedArray = MinimumElement.readElements(returnedCount);
        int returnedMinimum = MinimumElement.findMin(returnedArray);
        System.out.println("Minimum Element: " + returnedMinimum);
        System.out.println("\t" + "-- Reverse Array Challenge --");
        int[] originalArray = new int[]{1, 2, 3, 4, 5};
        ReverseArray.reverse(originalArray);
    }
}
