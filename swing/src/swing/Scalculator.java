package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scalculator {

	private JFrame frame;
	private JTextField textField;
	Double n1,n2,result,a;
	String op,ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scalculator window = new Scalculator();
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
	public Scalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 661, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 38, 625, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEdit.setBounds(21, 13, 33, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblView.setBounds(64, 13, 33, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblHelp.setBounds(107, 13, 38, 14);
		frame.getContentPane().add(lblHelp);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 103, 298, 230);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnX.getText();
				textField.setText(Number);
			}
		});
		btnX.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnX.setBounds(10, 171, 89, 36);
		panel.add(btnX);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnXy.getText();
				textField.setText(Number);
			}
		});
		btnXy.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnXy.setBounds(10, 124, 89, 36);
		panel.add(btnXy);
		
		JButton button_2 = new JButton("%");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(10, 77, 89, 36);
		panel.add(button_2);
		
		JButton btnSqrt = new JButton("sqrt\r\n");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnSqrt.getText();
				textField.setText(Number);
			}
		});
		btnSqrt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSqrt.setBounds(10, 24, 89, 36);
		panel.add(btnSqrt);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnx.getText();
				textField.setText(Number);
			}
		});
		btnx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnx.setBounds(108, 24, 89, 36);
		panel.add(btnx);
		
		JButton btnExp = new JButton("Exp\r\n");
		btnExp.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnExp.getText();
				textField.setText(Number);
			}
		});
		btnExp.setBounds(109, 77, 89, 36);
		panel.add(btnExp);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnSin.getText();
				textField.setText(Number);
			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSin.setBounds(199, 24, 89, 36);
		panel.add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnCos.getText();
				textField.setText(Number);
			}
		});
		btnCos.setBounds(199, 77, 89, 36);
		panel.add(btnCos);
		
		JButton btnIn = new JButton("\r\nIn");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnIn.getText();
				textField.setText(Number);
			}
		});
		btnIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnIn.setBounds(108, 124, 89, 36);
		panel.add(btnIn);
		
		JButton btnTan = new JButton("tan");
		btnTan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnTan.getText();
				textField.setText(Number);
			}
		});
		btnTan.setBounds(199, 124, 89, 36);
		panel.add(btnTan);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnN.getText();
				textField.setText(Number);
			}
		});
		btnN.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnN.setBounds(108, 171, 89, 36);
		panel.add(btnN);
		
		JButton btnSec = new JButton("Sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnSec.getText();
				textField.setText(Number);
			}
		});
		btnSec.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSec.setBounds(199, 171, 89, 36);
		panel.add(btnSec);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(318, 103, 317, 230);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_8.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_8.setBounds(10, 26, 64, 38);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_9.getText();
				textField.setText(Number);
			}
			
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_9.setBounds(87, 26, 58, 38);
		panel_1.add(btnNewButton_9);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_4.setBounds(155, 26, 64, 38);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("/");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_5.setBounds(229, 26, 64, 38);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("4\r\n");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_6.setBounds(10, 75, 64, 38);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
			
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_7.setBounds(87, 75, 64, 38);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_8.setBounds(155, 75, 64, 38);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
			
		});
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_9.setBounds(229, 75, 64, 38);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_10.setBounds(10, 124, 64, 38);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_11.setBounds(87, 124, 64, 38);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_12.setBounds(155, 124, 64, 38);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_13.setBounds(229, 124, 64, 38);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("0");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_14.getText();
				textField.setText(Number);
			}
		});
		button_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_14.setBounds(10, 173, 64, 38);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_15.getText();
				textField.setText(Number);
			}
		});
		button_15.setFont(new Font("Times New Roman", Font.BOLD, 17));
		button_15.setBounds(87, 173, 64, 38);
		panel_1.add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2=Double.parseDouble(textField.getText());
				String s = e.getActionCommand();
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
					if (s.equals("sin")) {
						result=Math.sin(n1);
						ans=String.format("%.2f",result);
						textField.setText(ans);
						
						}
				if(op=="cos")
				{
					result=Math.cos(n1);
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="tan")
				{
					result=Math.tan(n1);
					ans=String.format("%.2f",result);
					textField.setText(ans);		
					}
				if(op=="log")
				{
					result=Math.log(n1);
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="exp")
				{
					result=Math.exp(n1);
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="")
				{
					result=1/n1;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
			}
		});
		button_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_16.setBounds(155, 173, 64, 38);
		panel_1.add(button_16);
		
		JButton button_17 = new JButton("+");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button_17.setBounds(229, 173, 64, 38);
		panel_1.add(button_17);
		
		JLabel lblNewLabel = new JLabel("Scientific");
		lblNewLabel.setBounds(10, 86, 87, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Standard");
		lblNewLabel_1.setBounds(318, 86, 98, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
