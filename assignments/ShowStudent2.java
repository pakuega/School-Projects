package assignments;

public class ShowStudent2 {

	public static void main(String[] args) {
		Student pupil = new Student();
	      pupil.showIdNumber();
	      pupil.showPoints();
	      pupil.showHours();
	      System.out.println("The grade point average is " +
	         pupil.getGradePoint());

	}

}
