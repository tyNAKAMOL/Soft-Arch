public class BookReader implements BookScreenPrinter {
    private BookPrinter books;

    public BookReader(BookPrinter books) {
        super();
        this.books = books;
    }

    @Override
    public void printToScreen() {
        books.printToScreen();
    }
}