package Classfiles;
import java.sql.*;

public class UserDAO {
                public Connection con;
                public Statement st;
                public ResultSet resultSet;

                public UserDAO() {
                                try {
                                    con = ConnectionFactory.getConnection();
                                             
                                } catch (Exception e) {
                                                e.printStackTrace();
                                }
                }
                

        public String getUserType(String userName, String password) throws SQLException {
                                st = con.createStatement();
                                resultSet = st.executeQuery("select * from user_details");
                
                                while (resultSet.next()) {
                                                if (resultSet.getString(1).equals(userName) && (resultSet.getString(2).equals(password))) {
                                                                return resultSet.getString(3);
                                                }
                                }
                                
                                throw new InvalidUserException();
                }

}
