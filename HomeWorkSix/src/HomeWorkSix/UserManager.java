package HomeWorkSix;

public class UserManager {
	
	public void add(User user) {
	   System.out.println("Yeni Kullan�c� eklendi"+user.getName());	
	}
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi"+user.getName());
	}
	public void login() {
		System.out.println("Giris Yapildi");
	}
	
	public void changeTelephoneNumber(String phoneNumber) {
		System.out.println("Telefon Numaran�z "+phoneNumber+" olarak de�i�tirilmi�tir");
	}
	public void changeNationalIdenity(String nationalIdenity) {
		System.out.println("Kimlik Numaran�z"+nationalIdenity+"olarak de�i�tirilmi�tir");
	}
	
	
}
