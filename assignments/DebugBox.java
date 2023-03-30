package assignments;

public class DebugBox {
	   private int width;
	   private int length;
	   private int height;
	   public  DebugBox()
	   {
	      this.length = 1;
	      this.width = 1;
	      this.height = 1;
	   }
	   public  DebugBox(int w, int l,int h)
	   {
	      width = w;
	      length = l;
	      height = h;
	   }
	   public void showData()
	   {
	      System.out.println("Width: " + width + "  Length: " +
	        length + "  Height: "+ height);
	   }
	   public double getVolume()
	   { 
	      double vol = length * width * height;
	      return vol;
	   }

}
