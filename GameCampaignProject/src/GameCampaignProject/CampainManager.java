package GameCampaignProject;

public class CampainManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya eklenmi�tir");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya silinmi�tir");
		
	}

	@Override
	public void updataCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya g�ncellenmi�tir");
		
	}

	@Override
	public void discount(Campaign campaign,Game game) {
		System.out.println(game.getGameName()+"adl� oyuna"+campaign.getCampaignName()+" Kampanyas� uygulanm��t�r");
		
	}


}
