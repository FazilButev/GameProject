
public class SellingManager extends CampaignManager {
	
	void Sell(User user , Selling game , Campaign campaign) {
		
		System.out.println("****" + user.getFirstName() + " isimli kullan�c� " + game.getGameName() + " isimli oyunu " + campaign.getName() + " isimli kampanya ile y�zde " + campaign.getPrice() + " indirim oran�yla " + game.getGamePriceAfterDiscount() + " TL fiyat�na ald�." + "****" );
	}

}
