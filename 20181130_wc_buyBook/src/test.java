import nuc.sw.dao.Dao;
import nuc.sw.entity.Book;
import nuc.sw.action.*;
public class test {
	public static void main(String[] args) {
		Book book = new Book();
		Dao  dao = new Dao();
//		for(Book b:dao.selectABook("����"))
//		{
//			System.out.println(b.getPrice());
//			System.out.println(b.getName());
//			System.out.println(b.getAuthor());
//		}
		dao.insertOrder();
	}

}
