package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldDisplay;

	/**
	 * Launch the application.
	 */
	
	// Declares variable to store the number and result
	double first,second,result;
	String operation,answer;
	
	
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
		frame.setBounds(100, 100, 348, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldDisplay = new JTextField();
		textFieldDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldDisplay.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textFieldDisplay.setBounds(25, 30, 283, 84);
		frame.getContentPane().add(textFieldDisplay);
		textFieldDisplay.setColumns(10);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textFieldDisplay.getText().length()>0) {
					StringBuilder str = new StringBuilder(textFieldDisplay.getText());
					str.deleteCharAt(textFieldDisplay.getText().length()-1);
					backSpace = str.toString();
					textFieldDisplay.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 22));
		btnBack.setBounds(22, 124, 64, 56);
		frame.getContentPane().add(btnBack);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn7.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn7.setBounds(22, 190, 64, 56);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn4.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn4.setBounds(22, 254, 64, 56);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn1.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn1.setBounds(22, 320, 64, 56);
		frame.getContentPane().add(btn1);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn00.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn00.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn00.setBounds(22, 386, 64, 56);
		frame.getContentPane().add(btn00);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnClear.setBounds(96, 124, 64, 56);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn8.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn8.setBounds(96, 190, 64, 56);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn5.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn5.setBounds(96, 254, 64, 56);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn2.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn2.setBounds(96, 320, 64, 56);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn0.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn0.setBounds(96, 386, 64, 56);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btnDot.getText();
				textFieldDisplay.setText(number);
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnDot.setBounds(170, 386, 64, 56);
		frame.getContentPane().add(btnDot);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn3.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn3.setBounds(170, 320, 64, 56);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn6.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn6.setBounds(170, 254, 64, 56);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textFieldDisplay.getText()+ btn9.getText();
				textFieldDisplay.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn9.setBounds(169, 190, 64, 56);
		frame.getContentPane().add(btn9);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textFieldDisplay.getText());
				textFieldDisplay.setText("");
				operation = "%";
			}
		});
		btnModulo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnModulo.setBounds(170, 124, 64, 56);
		frame.getContentPane().add(btnModulo);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textFieldDisplay.getText());
				textFieldDisplay.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnAdd.setBounds(244, 124, 64, 56);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textFieldDisplay.getText());
				textFieldDisplay.setText("");
				operation = "-";
			}
		});
		btnSubtract.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnSubtract.setBounds(243, 190, 64, 56);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textFieldDisplay.getText());
				textFieldDisplay.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnMultiply.setBounds(244, 254, 64, 56);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textFieldDisplay.getText());
				textFieldDisplay.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnDivide.setBounds(244, 320, 64, 56);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second = Double.parseDouble(textFieldDisplay.getText());
				
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f",result);
					textFieldDisplay.setText(answer);
				}
				
				else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f",result);
					textFieldDisplay.setText(answer);
				}
				
				else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f",result);
					textFieldDisplay.setText(answer);
				}
				
				else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f",result);
					textFieldDisplay.setText(answer);
				}
				else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f",result);
					textFieldDisplay.setText(answer);
				}		
				
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnEqual.setBounds(244, 386, 64, 56);
		frame.getContentPane().add(btnEqual);
	}
}
