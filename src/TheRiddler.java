import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Riddle = JOptionPane.showInputDialog(null, "What is Michelle Obama's favorite vegetable");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
			if(Riddle.equals("Barakoli"){
			JOptionPane.showMessageDialog(null, "Correct");
			}
			else {JOptionPane.showMessageDialog(null, "Wrong!!!");}
		// 5. Otherwise, say "wrong" and tell them the answer
			
		// 6. Add some more riddles
		JOptionPane.showInputDialog("What do you call a owl that's a magician");
		// 2. Make a pop up to show the score.
			
	}
}
