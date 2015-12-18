import java.util.* ;

public class StudentCmpForName implements Comparator<StudentWithComparative>
{
	public int compare(StudentWithComparative s , StudentWithComparative s1)
	{
		char ss = s.getGrade();
		char ee = s1.getGrade();
		if(ss == ee)
			return 0 ;
		else if (ss < ee)
			return -1 ;
		else return 1 ;
	}
}