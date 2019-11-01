package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Project3 {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	int i=101,bno=12399;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 window = new Project3();
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
	public Project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 865, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setForeground(SystemColor.activeCaptionText);
		panel.setBounds(162, 11, 505, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setBounds(165, 0, 181, 49);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setForeground(SystemColor.desktop);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Ticket Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(363, 77, 476, 311);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label.setBounds(26, 35, 122, 20);
		panel_2.add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(203, 33, 197, 28);
		panel_2.add(textField_4);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(26, 112, 103, 28);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTo.setBounds(26, 151, 103, 28);
		panel_2.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblDate.setBounds(26, 190, 103, 28);
		panel_2.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTime.setBounds(26, 231, 103, 28);
		panel_2.add(lblTime);
		
		textField_5 = new JTextField();
		textField_5.setBounds(139, 116, 103, 24);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(139, 155, 103, 24);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(139, 194, 103, 24);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(139, 235, 103, 24);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(328, 131, 103, 24);
		panel_2.add(textField_9);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTicketNo.setBounds(328, 98, 103, 28);
		panel_2.add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblPrice.setBounds(328, 166, 103, 20);
		panel_2.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(328, 196, 103, 24);
		panel_2.add(textField_10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblRoute.setBounds(328, 231, 103, 20);
		panel_2.add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(328, 262, 103, 24);
		panel_2.add(textField_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 77, 349, 322);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox_2.setBounds(254, 133, 77, 20);
		panel_3.add(comboBox_2);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnAc.setBounds(107, 93, 53, 23);
		panel_3.add(rdbtnAc);
		
			
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String bnum=String.format("%d",bno);
				
				String v=" ";
				if(rdbtnAc.isSelected())
				{
					v="AC";
				}
				else
				{
					v="Non AC";
				}
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						textField.getText(),
						bnum,
						textField_5.getText(),
						textField_6.getText(),
						(String)comboBox_2.getSelectedItem(),
						textField_7.getText(),
						textField_8.getText(),
						v,
						textField_10.getText(),
				});
				bno++;
			}
		});
		btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnConfirm.setBounds(111, 277, 89, 23);
		panel_2.add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(10, 397, 829, 65);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name"," Booking No", "From", "To", "No of seat", "Date", "Time", "AC/NonAC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 11, 809, 53);
		panel_1.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(19, 119, 11, -10);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 50, 329, 2);
		panel_3.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(10, 21, 122, 20);
		panel_3.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(142, 11, 197, 28);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnStanderd = new JRadioButton("Standard");
		rdbtnStanderd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnStanderd.setBounds(10, 59, 95, 23);
		panel_3.add(rdbtnStanderd);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnSingleTicket.setBounds(107, 59, 109, 23);
		panel_3.add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnAdult.setBounds(234, 59, 109, 23);
		panel_3.add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnFirstClass.setBounds(10, 93, 95, 23);
		panel_3.add(rdbtnFirstClass);
		
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnSleeper.setBounds(162, 93, 84, 23);
		panel_3.add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnChild.setBounds(248, 93, 83, 23);
		panel_3.add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"From", "Kerala", "Tamilnadu", "Karnadaka", "Delhi", "Goa"}));
		comboBox.setBounds(10, 133, 109, 20);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"To", "Kerala", "Tamilnadu", "Karnadaka", "Delhi", "Goa"}));
		comboBox_1.setBounds(139, 133, 95, 20);
		panel_3.add(comboBox_1);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 164, 319, 2);
		panel_3.add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTax.setBounds(10, 177, 122, 20);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 208, 122, 20);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTotal.setBounds(10, 246, 122, 20);
		panel_3.add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 177, 154, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 208, 154, 20);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 239, 154, 20);
		panel_3.add(textField_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 277, 329, 2);
		panel_3.add(separator_2);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=String.format("%d",i);
				textField_9.setText(num);
				i++;
				
				String name=textField.getText();
				textField_4.setText(name);
				String from=(String) comboBox.getSelectedItem();
				textField_5.setText(from);
				String to=(String) comboBox_1.getSelectedItem();
				textField_6.setText(to);
				
				  Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_8.setText(tTime.format(timer.getTime()));
	               
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_7.setText(tdate.format(timer.getTime()));

			double t=0,tax=0;
			int no=Integer.parseInt((String) comboBox_2.getSelectedItem());
		
			if(rdbtnSingleTicket.isSelected())
			{
				t=t+500;
			}
			else
			{
				t=t+no*(700);
			}
			if(rdbtnAc.isSelected())
			{
				t=t+500;
				tax=t+200;
				textField_1.setText("200");
			}
			else
			{
				t=t+300;
				tax=t+100;
				textField_1.setText("100");
			}
			
			
			String st=String.format("%.2f",t);
			textField_2.setText(st);
			String taxst=String.format("%.2f",tax);
			textField_3.setText(taxst);
			textField_10.setText(taxst);
			textField_11.setText("Any");
		
			}
		
		
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(20, 290, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				comboBox_2.setSelectedItem(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				rdbtnStanderd.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnAc.setSelected(false);
				rdbtnSleeper.setSelected(false);
				rdbtnChild.setSelected(false);
				
				
			
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnReset.setBounds(127, 290, 89, 23);
		panel_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnExit.setBounds(227, 290, 89, 23);
		panel_3.add(btnExit);
	}
}
