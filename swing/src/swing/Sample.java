package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Sample {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login page");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEnter = new JButton("Sing In");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnter.setForeground(Color.RED);
		btnEnter.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnEnter.setBounds(230, 205, 104, 28);
		frame.getContentPane().add(btnEnter);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		txtUserName.setBounds(170, 70, 177, 28);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		txtPassword.setBounds(170, 125, 177, 28);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 72, 93, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 124, 74, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxForgotPassword = new JCheckBox("Reminder");
		chckbxForgotPassword.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		chckbxForgotPassword.setBackground(Color.BLUE);
		chckbxForgotPassword.setBounds(300, 175, 85, 23);
		frame.getContentPane().add(chckbxForgotPassword);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(67, 205, 104, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setBounds(142, 0, 114, 47);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
