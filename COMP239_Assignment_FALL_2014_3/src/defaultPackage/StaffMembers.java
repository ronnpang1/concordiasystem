package defaultPackage;
import java.util.*;
public class StaffMembers extends ConcordiaMembers implements PaymentInterface {
	private Staffstatus status;
	private double contracthours;
	private double enteredamount;
	final double rate= 11.50;
	private double salary;
	private double fixedsalary;
	private double commision;
	private double sales;
	
	
	public StaffMembers(String Firstname,String Secondname,String id, Staffstatus status,double hours,double commision,double salary,double hoursreq){
	super(Firstname,Secondname,id);
	this.status=status;
	contracthours=hours;
	this.commision=commision;
	fixedsalary=salary;
	enteredamount=hoursreq;
	
	}
	
	public Staffstatus getStatus() {
		return status;
	}

	public void setStatus(Staffstatus status) {
		this.status = status;
	}

	
	public double payment() {
		
		if(status==Staffstatus.PERM_STAFF)
		return fixedsalary;
		
		 if (status==Staffstatus.TEMP_STAFF){
			
			salary=enteredamount*rate;
			return salary;
			
		}
		 if (status==Staffstatus.OTHER){
			
			salary=fixedsalary+(commision*sales);
			
			return salary;
			
		}
		else
			return 0;
		
		}
	
	
	public void hoursworked(){
		try{
		Scanner input= new Scanner(System.in);
		System.out.println("How many hours has"+getFirstName()+ " "+ "worked?");
		enteredamount=input.nextInt();
		if(contracthours<0){
			
			System.out.println("This user has no more hours availble");
			setContracthours(0);
			
		}
		if(enteredamount<contracthours)
		{
			
			contracthours-=enteredamount;
			setContracthours(contracthours);
			
		}
		
		else
		{
			
			System.out.println("Invalid number. The number that has been inputed currently exceeds the users contarct hours");
			System.out.println("Enter a contract hour numbers under"+ " "+ " contracthours");
			hoursworked();
			
		}
		
		
		}catch(InputMismatchException e)
		{
		
			System.out.println("Invalid input. Try again");
			hoursworked();
			
		}
		
	
	catch(Exception e){
		System.out.println("Invalid input. Try again");
		hoursworked();
		
		
	}
	}

	public double getContracthours() {
		return contracthours;
	}

	public void setContracthours(double contracthours) {
		this.contracthours = contracthours;
	}

	public double getFixedsalary() {
		return fixedsalary;
	}

	public void setFixedsalary(double fixedsalary) {
		this.fixedsalary = fixedsalary;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	
	
	
	

}
