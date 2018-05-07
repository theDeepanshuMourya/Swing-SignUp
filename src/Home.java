import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {
 /**
 *
 * @author Deepanshu Mourya(theDeepanshuMourya)
 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 443);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 308, 452);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();

		        int y = arg0.getYOnScreen();

		       Home.this.setLocation(x - xx, y - xy);
			}
		});
		lblNewLabel.setBounds(-54, -12, 390, 292);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/2 (1).jpg")));
		
		JLabel lblLoginUi = new JLabel("Login UI");
		lblLoginUi.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginUi.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLoginUi.setForeground(new Color(255, 255, 255));
		lblLoginUi.setBounds(87, 310, 124, 25);
		panel.add(lblLoginUi);
		
		JLabel lblweGotYou = new JLabel("Welcomes You");
		lblweGotYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblweGotYou.setForeground(Color.WHITE);
		lblweGotYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblweGotYou.setBounds(87, 346, 124, 25);
		panel.add(lblweGotYou);
		
		Button button = new Button("SignUp");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(250, 128, 114));
		button.setBounds(329, 331, 283, 35);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(329, 67, 283, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(329, 139, 283, 29);
		contentPane.add(textField_1);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(329, 40, 113, 14);
		contentPane.add(lblUsername);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(329, 114, 113, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(329, 184, 113, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD");
		lblConfirmPassword.setBounds(329, 255, 199, 14);
		contentPane.add(lblConfirmPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(329, 209, 283, 29);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(329, 280, 283, 29);
		contentPane.add(passwordField_1);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
				
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblX.setBounds(602, 0, 43, 25);
		contentPane.add(lblX);
		
		JLabel lblCopyrightcThedeepanshumourya = new JLabel("Copyright(c) theDeepanshuMourya 2018.");
		lblCopyrightcThedeepanshumourya.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCopyrightcThedeepanshumourya.setBounds(474, 411, 181, 20);
		contentPane.add(lblCopyrightcThedeepanshumourya);
		
		JLabel lblAllRightsReserved = new JLabel("All rights reserved.");
		lblAllRightsReserved.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblAllRightsReserved.setBounds(567, 428, 78, 14);
		contentPane.add(lblAllRightsReserved);
	}
}
