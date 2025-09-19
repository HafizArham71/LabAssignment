public class Student{

	// Attributes
	private static int nextId = 1;
	private int id;
	private String name;
	private String gender;
	private String dateOfBirth;
	private String address;

	// Constructors
	public Student(String name, String gender, String dateOfBirth, String address){
		this.id = this.nextId++;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;	
	}
	
	public Student(){
		
	}

	// Getline
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public String getAddress(){
		return address;
	}

	// Setline
	public void setName(String name){
		this.name = name;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setAddress(String address){
		this.address = address;
	}

	@Override
    	public String toString() {
        	return String.format("ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Date of Birth: " + dateOfBirth + ", Address: " + address);
	}

}