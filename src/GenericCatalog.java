import java.util.List;
import java.util.ArrayList;


public class GenericCatalog<T> {
    private List<T> items;  // List to hold library items

    /**
     * Constructor to initialize the catalog with an empty list.
     */
    public GenericCatalog() {
        items = new ArrayList<>();
    }

    /**
     * Adds a new item to the catalog.
     *
     * @param item the item to add
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Removes an item from the catalog.
     *
     * @param item the item to remove
     * @return true if the item was removed, false otherwise
     */
    public boolean removeItem(T item) {
        return items.remove(item);
    }

    /**
     * Retrieves an item from the catalog by its index.
     *
     * @param index the index of the item to retrieve
     * @return the item at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    /**
     * Retrieves all items from the catalog.
     *
     * @return a list of all items in the catalog
     */

    public List<T> getAllItems() {
        return new ArrayList<>(items);
    }

    /**
     * Removes an item from the catalog by its ID.
     *
     * @param itemId the ID of the item to remove
     * @return true if the item was found and removed, false otherwise
     */
    public boolean removeItemById(String itemId) {
        for (T item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libraryItem = (LibraryItem) item;
                if (libraryItem.getItemID().equals(itemId)) {
                    items.remove(item);
                    return true;
                }
            }
        }
        return false;
    }
}
