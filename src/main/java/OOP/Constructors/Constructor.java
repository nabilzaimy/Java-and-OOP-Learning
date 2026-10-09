package OOP.Constructors;

public class Constructor {

    public static void main(String[] args){

        // constructor = special method that is called when an object is instantiated (created)

        Book book1 = new Book("Jangan Baca Buku Ini" , "Nabil" , 37);
        Book book2 = new Book("Fixie" , "Murshid" , 80);

        book1.displayInfo();
        book2.displayInfo();
    }
}
