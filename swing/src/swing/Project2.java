package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Project2 {

	private JFrame frame;
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 window = new Project2();
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
	public Project2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Report");
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 868, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBorder(new TitledBorder(null, "Student Report", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(450, 11, 392, 319);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 24, 372, 250);
		panel_2.add(textArea);
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnClear.setForeground(Color.BLUE);
		btnClear.setBounds(148, 285, 89, 23);
		panel_2.add(btnClear);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 430, 313);
		frame.getContentPane().add(panel);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblStudentId.setBounds(20, 21, 92, 21);
		panel.add(lblStudentId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblFirstName.setBounds(20, 53, 92, 21);
		panel.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSurname.setBounds(20, 97, 92, 21);
		panel.add(lblSurname);
		
		JLabel lblCousecode = new JLabel("CouseCode");
		lblCousecode.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblCousecode.setBounds(20, 136, 92, 21);
		panel.add(lblCousecode);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(122, 21, 109, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 56, 109, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 97, 109, 20);
		panel.add(textField_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(20, 167, 210, 7);
		panel.add(separator);
		
		JLabel lblTotalscore = new JLabel("TotalScore\r\n");
		lblTotalscore.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTotalscore.setBounds(20, 185, 82, 21);
		panel.add(lblTotalscore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblAverage.setBounds(20, 227, 82, 21);
		panel.add(lblAverage);
		
		JLabel lblRank = new JLabel("Ranking");
		lblRank.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblRank.setBounds(20, 270, 82, 21);
		panel.add(lblRank);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 185, 109, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 227, 109, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 270, 109, 20);
		panel.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"123ABC", "123EFG", "123CDE", "234ABC", "234EFG", "345ASD"}));
		comboBox.setBounds(122, 136, 109, 20);
		panel.add(comboBox);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblMaths.setBounds(241, 24, 92, 21);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblEnglish.setBounds(241, 56, 92, 21);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblBiology.setBounds(241, 88, 92, 21);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblComputer.setBounds(241, 129, 92, 21);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblChemistry.setBounds(240, 167, 92, 21);
		panel.add(lblChemistry);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblMalayalam.setBounds(241, 273, 92, 21);
		panel.add(lblMalayalam);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblTamil.setBounds(241, 230, 92, 21);
		panel.add(lblTamil);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblPhysics.setBounds(241, 199, 92, 21);
		panel.add(lblPhysics);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			    char num=arg0.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    arg0.consume();
                }
				
			}
		});
		
		textField_6.setColumns(10);
		textField_6.setBounds(343, 24, 65, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(343, 56, 65, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(343, 97, 65, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(343, 136, 65, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(342, 167, 66, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(343, 199, 65, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(343, 230, 65, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 char num=e.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(343, 270, 65, 20);
		panel.add(textField_13);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int math=Integer.parseInt(textField_6.getText());
				int eng=Integer.parseInt(textField_7.getText());
				int bio=Integer.parseInt(textField_8.getText());
				int cmp=Integer.parseInt(textField_9.getText());
				int che=Integer.parseInt(textField_10.getText());
				int phy=Integer.parseInt(textField_11.getText());
				int tam=Integer.parseInt(textField_12.getText());
				int mal=Integer.parseInt(textField_13.getText());
				int total=math+eng+bio+cmp+che+phy+tam+mal;
				int avg=total/8;
				String st=String.format("%d",total);
				textField_3.setText(st);
				String aveg=String.format("%d",avg);
				textField_4.setText(aveg);
				if(total>=700)
				{
					textField_5.setText("1");
				}
				else if(total>=600&&total<700)
				{
					textField_5.setText("2");
				}
				else if(total>=500&&total<600)
				{
					textField_5.setText("3");
				}
				else if(total>=400&&total<300)
				{
					textField_5.setText("4");
				}
				else if(total>=300&&total<400)
				{
					textField_5.setText("5");
				}
				else if(total>=200&&total<300)
				{
					textField_5.setText("6");
				}
				else if(total>=100&&total<200)
				{
					textField_5.setText("7");
				}
				else if(total<100)
				{
					textField_5.setText("Fail");
				}
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						textField.getText(),
						(String)comboBox.getSelectedItem(),
						textField_6.getText(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						textField_10.getText(),
						textField_11.getText(),
						textField_12.getText(),
						textField_13.getText(),
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText(),
				});
			}	
		});
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setForeground(Color.GREEN);
		btnAddReport.setBounds(136, 435, 105, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.removeRow( row );
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDelete.setForeground(Color.RED);
		btnDelete.setBounds(266, 435, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Report\n"
						+"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"
								+ "============================"+"\nMaths:\t\t"+textField_5.getText()+"\n"
								+"English:\t\t"+textField_6.getText()+"\n"
								+"Biology:\t\t"+textField_7.getText()+"\n"
								+"Computer:\t\t"+textField_8.getText()+"\n"
								+"Chemistry:\t\t"+textField_9.getText()+"\n"
								+"Physics:\t\t"+textField_10.getText()+"\n"
								+"Tamil:\t\t"+textField_11.getText()+"\n"
								+"Malayalam:\t\t"+textField_12.getText()+"\n"
								+"================================"+"\n"
								+"Total:\t\t"+textField_3.getText()+"\n"
								+"Average:\t\t"+textField_4.getText()+"\n"
								+"Ranking:\t\t"+textField_5.getText()+"\n");
			}
		});
		btnShowReport.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnShowReport.setForeground(Color.BLUE);
		btnShowReport.setBounds(377, 435, 113, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnExit.setForeground(Color.MAGENTA);
		btnExit.setBounds(500, 435, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				comboBox.setSelectedItem(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnReset.setForeground(new Color(139, 0, 139));
		btnReset.setBounds(608, 435, 89, 23);
		frame.getContentPane().add(btnReset);
		
		table = new JTable();
		table.setBackground(SystemColor.activeCaption);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Couse_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam","Tolat_score", "Average","Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 348, 832, 76);
		frame.getContentPane().add(table);
	}
}
