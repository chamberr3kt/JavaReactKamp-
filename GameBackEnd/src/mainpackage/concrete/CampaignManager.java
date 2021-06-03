package mainpackage.concrete;

import mainpackage.abstracts.CampaignService;
import mainpackage.entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getId()+" Kodlu kampanya sisteme eklenmi�tir");
		
	}

	@Override
	public void delete(Campaign campaign) {
	   System.out.println(campaign.getId()+" kodlu kampanya silinmi�tir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId()+" kodlu kampanya silinmi�tir1");
		
	}

}
