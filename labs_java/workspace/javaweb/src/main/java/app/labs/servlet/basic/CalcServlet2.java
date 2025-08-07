package app.labs.servlet.basic;

import java.io.IOException;
import java.util.Optional;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet2
 */
@WebServlet("/servlet/CalcServlet2")
public class CalcServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet2() {
        super();		
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ofNullable : is not null- return value // is null return empty
		int num1 = Optional.ofNullable(request.getParameter("num1"))
				.map(Integer::parseInt)
				.orElse(0);
		
		String op = Optional.ofNullable(request.getParameter("operator"))
				.orElse("+");

		int num2 = Optional.ofNullable(request.getParameter("num2"))
				.map(Integer::parseInt)
				.orElse(0);
		
		
		//Biz
		CalcService calc = new CalcService(num1, num2, op);
		int result = calc.getResult();
		
		
		// print - 출력 넘김. calc2.jsp에게 제어 넘어감. 
		RequestDispatcher rd = request.getRequestDispatcher("calc2.jsp");
		// 제어 넘길 때 옵션 붙임.
        request.setAttribute("result", Integer.toString(result));
        rd.forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
