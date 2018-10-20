package nuc.sw.service;

import java.util.List;

import nuc.sw.dao.BookDao;
import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

public class BookService {
	
	BookDao bDao = new BookDao();
	
	//���ͼ��
	public void saveBook(Book book)
	{
		bDao.saveBook(book);
	}
	
	//��ȡͼ��
	public List<Book> listBooks(){
		return BookDatabase.books;
	}
}
