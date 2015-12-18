public class Student implements Comparable<Student>
{
	 int id ;
	 String name ;
	 char grade ;
	public Student(int id , String name , char grade)
	{
		this.id = id ;
		this.name = name ;
		this.grade = grade ;
	}
	public int getId()
	{
		return id ;
	}
	public String getName()
	{
		return name ;
	}
	public char getGrade()
	{
		return grade ;
	}

	public int compareTo(Student  s)
	{
		if(this.id == s.getId())
			return 0 ;
		else if (this.id > s.getId())
			return 1 ;
		else
			return -1 ;
	}
	public String toString()
	{
		return String.format("Id "+this.id+" Name "+this.name+" Grad "+this.grade);
	}
}