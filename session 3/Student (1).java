class Student
{
	String name="Adam";
	int marks=96;
	
	Student()
	{
		name="No Name";
	}
	Student(String n)
	{
		name=n;
	}
	Student(String n,int m)
	{
		name=n;
		marks=m;
	}
}

class StudentDemo 
{
	public static void main(String[] args)
	{
		System.out.println(" Hi from StudentDemo Class");
		System.out.println(" Creating an object of Student Class");
		Student s1=new Student();
		System.out.println(" Created an object of Student Class");
		System.out.println(" Name value of the object is:"+s1.name);
		System.out.println(" Mark of the student is:"+s1.marks);
		s1.name="Lathika";
		s1.marks=69;
		System.out.println(" Name value of the object is:"+s1.name);
		System.out.println(" Mark of the student is:"+s1.marks);
	}
	
}
