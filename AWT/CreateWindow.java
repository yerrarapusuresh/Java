import javax.swing.* ;
import java.awt.event.* ;

public  class CreateWindow //implements ActionListener
{
	
	public static void main(String args[])
	{
		
		CreateWindow cw = new CreateWindow();
		cw.go();
	}
	public void go()
	{
		JFrame frame = new JFrame();
		//CreateWindow cw = new CreateWindow();
		JButton button = new JButton("Click me");
		buttonListner bl = new buttonListner(button);
		frame.setSize(300,300);
		button.addActionListener(bl);
		frame.setVisible(true);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*public void actionPerformed(ActionEvent ae)
	{
		button.setText("You Done Great Job");
	}*/
}