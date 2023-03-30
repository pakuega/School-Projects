package assignments;

import javax.swing.JOptionPane;


public class RandomGuessMatch {

	public static void main(String[] args) {
		
		Boolean isRandom;
		String answer;
		answer = JOptionPane.showInputDialog(null, "Think of a number between 1 and 5");
		
		int guess = Integer.parseInt(answer);
		int number = (1 + (int)(Math.random() * 5));
		int dNumber= guess-number;
		
		JOptionPane.showMessageDialog(null, "The difference is " + dNumber);
		
		if (guess == number)
			
			isRandom = true;
		else
			isRandom = false;
		
		JOptionPane.showMessageDialog(null,"The number is "+ number +
				"\nIs this guess correct? " + isRandom);
		

	}

}
