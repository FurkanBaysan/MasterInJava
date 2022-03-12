import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\t" + " 0 - To Print the Choice Options");
        System.out.println("\t" + " 1 - To Print the List of Grocery items");
        System.out.println("\t" + " 2 - To add an item to the Grocery List");
        System.out.println("\t" + " 3 -To modify an item in the List");
        System.out.println("\t" + " 4 - To remove an item from the List");
        System.out.println("\t" + " 5 - To search for an item in the List");
        System.out.println("\t" + " 6 - To quit the Application");
    }

    public static void addItem() {
        System.out.print("Please Enter the Grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    //    public static void modifyItem() {
//        System.out.print("Enter Item Number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Enter the Replacement Item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo - 1, newItem);
//    }
    public static void modifyItem() {
        System.out.println("Enter the Current Item: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter the Replacement Item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    //    public static void removeItem() {
//        System.out.print("Enter Item Number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo - 1);
//    }
    public static void removeItem() {
        System.out.println("Enter the Item: ");
        String currentItem = scanner.nextLine();
        groceryList.removeGroceryItem(currentItem);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        //groceryList.findItem(searchItem);
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not on file.");
        }
    }

    public static void processArrayList() {
        //First Way of Copying ArrayList's
        ArrayList<String> newGroceryArrayList = new ArrayList<String>();
        newGroceryArrayList.addAll(groceryList.getGroceryList());

        //Second Way of Copying ArrayList's
        //ArrayList<String> nextGroceryArrayList =
        //new ArrayList<String>(groceryList.getGroceryList());

        //Third Way of Copying ArrayList's
        //Copying ArrayList Contents,Converting back to a Regular Array and Holding by a Regular Array
        /*
        String[] groceryListArray = new String[groceryList.getGroceryList().size()];
        groceryListArray = groceryList.getGroceryList().toArray(groceryListArray); //toArray(new String[groceryListArray.length])

        System.out.println("Shopping list elements copied successfully.");
        for (int i = 0; i < groceryListArray.length; i++) {
            System.out.println(groceryListArray[i]);
        }
        */
    }
}
