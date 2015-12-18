import java.awt.event.*;
import javax.swing.*;

class buttonListner implements ActionListener
{
	JButton button ;
	public buttonListner(JButton b)
	{
		button = b ;
	}
	public void actionPerformed(ActionEvent ae)
	{
		button.setText("Another great job");
	}
}