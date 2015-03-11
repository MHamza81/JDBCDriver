package driver.jdbc;
import java.util.*;
import java.util.logging.Logger;
import java.sql.*;
import java.io.*;

public class JConnection {

	public Statement createStatement()  throws SQLException
	{
		try
		{
			IRemoteStatement remStmt =  (IRemoteStatement) remoteConnection.createStatement();
			JStatement localStmtInstance = new JStatement(remStmt);
			return (Statement)localStmtInstance;
		}      
	}
}
