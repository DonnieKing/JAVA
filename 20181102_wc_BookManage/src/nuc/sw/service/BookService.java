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
	
	//ɾ���鼮
		public void deleteBook(String s) {
			bDao.removeBook(s); 
		}
		
		//��ȡһ���鼮����Ϣ
		public Book getBook(String s) {
			return bDao.getBook(s);
		}
}
