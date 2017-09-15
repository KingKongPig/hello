package action;

import model.User;

public class LoginAction{
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute(){
		String result="error";
		if(null!=user.getUsername()){
			result="right";
		}
		return result;
	}
}
