package nuc.sw.service;

import java.util.List;

import nuc.sw.dao.BookDao;
import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

public class BookService {
	
	BookDao bDao = new BookDao();
	
	//添加图书
	public void saveBook(Book book)
	{
		bDao.saveBook(book);
	}
	
	//获取图书
	public List<Book> listBooks(){
		return BookDatabase.books;
	}
	
	//删除书籍
		public void deleteBook(String s) {
			bDao.removeBook(s); 
		}
		
		//获取一本书籍的信息
		public Book getBook(String s) {
			return bDao.getBook(s);
		}
}
