package nuc.sw.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.entity.Book;
import nuc.sw.service.BookService;

public class searchBookAction extends ActionSupport implements ModelDriven<Book> {
	private Book book = new Book();
	private String bookName;
	private BookService bService = new BookService();
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

		//查询一本书籍
		public String searchBookMethod() {
			System.out.println(bookName);
			book = bService.getBook(bookName);
			System.out.println(book);
			return "searchOK";
		}
		
	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return book;
	}

}
