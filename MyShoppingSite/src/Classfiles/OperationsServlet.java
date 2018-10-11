package Classfiles;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
@WebServlet("/OperationsServlet")
public class OperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public OperationsServlet() {
        super();
        
    }
    protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException 
    {
    	OperationsDao op=new OperationsDao();
   	 RequestDispatcher requestDispatcher=null;
   	// String productID=request.getParameter("productId");
   	 //String productName=request.getParameter("productName");
   	 //float productPrice=Float.parseFloat(request.getParameter("productPrice"));
   	 //op.adminAdd(productID,productName,productPrice);
   	 op.adminUpdate("2","chb",1200);
   	 //requestDispatcher=request.getRequestDispatcher("jspFiles/OperationProcessing.jsp");
   	 //requestDispatcher.forward(request, response); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			doCommon(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doCommon(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
