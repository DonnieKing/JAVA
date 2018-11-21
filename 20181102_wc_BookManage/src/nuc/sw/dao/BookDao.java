package nuc.sw.dao;



import java.util.Iterator;
import java.util.List;

import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

public class BookDao {
	public void saveBook(Book book) {
		BookDatabase.books.add(book);
	}
	public List<Book> listBooks(){
		return BookDatabase.books;
	}
	
	//删除书籍
		public void removeBook(String s) {
			Iterator<Book> it = BookDatabase.books.iterator();
			while(it.hasNext()){
			    Book book = it.next();
			    System.out.println("bb");
 			    System.out.println(book.getbName());
			    if(book.getbName().equals(s)){
			    	System.out.println("aa");
			        it.remove();
			    }
			}
		}
		
		//修改书籍
		public void updataBook(String s) {
			BookDao bDao = new BookDao();
			bDao.getBook(s);
			
			
		}
		
		//获取一条书籍的记录
		public Book getBook(String s) {
			
			Iterator<Book> it = BookDatabase.books.iterator();
			Book book = new Book();
			while(it.hasNext()) {
				Book book1 = it.next();
				if(book1.getbName().equals(s)) {
					book = book1;
				}
			}
			return book;
			
		}
	
	 
}
