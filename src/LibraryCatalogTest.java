public class LibraryCatalogTest {
    public static void main(String[] args) {
        GenericCatalog<LibraryItem> catalog = new GenericCatalog<>();

        LibraryItem book = new LibraryItem("Effective clifford Java", "Clifford Bloch", "B001");
        LibraryItem dvd = new LibraryItem("Inception", "Christopher Nolan", "D001");

        // Test adding items
        catalog.addItem(book);
        catalog.addItem(dvd);

        // Test retrieving items
        assert catalog.getItem(0).equals(book) : "Test failed for retrieving book";
        assert catalog.getItem(1).equals(dvd) : "Test failed for retrieving DVD";

        // Test removing items
        assert catalog.removeItemById("B001") : "Test failed for removing book";
        assert !catalog.removeItemById("B002") : "Test failed for non-existent item";

        // Test viewing items
        for (LibraryItem item : catalog.getAllItems()) {
            System.out.println(item);
        }

        System.out.println("All tests passed.");
    }
}
