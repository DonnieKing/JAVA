package nuc.sw.Action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.BookDao;
import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;
import nuc.sw.service.BookService;

public class deleteBookAction extends ActionSupport implements ModelDriven{
	
	BookDao bDao = new BookDao();
	private Book book = new Book();
	BookService bService = new BookService();
	private List<Book> books;
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}




	private String bookName;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}



	public String deleteBookMethod() {
		System.out.println(bookName);

		/*List<Book> listbooks = bDao.listBooks();
		//Iterator it =listbooks.iterator();
		 for(Book book :listbooks) {
			 //String bName = (String )book.getbName();
			 System.out.println(book.getbName());
			 if(book.getbName().equals(bookName))
			  
				{
					System.out.println("mmm");
					bDao.deleteBook(book);
				}
		 }*/
		System.out.println(book.getbName());
		bService.deleteBook(book.getbName()); 
		books = BookDatabase.books;
		System.out.println(books);
	
		return "deleteOK";
	} 
	
	
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return book;
	}

	

}
