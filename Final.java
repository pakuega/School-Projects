
public class Final {

	public static void main(String[] args) {
		String str = "abc456";
		for (int i = 0; i < str.length(); i++)
		{
			char chr = str.charAt(i);
			if(!Character.isLetter(chr))
				System.out.println(Character.toUpperCase(chr));
		}

	}

}
