package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Book;

public class getABookAction extends ActionSupport implements ModelDriven{
	
	private Book book = new Book();
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	List<Book> listbooks = new ArrayList<>();
	public List<Book> getListbooks() {
		return listbooks;
	}

	public void setListbooks(List<Book> listbooks) {
		this.listbooks = listbooks;
	}
	
	private String bookName;
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	Dao dao = new Dao();
	
	public String getABookMethod() {
		System.out.println(bookName);
		listbooks = dao.selectABook(bookName);
		return "getABookOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listbooks;
	}
	
}
