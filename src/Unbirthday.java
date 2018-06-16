import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday= JOptionPane.showInputDialog(null, "What is your birthday?");
	if(birthday.equals("6-16")) {
	System.out.println("Happy Birthday");
	}
	else {
		System.out.println("Merry Unbirthday");
	}
}
}