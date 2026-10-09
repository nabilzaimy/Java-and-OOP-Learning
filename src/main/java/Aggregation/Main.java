package Aggregation;

public class Main {
    public static void main(String[] args){

        // Aggregation =  Represent a "Has-A" relationship between objects.
        //                1 object contains another object as part of its structure
        //                but the contained object/s can exist independently

        Book book1 = new Book("Jangan Baca Buku Ini" , 299);
        Book book2 = new Book("Jangan Baca Buku Ini - 2" , 121);
        Book book3 = new Book("Jangan Baca Buku Ini - 3" , 366);

        Book[] books = {book1 , book2 , book3};


        Library library = new Library(" NYC - Library" , 1992 , books);

        library.displayInfo();
    }
}
