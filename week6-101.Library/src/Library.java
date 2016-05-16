
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book newBook) {

        books.add(newBook);
    }

    public void printBooks() {
        for (Book items : books) {
            System.out.println(items);
        }

    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book items : books) {
            
            

            if (StringUtils.included(items.title(), title)) {
                found.add(items);

            }

           

        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book items : books) {
            if (StringUtils.included(items.publisher(), publisher)) {
                found.add(items);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        String years = Integer.toString(year);
        for (Book items : books) {
            if (items.toString().contains(years)) {
                found.add(items);
            }
        }
        return found;
    }

}
