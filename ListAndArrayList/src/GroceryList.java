import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("Number of items in the Grocery List: " +
                groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." +
                    "item" + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int currentItemPosition = findItemPosition(currentItem);
        if (currentItemPosition >= 0) {
            modifyGroceryItem(currentItemPosition, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) +
                " has been modified.");
    }

    public void removeGroceryItem(String currentItem) {
        int position = findItemPosition(currentItem);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        //String item = groceryList.get(position);
        groceryList.remove(position);
    }

    private String findItem(String searchItem) {
        String result = "";
        for (int i = 0; i < groceryList.size(); i++) {
            if (searchItem.equals(groceryList.get(i))) {
                //System.out.println("Searching Element Found in Position: " + i);
                //System.out.println("Searching element: " + groceryList.get(i));
                result = groceryList.get(i);
            }
        }
        return result;
    }

    //  -- Alternative Way of finding an item (element) in the List --
    //  In other words,
    //  -- Alternative inner implementation of findItem(searchItem) Method --

//    public String findItem(String searchingItem) {
//        int position = groceryList.indexOf(searchingItem);
//        if (position >= 0) {
//            return groceryList.get(position); //Returns the element at specified index.
//        }
//        return null;
//    }

    private Integer findItemPosition(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        return position;
        // The structure below is also suitable, but the current structure
        // is more professional.
        //        if (position >= 0) {
        //            return position;
        //        }
        //        return null;
    }

    public boolean onFile(String searchItem) {
        String searchingItem = findItem(searchItem);
        if (groceryList.contains(searchingItem)) {
            return true;
        }
        return false;
    }

}