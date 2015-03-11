package driver.jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Logger;
import java.sql.*;
import java.io.*;

public class JStatement {


	public
	ResultSet executeQuery(String sqlQuery)
			throws SQLException
	{
		try
		{
			IRemoteResultSet remoteRsInstance = (IRemoteResultSet) remoteStmt.executeQuery(sqlQuery);
			JResultSet localRsInstance = new JResultSet(remoteRsInstance);
			return (ResultSet)localRsInstance;
		}
		catch(RemoteException ex)
		{
			throw(new SQLException(ex.getMessage()));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
