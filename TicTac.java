package TicTacPack;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TicTac {

	private JFrame frame;
	private JTextField Xcount;
	private JTextField Ocount;
	private int XCount1=0;
	private int OCount1=0;
	private String start="X";
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int i=0;
	 

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac window = new TicTac();
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
	public TicTac() {
		initialize();
	}
	
	private void chooseplayer(){
		if(start.equalsIgnoreCase("X")) {
			start="O";
			
		}
		else {
			start="X";
		}
	}
	private void winGame(){
		if((b1==1&& b2==1&&b3==1)||(b4==1&&b5==1&&b6==1)||(b7==1&&b8==1&&b9==1)||(b1==1&&b4==1&&b7==1)||(b2==1&&b5==1&&b8==1)||(b3==1&&b6==1&&b9==1)||(b1==1&&b5==1&&b9==1||(b3==1&&b5==1&&b7==1))) {
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount1++;
			Xcount.setText(String.valueOf(XCount1));
		}
		else if ((b1==0&& b2==0&&b3==0)||(b4==0&&b5==0&&b6==0)||(b7==0&&b8==0&&b9==0)||(b1==0&&b4==0&&b7==0)||(b2==0&&b5==0&&b8==0)||(b3==0&&b6==0&&b9==0)||(b1==0&&b5==0&&b9==0)||(b3==0&&b5==0&&b7==0)) {
				JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
				OCount1++;
				Ocount.setText(String.valueOf(OCount1));
			}
		else if (i==9) {
	        JOptionPane.showMessageDialog(frame, "It's a Draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	    }
			
		}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn1.getText() == null ||btn1.getText().isEmpty()) { // Check if the button is not already set
		            btn1.setText(start);
				
				if(start.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
					b1=1;
					i++;
				}
				else {
					btn1.setForeground(Color.GREEN);
					b1=0;
					i++;
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn2.getText() == null ||btn2.getText().isEmpty()) { // Check if the button is not already set
		            btn2.setText(start);
				
				if(start.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
					b2=1;
					i++;
				}
				else {
					btn2.setForeground(Color.GREEN);
					b2=0;
					i++;
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getText() == null ||btn3.getText().isEmpty()) { // Check if the button is not already set
		            btn3.setText(start);
				if(start.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
					b3=1;
					i++;
				}
				else {
					btn3.setForeground(Color.GREEN);
					b3=0;
					i++;
				}
				chooseplayer();
				winGame();
			}
			}
		});
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		Xcount = new JTextField();
		Xcount.setHorizontalAlignment(SwingConstants.CENTER);
		Xcount.setFont(new Font("Tahoma", Font.BOLD, 22));
		Xcount.setText("0");
		panel_5.add(Xcount, BorderLayout.CENTER);
		Xcount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getText() == null ||btn4.getText().isEmpty()) { // Check if the button is not already set
		       
				btn4.setText(start);
				if(start.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
					b4=1;
					i++;
				}
				else {
					btn4.setForeground(Color.GREEN);
					b4=0;
					i++;
					
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn5.getText() == null ||btn5.getText().isEmpty()) { // Check if the button is not already set
		            btn5.setText(start);
				
				if(start.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
					b5=1;
					i++;
				}
				else {
					btn5.setForeground(Color.GREEN);
					b5=0;
					i++;
					
				}
				chooseplayer();
				winGame();
			}
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getText() == null ||btn6.getText().isEmpty()) {
				btn6.setText(start);
				if(start.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
					b6=1;
					i++;
					
				}
				else {
					btn6.setForeground(Color.GREEN);
					b6=0;
					i++;
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		Ocount = new JTextField();
		Ocount.setText("0");
		Ocount.setFont(new Font("Tahoma", Font.BOLD, 22));
		Ocount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(Ocount, BorderLayout.CENTER);
		Ocount.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getText() == null ||btn7.getText().isEmpty()) {
				btn7.setText(start);
				if(start.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
					b7=1;
					i++;
					
				}
				else {
					btn7.setForeground(Color.GREEN);
					b7=0;
					i++;
					
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_10.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getText() == null ||btn8.getText().isEmpty()) {
				btn8.setText(start);
				if(start.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
					b8=1;
					i++;
					
				}
				else {
					btn8.setForeground(Color.GREEN);
					b8=0;
					i++;
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getText() == null ||btn9.getText().isEmpty()) {
				btn9.setText(start);
				if(start.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
					b9=1;
					i++;
				}
				else {
					btn9.setForeground(Color.GREEN);
					b9=0;
					i++;
				}
				chooseplayer();
				winGame();
			}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				  b1=10;
				  b2=10;
				  b3=10;
				  b4=10;
				  b5=10;
				  b6=10;
				  b7=10;
				  b8=10;
				  b9=10;
				  i=0;
				  
			  
				
			}
		});
		btnReset.setBackground(new Color(128, 128, 128));
		btnReset.setForeground(new Color(0, 0, 0));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm You Want To Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
				
			}
			
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
