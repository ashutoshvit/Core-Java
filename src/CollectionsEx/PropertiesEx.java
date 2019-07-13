package CollectionsEx;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesEx {
	
	public static Properties prop=null;
	static {
		try {
			prop = new Properties();
			prop.load(new FileInputStream("Connection.properties"));
		}catch(Exception ex) {ex.printStackTrace();}
	}
	
	public static Connection getConnection() {
		Connection con= null;
		String driverClass= prop.getProperty("driverClassName");
		String url=prop.getProperty("url");
		String userName= prop.getProperty("userName");
		String pwd= prop.getProperty("password");
		try {
			//Load JDBC Connection
			Class.forName(driverClass);
			con= DriverManager.getConnection(url, userName, pwd);
		}
		catch(SQLException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		
		return con;
		}

	public static void main(String args[]) {
		Connection con = PropertiesEx.getConnection();
		System.out.println(con);
		}
	
		
	}
