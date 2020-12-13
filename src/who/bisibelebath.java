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

public class bisibelebath extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bisibelebath frame = new bisibelebath();
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
	public bisibelebath() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 621);
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
		lblNewLabel_4.setIcon(new ImageIcon(bisibelebath.class.getResource("/who/bisibele-600x378.jpg")));
		lblNewLabel_4.setBounds(264, 59, 603, 275);
		contentPane.add(lblNewLabel_4);
		
		JTextArea txtrHotLentilRice = new JTextArea();
		txtrHotLentilRice.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrHotLentilRice.setText("Hot lentil Rice dish");
		txtrHotLentilRice.setBounds(133, 353, 693, 29);
		contentPane.add(txtrHotLentilRice);
		
		JTextArea txtrMysuruPalacekarnataka = new JTextArea();
		txtrMysuruPalacekarnataka.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrMysuruPalacekarnataka.setText("Mysuru Palace,Karnataka");
		txtrMysuruPalacekarnataka.setBounds(133, 406, 693, 29);
		contentPane.add(txtrMysuruPalacekarnataka);
		
		JTextArea txtrItIsMade = new JTextArea();
		txtrItIsMade.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrItIsMade.setText("It is a rice based wholesome dish.Its preparation includes spices,toor dal,rice,ghee \r\nand vegetables.Bisibele bath is usually served with chutney,boondi,papad or potato chips.");
		txtrItIsMade.setBounds(133, 450, 693, 73);
		contentPane.add(txtrItIsMade);
		
		JLabel lblNewLabel_5 = new JLabel("Bisibelebath");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(45, 100, 182, 81);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(308, 536, 97, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(471, 536, 97, 38);
		contentPane.add(btnNewButton_1);
	}
}	