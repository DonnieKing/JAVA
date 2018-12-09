package nuc.sw.action;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import nuc.sw.dao.Dao;
import nuc.sw.entity.Book;

public class getBookAction extends ActionSupport implements ModelDriven{
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
	Dao dao = new Dao();
	public String getBookMethod()
	{ 
		
		listbooks = dao.selectBooks();		 
//		for(Book b:listbooks)
//		{
//			System.out.print(b.getName());
//		}
		return "getBookOK";		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return listbooks;
	}
}
