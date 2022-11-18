package ch7;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("Contentpane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("202110952"));
		contentPane.add(new JButton("윤서진"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
