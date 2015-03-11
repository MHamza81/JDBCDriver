package driver.jdbc;
import java.util.*;
import java.util.logging.Logger;
import java.sql.*;
import java.io.*;
public class JWResultSet implements java.sql.ResultSet{

	
		// The current ResultSet data row 
		private   Object[]   row;

		public boolean next() throws SQLException
		{
			try
			{
				// Get the current data row from remote ResultSet
				// All the getXXX methods will get data from local 'row'

				row = remoteResultSet.getNextRow();
			}
			catch(Exception ex)
			{
				return false;      
			}   

			if(row == null)
			{
				return false;
			}

			return true;
		}   
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
