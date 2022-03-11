public class Books {
    String bookName;
    String author;
    int numberOfPages;

    public Books(String bookName, String author, int numberOfPages){
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;


    }
    public String bookDetails(){
        return "nazwa książki: " + bookName + "\nautor: " + author + "\nliczba stron: " + numberOfPages;
    }
    public int getNumberOfPages(String author){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


}

