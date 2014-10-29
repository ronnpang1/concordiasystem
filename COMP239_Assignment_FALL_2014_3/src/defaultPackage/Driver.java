package defaultPackage;


import java.util.*; 
public class Driver {
	static int studentint=0;
	static int staffint=0;
	static Students[] student= new Students[10000];
	static StaffMembers[] staff=new StaffMembers[10000];
	
	public static void main(String[] args) {
		String userinput = null,userchoice,usercontinue = null;
		ConcordiaMembers database1 = new ConcordiaMembers();
		
		
		do{
			
			
			
			
		}while(usercontinue.equals("Y"));
		
		
	}
	
	
	
	
	public static void adduser() {
		
		int newuser=0;
		Scanner input= new Scanner(System.in);
		System.out.println("press 1 to add a new member to the faculty or 2 to add a new faculty member or 3 to add a new staff member");
		
		newuser=input.nextInt();
		
		switch(newuser){
		
		case 1:
			studentint++;
			System.out.println("What is the first name of this student?");
			String firstname=input.nextLine();
			student[studentint].setFirstName(firstname);
			System.out.println("What is the last name of this student?");
			String lastname=input.nextLine();
			student[studentint].setFirstName(lastname);
			System.out.println("New user added");
			System.out.println("What is the status of this student? Press 1 for alumni,2 for graduate,3 for undergraduate,4 for a graduate TA, or 5 for a undergraduate TA");
			int status=input.nextInt();
			if(status==1)
			student[studentint].setStatus(StudentStatus.ALUMNI);
			if(status==2)
			student[studentint].setStatus(StudentStatus.GRADUATE);
			if(status==3)
			student[studentint].setStatus(StudentStatus.UNDERGRADUATE);
			if(status==4)
			student[studentint].setStatus(StudentStatus.UNDERGRADUATE_TA);
			if(status==5)
				student[studentint].setStatus(StudentStatus.GRADUATE_TA);
			break;
		
		case 3:
			staffint++;
			System.out.println("What is the first name of this person?");
			firstname=input.nextLine();
			student[studentint].setFirstName(firstname);
			System.out.println("What is the last name of this  person?");
			lastname=input.nextLine();
			student[studentint].setFirstName(lastname);
			System.out.println("New user added");
			System.out.println("What is the status of this  person? Press 1 for if he is a part-time,2 if he's full time or 3 if ge gets commision");
			status=input.nextInt();
			if(status==1)
			staff[staffint].setStatus(Staffstatus.TEMP_STAFF);
			if(status==2)
			staff[staffint].setStatus(Staffstatus.PERM_STAFF);
			if(status==3)
			staff[staffint].setStatus(Staffstatus.OTHER);
			
			break;
			
		default:
			break;
		
		
		
		}
		
		
		
		
		
		
		
	}

}
