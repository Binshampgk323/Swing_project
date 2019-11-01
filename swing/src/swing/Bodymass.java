package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bodymass {

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
					Bodymass window = new Bodymass();
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
	public Bodymass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frame.setBounds(100, 100, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(10, 87, 264, 232);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(121, 25, 133, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 72, 133, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Height(m) :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 25, 89, 28);
		panel.add(lblNewLabel);
		
		JLabel lblWeightkg = new JLabel("Weight(kg) :");
		lblWeightkg.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblWeightkg.setBounds(10, 72, 89, 28);
		panel.add(lblWeightkg);
		
		JLabel lblNewLabel_1 = new JLabel("BMI");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 128, 52, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(159, 128, 89, 23);
		panel.add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBackground(new Color(255, 215, 0));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(72, 128, 64, 23);
		panel.add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("Calculate\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField_1.getText());
				double r=(n1/n2/n2)*10000;
				String ans=String.format("%.2f", r);
				lblNewLabel_3.setText(ans);
				if(r<18.5)
				{
					lblNewLabel_2 .setText("Under Weight");
				
				}
				else if(r>=18.5&&r<=24.9)
				{
					lblNewLabel_2 .setText("Normal Weight");
					
				}
				else if(r>=25&&r<=29.9)
				{
					lblNewLabel_2 .setText("Over Weight");
					
				}else if(r>30)
				{
					lblNewLabel_2 .setText("Obese");
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(10, 198, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				lblNewLabel_3.setText(null);
				lblNewLabel_2.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_1.setBounds(114, 198, 64, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_2.setBounds(188, 198, 66, 23);
		panel.add(btnNewButton_2);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(34, 139, 34));
		panel_1.setBounds(10, 5, 264, 71);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Body Mass Index");
		label.setForeground(new Color(0, 0, 139));
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label.setBounds(54, 11, 187, 49);
		panel_1.add(label);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setToolTipText("");
		lblNewLabel_4.setText("\r\n\r\n");
		lblNewLabel_4.setLabelFor(frame);
		lblNewLabel_4.setBounds(10, 330, 264, 121);
		frame.getContentPane().add(lblNewLabel_4);
		ImageIcon imgThisImg = new ImageIcon("C://Users/USER/Downloads/Capture.PNG");


		lblNewLabel_4 .setIcon(imgThisImg);
	}
}
