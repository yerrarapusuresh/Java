import java.io.*;
import java.net.*;

public class Client
{
	public void go()
	{
		try
		{
			Socket s = new Socket("127.0.0.1",4242);
			InputStreamReader stream = new InputStreamReader(s.getInputStream());
			BufferedReader buff = new BufferedReader(stream);
			
			System.out.println(buff.readLine());
			buff.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Client c = new Client();
		c.go();
	}
}