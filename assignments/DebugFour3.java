package assignments;

public class DebugFour3 {

	public static void main(String[] args) {
		          int width= 12;
			      int length = 10;
			      int height = 8;
			      DebugBox box1 = new DebugBox();
			      DebugBox box2 = new DebugBox(width, length, height);
			      System.out.println("The dimensions of the first box are");
			      box1.showData();
			      System.out.print("  The volume of the first box is ");
			      showVolume(box1);
			      System.out.println("The dimensions of the second box are");
			      box2.showData();
			      System.out.print("  The volume of the second box is ");
			      showVolume(box2);
			   }
			   public static void showVolume(DebugBox aBox)
			   {
			      double vol = aBox.getVolume();
			      System.out.println(vol);
			   }

	

}
