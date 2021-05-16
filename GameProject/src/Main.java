
public class Main {

	public static void main(String[] args) {
		
		
		User user1 = new User(1,"Fazýl","Bütev","123456789","05.06.1994");
		User user2 = new User(2,"Pýnar","Saðýr","12332112343","23.03.1994");
		UserManager userManager = new UserManager();
		userManager.signUp(user1);
		userManager.signIn(user1);
		
		System.out.println("--------------------------------------------------");
		
		UserManager userManager2 = new UserManager();
		userManager2.CheckIfRealPerson(user1);
		
		System.out.println("--------------------------------------------------");
		
		userManager.signUpdate(user1);
		
		System.out.println("--------------------------------------------------");
		
		Selling game = new Selling("Counter-Strike" , 100 , 1000 , 15 , 85);
		SellingManager sellingManager = new SellingManager();
		
		
		System.out.println("--------------------------------------------------");
		
		Campaign campaign = new Campaign(1, "Uçalým Yýldýzlara", 10, 1111111);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.CampaignAdd(campaign);
		campaignManager.CampaignDelete(campaign);
		campaignManager.CampaignUpdate(campaign);
		
		System.out.println("--------------------------------------------------");
		
		sellingManager.Sell(user1, game,campaign);
		
	}

}
