package logic;

import db.LoginCheckDB;

public class LoginVerification {
	public enum LoginResult {FAILED, USER_LOGGED_IN, ADMIN_LOGGED_IN};

	private LoginCheckDB lgnDB = new LoginCheckDB();

	public LoginResult loginCheck(String username, String password) {
		
					/*//////////////////
					 * MANGLER TR�DE *
					*//////////////////
		Traade tr�d4 = new Traade(4);
		tr�d4.start();
		if (lgnDB.LoginCheck(username, password) == true) {
			return LoginResult.USER_LOGGED_IN;
		} else if (lgnDB.adminLoginCheck(username, password) == true) {
			return LoginResult.ADMIN_LOGGED_IN;
		} else {
			return LoginResult.FAILED;
		}
	}
}

