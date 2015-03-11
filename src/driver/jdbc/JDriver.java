package driver.jdbc;
import java.util.*;
import java.util.logging.Logger;
import java.sql.*;
import java.io.*;
public class JDriver implements java.sql.Driver {

	static
	{
		try
		{
			// Register the JWDriver with DriverManager
			JDriver driverInst = new JDriver();
			DriverManager.registerDriver(driverInst);
		}
		catch (SQLException E) {
			throw new RuntimeException("Can't register driver!");
		}
	}

	public static void connect(){
		if(remoteDriver == null)
		{
			remoteDriver = RemoteDriver)Naming.lookup("rmi://"+serverName+":1099"+"/RemoteDriver");


		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}



		@Override
		public boolean acceptsURL(String arg0) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}



		@Override
		public Connection connect(String arg0, Properties arg1) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public int getMajorVersion() {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public int getMinorVersion() {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public Logger getParentLogger() throws SQLFeatureNotSupportedException {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1)
				throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public boolean jdbcCompliant() {
			// TODO Auto-generated method stub
			return false;
		}

	}
