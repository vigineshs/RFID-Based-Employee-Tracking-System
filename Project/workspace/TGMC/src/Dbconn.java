//package pds;

import java.sql.*;
/*import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.ibm.db2.jcc.*;
import java.io.IOException;
import javax.sql.DataSource;*/


public class Dbconn {

	/**
	 * @param args
	 */
	
	private static final long serialVersionUID = 1L;
   
	private Connection dbconnection;   
    public Connection getDbconnection() {
		return dbconnection;
	}

	public void setDbconnection(Connection dbconnection) {
		this.dbconnection = dbconnection;
	}

	private static Dbconn dbconn;
	
			
	
	public static synchronized Dbconn getConnection()
	{
		if(dbconn == null)
			return new Dbconn();
		return dbconn;
	}
    
	public Dbconn() {
        super();

		 try
		  {
			   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		       dbconnection=DriverManager.getConnection("jdbc:odbc:ets","db2","vicky");
		  }
	    catch(Exception e)
	     {
	    	e.printStackTrace();
	     }
	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}






