package CODE7;
import java.util.*;
public class CountWords
{
	public static void main(String[] args)
	{
		String words;
		boolean punctuation = false;
		System.out.print("Enter a string >> ");
		Scanner in = new Scanner(System.in);
		words = in.nextLine();
		words = words.replace(" " , ".");
		words = words.replace("!" , ".");
		words = words.replace("," , ".");
		words = words.replace("?" , ".");
		words = words.replace("@" , ".");
		words = words.replace("#" , ".");
		words = words.replace(";" , ".");
		words = words.replace("-" , ".");
		words = words.replace("_" , ".");
		char c;
		int count = 0;
		for(int i =0 ; i < words.length() ; i++)
		{
			c = words.charAt(i);
			if(c == '.')
			{
				if(!punctuation)
				{
					++count;
				}
				punctuation = true;
			}
			else
			{
				punctuation = false;
			}
		}
		if(words.charAt(words.length() - 1) != '.')
			++count;
		System.out.println("There are " + count + " words in the string");
	}
}