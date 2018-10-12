package nuc.sw.Action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.entity.Book;
import nuc.sw.service.BookService;

public class getBookAction extends ActionSupport implements ModelDriven{
	
		
	 private List<Book> books = new ArrayList<Book>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	BookService bService = new BookService();
	public String getBookMethod() {
		setBooks(bService.listBooks());
		ActionContext.getContext().put("books", books);
		return "getBookOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return books;
	}
}
