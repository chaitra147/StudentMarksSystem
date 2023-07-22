import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField totalmarks;
	private JTextField average;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
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
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.LIGHT_GRAY, null, null));
		panel.setBounds(23, 10, 610, 448);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT MARKS CALCULATION SYSTEM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(90, 25, 465, 24);
		panel.add(lblNewLabel);
		
		JLabel lblSubject = new JLabel("SUBJECT 1");
		lblSubject.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSubject.setBounds(30, 96, 95, 24);
		panel.add(lblSubject);
		
		JLabel lblSubject_3 = new JLabel("SUBJECT 2");
		lblSubject_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSubject_3.setBounds(30, 136, 95, 24);
		panel.add(lblSubject_3);
		
		JLabel lblSubject_1 = new JLabel("SUBJECT 3");
		lblSubject_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSubject_1.setBounds(30, 177, 95, 24);
		panel.add(lblSubject_1);
		
		JLabel lblSubject_1_1 = new JLabel(" TOTAL MARKS");
		lblSubject_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSubject_1_1.setBounds(30, 247, 122, 24);
		panel.add(lblSubject_1_1);
		
		JLabel lblSubject_1_2 = new JLabel("AVERAGE");
		lblSubject_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSubject_1_2.setBounds(30, 303, 95, 24);
		panel.add(lblSubject_1_2);
		
		JLabel lblSubject_1_3 = new JLabel("GRADE");
		lblSubject_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSubject_1_3.setBounds(30, 362, 95, 24);
		panel.add(lblSubject_1_3);
		
		sub1 = new JTextField();
		sub1.setBounds(255, 96, 96, 19);
		panel.add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(255, 136, 96, 19);
		panel.add(sub2);
		
		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(255, 177, 96, 19);
		panel.add(sub3);
		
		totalmarks = new JTextField();
		totalmarks.setColumns(10);
		totalmarks.setBounds(255, 247, 96, 19);
		panel.add(totalmarks);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(255, 303, 96, 19);
		panel.add(average);
		
		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(255, 362, 96, 19);
		panel.add(grade);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				
				int total = s1 + s2 + s3;
				float avg = total/3;
				
				totalmarks.setText(String.valueOf(total));
				average.setText(String.valueOf(avg));
				if(avg>45)
				{
					grade.setText("PASS");
				}
				else
				{
					grade.setText("FAIL");
				}
				
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnAdd.setBounds(448, 123, 96, 51);
		panel.add(btnAdd);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				totalmarks.setText("");
				average.setText("");
				grade.setText("");
				sub1.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnClear.setBounds(448, 206, 96, 51);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnExit.setBounds(448, 302, 96, 51);
		panel.add(btnExit);
	}
}
