package GameCampaignProject;

public class GameSaleManager implements GameSaleService {

	
	public  GameSaleManager() {
	System.out.println("Oyun sat�� ekran�na ho� geldiniz");
	}

	@Override
	public void showGame(Game game) {
		System.out.println(game.getGameName()+" adl� oyun ekrana getirilmi�tir");
	}



	@Override
	public void buyGame(GameSale gameSale, Player player) {
		System.out.println(player.getPlayerRealName()+"adl� oyuncu"+gameSale.getGameName()+" adl� oyunu sat�n ald�");
		System.out.println(" G�le G�le oynay�n :) ");
		
	}

	

}
