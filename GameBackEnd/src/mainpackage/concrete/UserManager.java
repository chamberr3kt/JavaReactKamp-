package mainpackage.concrete;

import mainpackage.abstracts.UserCheckService;
import mainpackage.abstracts.UserService;
import mainpackage.entity.User;

public class UserManager implements UserService{
	private UserCheckService usercheckservice;

	public UserManager(UserCheckService usercheckservice) {
		this.usercheckservice = usercheckservice;
	}

	@Override
	public void add(User user) {
		
		if(this.usercheckservice.checkIfRealUser(user)) {
			System.out.println("Database Kay�t Ba�ar�l�"+user.getUserName());
		}
		else {
			System.out.println("Ba�ar�l� De�il");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" adl� oyuncu sistemden silinmi�tir");
		
	}

	@Override
	public void update(User user) {
		
		System.out.println(user.getUserName()+" adl� kullan�c� g�ncellenmi�tir");
	}

}
