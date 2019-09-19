package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField text;
	
public static void main(String[] args) {
	
	new BinaryConverter().createUI();
}	
	void createUI() {
	text = new JTextField (20);
	frame = new JFrame ();
	panel = new JPanel ();
	button = new JButton ("convert");
	frame.setTitle("Convert 8 bits of binary to ASCII");
	
	frame.add(panel);
	panel .add(text);
	panel .add (button);
	
	button.addActionListener(this);
	
	frame.pack();
	frame.setVisible(true);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
