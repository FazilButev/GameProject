
public class SellingManager extends CampaignManager {
	
	void Sell(User user , Selling game , Campaign campaign) {
		
		System.out.println("****" + user.getFirstName() + " isimli kullanýcý " + game.getGameName() + " isimli oyunu " + campaign.getName() + " isimli kampanya ile yüzde " + campaign.getPrice() + " indirim oranýyla " + game.getGamePriceAfterDiscount() + " TL fiyatýna aldý." + "****" );
	}

}
