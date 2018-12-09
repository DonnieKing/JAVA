package nuc.sw.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Book;

public class getTypeBookAction extends ActionSupport implements ModelDriven {
	
	 private Book book = new Book();
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	private List<Book> listbooks = new ArrayList<Book>();
	public List<Book> getListbooks() {
		return listbooks;
	}
	public void setListbooks(List<Book> listbooks) {
		this.listbooks = listbooks;
	}
	
	private String types; 
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}

	Dao dao = new Dao();
 
	public String getTypeBook()
	{
		//System.out.println(types);
		listbooks = dao.selectTypeBook(types);
		return "getTypeBookOK";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listbooks;
	}
	
	  
}
