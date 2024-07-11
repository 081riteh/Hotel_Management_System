package Frontend;
import java.sql.SQLException;
import java.text.ParseException;

import Backend.DBHome;
import Backend.allQuery;
import businessLogic.index;
	public class Login {
		 
		private int user_id;
		private String password;
		private int choice;
		
		public Login(int user_id, String password,int choice) {
			super();
			this.user_id = user_id;
			this.password = password;
			this.choice=choice;
		}
		
		

		public void checkLogin() throws SQLException, ParseException {
			
			
			
			
			boolean valid=allQuery.login(DBHome.getCon(), user_id, password, choice);
			//System.out.println(valid);
			//boolean valid=false;
			if(valid) {
			switch(this.choice) {
			case 0:
				if(check(this.user_id,this.password)) {
					SuperAdmin.main();
				}
				else {
					System.out.println("Invalid Credentials");
					Home.UI();
				}
				break;
			case 1:
				Admin.main();
				break;
			case 2:
				Receptionist.main();
				break;
			case 3:
				HotelManager.main();
				break;
			case 4:
				RestaurantManager.main();
				break;
			case 5:
				Customer.main(this.user_id);
				break;
			   }
			}
			else {
				System.out.println("Invalid Credential");
				Home.UI();
			}
			
			
		}



		private boolean check(int user_id2, String password2) {
			// TODO Auto-generated method stub
			System.out.println(password2);
			if(user_id2==1 && password2.equals(new String("riteh"))) {
				return true;
			}
			return false;
		}

}
