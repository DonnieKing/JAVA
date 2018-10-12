package nuc.sw.dao;

import java.util.*;

import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

public class BookDao {
	// 添加一本书籍
	public void  insertBook(Book book) {
		BookDatabase.bookList.add(book);		
	}
	
	// 获取所有书籍
	public List<Book> listBooks(){
		return BookDatabase.bookList;
	}
	// 删除一本书籍
	public void deleteBook(Book book) {
		BookDatabase.bookList.remove(book);
	}
}
