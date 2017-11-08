
package profiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {
    
public static boolean validate(String name,String pass){
boolean status=false;
try{
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Database","karan","karan");
	
	PreparedStatement ps=con.prepareStatement("select * from PROFILE where name=? and password=?");
	ps.setString(1,name);
	ps.setString(2,pass);
	
	ResultSet rs=ps.executeQuery();
	status=rs.next();
	
	
}catch(Exception e){System.out.println(e);}
return status;
}
}

