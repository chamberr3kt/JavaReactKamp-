package GameCampaignProject;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName()+ "adl� oyun eklenmi�tir");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName()+" adl� oyun silinmi�tir");
		 
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName()+" adl� oyun g�ncellenmi�tir");
	}

}
