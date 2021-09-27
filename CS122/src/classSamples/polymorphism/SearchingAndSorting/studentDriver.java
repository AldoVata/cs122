package classSamples.polymorphism.SearchingAndSorting;

public class studentDriver {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		int found;
		
		students[0] = new Student("Greg",17);
		students[1] = new Student("Jimmy",15);
		students[2] = new Student("Amy",16);
		students[3] = new Student("John",18);
		students[4] = new Student("Skipper",19);
		
		Searching<Student> searches = new Searching<Student>();
		Student test = new Student("Greg",15);
		found = searches.linearSearch(students, test);
		System.out.println("Match for "+test+" at position: "+found);

	}

}
