package defaultPackage;

import java.util.Scanner;
	
public class Students extends ConcordiaMembers implements PaymentInterface{
	private StudentStatus status;
	boolean entry;
	private int contractHours;
	final private double HOURLY_RATE = 11.50;
	final private double HOURLY_RATE_GRADUATE = HOURLY_RATE*1.2;
	Scanner myKey = new Scanner(System.in);
	
	public Students(String firstName, String lastName, String concordiaID, StudentStatus status, int contractHours) {
	
		super(firstName, lastName, concordiaID);
		
		this.status = status;
		this.contractHours = contractHours;
		}
	
	public StudentStatus getStatus() {
		return status;
	}
	
	public void setStatus(StudentStatus status) {
		this.status = status;
	}
	
	public int getContractHours() {
		return contractHours;
	}

	public void setContractHours(int contractHours) {
		this.contractHours = contractHours;
	}


	
	public double payment() {
		if(status == StudentStatus.GRADUATE_TA){
			return HOURLY_RATE_GRADUATE*hoursWorked();
		}
		else if(status == StudentStatus.UNDERGRADUATE_TA){
			return HOURLY_RATE*hoursWorked();
		}
		else
		return 0;
	}
	
	public int hoursWorked(){
		System.out.print("How many hours has " + getFirstName() + " worked? ");
		int userEntry = myKey.nextInt();
		entry = false;
		
		while(entry==false){
			
			if (userEntry <= getContractHours()){
				entry = true;
				break;
			}
			else
				System.out.println("You've entered an invalid number. Try again!");
				userEntry = myKey.nextInt();
			
		}
		
		setContractHours(getContractHours()-userEntry);
		return userEntry;
		
	}

	
	
}
