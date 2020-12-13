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

public class momos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					momos frame = new momos();
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
	public momos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 623);
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
		lblNewLabel_4.setIcon(new ImageIcon(momos.class.getResource("/who/Screenshot-14-9.png")));
		lblNewLabel_4.setBounds(225, 51, 582, 289);
		contentPane.add(lblNewLabel_4);
		
		JTextArea txtrSteamedBunmomos = new JTextArea();
		txtrSteamedBunmomos.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrSteamedBunmomos.setText("Steamed Bun(momos)");
		txtrSteamedBunmomos.setBounds(133, 353, 693, 29);
		contentPane.add(txtrSteamedBunmomos);
		
		JTextArea txtrLadakhnortheastIndia = new JTextArea();
		txtrLadakhnortheastIndia.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrLadakhnortheastIndia.setText("Ladakh,Northeast India");
		txtrLadakhnortheastIndia.setBounds(133, 406, 693, 29);
		contentPane.add(txtrLadakhnortheastIndia);
		
		JTextArea txtrItIsMade = new JTextArea();
		txtrItIsMade.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrItIsMade.setText("Momos are also native to Tibet,Bhutan and Darjeeling.It is a steamed dumpling with some of\r\nfilling(veg/non-veg).A simple white flour dough,yeast or baking soda is used for the outer covering.\r\nVarieties are Steam,fried,open momo");
		txtrItIsMade.setBounds(133, 450, 693, 73);
		contentPane.add(txtrItIsMade);
		
		JLabel lblNewLabel_5 = new JLabel("Momos");
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
		btnNewButton.setBounds(308, 536, 97, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(471, 536, 97, 40);
		contentPane.add(btnNewButton_1);
	}
}
