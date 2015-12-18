
public class MediaPlayer 
{
	String Name ;
	String Type ;
	String Color ;
	boolean FMSupported = false ;
	boolean CDSupported = false ;
	
	MediaPlayer(String Name,String Type)
	{
		this.Name = Name ;
		this.Type = Type ;
		Color = "Grey";
	}
	
	MediaPlayer(String Name , String Type,String Color)
	{
		this(Name, Type);
		this.Color = Color ;
	}
	
	MediaPlayer(String comp_name)
	{
		Name = comp_name ;
		Type = "Radio";
	}
	
	String getName()
	{
		return Name ;
	}
	
	String getType()
	{
		
		return Type ;
	}
	
	String getColor()
	{
		return Color ;
	}
	
	void setRadio(String newType)
	{
		Type = newType ;
	}
	
	boolean isRadio()
	{
		return this.Type.equals("Radio");
	}
	
	boolean isIdentical(MediaPlayer O)
	{
		return this.getType().equals(O.getType());
		
	}
	
}
