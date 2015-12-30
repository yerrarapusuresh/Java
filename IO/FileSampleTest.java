import java.io.*;

public class FileSampleTest 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("sample.txt");
		System.out.println(file.exists());
		System.out.println(file.createNewFile());
		System.out.println(file.exists());
		FileWriter fw = new FileWriter(file);
		fw.write("Hello Suresh\n How Are you ??");
		char[] in = new char[200];
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(file);
		fr.read(in);
		for(char c : in)
			System.out.print(c);
		fr.close();

	}
}
