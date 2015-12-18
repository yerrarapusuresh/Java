import java.util.*;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("this,,,,,,  for@#$ test!"," @#$,!");
		System.out.println(""+tokenizer.countTokens());
		int i = tokenizer.countTokens();
		while(i!=2)
		{
			System.out.println(tokenizer.nextToken());
			i--;
		}
		
		
		String str = "ZSuresh is good boy";
		char  ch =str.charAt(0);
		System.out.println(""+(char)(((((ch)%'A')+3)%26)+'A'));

	}

}
