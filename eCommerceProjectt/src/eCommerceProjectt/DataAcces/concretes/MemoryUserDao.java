package eCommerceProjectt.DataAcces.concretes;

import java.util.List;

import eCommerceProjectt.DataAcces.abstracts.UserDao;
import eCommerceProjectt.Entities.concretes.User;

public class MemoryUserDao implements UserDao {

	@Override
	public void Add(User user) {
		 System.out.println(user.getName()+" adl� kullan�c� sisteme eklenmi�tir");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getName()+" adl� kullan�c� sistemden silinmi�tir");
		
	}

	@Override
	public void Update(User user) {
		 System.out.println(user.getName()+" adl� kullan�c� g�ncellenmi�tir");
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
