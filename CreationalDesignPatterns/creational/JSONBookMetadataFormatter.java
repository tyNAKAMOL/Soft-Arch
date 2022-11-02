package creational;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
        // fit.

        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see
        // fit.

        JSONObject jsonObject = new JSONObject();

        jsonObject.put(Book.Metadata.ISBN.value, b.getISBN());
        jsonObject.put(Book.Metadata.TITLE.value, b.getTitle());
        jsonObject.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        JSONArray authors = new JSONArray();
        for (String author : b.getAuthors()) {
            authors.add(author);
        }

        jsonObject.put(Book.Metadata.AUTHORS.value, authors);
        jsonArray.add(jsonObject);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        return jsonArray.toString();

    }
}