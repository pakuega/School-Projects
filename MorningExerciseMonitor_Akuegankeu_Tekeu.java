import java.util.*;
public class MorningExerciseMonitor_Akuegankeu_Tekeu 
{
	private String fullName;
	private float [] arrayNumber = new float[7];
	
	public MorningExerciseMonitor_Akuegankeu_Tekeu() {}
	
	public MorningExerciseMonitor_Akuegankeu_Tekeu(String name, float[] distance)
	{
		fullName = name;
		arrayNumber = distance;
	}
	public String toString() {
        String msg="PERSON\n";
        msg = msg + "Name = "+ fullName +"\nWeek Exercise Distance = ";
        for(int i=0; i < arrayNumber.length; i++) 
        {
           if(i==arrayNumber.length-1)
                msg = msg +""+ arrayNumber[i];
           else
                msg = msg + arrayNumber[i]+", ";
        }
       
         return msg;
         
	 }
    public static void main(String[] args) {
            float arr[]= {2.1f, 2.5f, 2.2f, 2.4f, 2.6f, 2.2f, 2.4f};
            MorningExerciseMonitor_Akuegankeu_Tekeu ex = new MorningExerciseMonitor_Akuegankeu_Tekeu("Mary Lane", arr);
            System.out.println(ex);
    }
}
