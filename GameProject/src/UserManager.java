
public class UserManager implements CheckUserManager{
	
	public void signUp(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullan?c? ba?ar?yla kay?t edildi.");
	
	}
	
	public void signIn(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullan?c? ba?ar?yla giri? yapt?.");
		
	}

	public void signUpdate(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullan?c? ba?ar?yla bilgilerini g?ncelledi.");
		
	}

	@Override
	public void CheckIfRealPerson(User user)
	{
		if(user.getId()==1 && user.getFirstName()=="Faz?l" && user.getLastName()=="B?tev" && user.getNationalityId()=="123456789" && user.getDayOfBirth()=="05.06.1994") {
			
			System.out.println(user.getFirstName() + " isimli ki?inin do?rulamas? yap?ld?.");
		}
		else {
			System.out.println("B?yle bir ki?i sistemde kay?tl? de?ildir.");
		}
	}
	 
	

	
	
	


}
