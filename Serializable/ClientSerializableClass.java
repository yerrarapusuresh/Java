import java.io.*;

public class ClientSerializableClass
{
	
	public static void main(String[] args) 
	{
		

			SerializableClass sample = new SerializableClass();
			try
			{
				FileOutputStream file = new FileOutputStream("sample.ser");	
				ObjectOutputStream obj = new ObjectOutputStream(file);	
				obj.writeObject(sample);
				obj.close();
			}
			catch(Exception e)
			{
				System.out.println("Unable to write");
			}
			finally
			{
				//obj.close();
			}


			try
			{
				FileInputStream file = new FileInputStream("sample.ser");
				ObjectInputStream obj = new ObjectInputStream(file);
				SerializableClass s = (SerializableClass) obj.readObject();
				System.out.println(s);
				obj.close();

			}
			catch(Exception e)
			{
				System.out.println("Unble to read");
			}
			finally
			{
				//obj.close();
			}
	}
}