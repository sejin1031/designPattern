package Book;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf {
    private ArrayList<Book> books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.books = new ArrayList<Book>();
    }
    public Book getBookAt(int index){
        return books.get(index);
    }
    public void appendBook(Book book){
        books.add(book);
        last++;
    }
    public int getLength(){
        return last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
