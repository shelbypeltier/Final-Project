import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.TextArea;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.UIManager;


public class gui {

	private JFrame frmRegister;
	private JPanel mainPanel;
	private JLayeredPane layeredPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtTab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	
public void panelSwitcher(JPanel panel) {
	layeredPane.removeAll();
	layeredPane.add(panel); 
	layeredPane.repaint();
	layeredPane.revalidate();
}

//Does what it says on the tin, switches between the panels
	
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setResizable(false);
		frmRegister.setTitle("Register");
		frmRegister.getContentPane().setForeground(Color.WHITE);
		frmRegister.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 708, 673);
		frmRegister.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		mainPanel = new JPanel();
		layeredPane.add(mainPanel, "name_279449572344700");
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(211, 211, 211));
		mainPanel.add(panel_4_1, BorderLayout.NORTH);
		panel_4_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_6_1 = new JLabel("Main Menu\r\n");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_4_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6 = new JLabel("Press Tab to add or remove food items!");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Press Cash out to cash out customer ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4_1.add(lblNewLabel_7);
		
		JPanel panel = new JPanel();
		mainPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 3, 50, 50));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel = new JLabel("Table 1");
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setBackground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JPanel foodPanel = new JPanel();
		foodPanel.setLayout(null);
		foodPanel.setBackground(new Color(245, 245, 245));
		layeredPane.add(foodPanel, "name_87183823231600");
		
		JPanel cashOutPanel = new JPanel();
		cashOutPanel.setLayout(null);
		layeredPane.add(cashOutPanel, "name_89245863028200");

		JPanel burgerPanel = new JPanel();
		burgerPanel.setLayout(null);
		layeredPane.add(burgerPanel, "name_89247955965200");

		JPanel chickenTenderPanel = new JPanel();
		chickenTenderPanel.setLayout(null);
		layeredPane.add(chickenTenderPanel, "name_89250918515800");

		JPanel sidesPanel = new JPanel();
		sidesPanel.setLayout(null);
		layeredPane.add(sidesPanel, "name_89252583363100");

		JPanel saladPanel = new JPanel();
		saladPanel.setLayout(null);
		layeredPane.add(saladPanel, "name_89255018988000");

		JPanel drinkPanel = new JPanel();
		drinkPanel.setLayout(null);
		layeredPane.add(drinkPanel, "name_89257821863100");

		JPanel dessertPanel = new JPanel();
		dessertPanel.setLayout(null);
		layeredPane.add(dessertPanel, "name_89259888474000");
		
		JButton btnCashOut = new JButton("Tab");
		btnCashOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelSwitcher(foodPanel); 
			}
		});
		
		//Button switches view to panel 4 when pressed
		btnCashOut.setBackground(Color.WHITE);
		panel_2.add(btnCashOut);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Cash Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelSwitcher(cashOutPanel); 
			}
		});
		panel_3.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Table 2");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1.setBackground(Color.WHITE);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_1_1.add(panel_2_1);
		
		JButton btnNewButton_2 = new JButton("Tab");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		panel_2_1.add(btnNewButton_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_1_1.add(panel_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Cash Out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(cashOutPanel); 
			}
		});
		panel_3_1.add(btnNewButton_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Table 3");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_2.setBackground(Color.WHITE);
		panel_1_2.add(lblNewLabel_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_1_2.add(panel_2_2);
		
		JButton btnNewButton_3 = new JButton("Tab");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		panel_2_2.add(btnNewButton_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_1_2.add(panel_3_2);
		
		JButton btnNewButton_1_2 = new JButton("Cash Out");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(cashOutPanel);
			}
		});
		panel_3_2.add(btnNewButton_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel.add(panel_1_3);
		panel_1_3.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Table 4");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_3.setBackground(Color.WHITE);
		panel_1_3.add(lblNewLabel_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_1_3.add(panel_2_3);
		
		JButton btnNewButton_4 = new JButton("Tab");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		panel_2_3.add(btnNewButton_4);
		
		JPanel panel_3_3 = new JPanel();
		panel_1_3.add(panel_3_3);
		
		JButton btnNewButton_1_3 = new JButton("Cash Out");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(cashOutPanel);
			}
		});
		panel_3_3.add(btnNewButton_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel.add(panel_1_4);
		panel_1_4.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Table 5");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_4.setBackground(Color.WHITE);
		panel_1_4.add(lblNewLabel_4);
		
		JPanel panel_2_4 = new JPanel();
		panel_1_4.add(panel_2_4);
		
		JButton btnNewButton_5 = new JButton("Tab");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_5.setBackground(Color.WHITE);
		panel_2_4.add(btnNewButton_5);
		
		JPanel panel_3_4 = new JPanel();
		panel_1_4.add(panel_3_4);
		
		JButton btnNewButton_1_4 = new JButton("Cash Out ");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(cashOutPanel);
			}
		});
		panel_3_4.add(btnNewButton_1_4);
		
		JPanel panel_1_5 = new JPanel();
		panel.add(panel_1_5);
		panel_1_5.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_5 = new JLabel("Table 6");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_5.setBackground(Color.WHITE);
		panel_1_5.add(lblNewLabel_5);
		
		JPanel panel_2_5 = new JPanel();
		panel_1_5.add(panel_2_5);
		
		JButton btnNewButton_6 = new JButton("Tab");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_6.setBackground(Color.WHITE);
		panel_2_5.add(btnNewButton_6);
		
		JPanel panel_3_5 = new JPanel();
		panel_1_5.add(panel_3_5);
		
		JButton btnNewButton_1_5 = new JButton("Cash Out");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(cashOutPanel);
			}
		});
		panel_3_5.add(btnNewButton_1_5);
		
				
		JButton btnNewButton = new JButton("Burgers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(burgerPanel); 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(20, 152, 200, 175);
		foodPanel.add(btnNewButton);
		
		JButton btnChickenTenders = new JButton("Chicken Tenders");
		btnChickenTenders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(chickenTenderPanel); 
			}
		});
		btnChickenTenders.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChickenTenders.setBounds(260, 156, 200, 175);
		foodPanel.add(btnChickenTenders);
		
		JButton btnSides = new JButton("Sides");
		btnSides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(sidesPanel);
			}
		});
		btnSides.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnSides.setBounds(500, 156, 200, 175);
		foodPanel.add(btnSides);
		
		JButton btnNewButton_8_1 = new JButton("Dessert");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(dessertPanel); 
			}
		});
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_1.setBounds(500, 383, 200, 175);
		foodPanel.add(btnNewButton_8_1);
		
		JButton btnNewButton_7_1 = new JButton("Drinks");
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(drinkPanel); 
			}
		});
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_1.setBounds(260, 383, 200, 175);
		foodPanel.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("Salads");
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(saladPanel); 
			}
		});
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_2.setBounds(20, 383, 200, 175);
		foodPanel.add(btnNewButton_7_2);
		
		JLabel lblNewLabel_8 = new JLabel("Food");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_8.setBounds(156, 11, 403, 75);
		foodPanel.add(lblNewLabel_8);
		
		JButton btnNewButton_7_3_1 = new JButton("Back");
		btnNewButton_7_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelSwitcher(mainPanel); 
			}
		});
		btnNewButton_7_3_1.setBounds(10, 17, 94, 40);
		foodPanel.add(btnNewButton_7_3_1);

		
		JLabel lblNewLabel_9_1 = new JLabel("Payment");
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_9_1.setBounds(236, 0, 197, 52);
		cashOutPanel.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_3 = new JLabel("Sub Total: ");
		lblNewLabel_10_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_3.setBounds(134, 62, 343, 52);
		cashOutPanel.add(lblNewLabel_10_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(506, 62, 139, 41);
		cashOutPanel.add(textField_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Total with tax: ");
		lblNewLabel_10_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_1_1.setBounds(134, 109, 343, 52);
		cashOutPanel.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_10_2_2 = new JLabel("Tip: ");
		lblNewLabel_10_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_2.setBounds(134, 156, 343, 52);
		cashOutPanel.add(lblNewLabel_10_2_2);
		
		JLabel lblNewLabel_10_2_1_2 = new JLabel("Total: ");
		lblNewLabel_10_2_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1_2.setBounds(379, 221, 98, 52);
		cashOutPanel.add(lblNewLabel_10_2_1_2);
		
		JButton btnNewButton_8_2 = new JButton("Credit");
		btnNewButton_8_2.setBounds(232, 284, 123, 52);
		cashOutPanel.add(btnNewButton_8_2);
		
		JLabel lblNewLabel_11_2 = new JLabel("Choose Payment");
		lblNewLabel_11_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11_2.setBounds(50, 295, 158, 41);
		cashOutPanel.add(lblNewLabel_11_2);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("or");
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11_1_1.setBounds(381, 295, 67, 41);
		cashOutPanel.add(lblNewLabel_11_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Enter in Amount of Cash");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(471, 288, 174, 41);
		cashOutPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(506, 114, 139, 41);
		cashOutPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(506, 166, 139, 41);
		cashOutPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(506, 221, 139, 41);
		cashOutPanel.add(textField_5);
		
		JButton btnNewButton_9_1 = new JButton("Cash Out");
		btnNewButton_9_1.setBounds(506, 346, 139, 41);
		cashOutPanel.add(btnNewButton_9_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(506, 439, 139, 41);
		cashOutPanel.add(textField_6);
		
		JLabel lblNewLabel_10_2_1_1_1 = new JLabel("Change: ");
		lblNewLabel_10_2_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1_1_1.setBounds(134, 439, 343, 52);
		cashOutPanel.add(lblNewLabel_10_2_1_1_1);
		
		JButton btnNewButton_10_1_2_1 = new JButton("Back ");
		btnNewButton_10_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel); 
			}
		});
		btnNewButton_10_1_2_1.setBounds(10, 17, 108, 40);
		cashOutPanel.add(btnNewButton_10_1_2_1);
		
	
		JPanel panel_7_3 = new JPanel();
		panel_7_3.setLayout(null);
		panel_7_3.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Condiments", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7_3.setBounds(10, 73, 708, 191);
		burgerPanel.add(panel_7_3);
		
		JButton btnNewButton_11_5 = new JButton("Tomatos");
		btnNewButton_11_5.setBounds(10, 22, 120, 30);
		panel_7_3.add(btnNewButton_11_5);
		
		JButton btnNewButton_11_1_3 = new JButton("Extra Tomatos");
		btnNewButton_11_1_3.setBounds(10, 55, 120, 30);
		panel_7_3.add(btnNewButton_11_1_3);
		
		JButton btnNewButton_11_2_6 = new JButton("Onions");
		btnNewButton_11_2_6.setBounds(523, 22, 120, 30);
		panel_7_3.add(btnNewButton_11_2_6);
		
		JButton btnNewButton_11_2_1_3 = new JButton("Extra Onions");
		btnNewButton_11_2_1_3.setBounds(523, 55, 120, 30);
		panel_7_3.add(btnNewButton_11_2_1_3);
		
		JButton btnNewButton_11_2_2_1 = new JButton("Mayo");
		btnNewButton_11_2_2_1.setBounds(139, 22, 120, 30);
		panel_7_3.add(btnNewButton_11_2_2_1);
		
		JButton btnNewButton_11_2_3_1 = new JButton("Extra Mayo");
		btnNewButton_11_2_3_1.setBounds(140, 55, 120, 30);
		panel_7_3.add(btnNewButton_11_2_3_1);
		
		JButton btnNewButton_11_3_1 = new JButton("Pickles");
		btnNewButton_11_3_1.setBounds(263, 22, 120, 30);
		panel_7_3.add(btnNewButton_11_3_1);
		
		JButton btnNewButton_11_1_1_1 = new JButton("Extra Pickles");
		btnNewButton_11_1_1_1.setBounds(263, 55, 120, 30);
		panel_7_3.add(btnNewButton_11_1_1_1);
		
		JButton btnNewButton_11_2_4_1 = new JButton("Lettuce");
		btnNewButton_11_2_4_1.setBounds(393, 22, 120, 30);
		panel_7_3.add(btnNewButton_11_2_4_1);
		
		JButton btnNewButton_11_2_1_1_1 = new JButton("Extra Lettuce");
		btnNewButton_11_2_1_1_1.setBounds(393, 55, 120, 30);
		panel_7_3.add(btnNewButton_11_2_1_1_1);
		
		JButton btnNewButton_11_4_1 = new JButton("Ketchup");
		btnNewButton_11_4_1.setBounds(10, 96, 120, 30);
		panel_7_3.add(btnNewButton_11_4_1);
		
		JButton btnNewButton_11_1_2_1 = new JButton("Extra Ketchup");
		btnNewButton_11_1_2_1.setBounds(10, 129, 120, 30);
		panel_7_3.add(btnNewButton_11_1_2_1);
		
		JButton btnNewButton_11_2_5_1 = new JButton("Mustard");
		btnNewButton_11_2_5_1.setBounds(139, 96, 120, 30);
		panel_7_3.add(btnNewButton_11_2_5_1);
		
		JButton btnNewButton_11_2_1_2_1 = new JButton("Extra Mustard");
		btnNewButton_11_2_1_2_1.setBounds(139, 129, 120, 30);
		panel_7_3.add(btnNewButton_11_2_1_2_1);
		
		JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Cheese", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_2.setBounds(10, 275, 708, 99);
		burgerPanel.add(panel_7_1_2);
		
		JButton btnNewButton_12_4 = new JButton("American");
		btnNewButton_12_4.setBounds(10, 24, 154, 52);
		panel_7_1_2.add(btnNewButton_12_4);
		
		JButton btnNewButton_12_1_2 = new JButton("Swiss");
		btnNewButton_12_1_2.setBounds(197, 24, 154, 52);
		panel_7_1_2.add(btnNewButton_12_1_2);
		
		JButton btnNewButton_12_2_2 = new JButton("Cheddar");
		btnNewButton_12_2_2.setBounds(380, 24, 154, 52);
		panel_7_1_2.add(btnNewButton_12_2_2);
		
		JButton btnNewButton_12_2_1_1 = new JButton("Colby Jack");
		btnNewButton_12_2_1_1.setBounds(544, 24, 154, 52);
		panel_7_1_2.add(btnNewButton_12_2_1_1);
		
		JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Meat", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_2.setBounds(10, 385, 708, 99);
		burgerPanel.add(panel_7_1_1_2);
		
		JButton btnNewButton_12_3_2 = new JButton("Quarter pound");
		btnNewButton_12_3_2.setBounds(10, 24, 154, 52);
		panel_7_1_1_2.add(btnNewButton_12_3_2);
		
		JButton btnNewButton_12_1_1_2 = new JButton("Half Pound");
		btnNewButton_12_1_1_2.setBounds(197, 24, 154, 52);
		panel_7_1_1_2.add(btnNewButton_12_1_1_2);
		
		JPanel panel_7_1_1_1_2 = new JPanel();
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Bread", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_2.setBounds(10, 495, 708, 99);
		burgerPanel.add(panel_7_1_1_1_2);
		
		JButton btnNewButton_12_3_1_1 = new JButton("Hamburger Bun");
		btnNewButton_12_3_1_1.setBounds(10, 24, 154, 52);
		panel_7_1_1_1_2.add(btnNewButton_12_3_1_1);
		
		JButton btnNewButton_12_1_1_1_2 = new JButton("Sourdough");
		btnNewButton_12_1_1_1_2.setBounds(197, 24, 154, 52);
		panel_7_1_1_1_2.add(btnNewButton_12_1_1_1_2);
		
		JButton btnNewButton_12_1_1_1_1_1 = new JButton("Rye");
		btnNewButton_12_1_1_1_1_1.setBounds(361, 24, 154, 52);
		panel_7_1_1_1_2.add(btnNewButton_12_1_1_1_1_1);
		
		JLabel lblNewLabel_12_3 = new JLabel("Burgers");
		lblNewLabel_12_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_3.setForeground(Color.RED);
		lblNewLabel_12_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_3.setBounds(187, 11, 284, 51);
		burgerPanel.add(lblNewLabel_12_3);
		
		JButton btnNewButton_7_3_2_1_1 = new JButton("Home");
		btnNewButton_7_3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel);
			}
		});
		btnNewButton_7_3_2_1_1.setBounds(10, 17, 94, 40);
		burgerPanel.add(btnNewButton_7_3_2_1_1);
		
		JButton btnNewButton_10_1_2_1_1 = new JButton("Back ");
		btnNewButton_10_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_10_1_2_1_1.setBounds(119, 17, 108, 40);
		burgerPanel.add(btnNewButton_10_1_2_1_1);
		
		
		JPanel panel_7_2_4 = new JPanel();
		panel_7_2_4.setLayout(null);
		panel_7_2_4.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Number of Tenders", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_4.setBounds(10, 107, 708, 128);
		chickenTenderPanel.add(panel_7_2_4);
		
		JButton btnNewButton_12_4_1_5 = new JButton("1pc");
		btnNewButton_12_4_1_5.setBounds(10, 41, 154, 52);
		panel_7_2_4.add(btnNewButton_12_4_1_5);
		
		JButton btnNewButton_12_4_2_4 = new JButton("4pc");
		btnNewButton_12_4_2_4.setBounds(184, 41, 154, 52);
		panel_7_2_4.add(btnNewButton_12_4_2_4);
		
		JButton btnNewButton_12_4_3_3 = new JButton("8pc");
		btnNewButton_12_4_3_3.setBounds(348, 41, 154, 52);
		panel_7_2_4.add(btnNewButton_12_4_3_3);
		
		JPanel panel_7_1_1_1_1_3 = new JPanel();
		panel_7_1_1_1_1_3.setLayout(null);
		panel_7_1_1_1_1_3.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sauces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_3.setBounds(10, 246, 708, 211);
		chickenTenderPanel.add(panel_7_1_1_1_1_3);
		
		JButton btnNewButton_12_4_1_1_4 = new JButton("Ranch");
		btnNewButton_12_4_1_1_4.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_4);
		
		JButton btnNewButton_12_4_1_1_1_4 = new JButton("Sweet and Sour");
		btnNewButton_12_4_1_1_1_4.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_4);
		
		JButton btnNewButton_12_4_1_1_1_1_6 = new JButton("BBQ");
		btnNewButton_12_4_1_1_1_1_6.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_1_6);
		
		JButton btnNewButton_12_4_1_1_1_1_1_3 = new JButton("Honey Mustard");
		btnNewButton_12_4_1_1_1_1_1_3.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_5 = new JButton("Chipotle BBQ");
		btnNewButton_12_4_1_1_1_1_2_5.setBounds(10, 113, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_1_2_5);
		
		JButton btnNewButton_12_4_1_1_1_1_3_3 = new JButton("Buffalo");
		btnNewButton_12_4_1_1_1_1_3_3.setBounds(188, 113, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_1_3_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_3 = new JButton("Ketchup");
		btnNewButton_12_4_1_1_1_1_2_2_3.setBounds(352, 113, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_1_2_2_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_3 = new JButton("Mustard");
		btnNewButton_12_4_1_1_1_1_2_3_3.setBounds(516, 113, 154, 52);
		panel_7_1_1_1_1_3.add(btnNewButton_12_4_1_1_1_1_2_3_3);
		
		JLabel lblNewLabel_12_1_3 = new JLabel("Chicken");
		lblNewLabel_12_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_3.setForeground(Color.RED);
		lblNewLabel_12_1_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_3.setBounds(195, 27, 284, 51);
		chickenTenderPanel.add(lblNewLabel_12_1_3);
		
		JButton btnNewButton_7_3_2_1_1_1 = new JButton("Home");
		btnNewButton_7_3_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel); 
			}
		});
		btnNewButton_7_3_2_1_1_1.setBounds(10, 17, 94, 40);
		chickenTenderPanel.add(btnNewButton_7_3_2_1_1_1);
		
		JButton btnNewButton_10_1_2_1_1_1 = new JButton("Back ");
		btnNewButton_10_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel);
			}
		});
		btnNewButton_10_1_2_1_1_1.setBounds(119, 17, 108, 40);
		chickenTenderPanel.add(btnNewButton_10_1_2_1_1_1);
		

		JPanel panel_7_2_1_2 = new JPanel();
		panel_7_2_1_2.setLayout(null);
		panel_7_2_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Fries", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_2.setBounds(10, 149, 286, 128);
		sidesPanel.add(panel_7_2_1_2);
		
		JButton btnNewButton_12_4_1_2_2 = new JButton("Regular");
		btnNewButton_12_4_1_2_2.setBounds(10, 41, 98, 52);
		panel_7_2_1_2.add(btnNewButton_12_4_1_2_2);
		
		JButton btnNewButton_12_4_2_1_2 = new JButton("Large");
		btnNewButton_12_4_2_1_2.setBounds(138, 41, 98, 52);
		panel_7_2_1_2.add(btnNewButton_12_4_2_1_2);
		
		JPanel panel_7_2_1_1_5 = new JPanel();
		panel_7_2_1_1_5.setLayout(null);
		panel_7_2_1_1_5.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Onion Rings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_5.setBounds(401, 149, 286, 128);
		sidesPanel.add(panel_7_2_1_1_5);
		
		JButton btnNewButton_12_4_1_2_1_5 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_5.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_5.add(btnNewButton_12_4_1_2_1_5);
		
		JButton btnNewButton_12_4_2_1_1_5 = new JButton("Large");
		btnNewButton_12_4_2_1_1_5.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_5.add(btnNewButton_12_4_2_1_1_5);
		
		JPanel panel_7_2_1_1_1_1 = new JPanel();
		panel_7_2_1_1_1_1.setLayout(null);
		panel_7_2_1_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Chesse curds", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_1_1.setBounds(10, 303, 286, 128);
		sidesPanel.add(panel_7_2_1_1_1_1);
		
		JButton btnNewButton_12_4_1_2_1_1_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_1_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_1_1.add(btnNewButton_12_4_1_2_1_1_1);
		
		JButton btnNewButton_12_4_2_1_1_1_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1_1_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_1_1.add(btnNewButton_12_4_2_1_1_1_1);
		
		JPanel panel_7_2_1_1_2_1 = new JPanel();
		panel_7_2_1_1_2_1.setLayout(null);
		panel_7_2_1_1_2_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Onion Rings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_2_1.setBounds(401, 303, 286, 128);
		sidesPanel.add(panel_7_2_1_1_2_1);
		
		JButton btnNewButton_12_4_1_2_1_2_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_2_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_2_1.add(btnNewButton_12_4_1_2_1_2_1);
		
		JButton btnNewButton_12_4_2_1_1_2_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1_2_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_2_1.add(btnNewButton_12_4_2_1_1_2_1);
		
		JPanel panel_7_2_1_1_3_1 = new JPanel();
		panel_7_2_1_1_3_1.setLayout(null);
		panel_7_2_1_1_3_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Mozzarella Sticks", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_3_1.setBounds(10, 451, 286, 128);
		sidesPanel.add(panel_7_2_1_1_3_1);
		
		JButton btnNewButton_12_4_1_2_1_3_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_3_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_3_1.add(btnNewButton_12_4_1_2_1_3_1);
		
		JButton btnNewButton_12_4_2_1_1_3_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1_3_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_3_1.add(btnNewButton_12_4_2_1_1_3_1);
		
		JPanel panel_7_2_1_1_4_1 = new JPanel();
		panel_7_2_1_1_4_1.setLayout(null);
		panel_7_2_1_1_4_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Waffle Fries", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_4_1.setBounds(401, 451, 286, 128);
		sidesPanel.add(panel_7_2_1_1_4_1);
		
		JButton btnNewButton_12_4_1_2_1_4_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_4_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_4_1.add(btnNewButton_12_4_1_2_1_4_1);
		
		JButton btnNewButton_12_4_2_1_1_4_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1_4_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_4_1.add(btnNewButton_12_4_2_1_1_4_1);
		
		JLabel lblNewLabel_12_2_1 = new JLabel("Sides");
		lblNewLabel_12_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_2_1.setForeground(Color.RED);
		lblNewLabel_12_2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_2_1.setBounds(196, 50, 284, 51);
		sidesPanel.add(lblNewLabel_12_2_1);
		
		JButton btnNewButton_7_3_2_1_1_2 = new JButton("Home");
		btnNewButton_7_3_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel); 
			}
		});
		btnNewButton_7_3_2_1_1_2.setBounds(10, 17, 94, 40);
		sidesPanel.add(btnNewButton_7_3_2_1_1_2);
		
		JButton btnNewButton_10_1_2_1_1_2 = new JButton("Back ");
		btnNewButton_10_1_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_10_1_2_1_1_2.setBounds(119, 17, 108, 40);
		sidesPanel.add(btnNewButton_10_1_2_1_1_2);
		
		
		JPanel panel_7_2_2_1 = new JPanel();
		panel_7_2_2_1.setLayout(null);
		panel_7_2_2_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Toppings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_2_1.setBounds(10, 107, 708, 186);
		saladPanel.add(panel_7_2_2_1);
		
		JButton btnNewButton_12_4_1_3_2 = new JButton("Carrots");
		btnNewButton_12_4_1_3_2.setBounds(10, 41, 154, 52);
		panel_7_2_2_1.add(btnNewButton_12_4_1_3_2);
		
		JButton btnNewButton_12_4_2_2_2 = new JButton("Grape Tomatos");
		btnNewButton_12_4_2_2_2.setBounds(184, 41, 154, 52);
		panel_7_2_2_1.add(btnNewButton_12_4_2_2_2);
		
		JButton btnNewButton_12_4_3_1_2 = new JButton("cucumber");
		btnNewButton_12_4_3_1_2.setBounds(348, 41, 154, 52);
		panel_7_2_2_1.add(btnNewButton_12_4_3_1_2);
		
		JButton btnNewButton_12_4_3_1_1_1 = new JButton("onion");
		btnNewButton_12_4_3_1_1_1.setBounds(512, 41, 154, 52);
		panel_7_2_2_1.add(btnNewButton_12_4_3_1_1_1);
		
		JButton btnNewButton_12_4_1_3_1_1 = new JButton("Shredded Cheese");
		btnNewButton_12_4_1_3_1_1.setBounds(10, 104, 154, 52);
		panel_7_2_2_1.add(btnNewButton_12_4_1_3_1_1);
		
		JButton btnNewButton_12_4_2_2_1_1 = new JButton("Croutons");
		btnNewButton_12_4_2_2_1_1.setBounds(184, 104, 154, 52);
		panel_7_2_2_1.add(btnNewButton_12_4_2_2_1_1);
		
		JPanel panel_7_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sauces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_1_1.setBounds(10, 324, 708, 232);
		saladPanel.add(panel_7_1_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_2_1 = new JButton("Ranch");
		btnNewButton_12_4_1_1_2_1.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_2_1);
		
		JButton btnNewButton_12_4_1_1_1_2_1 = new JButton("Sweet and Sour");
		btnNewButton_12_4_1_1_1_2_1.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_4_1 = new JButton("BBQ");
		btnNewButton_12_4_1_1_1_1_4_1.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_4_1);
		
		JButton btnNewButton_12_4_1_1_1_1_1_1_1 = new JButton("Honey Mustard");
		btnNewButton_12_4_1_1_1_1_1_1_1.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_5 = new JButton("Chipotle BBQ");
		btnNewButton_12_4_1_1_1_1_2_1_5.setBounds(10, 88, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_5);
		
		JButton btnNewButton_12_4_1_1_1_1_3_1_1 = new JButton("Buffalo");
		btnNewButton_12_4_1_1_1_1_3_1_1.setBounds(188, 88, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_3_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_1_1 = new JButton("Ketchup");
		btnNewButton_12_4_1_1_1_1_2_2_1_1.setBounds(352, 88, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_2_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_1_1 = new JButton("Mustard");
		btnNewButton_12_4_1_1_1_1_2_3_1_1.setBounds(516, 88, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_3_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_1_1 = new JButton("1000 island");
		btnNewButton_12_4_1_1_1_1_2_1_1_1.setBounds(10, 151, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_2_1 = new JButton("Blue Cheese");
		btnNewButton_12_4_1_1_1_1_2_1_2_1.setBounds(188, 151, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_3_1 = new JButton("French");
		btnNewButton_12_4_1_1_1_1_2_1_3_1.setBounds(352, 151, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_3_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_4_1 = new JButton("Italian");
		btnNewButton_12_4_1_1_1_1_2_1_4_1.setBounds(516, 151, 154, 52);
		panel_7_1_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_4_1);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("Salad");
		lblNewLabel_12_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_1_1.setForeground(Color.RED);
		lblNewLabel_12_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_1_1.setBounds(195, 27, 284, 51);
		saladPanel.add(lblNewLabel_12_1_1_1);
		
		JButton btnNewButton_7_3_2_1_1_3 = new JButton("Home");
		btnNewButton_7_3_2_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel);
			}
		});
		btnNewButton_7_3_2_1_1_3.setBounds(10, 17, 94, 40);
		saladPanel.add(btnNewButton_7_3_2_1_1_3);
		
		JButton btnNewButton_10_1_2_1_1_3 = new JButton("Back ");
		btnNewButton_10_1_2_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_10_1_2_1_1_3.setBounds(119, 17, 108, 40);
		saladPanel.add(btnNewButton_10_1_2_1_1_3);
		
		
		JPanel panel_7_2_3_1 = new JPanel();
		panel_7_2_3_1.setLayout(null);
		panel_7_2_3_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_3_1.setBounds(10, 311, 708, 128);
		drinkPanel.add(panel_7_2_3_1);
		
		JButton btnNewButton_12_4_1_4_1 = new JButton("Small");
		btnNewButton_12_4_1_4_1.setBounds(10, 41, 154, 52);
		panel_7_2_3_1.add(btnNewButton_12_4_1_4_1);
		
		JButton btnNewButton_12_4_2_3_1 = new JButton("Regular");
		btnNewButton_12_4_2_3_1.setBounds(184, 41, 154, 52);
		panel_7_2_3_1.add(btnNewButton_12_4_2_3_1);
		
		JButton btnNewButton_12_4_3_2_1 = new JButton("Large");
		btnNewButton_12_4_3_2_1.setBounds(348, 41, 154, 52);
		panel_7_2_3_1.add(btnNewButton_12_4_3_2_1);
		
		JPanel panel_7_1_1_1_1_2_2 = new JPanel();
		panel_7_1_1_1_1_2_2.setLayout(null);
		panel_7_1_1_1_1_2_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Type of drink", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_2.setBounds(10, 89, 708, 211);
		drinkPanel.add(panel_7_1_1_1_1_2_2);
		
		JButton btnNewButton_12_4_1_1_3_1 = new JButton("Pepsi");
		btnNewButton_12_4_1_1_3_1.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_3_1);
		
		JButton btnNewButton_12_4_1_1_1_3_1 = new JButton("Diet Pepsi");
		btnNewButton_12_4_1_1_1_3_1.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_3_1);
		
		JButton btnNewButton_12_4_1_1_1_1_5_1 = new JButton("Mtn Dew");
		btnNewButton_12_4_1_1_1_1_5_1.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_1_5_1);
		
		JButton btnNewButton_12_4_1_1_1_1_1_2_1 = new JButton("Rootbeer");
		btnNewButton_12_4_1_1_1_1_1_2_1.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_1_1_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_4_1 = new JButton("Dr.Pepper");
		btnNewButton_12_4_1_1_1_1_2_4_1.setBounds(10, 113, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_1_2_4_1);
		
		JButton btnNewButton_12_4_1_1_1_1_3_2_1 = new JButton("Sprite");
		btnNewButton_12_4_1_1_1_1_3_2_1.setBounds(188, 113, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_1_3_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_2_1 = new JButton("Ice Tea");
		btnNewButton_12_4_1_1_1_1_2_2_2_1.setBounds(352, 113, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_1_2_2_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_2_1 = new JButton("Milk");
		btnNewButton_12_4_1_1_1_1_2_3_2_1.setBounds(516, 113, 154, 52);
		panel_7_1_1_1_1_2_2.add(btnNewButton_12_4_1_1_1_1_2_3_2_1);
		
		JLabel lblNewLabel_12_1_2_2 = new JLabel("Drinks");
		lblNewLabel_12_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_2_2.setForeground(Color.RED);
		lblNewLabel_12_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_2_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_2_2.setBounds(195, 27, 284, 51);
		drinkPanel.add(lblNewLabel_12_1_2_2);
		
		JButton btnNewButton_7_3_2_1_1_4 = new JButton("Home");
		btnNewButton_7_3_2_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel); 
			}
		});
		btnNewButton_7_3_2_1_1_4.setBounds(10, 17, 94, 40);
		drinkPanel.add(btnNewButton_7_3_2_1_1_4);
		
		JButton btnNewButton_10_1_2_1_1_4 = new JButton("Back ");
		btnNewButton_10_1_2_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_10_1_2_1_1_4.setBounds(119, 17, 108, 40);
		drinkPanel.add(btnNewButton_10_1_2_1_1_4);
		
		
		JPanel panel_7_1_1_1_1_2_1_2 = new JPanel();
		panel_7_1_1_1_1_2_1_2.setLayout(null);
		panel_7_1_1_1_1_2_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Shakes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_1_2.setBounds(10, 89, 708, 128);
		dessertPanel.add(panel_7_1_1_1_1_2_1_2);
		
		JButton btnNewButton_12_4_1_4_1_1_2 = new JButton("Chocolate");
		btnNewButton_12_4_1_4_1_1_2.setBounds(10, 35, 154, 52);
		panel_7_1_1_1_1_2_1_2.add(btnNewButton_12_4_1_4_1_1_2);
		
		JButton btnNewButton_12_4_1_4_1_2_2 = new JButton("Strawberry");
		btnNewButton_12_4_1_4_1_2_2.setBounds(188, 35, 154, 52);
		panel_7_1_1_1_1_2_1_2.add(btnNewButton_12_4_1_4_1_2_2);
		
		JButton btnNewButton_12_4_1_4_1_3_2 = new JButton("Vanilla");
		btnNewButton_12_4_1_4_1_3_2.setBounds(371, 35, 154, 52);
		panel_7_1_1_1_1_2_1_2.add(btnNewButton_12_4_1_4_1_3_2);
		
		JLabel lblNewLabel_12_1_2_1_1 = new JLabel("Dessert");
		lblNewLabel_12_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_2_1_1.setForeground(Color.RED);
		lblNewLabel_12_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_2_1_1.setBounds(195, 27, 284, 51);
		dessertPanel.add(lblNewLabel_12_1_2_1_1);
		
		JPanel panel_7_1_1_1_1_2_1_1_1 = new JPanel();
		panel_7_1_1_1_1_2_1_1_1.setLayout(null);
		panel_7_1_1_1_1_2_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sundaes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_1_1_1.setBounds(10, 235, 708, 128);
		dessertPanel.add(panel_7_1_1_1_1_2_1_1_1);
		
		JButton btnNewButton_12_4_1_4_1_1_1_1 = new JButton("Chocolate");
		btnNewButton_12_4_1_4_1_1_1_1.setBounds(10, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1_1.add(btnNewButton_12_4_1_4_1_1_1_1);
		
		JButton btnNewButton_12_4_1_4_1_2_1_1 = new JButton("Strawberry");
		btnNewButton_12_4_1_4_1_2_1_1.setBounds(188, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1_1.add(btnNewButton_12_4_1_4_1_2_1_1);
		
		JButton btnNewButton_12_4_1_4_1_3_1_1 = new JButton("Vanilla");
		btnNewButton_12_4_1_4_1_3_1_1.setBounds(371, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1_1.add(btnNewButton_12_4_1_4_1_3_1_1);
		
		JButton btnNewButton_7_3_2_1_1_5 = new JButton("Home");
		btnNewButton_7_3_2_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(mainPanel); 
			}
		});
		btnNewButton_7_3_2_1_1_5.setBounds(10, 17, 94, 40);
		dessertPanel.add(btnNewButton_7_3_2_1_1_5);
		
		JButton btnNewButton_10_1_2_1_1_5 = new JButton("Back ");
		btnNewButton_10_1_2_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(foodPanel); 
			}
		});
		btnNewButton_10_1_2_1_1_5.setBounds(119, 17, 108, 40);
		dessertPanel.add(btnNewButton_10_1_2_1_1_5);
		
		JPanel tabPanel = new JPanel();
		tabPanel.setBackground(UIManager.getColor("Button.background"));
		tabPanel.setBounds(708, 0, 286, 673);
		frmRegister.getContentPane().add(tabPanel);
		tabPanel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(10, 72, 266, 577);
		tabPanel.add(textArea);
		
		JPanel billPanel = new JPanel();
		billPanel.setBounds(41, 11, 214, 53);
		tabPanel.add(billPanel);
		billPanel.setLayout(null);
		
		JPanel currentBillPanel = new JPanel();
		currentBillPanel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		currentBillPanel.setBounds(-6, -16, 226, 76);
		billPanel.add(currentBillPanel);
		currentBillPanel.setLayout(null);
		
		txtTab = new JTextField();
		txtTab.setBorder(null);
		txtTab.setBounds(6, 16, 214, 53);
		currentBillPanel.add(txtTab);
		txtTab.setEditable(false);
		txtTab.setHorizontalAlignment(SwingConstants.CENTER);
		txtTab.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTab.setText("Current Bill");
		txtTab.setColumns(10);
		frmRegister.setBounds(100, 100, 1000, 700);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
