package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String input =  JOptionPane.showInputDialog("what kind of popcorn do you want???");
	String inputinput =  JOptionPane.showInputDialog("how log do you want to cook your popcorn???");
	int num = Integer.parseInt(inputinput);
	Popcorn cron = new Popcorn(input);
	Microwave wav = new  Microwave ();
	wav.putInMicrowave(cron);
	wav.setTime(num);
	wav.startMicrowave();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
