package nuc.sw.dao;

import java.util.*;

import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

public class BookDao {
	// ���һ���鼮
	public void  insertBook(Book book) {
		BookDatabase.bookList.add(book);		
	}
	
	// ��ȡ�����鼮
	public List<Book> listBooks(){
		return BookDatabase.bookList;
	}
	// ɾ��һ���鼮
	public void deleteBook(Book book) {
		BookDatabase.bookList.remove(book);
	}
}
