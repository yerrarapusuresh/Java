import java.io.*;
import java.util.*;
import java.net.*;

public class Server
{
	public  void go()
	{
		try
		{
			ServerSocket s = new ServerSocket(4242);
			while(true)
			{
				Socket sock = s.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String name = getName();
				writer.println(name);
				writer.close();
				System.out.println(name);

			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public String getName()
	{
		String str[] = {"Suresh","Sumit-","Shashikant-rombaBusy","Gowthami","kirthi","daksh","all lab mates"};
		Random r = new Random();
		return str[r.nextInt(str.length)];

	}
	public static void  main(String[] args) 
	{
		Server server = new Server();
		server.go();
		
	}
}