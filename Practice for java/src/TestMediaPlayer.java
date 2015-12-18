
public class TestMediaPlayer {

	public static void main(String[] args)
	{
		MediaPlayer bpl = new MediaPlayer("BPL");
		MediaPlayer sunsui = new MediaPlayer("Sansui");
		MediaPlayer LG = new MediaPlayer("LG","Radi","Green");
		System.out.println("The Type of radio is "+bpl.getType());
		System.out.println("The Type of radio is "+sunsui.getType());
		System.out.println("Color of bpl "+bpl.getColor()+"Color of Sunsui "+sunsui.getColor());
		System.out.println("is identical "+bpl.isIdentical(LG));
		
	}
	

}
