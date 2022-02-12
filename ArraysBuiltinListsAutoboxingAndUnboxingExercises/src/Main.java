public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "Sorted Array Exercise --");
        int[] inputHolderArray;
        inputHolderArray = SortedArray.getIntegers(5);
        System.out.println("\t" + "Printing Unsorted Array");
        SortedArray.printArray(inputHolderArray);
        SortedArray.sortIntegers(inputHolderArray);
        System.out.println("\t" + "Printing Sorted Array");
        SortedArray.printArray(inputHolderArray);
    }
}
