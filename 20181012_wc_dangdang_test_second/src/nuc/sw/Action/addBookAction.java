package nuc.sw.Action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ResolverUtil.NameEndsWith;
import com.opensymphony.xwork2.util.finder.ClassFinder.Info;

import nuc.sw.entity.Book;
import nuc.sw.service.BookService;

public class addBookAction extends ActionSupport implements ModelDriven{

	private Book book = new Book();
	private String tip;
	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
	
	BookService bService = new BookService();
	
	public String addBookMethod() {
		bService.saveBook(book);
		tip = "图书添加成功";
		return "addBookOK";
	}


	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	
}
