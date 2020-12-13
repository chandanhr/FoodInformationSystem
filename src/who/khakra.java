package who;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class khakra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					khakra frame = new khakra();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public khakra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 817);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Swaad!");
		lblNewLabel.setForeground(new Color(218, 112, 214));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(407, 13, 109, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 17));
		lblNewLabel_1.setBounds(12, 356, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("origin");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel_2.setBounds(12, 412, 56, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel_3.setBounds(12, 483, 99, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(khakra.class.getResource("/who/khakhra.png")));
		lblNewLabel_4.setBounds(234, 53, 615, 287);
		contentPane.add(lblNewLabel_4);
		
		JTextArea txtrKhakhra = new JTextArea();
		txtrKhakhra.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrKhakhra.setText("Khakhra");
		txtrKhakhra.setBounds(133, 353, 693, 29);
		contentPane.add(txtrKhakhra);
		
		JTextArea txtrGujaratindia = new JTextArea();
		txtrGujaratindia.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrGujaratindia.setText("Gujarat,India");
		txtrGujaratindia.setBounds(133, 406, 693, 29);
		contentPane.add(txtrGujaratindia);
		
		JTextArea txtrItIsMade = new JTextArea();
		txtrItIsMade.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrItIsMade.setText("It is made up of bean,wheat flour and oil.It is served ususally during breakfast.\r\nKhakhras are individually hand-made and roasted to provide a crunchy and healthy \r\nwith pickles and sweet chutney or milk and tea.");
		txtrItIsMade.setBounds(133, 450, 546, 73);
		contentPane.add(txtrItIsMade);
		
		JLabel lblNewLabel_5 = new JLabel("Khakhra");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(45, 100, 131, 81);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(308, 536, 97, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Deepu K B\\Desktop\\exit_button-128.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(463, 536, 97, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblRating = new JLabel("Rating");
		lblRating.setBounds(45, 644, 56, 16);
		contentPane.add(lblRating);
		
		textField = new JTextField();
		textField.setText("4");
		textField.setBounds(169, 641, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
