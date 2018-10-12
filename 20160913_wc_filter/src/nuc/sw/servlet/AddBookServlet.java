package nuc.sw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.sw.dao.BookDao;
import nuc.sw.db.BookDatabase;
import nuc.sw.entity.Book;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Book book = new Book();
		request.setCharacterEncoding("utf-8");
		book.setBookName(request.getParameter("bookName"));
		book.setBookAuthor(request.getParameter("bookAuthor"));
		book.setBookPrice(Float.parseFloat(request.getParameter("bookPrice")));
		// 将数据信息存入到数据库当中
		BookDao bDao = new BookDao();
		bDao.insertBook(book);
		// 将数据放入到request域当中，跳转到bookShow.jsp并显示
		//request.setAttribute("books",bDao.listBooks());
		request.setAttribute("books",BookDatabase.bookList);
		request.getRequestDispatcher("bookShow.jsp").forward(request, response);
	}

}
