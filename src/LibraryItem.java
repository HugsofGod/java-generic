/**
 * LibraryItem represents a generic item in a library with common attributes.
 */
public class LibraryItem {
    private String title;
    private String author;
    private String itemID;

    /**
     * Constructor to initialize the library item with title, author, and item ID.
     *
     * @param title the title of the item
     * @param author the author of the item
     * @param itemID the unique ID of the item
     */
    public LibraryItem(String title, String author, String itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    /**
     * Gets the title of the item.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the item.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the item ID.
     *
     * @return the item ID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Returns a string representation of the library item.
     *
     * @return a string representation of the item
     */
    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", itemID='" + itemID + '\'' +
                '}';
    }
}
