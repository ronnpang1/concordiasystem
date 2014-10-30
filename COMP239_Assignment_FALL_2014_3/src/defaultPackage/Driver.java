package defaultPackage;


import java.util.*; 
public class Driver {
	static int studentint=1;
	static int staffint=1;
	static int Concordiamemtotal=0;
	static ConcordiaMembers[] conu=new ConcordiaMembers[10000];

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int choice=0;
		String userinput = null,userchoice,usercontinue="Y";
		ConcordiaMembers database1 = new ConcordiaMembers();
		
		
		do
		{
			
			System.out.println("Press 1 to add or 2 to view");
			choice=input.nextInt();
		
			if(choice==1)
			adduser();
			
			if(choice==2)
				showuser();
			
		
			
				
			
			usercontinue=input.next();
			
		}while(usercontinue.equals("Y"));
		
		
	}
	
	
	
	
	public static void adduser() {
		

		
		int newuser=0;
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		System.out.println("press 1 to add a new member to the faculty or 2 to add a new faculty member or 3 to add a new staff member");
		
		newuser=input.nextInt();
		
		switch(newuser){
		
		case 1:
		
			conu[Concordiamemtotal] =new Students();
			System.out.println("What is the first name of this student?");
			String firstname=input.next();
			System.out.println("What is the last name of this student?");
			String lastname=input.next();
			conu[Concordiamemtotal].setFirstName(firstname);
			conu[Concordiamemtotal].setFirstName(lastname);
			System.out.println("New user added");
			System.out.println("What is the status of this student? Press 1 for alumni,2 for graduate,3 for undergraduate,4 for a graduate TA, or 5 for a undergraduate TA");
			int status=input.nextInt();
			if(status==1)
			{
				((Students) conu[Concordiamemtotal]).setStatus(StudentStatus.ALUMNI);
				Concordiamemtotal++;
			}
			if(status==2)
			{
				((Students) conu[Concordiamemtotal]).setStatus(StudentStatus.GRADUATE);
				Concordiamemtotal++;
			}
			if(status==3)
			{
				((Students) conu[Concordiamemtotal]).setStatus(StudentStatus.UNDERGRADUATE);
				Concordiamemtotal++;
			}
			if(status==4)
			{
				((Students) conu[Concordiamemtotal]).setStatus(StudentStatus.UNDERGRADUATE_TA);
				Concordiamemtotal++;
			}
			if(status==5)
			{
				((Students) conu[Concordiamemtotal]).setStatus(StudentStatus.GRADUATE_TA);
			Concordiamemtotal++;
			}
			break;
		
			
			
		
		case 3:
		
			conu[Concordiamemtotal]=new StaffMembers();
			staffint++;
			System.out.println("What is the first name of this person?");
			firstname=input.next();
			conu[Concordiamemtotal].setFirstName(firstname);
			System.out.println("What is the last name of this  person?");
			lastname=input.next();
			conu[Concordiamemtotal].setFirstName(lastname);
			System.out.println("New user added");
			System.out.println("What is the status of this  person? Press 1 for if he is a part-time,2 if he's full time or 3 if ge gets commision");
			status=input.nextInt();
			if(status==1)
			{
				((StaffMembers) conu[Concordiamemtotal]).setStatus(Staffstatus.TEMP_STAFF);
				Concordiamemtotal++;
			}
			if(status==2)
			{
				((StaffMembers) conu[Concordiamemtotal]).setStatus(Staffstatus.PERM_STAFF);
				Concordiamemtotal++;
			}
			if(status==3)
			{
				((StaffMembers) conu[Concordiamemtotal]).setStatus(Staffstatus.OTHER);
				Concordiamemtotal++;
			}
			
			
			break;
		
		default:
			break;
		
		
		
		}
		
	}
	
	public static void showuser(){
		
		

		int newuser1=0;
		Scanner input= new Scanner(System.in);
		System.out.println("1 to view all students, 2 to view all students, or 3 to view all faculty or 4 to view all staff ");
		
		newuser1=input.nextInt();
		
		switch(newuser1){
		case 1:
			for(int i=0;i<Concordiamemtotal;i++)
			{
			System.out.println(conu[i].getFirstName());
			}
			break;
		case 2:
			for(int i=0;i<Concordiamemtotal;i++)
			{
			if(conu[i] instanceof Students )
			System.out.println(conu[i].getFirstName());
			}
			break;
		case 3:
			for(int i=0;i<Concordiamemtotal;i++)
			{
			if(conu[i] instanceof StaffMembers )
			System.out.println(conu[i].getFirstName());
			}
			break;
		
		default:break;
		
		}
		
		
	}
	public static void advanceby(){
		Scanner input= new Scanner(System.in);
		int viewpay=input.nextInt();
		System.out.println("PAYSTUBS-1 to view pay students, 2 to view all students, or 3 to view all faculty or 4 to view all staff ");
		
		
	}

}
