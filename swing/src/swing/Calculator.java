package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double n1,n2,result;
	String op,ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 350, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.text);
		textField.setBounds(20, 11, 290, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(SystemColor.menu);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setForeground(new Color(255, 0, 0));
		button_1.setBounds(20, 68, 52, 36);
		frame.getContentPane().add(button_1);
		
		JButton button = new JButton("4");
		button.setBackground(SystemColor.menu);
		button.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setForeground(Color.RED);
		button.setBounds(20, 124, 52, 36);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("7");
		button_2.setBackground(SystemColor.menu);
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setBounds(20, 183, 52, 36);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("0");
		button_3.setBackground(SystemColor.menu);
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setForeground(Color.RED);
		button_3.setBounds(20, 243, 52, 36);
		frame.getContentPane().add(button_3);
		
		JButton btnC = new JButton("C\r\n");
		btnC.setBackground(SystemColor.menu);
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnC.setForeground(Color.RED);
		btnC.setBounds(20, 301, 128, 36);
		frame.getContentPane().add(btnC);
		
		JButton button_5 = new JButton("2\r\n");
		button_5.setBackground(SystemColor.menu);
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setForeground(Color.RED);
		button_5.setBounds(96, 68, 52, 36);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBackground(SystemColor.menu);
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setForeground(Color.RED);
		button_6.setBounds(96, 124, 52, 36);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBackground(SystemColor.menu);
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setForeground(Color.RED);
		button_7.setBounds(96, 183, 52, 36);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(".");
		button_8.setBackground(SystemColor.menu);
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_8.setForeground(Color.RED);
		button_8.setBounds(96, 243, 52, 36);
		frame.getContentPane().add(button_8);
		
		JButton btnB = new JButton("B");
		btnB.setBackground(SystemColor.menu);
		btnB.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					b=str.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setForeground(Color.RED);
		btnB.setBounds(176, 301, 52, 36);
		frame.getContentPane().add(btnB);
		
		JButton button_10 = new JButton("3");
		button_10.setBackground(SystemColor.menu);
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setForeground(Color.RED);
		button_10.setBounds(176, 68, 52, 36);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("6");
		button_11.setBackground(SystemColor.menu);
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setForeground(Color.RED);
		button_11.setBounds(176, 124, 52, 36);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("9");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBackground(SystemColor.menu);
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_12.setForeground(Color.RED);
		button_12.setBounds(176, 183, 52, 36);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setBackground(SystemColor.menu);
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=n1+n2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=n1-n2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=n1*n2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=n1/n2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=n1%n2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
			}
		});
		button_13.setForeground(Color.RED);
		button_13.setBounds(176, 243, 52, 36);
		frame.getContentPane().add(button_13);
		
		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_15.setBackground(SystemColor.menu);
		button_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_15.setForeground(new Color(255, 0, 0));
		button_15.setBounds(251, 68, 52, 36);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("-");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_16.setBackground(SystemColor.menu);
		button_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_16.setForeground(Color.RED);
		button_16.setBounds(251, 124, 52, 36);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("*");
		button_17.setBackground(SystemColor.menu);
		button_17.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_17.setForeground(Color.RED);
		button_17.setBounds(251, 183, 52, 36);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("/\r\n");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_18.setBackground(SystemColor.menu);
		button_18.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_18.setForeground(Color.RED);
		button_18.setBounds(251, 243, 52, 36);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("%");
		button_19.setBackground(SystemColor.menu);
		button_19.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_19.setForeground(Color.RED);
		button_19.setBounds(251, 301, 52, 36);
		frame.getContentPane().add(button_19);
	}

}
