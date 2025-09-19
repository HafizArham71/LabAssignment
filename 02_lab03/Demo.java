public class Demo{

	public static void main(String[] args){

		Student s1 = new Student("Arham", "Male", new Date(1, 1, 2005), new Address("Pakistan", "Lahore"));

		System.out.println(s1.toString());
	}
}