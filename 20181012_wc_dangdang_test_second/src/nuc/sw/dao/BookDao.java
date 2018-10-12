package nuc.sw.dao;



import java.util.List;

import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

public class BookDao {
	public void saveBook(Book book) {
		BookDatabase.books.add(book);
	}
	public List<Book> listBooks(){
		return BookDatabase.books;
	}
}
