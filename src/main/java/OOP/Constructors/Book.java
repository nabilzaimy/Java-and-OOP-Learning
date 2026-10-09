package OOP.Constructors;

public class Book {

    String title;
    String author;
    int totalPages;

    Book(String title , String author , int totalPages){

        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }

    void displayInfo(){
        System.out.println(title + "by " + author + " - " + totalPages);
    }

}
