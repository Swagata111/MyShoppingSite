package Classfiles;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.RequestDispatcher;

@WebServlet("/UserValidate")
public class UserValidate extends HttpServlet {
       private static final long serialVersionUID = 1L;

       protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws Exception {

              String userName = request.getParameter("userName");
              String password = request.getParameter("password");

              RequestDispatcher rd = null;

              UserDAO userCheck = new UserDAO();
              try {
                     if (userCheck.getUserType(userName, password).equals("user")) {
                           //System.out.println(userCheck.getUserType(userName, password));
                           rd = request.getRequestDispatcher("/jspFiles/user.jsp");

                     } else if (userCheck.getUserType(userName, password).equals("admin")) {
                           rd = request.getRequestDispatcher("/jspFiles/admin.jsp");
                     }
                     rd.forward(request, response);
                     
              } catch (InvalidUserException e) {
                     rd = request.getRequestDispatcher("/jspFiles/IncorrectUser.jsp");
                     rd.forward(request, response);
              } catch (SQLException e)

              {
                     
                     e.printStackTrace();
              }
       }

       protected void doGet(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
              try {
                     doCommon(request, response);
              } catch (Exception e) {

                     e.printStackTrace();
              }
       }

       protected void doPost(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
              try {
                     doCommon(request, response);
              } catch (Exception e) {

                     e.printStackTrace();
              }
       }

}

