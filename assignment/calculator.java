package ch9;

import javax.swing.*;
import java.awt.*;

public class calculator extends JFrame{
	public calculator() {
				setTitle("계산기");
				setSize(300, 300);
				setLocation(130, 300);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				JPanel jp1 = new JPanel();
				JPanel jp2 = new JPanel();
				
				this.add(jp1);
				jp1.setLayout(new FlowLayout());
			
				jp2.setLayout(new GridLayout(4,4));
				jp2.setPreferredSize(new Dimension(220,220));
				
				JButton b1 = new JButton("1");
				jp2.add(b1);
				
				JButton b2 = new JButton("2");
				jp2.add(b2);
				
				JButton b3 = new JButton("3");
				jp2.add(b3);

				JButton minus = new JButton("-");
				jp2.add(minus);
		
				JButton b4 = new JButton("4");
				jp2.add(b4);
				
				JButton b5 = new JButton("5");
				jp2.add(b5);
				
				JButton b6 = new JButton("6");
				jp2.add(b6);

				JButton plus = new JButton("+");
				jp2.add(plus);
			
				JButton b7 = new JButton("7");
				jp2.add(b7);
				
				JButton b8 = new JButton("8");
				jp2.add(b8);
				
				JButton b9 = new JButton("9");
				jp2.add(b9);

				JButton mul = new JButton("*");
				jp2.add(mul);
			
				JButton b0 = new JButton("0");
				jp2.add(b0);
				
				JButton dot = new JButton(".");
				jp2.add(dot);
				
				JButton eq = new JButton("=");
				jp2.add(eq);

				JButton div = new JButton("/");
				jp2.add(div);
				

				JTextField text = new JTextField(15);
				jp1.add(text);
				jp1.add(jp2);
						
				this.setVisible(true);
				
			}
			
			public static void main(String[] args) {
				new calculator();
				
			}

		}