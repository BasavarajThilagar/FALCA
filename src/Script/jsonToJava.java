package Script;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import generic.WebBase;

public class jsonToJava extends WebBase
{

	@Test(priority=1)
	public void testjson() throws ClassNotFoundException, SQLException 
	{
		Class.forName("mongodb.jdbc.MongoDriver");
		Connection conn=null;
		conn=DriverManager.getConnection("jdbc:mongodb://172.26.1.28:27017/Collection", "falcatesting", "falcatesting");
		Statement st=conn.createStatement();
		ResultSet rs = st.executeQuery("db.getCollection('users').find({'profile.Phone.Primary':'9380106400'})");
		rs.next();
		rs.getString(1);
		System.out.println(rs);
		conn.close();
	}

}
