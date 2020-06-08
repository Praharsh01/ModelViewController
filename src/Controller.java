import java.util.*;


	//All Forms of user Inputs and Checking

public class Controller {
	
	//User defined method
	private String First_name;
	private String Last_name;
	private int age;
	private String final_username;
	private Model m;
	private View v;
	private Scanner s;

	public Controller() {
		//Set up classes
		m = new Model();
		v = new View();

		
		//Capture external input in private variable
		s = new Scanner(System.in);
		process_input();
		s.close();	
	}

	public void process_input(){
		
		System.out.println("Please type in your first name");
		this.First_name = s.nextLine();
		
		System.out.println("Please type in your last name");
		this.Last_name = s.nextLine();
		
		//Update the database
		this.final_username = m.CreatAccount(this.First_name, this.Last_name);
		
		//Show the user
		v.output_result(this.final_username);
		
	}
		
}	