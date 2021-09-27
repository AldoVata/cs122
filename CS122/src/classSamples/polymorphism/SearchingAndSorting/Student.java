package classSamples.polymorphism.SearchingAndSorting;

public class Student implements Comparable<Student>{
	String name;
	int age;
	
	public Student(String n, int a)
	{
		name = n;
		age = a;
	}

	public boolean equals(Object s)
	{
		if(this.age == ((Student)s).age)
			return true;
		return false;
	}
	
	public int compareTo(Student s)
	{
		if(age < s.age)
			return 1;
		else if (age> s.age)
			return -1;
		return 0;
	}
	
	public String toString()
	{
		return "("+name+", "+age+")";
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}
