package Oops_Concepts.Oops1.LibMgt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
        System.out.println("Book Added Succsfully..");
    }

    public void listBooks(){
        for(Book b: books){
            b.toString();
        }
    }

    public void searchByTitle(String title){
        for(Book b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println("Book Found!");
                b.toString();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void deleteById(int id){
          Iterator<Book> itr = books.iterator();
          while(itr.hasNext()){
              if(itr.next().getId()==id){
                  itr.remove();
                  System.out.println("Book deleted");
                  return;
              }
          }
          System.out.println("BookNotFound");
    }

    public void updateAvailability(int id,boolean newStatus){
        for(Book b: books){
            if(b.getId()==id){
                b.setAvailable(newStatus);
                System.out.println("Book Availability Updated");
                return;
            }
        }
        System.out.println("Book not found");
    }

}

