import acm.graphics.*;
import acm.program.*;
public class DrawRobar  extends GraphicsProgram{
	
	public void run()
	{
		add(new GOval(120,20,40,40));
		add(new GRect(100,60,80,110));
		add(new GRect(115,170,15,70));
		add(new GRect(150,170,15,70));
	}

}
