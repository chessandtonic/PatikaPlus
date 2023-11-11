package week5.BookSorter;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private int publicationDate;

    public Book(String title, int pageCount, String author, int publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    // Sorting by name
    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "'Title:'" + title + '\'' +
                ", Page Count:" + pageCount +
                ", author:'" + author + '\'' +
                ", Publication Date:'" + publicationDate + '\'' +
                '}';
    }
}