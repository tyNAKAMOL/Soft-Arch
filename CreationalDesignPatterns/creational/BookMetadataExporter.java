package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws Exception {
        // Please implement this method. You may create additional methods as you see
        // fit.

        BookMetadataFormatter formatter = create_book();
        for (Book bookadd : books) {
            formatter.append(bookadd);
        }
        System.out.print(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter create_book() throws Exception;

}