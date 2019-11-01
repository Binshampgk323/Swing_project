package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Heightandweight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Double n1,n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Heightandweight window = new Heightandweight();
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
	public Heightandweight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter");
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(132, 89, 128, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 136, 128, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Help\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 69, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("About");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(75, 11, 57, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Height");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(33, 89, 89, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Weight");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(33, 141, 69, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("US measurement");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(130, 51, 116, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Metric");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(301, 51, 69, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setBounds(311, 89, 89, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setBounds(311, 136, 89, 19);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("OK\r\n\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField_1.getText());
				Double r=(n1/3.2808);
				Double r2=(n2/2.2046);
				String a=String.format("%.2f m",r);
				String a2=String.format("%.0f kg",r2);
				lblNewLabel_6.setText(a);
				lblNewLabel_7.setText(a2);
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(100, 204, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				lblNewLabel_6.setText(null);
				lblNewLabel_7.setText(null);


			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(221, 204, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
