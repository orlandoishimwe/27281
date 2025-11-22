package Orl27281.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN) throws DataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        if (title == null || title.isEmpty()) throw new DataException("Book title required");
        if (author == null || author.isEmpty()) throw new DataException("Author required");
        if (ISBN == null || ISBN.length() < 10) throw new DataException("ISBN must be ≥ 10 characters");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}
