package businessLogic;
import java.sql.SQLException;

import Backend.DBHome;
import Backend.allQuery;
public class index {
    
	
	public static boolean validateUser(int user_id,String password,int choice) throws SQLException {
		
		
		allQuery.login(DBHome.getCon(), user_id, password, choice);
		return false;
		
	}
	
	
	
	
	
	
	
	
}
