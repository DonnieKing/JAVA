package nuc.sw.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.entity.Book;
import nuc.sw.service.BookService;

public class updataBookAction extends ActionSupport 	implements ModelDriven<Book>{
	private Book book = new Book();
	private BookService bService = new BookService();
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

		/*//确认修改
		public String confirmUpdataBookMethod() {
			Book book1 = bService.getBook(book.getbName());
			book1.setbName(book.getbName());
			book1.setbAuthor(book.getbAuthor());
			book1.setbPrice(book.getbPrice());
			book1.setbPublish (book.getbPublish());
			return "confirmUpdataOK";
		}*/
		
		//修改书籍
		public String updataBookMethod() {
			System.out.println(book.getbName());
			System.out.println(book.getbAuthor());
			System.out.println(book.getbPrice());
			book = bService.getBook(book.getbName());
			System.out.println(book);
			System.out.println(book.getbAuthor());
			return "updataOK";
		}

		@Override
		public Book getModel() {
			// TODO Auto-generated method stub
			return book;
		}
}
