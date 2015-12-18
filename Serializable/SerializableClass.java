public class SerializableClass implements java.io.Serializable
{
	int i = 10 ;
	String name = "Suresh" ;
	transient int age = 20 ;
	double n = 24.03232 ;

	public String toString()
	{
		return "name "+name+" i "+i+" age "+age+" n "+n ;
	}
}
