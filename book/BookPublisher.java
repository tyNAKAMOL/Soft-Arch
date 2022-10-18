public class BookPublisher implements BookFilePrinter {
    private BookPrinter books;

    public BookPublisher(BookPrinter books) {
        super();
        this.books = books;
    }

    @Override
    public void printToFile() {
        books.printToFile();
    }
}