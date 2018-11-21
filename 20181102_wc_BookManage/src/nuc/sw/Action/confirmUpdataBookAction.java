package nuc.sw.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.entity.Book;
import nuc.sw.service.BookService;

public class confirmUpdataBookAction extends ActionSupport implements ModelDriven<Book>{
	private Book book = new Book();
	private BookService bService = new BookService();
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	//È·ÈÏÐÞ¸Ä
			public String confirmUpdataBookMethod() {
				Book book1 = bService.getBook(book.getbName());
				book1.setbName(book.getbName());
				book1.setbAuthor(book.getbAuthor());
				book1.setbPrice(book.getbPrice());
				book1.setbPublish (book.getbPublish());
				return "confirmUpdataOK";
			}

	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return book;
	}
}
