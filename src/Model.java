
		//All forms of logic

public class Model {

	private String username;
	private String domain = "@hotmail.com";
	
	
	public String CreatAccount(String First_name, String Last_name){
		
		this.username = First_name + "." + Last_name + this.domain;
		
		return this.username;
	}
	
}
