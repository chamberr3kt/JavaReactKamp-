package eCommerceProjectt.Business.concretes;

import java.util.List;

import eCommerceProjectt.Business.abstracts.UserService;
import eCommerceProjectt.Business.abstracts.VerifacionCodeService;
import eCommerceProjectt.Entities.concretes.User;


public class UserManager implements UserService {
	private VerifacionCodeService verifacionCodeService;
	
	
	
	
	
	public UserManager(VerifacionCodeService verifacionCodeService) {
		super();
		this.verifacionCodeService = verifacionCodeService;
	}

	@Override
	public void add(User user) {
	  System.out.println(user.getName()+" adl� kullan�c� sisteme eklenmi�tir");
		
	}

	@Override
	public void delete(User user) {
		  System.out.println(user.getName()+" adl� kullan�c� sistemden silinmi�tir");
		
	}

	@Override
	public void update(User user) {
		  System.out.println(user.getName()+" adl� kullan�c� g�ncellenmi�tir");
		
	}

	@Override
	public List<User> getAll() {return null;}



	@Override
	public void checkservice(User user) {
		
		this.verifacionCodeService.sendActivationCode();
	}

	}
