package defaultPackage;

public class ConcordiaDatabase {
		
	private Students[] students;
	private FacultyMembers[] facultyMembers;
	private StaffMembers[] staffMembers;
	final private int MAX_ARRAY_SIZE = 100;
	
	public ConcordiaDatabase() {
		this.students = new Students[MAX_ARRAY_SIZE];
		this.facultyMembers = new FacultyMembers[MAX_ARRAY_SIZE];
		this.staffMembers = new StaffMembers[MAX_ARRAY_SIZE];
	}
	

	
}
