package defaultPackage;

public class ConcordiaMembers {


		private String firstName;		
		private String lastName;
		private String concordiaID;		
		
		
	
		
		public ConcordiaMembers(String firstName, String lastName, String concordiaID){
			this.firstName=firstName;
			this.lastName=lastName;
			this.concordiaID=concordiaID;
			
		}
		
		public ConcordiaMembers() {
			
		}



		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getConcordiaID() {
			return concordiaID;
		}


		public void setConcordiaID(String concordiaID) {
			this.concordiaID = concordiaID;
		}




		

}
