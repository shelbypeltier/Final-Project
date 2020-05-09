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
import java.util.ArrayList;
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

	protected static final String tempChickenTender = null;
	private JFrame frmRegister;
	private JLayeredPane layeredPane;
	private JLayeredPane layeredPane1 = new JLayeredPane();
	private JPanel Main;
	private JTextField textField;
	private JTextField txtEnterInCash;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextArea txtTest;
	private ChickenTenders tempChickenTenders = new ChickenTenders();
	private Dessert tempDessert = new Dessert ();
	private Drinks tempDrink = new Drinks();
	private Salad tempSalad = new Salad();
	private Burgers tempBurger = new Burgers();
	private Sides tempSides =  new Sides();
	private ArrayList<Drinks> drink = new ArrayList<Drinks>();
	private ArrayList<ChickenTenders> chickenTender = new ArrayList<ChickenTenders>();
	private ArrayList<Dessert> dessert = new ArrayList<Dessert>();
	private ArrayList<Salad> salad = new ArrayList<Salad>();
	private ArrayList<Burgers> burger = new ArrayList<Burgers>();
	private ArrayList<Sides> sides =  new ArrayList<Sides>();
	private int numOfTable = 0;
	private int numOfTables = 6;
	private Table[] tables = new Table[6];  
	private int numOfDrink = 0;
	private int numOfChickenTender = 0;
	private int numOfDessert = 0;
	private int numOfBurgers = 0;
	private int numOfSides = 0;
	private int numOfSalads = 0;
	
	public void panelSwitcher(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel); 
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public void panelSwitcher1(JPanel panel) {
		layeredPane1.removeAll();
		layeredPane1.add(panel); 
		layeredPane1.repaint();
		layeredPane1.revalidate();
	}

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
  
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		for(int i=0;i < numOfTables ;i++) {
		tables[i] = new Table(i+1);
		}
		

		frmRegister = new JFrame();
		frmRegister.setResizable(false);
		frmRegister.setTitle("Register");
		frmRegister.getContentPane().setForeground(Color.WHITE);
		frmRegister.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();

		layeredPane.setBounds(0, 0, 996, 673);
		frmRegister.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		Main = new JPanel();
		layeredPane.add(Main, "name_279449572344700");
		Main.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(211, 211, 211));
		Main.add(panel_4_1, BorderLayout.NORTH);

		panel_4_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_6_1 = new JLabel("Main Menu\r\n");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_4_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6 = new JLabel("Press Tab to add food items!");

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

		Main.add(panel, BorderLayout.CENTER);

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

		JPanel sidesPanel = new JPanel();
		JPanel saladPanel = new JPanel();
		JPanel drinksPanel = new JPanel();
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		JPanel addFoodPanel = new JPanel();
		JPanel selectionScreen = new JPanel();
		JPanel tabScreen = new JPanel();
		JPanel chooseFoodPanel = new JPanel();
		JPanel burgerScreen = new JPanel();
		JPanel cashOutPanel = new JPanel();
		JPanel chickenPanel = new JPanel();
		JPanel dessertPanel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 258, 568);
		scrollPane.setViewportBorder(new TitledBorder(null, "Tab", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabScreen.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(30);
		textArea.setColumns(30);
		scrollPane.setViewportView(textArea);
		
		JButton btnCashOut = new JButton("Tab");
		btnCashOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			panelSwitcher1(chooseFoodPanel);
			panelSwitcher(addFoodPanel);
			numOfTable = 0; 
			tempBurger.defaultBurger();
			tempChickenTenders.defaultTenders(); 
			tempDessert.defaultDessert();
			tempDrink.defaultDrink();
			tempSalad.defaultSalad(); 
			tempSides.defaultSides(); 
			}
		});

		btnCashOut.setBackground(Color.WHITE);
		panel_2.add(btnCashOut);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Cash Out");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				numOfTable = 0;
				panelSwitcher1(cashOutPanel);
				panelSwitcher(addFoodPanel);
				textArea.setText(tables[numOfTable].toString());

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
				panelSwitcher1(chooseFoodPanel);
				panelSwitcher(addFoodPanel);
				numOfTable = 1; 
				tempBurger.defaultBurger();
				tempChickenTenders.defaultTenders(); 
				tempDessert.defaultDessert();
				tempDrink.defaultDrink();
				tempSalad.defaultSalad(); 
				tempSides.defaultSides(); 
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		panel_2_1.add(btnNewButton_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_1_1.add(panel_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Cash Out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOfTable = 1;
				panelSwitcher(addFoodPanel);
				panelSwitcher1(cashOutPanel);
				textArea.setText(tables[numOfTable].toString());
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
				panelSwitcher1(chooseFoodPanel);
				panelSwitcher(addFoodPanel);
				numOfTable = 2;
				tempBurger.defaultBurger();
				tempChickenTenders.defaultTenders(); 
				tempDessert.defaultDessert();
				tempDrink.defaultDrink();
				tempSalad.defaultSalad(); 
				tempSides.defaultSides(); 
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		panel_2_2.add(btnNewButton_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_1_2.add(panel_3_2);
		
		JButton btnNewButton_1_2 = new JButton("Cash Out");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOfTable = 2;
				panelSwitcher1(cashOutPanel);
				panelSwitcher(addFoodPanel);
				textArea.setText(tables[numOfTable].toString());
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
				panelSwitcher1(chooseFoodPanel);
				panelSwitcher(addFoodPanel);
				numOfTable = 3; 
				tempBurger.defaultBurger();
				tempChickenTenders.defaultTenders(); 
				tempDessert.defaultDessert();
				tempDrink.defaultDrink();
				tempSalad.defaultSalad(); 
				tempSides.defaultSides(); 
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		panel_2_3.add(btnNewButton_4);
		
		JPanel panel_3_3 = new JPanel();
		panel_1_3.add(panel_3_3);
		
		JButton btnNewButton_1_3 = new JButton("Cash Out");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOfTable = 3;
				panelSwitcher1(cashOutPanel);
				panelSwitcher(addFoodPanel);
				textArea.setText(tables[numOfTable].toString());
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
				panelSwitcher1(chooseFoodPanel);
				panelSwitcher(addFoodPanel);
				numOfTable = 4; 
				tempBurger.defaultBurger();
				tempChickenTenders.defaultTenders(); 
				tempDessert.defaultDessert();
				tempDrink.defaultDrink();
				tempSalad.defaultSalad(); 
				tempSides.defaultSides(); 
			}
		});
		btnNewButton_5.setBackground(Color.WHITE);
		panel_2_4.add(btnNewButton_5);
		
		JPanel panel_3_4 = new JPanel();
		panel_1_4.add(panel_3_4);
		
		JButton btnNewButton_1_4 = new JButton("Cash Out ");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOfTable = 4;
				panelSwitcher1(cashOutPanel);
				panelSwitcher(addFoodPanel);
				textArea.setText(tables[numOfTable].toString());
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
				panelSwitcher1(chooseFoodPanel);
				panelSwitcher(addFoodPanel);
				numOfTable = 5; 
				tempBurger.defaultBurger();
				tempChickenTenders.defaultTenders(); 
				tempDessert.defaultDessert();
				tempDrink.defaultDrink();
				tempSalad.defaultSalad(); 
				tempSides.defaultSides(); 
			}
		});
		btnNewButton_6.setBackground(Color.WHITE);
		panel_2_5.add(btnNewButton_6);
		
		JPanel panel_3_5 = new JPanel();
		panel_1_5.add(panel_3_5);
		
		JButton btnNewButton_1_5 = new JButton("Cash Out");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOfTable = 5;
				panelSwitcher1(cashOutPanel);
				panelSwitcher(addFoodPanel);
				textArea.setText(tables[numOfTable].toString());
			}
		});
		panel_3_5.add(btnNewButton_1_5);
		
		layeredPane.add(addFoodPanel, "name_279492568056700");
		addFoodPanel.setLayout(null);
		
		selectionScreen.setBounds(0, 68, 728, 605);
		addFoodPanel.add(selectionScreen);
		selectionScreen.setLayout(new BorderLayout(0, 0));
		
		
		selectionScreen.add(layeredPane1);
		layeredPane1.setLayout(new CardLayout(0, 0));
		
		chooseFoodPanel.setBackground(new Color(245, 245, 245));
		layeredPane1.add(chooseFoodPanel, "name_283150248070400");
		chooseFoodPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Burgers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher1(burgerScreen);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(20, 152, 200, 175);
    
		chooseFoodPanel.add(btnNewButton);		
		JButton btnChickenTenders = new JButton("Chicken Tenders");
		btnChickenTenders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelSwitcher1(chickenPanel);

			}
		});
		btnChickenTenders.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChickenTenders.setBounds(260, 156, 200, 175);
		chooseFoodPanel.add(btnChickenTenders);

		
		JButton btnSides = new JButton("Sides");
		btnSides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelSwitcher1(sidesPanel);

			}
		});
		btnSides.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnSides.setBounds(500, 156, 200, 175);
		chooseFoodPanel.add(btnSides);

		
		JButton btnNewButton_8_1 = new JButton("Dessert");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher1(dessertPanel);
			}
		});
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_1.setBounds(500, 383, 200, 175);
		chooseFoodPanel.add(btnNewButton_8_1);

		
		JButton btnNewButton_7_1 = new JButton("Drinks");
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher1(drinksPanel);
			}
		});
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_1.setBounds(260, 383, 200, 175);
		chooseFoodPanel.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("Salads");
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher1(saladPanel);
			}
		});
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_2.setBounds(20, 383, 200, 175);
		chooseFoodPanel.add(btnNewButton_7_2);
		
		JLabel lblNewLabel_8 = new JLabel("Food");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(156, 11, 403, 75);
		chooseFoodPanel.add(lblNewLabel_8);
		
		layeredPane1.add(cashOutPanel, "name_284758187107600");
		cashOutPanel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Payment");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(236, 0, 197, 52);
		cashOutPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sub Total: ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10.setBounds(134, 62, 343, 52);
		cashOutPanel.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(506, 62, 139, 41);
		cashOutPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Total with tax: ");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_1.setBounds(134, 109, 343, 52);
		cashOutPanel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Tip: ");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2.setBounds(134, 156, 343, 52);
		cashOutPanel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Total: ");
		lblNewLabel_10_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1.setBounds(379, 221, 98, 52);
		cashOutPanel.add(lblNewLabel_10_2_1);
		
		JButton btnNewButton_8 = new JButton("Credit");
		btnNewButton_8.setBounds(232, 284, 123, 52);
		cashOutPanel.add(btnNewButton_8);
		
		JLabel lblNewLabel_11 = new JLabel("Choose Payment");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(50, 295, 158, 41);
		cashOutPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("or");
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11_1.setBounds(381, 295, 67, 41);
		cashOutPanel.add(lblNewLabel_11_1);
		
		txtEnterInCash = new JTextField();
		txtEnterInCash.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterInCash.setText("Enter in Amount of Cash");
		txtEnterInCash.setBounds(471, 288, 174, 41);
		cashOutPanel.add(txtEnterInCash);
		txtEnterInCash.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(506, 114, 139, 41);

		cashOutPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);

		textField_3.setBounds(506, 166, 139, 41);
		cashOutPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(506, 221, 139, 41);
		cashOutPanel.add(textField_4);
		
		JButton btnNewButton_9 = new JButton("Cash Out");
		btnNewButton_9.setBounds(506, 346, 139, 41);
		cashOutPanel.add(btnNewButton_9);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(506, 439, 139, 41);
		cashOutPanel.add(textField_1);
		
		JLabel lblNewLabel_10_2_1_1 = new JLabel("Change: ");
		lblNewLabel_10_2_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1_1.setBounds(134, 439, 343, 52);
		cashOutPanel.add(lblNewLabel_10_2_1_1);
		
		layeredPane1.add(burgerScreen, "name_357597043214500");
		burgerScreen.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Condiments", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 73, 708, 191);
		burgerScreen.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("Tomatos");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!(tempBurger.getTomato().equals("tomato"))) {
				tempBurger.setTomato("tomato");
				textArea.append("Tomatoes added\n");
				}
				else {
					tempBurger.setTomato("");
					textArea.append("Tomatoes removed\n");
				}
			}
		});
		btnNewButton_11.setBounds(10, 22, 120, 30);
		panel_7.add(btnNewButton_11);
		
		JButton btnNewButton_11_1 = new JButton("Extra Tomatos");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getTomato().equals("extraTomato"))) {
					tempBurger.setTomato("extraTomato");
					textArea.append("Extra Tomato added\n");
					}
					else {
						tempBurger.setTomato(null);
					textArea.append("Extra Tomato removed\n");
					}
			}
		});
		btnNewButton_11_1.setBounds(10, 55, 120, 30);
		panel_7.add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("Onions");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getOnion().equalsIgnoreCase("onion"))) {
					tempBurger.setOnion("onion");
					textArea.append("Onions Added\n"); 
					}
					else {
						tempBurger.setOnion("");
						textArea.append("Onions Removed\n");
					}
			}
		});
		btnNewButton_11_2.setBounds(523, 22, 120, 30);
		panel_7.add(btnNewButton_11_2);
		
		JButton btnNewButton_11_2_1 = new JButton("Extra Onions");
		btnNewButton_11_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getOnion().equalsIgnoreCase("extraOnion"))) {
					tempBurger.setOnion("extraOnion");
					textArea.append("Extra Onions Added\n");
					}
					else {
						tempBurger.setOnion("");
						textArea.append("Extra Onions Removed\n"); 
					}
			}
		});
		btnNewButton_11_2_1.setBounds(523, 55, 120, 30);
		panel_7.add(btnNewButton_11_2_1);
		
		JButton btnNewButton_11_2_2 = new JButton("Mayo");
		btnNewButton_11_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getMayo().equalsIgnoreCase("mayo"))) {
					tempBurger.setMayo("mayo");
					textArea.append("Mayo Added\n");
					}
					else {
						tempBurger.setMayo("");
						textArea.append("Mayo Removed\n");
					}
			}
		});
		btnNewButton_11_2_2.setBounds(139, 22, 120, 30);
		panel_7.add(btnNewButton_11_2_2);
		
		JButton btnNewButton_11_2_3 = new JButton("Extra Mayo");
		btnNewButton_11_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getMayo().equalsIgnoreCase("extraMayo"))) {
					tempBurger.setMayo("extraMayo");
					textArea.append("Extra Mayo Added\n");
					}
					else {
						tempBurger.setMayo("");
						textArea.append("Extra Mayo Removed\n"); 
					}
			}
		});
		btnNewButton_11_2_3.setBounds(140, 55, 120, 30);
		panel_7.add(btnNewButton_11_2_3);
		
		JButton btnNewButton_11_3 = new JButton("Pickles");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getPickle().equalsIgnoreCase("pickles"))) {
					tempBurger.setPickle("pickles");
					textArea.append("Pickles Added\n"); 
					}
					else {
						tempBurger.setPickle("");
						textArea.append("Pickles Removed\n"); 
					}
			}
			}
		);
		btnNewButton_11_3.setBounds(263, 22, 120, 30);
		panel_7.add(btnNewButton_11_3);
		
		JButton btnNewButton_11_1_1 = new JButton("Extra Pickles");
		btnNewButton_11_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getPickle().equalsIgnoreCase("extraPickles"))) {
					tempBurger.setPickle("extraPickles");
					textArea.append("Extra Pickles Added\n"); 
					}
					else {
						tempBurger.setPickle("");
						textArea.append("Extra Pickles Removed\n");
					}
			}
		});
		btnNewButton_11_1_1.setBounds(263, 55, 120, 30);
		panel_7.add(btnNewButton_11_1_1);
		
		JButton btnNewButton_11_2_4 = new JButton("Lettuce");
		btnNewButton_11_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getLettuce().equalsIgnoreCase("lettuce"))) {
					tempBurger.setLettuce("lettuce");
					textArea.append("Lettuce Added\n"); 
					}
					else {
						tempBurger.setLettuce("");
						textArea.append("Lettuce Removed\n"); 
					}
			}
		});
		btnNewButton_11_2_4.setBounds(393, 22, 120, 30);
		panel_7.add(btnNewButton_11_2_4);
		
		JButton btnNewButton_11_2_1_1 = new JButton("Extra Lettuce");
		btnNewButton_11_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getLettuce().equalsIgnoreCase("extraLettuce"))) {
					tempBurger.setLettuce("extraLettuce");
					textArea.append("Extra Lettuce Added\n"); 
					}
					else {
						tempBurger.setLettuce("");
						textArea.append("Extra Lettuce Removed\n"); 
					}
			}
		});
		btnNewButton_11_2_1_1.setBounds(393, 55, 120, 30);
		panel_7.add(btnNewButton_11_2_1_1);
		
		JButton btnNewButton_11_4 = new JButton("Ketchup");
		btnNewButton_11_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getKetchup().equalsIgnoreCase("ketchup"))) {
					tempBurger.setKetchup("ketchup");
					textArea.append("Ketchup Added\n"); 
					}
					else {
						tempBurger.setKetchup("");
						textArea.append("Ketchup Removed\n"); 
					}
			}
		});
		btnNewButton_11_4.setBounds(10, 96, 120, 30);
		panel_7.add(btnNewButton_11_4);
		
		JButton btnNewButton_11_1_2 = new JButton("Extra Ketchup");
		btnNewButton_11_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getKetchup().equalsIgnoreCase("extraKetchup"))) {
					tempBurger.setKetchup("extraKetchup");
					textArea.append("Extra Ketchup Added\n");
					}
					else {
						tempBurger.setKetchup("");
						textArea.append("Extra Ketchup Removed\n");
					}
			}
		});
		btnNewButton_11_1_2.setBounds(10, 129, 120, 30);
		panel_7.add(btnNewButton_11_1_2);
		
		JButton btnNewButton_11_2_5 = new JButton("Mustard");
		btnNewButton_11_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getMustard().equalsIgnoreCase("mustard"))) {
					tempBurger.setMustard("mustard");
					textArea.append("Mustard Added\n");
					}
					else {
						tempBurger.setMustard("");
						textArea.append("Mustard Removed\n");
					}
			}
		});
		btnNewButton_11_2_5.setBounds(139, 96, 120, 30);
		panel_7.add(btnNewButton_11_2_5);
		
		JButton btnNewButton_11_2_1_2 = new JButton("Extra Mustard");
		btnNewButton_11_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getMustard().equalsIgnoreCase("extraMustard"))) {
					tempBurger.setMustard("extraMustard");
					textArea.append("Extra Mustard Added\n"); 
					} 
				    else {
					tempBurger.setMustard("");
					textArea.append("Extra Mustard Removed\n"); 
				}
			}
		});
		btnNewButton_11_2_1_2.setBounds(139, 129, 120, 30);
		panel_7.add(btnNewButton_11_2_1_2);
		
		JButton btnNewButton_11_2_6 = new JButton("Grilled Onions");
		btnNewButton_11_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getGrilledOnion().equalsIgnoreCase("grilledonion"))) {
					tempBurger.setGrilledOnion("grilledonion");
					textArea.append("Grilled Onions Added\n"); 
					}
					else {
						tempBurger.setGrilledOnion("");
						textArea.append("Grilled Onions Removed\n");
					}
			}
		});
		btnNewButton_11_2_6.setBounds(263, 96, 120, 30);
		panel_7.add(btnNewButton_11_2_6);
		
		JButton btnNewButton_11_2_7 = new JButton("Xtra Grilled Onions");
		btnNewButton_11_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getGrilledOnion().equalsIgnoreCase("Extragrilledonion"))) {
					tempBurger.setGrilledOnion("ExtraGrilledOnion");
					textArea.append("Extra Grilled Onions Added\n"); 
					}
					else {
						tempBurger.setGrilledOnion("");
						textArea.append("Extra Grilled Onions Removed\n");
					}
			}
		});
		btnNewButton_11_2_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_11_2_7.setBounds(263, 129, 120, 30);
		panel_7.add(btnNewButton_11_2_7);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Cheese", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1.setBounds(10, 275, 708, 99);
		burgerScreen.add(panel_7_1);
		
		JButton btnNewButton_12 = new JButton("American");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getTypeOfCheese().equalsIgnoreCase("american"))) {
					tempBurger.setTypeOfCheese("american");
					textArea.append("American Cheese Added\n");
					}
					else {
						tempBurger.setTypeOfCheese("");
						textArea.append("American Cheese Removed\n"); 
					}
			}
		});
		btnNewButton_12.setBounds(10, 24, 154, 52);
		panel_7_1.add(btnNewButton_12);
		
		JButton btnNewButton_12_1 = new JButton("Swiss");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getTypeOfCheese().equalsIgnoreCase("swiss"))) {
					tempBurger.setTypeOfCheese("swiss");
					textArea.append("Swiss Cheese Added\n");
					}
					else {
						tempBurger.setTypeOfCheese("");
						textArea.append("Swiss Cheese Removed\n"); 
					}
			}
			}
		);
		btnNewButton_12_1.setBounds(197, 24, 154, 52);
		panel_7_1.add(btnNewButton_12_1);
		
		JButton btnNewButton_12_2 = new JButton("Cheddar");
		btnNewButton_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getTypeOfCheese().equalsIgnoreCase("cheddar"))) {
					tempBurger.setTypeOfCheese("cheddar");
					textArea.append("Cheddar Cheese Added\n");
					}
					else {
						tempBurger.setTypeOfCheese("");
						textArea.append("Cheddar Cheese Removed\n"); 
					}
			}
			}
		);
		btnNewButton_12_2.setBounds(380, 24, 154, 52);
		panel_7_1.add(btnNewButton_12_2);
		
		JButton btnNewButton_12_2_1 = new JButton("Colby Jack");
		btnNewButton_12_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getTypeOfCheese().equalsIgnoreCase("colbyJack"))) {
					tempBurger.setTypeOfCheese("colbyJack");
					textArea.append("Colby Jack Cheese Added\n");
					}
					else {
						tempBurger.setTypeOfCheese("");
						textArea.append("Colby Jack Cheese Removed\n");
					}
			}
			}
		);
		btnNewButton_12_2_1.setBounds(544, 24, 154, 52);
		panel_7_1.add(btnNewButton_12_2_1);
		
		JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Meat", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1.setBounds(10, 385, 708, 99);
		burgerScreen.add(panel_7_1_1);
		
		JButton btnNewButton_12_3 = new JButton("Quarter pound");
		btnNewButton_12_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					tempBurger.setNumOfPatties("quarterPound");
					textArea.append("Quarter Pound Pattie Selected\n");
			}
		});
		btnNewButton_12_3.setBounds(10, 24, 154, 52);
		panel_7_1_1.add(btnNewButton_12_3);
		
		JButton btnNewButton_12_1_1 = new JButton("Half Pound");
		btnNewButton_12_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempBurger.setNumOfPatties("halfPound");
				textArea.append("Half Pound Pattie Selected\n");
			}
		});
		btnNewButton_12_1_1.setBounds(197, 24, 154, 52);
		panel_7_1_1.add(btnNewButton_12_1_1);
		
		JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Bread", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1.setBounds(10, 495, 708, 99);
		burgerScreen.add(panel_7_1_1_1);
		
		JButton btnNewButton_12_3_1 = new JButton("Hamburger Bun");
		btnNewButton_12_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getBunType().equalsIgnoreCase("hambBun"))) {
					tempBurger.setBunType("hambBun");
					textArea.append("Plain Bun Selected\n");
					}
					else {
						tempBurger.setBunType("");
						textArea.append("Plain Bun Deselected\n");
					}
			}
		});
		btnNewButton_12_3_1.setBounds(10, 24, 154, 52);
		panel_7_1_1_1.add(btnNewButton_12_3_1);
		
		JButton btnNewButton_12_1_1_1 = new JButton("Sourdough");
		btnNewButton_12_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getBunType().equalsIgnoreCase("sourDough"))) {
					tempBurger.setBunType("sourDough");
					textArea.append("Sour Dough Selected\n");
					}
					else {
						tempBurger.setBunType("");
						textArea.append("Sour Dough Deselected\n");
					}
			}
		});
		btnNewButton_12_1_1_1.setBounds(197, 24, 154, 52);
		panel_7_1_1_1.add(btnNewButton_12_1_1_1);
		
		JButton btnNewButton_12_1_1_1_1 = new JButton("Rye");
		btnNewButton_12_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempBurger.getBunType().equalsIgnoreCase("rye"))) {
					tempBurger.setBunType("rye");
					textArea.append("Rye Selected\n");
					}
					else {
						tempBurger.setBunType("");
						textArea.append("Rye Deselected\n");
					}
			}
		});
		btnNewButton_12_1_1_1_1.setBounds(380, 24, 154, 52);
		panel_7_1_1_1.add(btnNewButton_12_1_1_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("Burgers");
		lblNewLabel_12.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12.setForeground(Color.RED);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(187, 11, 284, 51);
		burgerScreen.add(lblNewLabel_12);
		
		JButton btnNewButton_13_5 = new JButton("Create");
		btnNewButton_13_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempBurger.getBunType().equals("")) {
					textArea.append("Please Select a Bun Type\n");
				} else if (tempBurger.getNumOfPatties().equals("")) {
					textArea.append("Please Select a Pattie\n");
				} else {
				burger.add(new Burgers(tempBurger.getNumOfPatties(),tempBurger.getTypeOfCheese(),tempBurger.getBunType(),tempBurger.getTomato(),tempBurger.getLettuce(),tempBurger.getOnion(),tempBurger.getPickle(),tempBurger.getMayo(),tempBurger.getKetchup(),tempBurger.getGrilledOnion(),tempBurger.getMustard()));
				tables[numOfTable].addFood(burger.get(numOfBurgers));
				textArea.setText("Current Tab " + tables[numOfTable].toString());
				textArea.append(tempBurger.toString() + "Added to Tab\n");
				txtTest.append(tempBurger.getPrice() + "");
				tempBurger.defaultBurger();
				numOfBurgers ++;
				}
			}
		});
		btnNewButton_13_5.setBounds(517, 11, 145, 51);
		burgerScreen.add(btnNewButton_13_5);
		
		chickenPanel.setLayout(null);
		layeredPane1.add(chickenPanel, "name_360921205834800");
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		panel_7_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Number of Tenders", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2.setBounds(10, 107, 708, 128);
		chickenPanel.add(panel_7_2);
		
		JButton btnNewButton_12_4_1 = new JButton("2pc");
		btnNewButton_12_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((tempChickenTenders.getNumOfTenders() != 2)) {
					tempChickenTenders.setNumOfTenders(2);
					textArea.append("2 pc chicken tenders\n");
					}
					else {
						tempChickenTenders.setNumOfTenders(0);
					}
				textArea.append("2 pc Selected");
				textArea.append("2 pc Chicken Tenders Removed\n");
			}
		});
		btnNewButton_12_4_1.setBounds(10, 41, 154, 52);
		panel_7_2.add(btnNewButton_12_4_1);
		
		JButton btnNewButton_12_4_2 = new JButton("4pc");
		btnNewButton_12_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((tempChickenTenders.getNumOfTenders() != 4)) {
					tempChickenTenders.setNumOfTenders(4);
					textArea.append("4 pc Chicken Tenders\n");
					}
					else {
						tempChickenTenders.setNumOfTenders(0);
						textArea.append("4 pc Chicken Tenders Removed\n");
					}
			}
		});
		btnNewButton_12_4_2.setBounds(184, 41, 154, 52);
		panel_7_2.add(btnNewButton_12_4_2);
		
		JButton btnNewButton_12_4_3 = new JButton("8pc");
		btnNewButton_12_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((tempChickenTenders.getNumOfTenders() != 8)) {
					tempChickenTenders.setNumOfTenders(8);
					textArea.append("8 pc Chicken Tenders\n");
					}
					else {
						tempChickenTenders.setNumOfTenders(0);
						textArea.append("8 pc Chicken Tenders\n");
					}
			}
		});
		btnNewButton_12_4_3.setBounds(348, 41, 154, 52);
		panel_7_2.add(btnNewButton_12_4_3);
		
		JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sauces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1.setBounds(10, 246, 708, 211);
		chickenPanel.add(panel_7_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1 = new JButton("Ranch");
		btnNewButton_12_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("ranch"))) {
					tempChickenTenders.setSauce("ranch");
					textArea.append("Ranch Added \n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Ranch Removed \n");
					}
			}
		});
		btnNewButton_12_4_1_1.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1);
		
		JButton btnNewButton_12_4_1_1_1 = new JButton("Sweet and Sour");
		btnNewButton_12_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("sweetAndSour"))) {
					tempChickenTenders.setSauce("sweetAndSour");
					textArea.append("Sweet and Sour Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Sweet and Sour Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1 = new JButton("BBQ");
		btnNewButton_12_4_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("bbq"))) {
					tempChickenTenders.setSauce("bbq");
					textArea.append("BBQ Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("BBQ Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_1 = new JButton("Honey Mustard");
		btnNewButton_12_4_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("honeyMustard"))) {
					tempChickenTenders.setSauce("honeyMustard");
					textArea.append("Honey Mustard Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Honey Mustard Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_1.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2 = new JButton("Chipotle BBQ");
		btnNewButton_12_4_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("chipotleBbq"))) {
					tempChickenTenders.setSauce("chipotleBbq");
					textArea.append("Chipotle BBQ Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Chipotle BBQ Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2.setBounds(10, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_3 = new JButton("Buffalo");
		btnNewButton_12_4_1_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("buffalo"))) {
					tempChickenTenders.setSauce("buffalo");
					textArea.append("Buffalo Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Buffalo Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_3.setBounds(188, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2 = new JButton("Ketchup");
		btnNewButton_12_4_1_1_1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("ketchup"))) {
					tempChickenTenders.setSauce("ketchup");
					textArea.append("Ketchup Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Ketchup Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_2.setBounds(352, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3 = new JButton("Mustard");
		btnNewButton_12_4_1_1_1_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempChickenTenders.getSauce().equalsIgnoreCase("mustard"))) {
					tempChickenTenders.setSauce("mustard");
					textArea.append("Mustard Added\n");
					}
					else {
						tempChickenTenders.setSauce("");
						textArea.append("Mustard Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_3.setBounds(516, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_3);
		
		JLabel lblNewLabel_12_1 = new JLabel("Chicken");
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1.setForeground(Color.RED);
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1.setBounds(195, 27, 284, 51);
		chickenPanel.add(lblNewLabel_12_1);
		
		JButton btnNewButton_13_4 = new JButton("Create");
		btnNewButton_13_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempChickenTenders.getNumOfTenders()==0) {
					textArea.append("Please select a number of chicken tenders\n");
				} else {
				chickenTender.add(new ChickenTenders(tempChickenTenders.getSauce(), tempChickenTenders.getNumOfTenders()));
				tables[numOfTable].addFood(chickenTender.get(numOfChickenTender));
				textArea.append(tempChickenTenders.toString()); 
				tempChickenTenders.defaultTenders();
				numOfChickenTender ++;
				}
			}
		});
		btnNewButton_13_4.setBounds(504, 27, 166, 69);
		chickenPanel.add(btnNewButton_13_4);
		
		sidesPanel.setLayout(null);
		layeredPane1.add(sidesPanel, "name_361320264502300");
		
		JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Fries", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1.setBounds(10, 149, 286, 128);
		sidesPanel.add(panel_7_2_1);
		
		JButton btnNewButton_12_4_1_2 = new JButton("Regular");
		btnNewButton_12_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("regFry"))) {
					tempSides.setName("regFry");
					textArea.append("Regular Fry Added \n"); 
					}
					else {
						tempSides.setName("");
						textArea.append("Regular Fry Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_2.setBounds(10, 41, 98, 52);
		panel_7_2_1.add(btnNewButton_12_4_1_2);
		
		JButton btnNewButton_12_4_2_1 = new JButton("Large");
		btnNewButton_12_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("largeFry"))) {
					tempSides.setName("largeFry");
					textArea.append("Large Fry Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Large Fry Removed\n");
					}
			}
		});
		btnNewButton_12_4_2_1.setBounds(138, 41, 98, 52);
		panel_7_2_1.add(btnNewButton_12_4_2_1);
		
		JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Onion Rings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1.setBounds(401, 149, 286, 128);
		sidesPanel.add(panel_7_2_1_1);
		
		JButton btnNewButton_12_4_1_2_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("regOnionRings"))) {
					tempSides.setName("regOnionRings");
					textArea.append("Regular Onion Rings Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Regular Onion Rings Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_2_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1.add(btnNewButton_12_4_1_2_1);
		
		JButton btnNewButton_12_4_2_1_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("largeOnionRing"))) {
					tempSides.setName("largeOnionRing");
					textArea.append("Large Onion Rings Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Large Onion Rings Removed\n");
					}
			}
		});
		btnNewButton_12_4_2_1_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1.add(btnNewButton_12_4_2_1_1);
		
		JPanel panel_7_2_1_1_1 = new JPanel();
		panel_7_2_1_1_1.setLayout(null);
		panel_7_2_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Cheese curds", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_1.setBounds(10, 303, 286, 128);
		sidesPanel.add(panel_7_2_1_1_1);
		
		JButton btnNewButton_12_4_1_2_1_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("regCheeseCurd"))) {
					tempSides.setName("regChesseCurd");
					textArea.append("Regular Cheese Curds Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Regular Cheese Curds Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_2_1_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_1.add(btnNewButton_12_4_1_2_1_1);
		
		JButton btnNewButton_12_4_2_1_1_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("largeCheeseCurd"))) {
					tempSides.setName("largeCheeseCurd");
					textArea.append("Large Cheese Curds Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Large Cheese Curds Removed\n");
					}
			}
		});
		btnNewButton_12_4_2_1_1_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_1.add(btnNewButton_12_4_2_1_1_1);
		
		JPanel panel_7_2_1_1_2 = new JPanel();
		panel_7_2_1_1_2.setLayout(null);
		panel_7_2_1_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "cole slaw", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_2.setBounds(401, 303, 286, 128);
		sidesPanel.add(panel_7_2_1_1_2);
		
		JButton btnNewButton_12_4_1_2_1_2 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("regColeSlaw"))) {
					tempSides.setName("regColeSlaw");
					textArea.append("Regular Coleslaw Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Regular Coleslaw Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_2_1_2.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_2.add(btnNewButton_12_4_1_2_1_2);
		
		JButton btnNewButton_12_4_2_1_1_2 = new JButton("Large");
		btnNewButton_12_4_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("largeColeSlaw"))) {
					tempSides.setName("largeColeSlaw");
					textArea.append("Large ColeSlaw Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Large ColeSlaw Removed\n");
					}
			}
		});
		btnNewButton_12_4_2_1_1_2.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_2.add(btnNewButton_12_4_2_1_1_2);
		
		JPanel panel_7_2_1_1_3 = new JPanel();
		panel_7_2_1_1_3.setLayout(null);
		panel_7_2_1_1_3.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Mozzarella Sticks", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_3.setBounds(10, 451, 286, 128);
		sidesPanel.add(panel_7_2_1_1_3);
		
		JButton btnNewButton_12_4_1_2_1_3 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("regMozzarellaSticks"))) {
					tempSides.setName("regMozzarellaSticks");
					textArea.append("Regular Mozzarella Sticks Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Regular Mozzarella Sticks Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_2_1_3.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_3.add(btnNewButton_12_4_1_2_1_3);
		
		JButton btnNewButton_12_4_2_1_1_3 = new JButton("Large");
		btnNewButton_12_4_2_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("largeMozzarellaSticks"))) {
					tempSides.setName("largeMozzarellaSticks");
					textArea.append("Large Mozzarella Sticks Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Large Mozzarella Sticks Removed\n");
					}
			}
		});
		btnNewButton_12_4_2_1_1_3.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_3.add(btnNewButton_12_4_2_1_1_3);
		
		JPanel panel_7_2_1_1_4 = new JPanel();
		panel_7_2_1_1_4.setLayout(null);
		panel_7_2_1_1_4.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Waffle Fries", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_4.setBounds(401, 451, 286, 128);
		sidesPanel.add(panel_7_2_1_1_4);
		
		JButton btnNewButton_12_4_1_2_1_4 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("regWaffleFry"))) {
					tempSides.setName("regWaffleFry");
					textArea.append("Regular Waffle Fry Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Regular Waffle Fry Removed\n");
					}
			}
		});
		btnNewButton_12_4_1_2_1_4.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_4.add(btnNewButton_12_4_1_2_1_4);
		
		JButton btnNewButton_12_4_2_1_1_4 = new JButton("Large");
		btnNewButton_12_4_2_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempSides.getName().equalsIgnoreCase("largeWaffleFry"))) {
					tempSides.setName("largeWaffleFry");
					textArea.append("Large Waffle Fry Added\n");
					}
					else {
						tempSides.setName("");
						textArea.append("Large Waffle Fry Removed\n");
					}
			}
		});
		btnNewButton_12_4_2_1_1_4.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_4.add(btnNewButton_12_4_2_1_1_4);
		
		JLabel lblNewLabel_12_2 = new JLabel("Sides");
		lblNewLabel_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_2.setForeground(Color.RED);
		lblNewLabel_12_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_2.setBounds(196, 50, 284, 51);
		sidesPanel.add(lblNewLabel_12_2);
		
		JButton btnNewButton_13_3 = new JButton("Add to table");
		btnNewButton_13_3.setBounds(490, 32, 166, 69);
		sidesPanel.add(btnNewButton_13_3);
		btnNewButton_13_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sides.add(new Sides(tempSides.getName()));
				tables[numOfTable].addFood(sides.get(numOfSides));
				textArea.append(tempSides.toString());
				tempSides.defaultSides();
				numOfSides ++;
			}
		});
		saladPanel.setLayout(null);
		layeredPane1.add(saladPanel, "name_362045875581000");
		
		JPanel panel_7_2_2 = new JPanel();
		panel_7_2_2.setLayout(null);
		panel_7_2_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Toppings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_2.setBounds(10, 107, 708, 186);
		saladPanel.add(panel_7_2_2);
		
		JButton btnNewButton_12_4_1_3 = new JButton("Carrots");
		btnNewButton_12_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getCarrot() == true) {
					tempSalad.setCarrot(false);
					}
					else {
						tempSalad.setCarrot(true);
					}
			}
		});
		btnNewButton_12_4_1_3.setBounds(10, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_1_3);
		
		JButton btnNewButton_12_4_2_2 = new JButton("Grape Tomatos");
		btnNewButton_12_4_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getTomato() == true) {
					tempSalad.setTomato(false);
					}
					else {
						tempSalad.setTomato(true);
					}
			}
		});
		btnNewButton_12_4_2_2.setBounds(184, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_2_2);
		
		JButton btnNewButton_12_4_3_1 = new JButton("cucumber");
		btnNewButton_12_4_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getCucumber() == true) {
					tempSalad.setCucumber(false);
					}
					else {
						tempSalad.setCucumber(true);
					}
			}
		});
		btnNewButton_12_4_3_1.setBounds(348, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_3_1);
		
		JButton btnNewButton_12_4_3_1_1 = new JButton("onion");
		btnNewButton_12_4_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getOnion() == true) {
					tempSalad.setOnion(false);
					}
					else {
						tempSalad.setOnion(true);
					}
			}
		});
		btnNewButton_12_4_3_1_1.setBounds(512, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_3_1_1);
		
		JButton btnNewButton_12_4_1_3_1 = new JButton("Shredded Cheese");
		btnNewButton_12_4_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getCheese() == true) {
					tempSalad.setCarrot(false);
					}
					else {
						tempSalad.setCarrot(true);
					}
			}
		});
		btnNewButton_12_4_1_3_1.setBounds(10, 104, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_1_3_1);
		
		JButton btnNewButton_12_4_2_2_1 = new JButton("Croutons");
		btnNewButton_12_4_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getCrouton() == true) {
					tempSalad.setCarrot(false);
					}
					else {
						tempSalad.setCarrot(true);
					}
			}
		});
		btnNewButton_12_4_2_2_1.setBounds(184, 104, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_2_2_1);
		
		JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sauces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_1.setBounds(10, 324, 708, 232);
		saladPanel.add(panel_7_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_2 = new JButton("Ranch");
		btnNewButton_12_4_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("ranch")) {
					tempSalad.setDressing("ranch");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_2.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_2 = new JButton("Sweet and Sour");
		btnNewButton_12_4_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("sweetAndSour")) {
					tempSalad.setDressing("sweetAndSour");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_2.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_4 = new JButton("BBQ");
		btnNewButton_12_4_1_1_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("Bbq")) {
					tempSalad.setDressing("Bbq");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_4.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_4);
		
		JButton btnNewButton_12_4_1_1_1_1_1_1 = new JButton("Honey Mustard");
		btnNewButton_12_4_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("HoneyMustard")) {
					tempSalad.setDressing("HoneyMustard");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_1_1.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1 = new JButton("Chipotle BBQ");
		btnNewButton_12_4_1_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("chipotleBbq")) {
					tempSalad.setDressing("chipotleBbq");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_1.setBounds(10, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_3_1 = new JButton("Buffalo");
		btnNewButton_12_4_1_1_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("Buffalo")) {
					tempSalad.setDressing("Buffalo");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_3_1.setBounds(188, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_3_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_1 = new JButton("Ketchup");
		btnNewButton_12_4_1_1_1_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("Ketchup")) {
					tempSalad.setDressing("Ketchup");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_2_1.setBounds(352, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_1 = new JButton("Mustard");
		btnNewButton_12_4_1_1_1_1_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("mustard")) {
					tempSalad.setDressing("mustard");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_3_1.setBounds(516, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_3_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_1 = new JButton("1000 island");
		btnNewButton_12_4_1_1_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("1000Island")) {
					tempSalad.setDressing("1000Island");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_1_1.setBounds(10, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_2 = new JButton("Blue Cheese");
		btnNewButton_12_4_1_1_1_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("blueCheese")) {
					tempSalad.setDressing("blueCheese");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_1_2.setBounds(188, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_3 = new JButton("French");
		btnNewButton_12_4_1_1_1_1_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("french")) {
					tempSalad.setDressing("french");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_1_3.setBounds(352, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_4 = new JButton("Italian");
		btnNewButton_12_4_1_1_1_1_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tempSalad.getDressing().equalsIgnoreCase("italian")) {
					tempSalad.setDressing("italian");
					}
					else {
						tempSalad.setDressing("");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_1_4.setBounds(516, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_4);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Salad");
		lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_1.setForeground(Color.RED);
		lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_1.setBounds(195, 27, 284, 51);
		saladPanel.add(lblNewLabel_12_1_1);
		
		JButton btnNewButton_13_2 = new JButton("Add to table");
		btnNewButton_13_2.setBounds(528, 27, 166, 69);
		saladPanel.add(btnNewButton_13_2);
		btnNewButton_13_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salad.add(new Salad(tempSalad.getTomato(),tempSalad.getCarrot(),tempSalad.getCucumber(),tempSalad.getOnion(),tempSalad.getCheese(),tempSalad.getCrouton(),tempSalad.getDressing()));
				tables[numOfTable].addFood(salad.get(numOfSalads));
				numOfSalads ++;
			}
		});
	
		drinksPanel.setLayout(null);
		layeredPane1.add(drinksPanel, "name_362790125265300");
		
		JPanel panel_7_2_3 = new JPanel();
		panel_7_2_3.setLayout(null);
		panel_7_2_3.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_3.setBounds(10, 311, 708, 128);
		drinksPanel.add(panel_7_2_3);
		
		JButton btnNewButton_12_4_1_4 = new JButton("Small");
		btnNewButton_12_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getSize().equalsIgnoreCase("small"))) {
					tempDrink.setSize("small");
					textArea.append("Small Selected\n");
					}
					else {
						tempDrink.setSize("");
						textArea.append("Small Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_4.setBounds(10, 41, 154, 52);
		panel_7_2_3.add(btnNewButton_12_4_1_4);
		
		JButton btnNewButton_12_4_2_3 = new JButton("Regular");
		btnNewButton_12_4_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getSize().equalsIgnoreCase("regular"))) {
					tempDrink.setSize("regular");
					textArea.append("Regular Selected " + tempDrink.getPrice() + "\n");
					}
					else {
						tempDrink.setSize("");
						textArea.append("Regular Deselected\n");
					}
			}
		});
		btnNewButton_12_4_2_3.setBounds(184, 41, 154, 52);
		panel_7_2_3.add(btnNewButton_12_4_2_3);
		
		JButton btnNewButton_12_4_3_2 = new JButton("Large");
		btnNewButton_12_4_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getSize().equalsIgnoreCase("large"))) {
					tempDrink.setSize("large");
					textArea.append("Large Selected\n");
					}
					else {
						tempDrink.setSize("");
						textArea.append("Large Deselected\n");
					}
			}
		});
		btnNewButton_12_4_3_2.setBounds(348, 41, 154, 52);
		panel_7_2_3.add(btnNewButton_12_4_3_2);
		
		JPanel panel_7_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Type of drink", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2.setBounds(10, 89, 708, 211);
		drinksPanel.add(panel_7_1_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_3 = new JButton("Pepsi");
		btnNewButton_12_4_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Pepsi"))) {
					tempDrink.setName("Pepsi");
					textArea.append("Pepsi Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Pepsi Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_3.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_3 = new JButton("Diet Pepsi");
		btnNewButton_12_4_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Diet Pepsi"))) {
					tempDrink.setName("Diet Pepsi");
					textArea.append("Diet Pepsi Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Diet Pepsi Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_3.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_5 = new JButton("Mtn Dew");
		btnNewButton_12_4_1_1_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Mtn Dew"))) {
					tempDrink.setName("Mtn Dew");
					textArea.append("Mtn Dew Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Mtn Dew Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_5.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_5);
		
		JButton btnNewButton_12_4_1_1_1_1_1_2 = new JButton("Rootbeer");
		btnNewButton_12_4_1_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Rootbeer"))) {
					tempDrink.setName("Rootbeer");
					textArea.append("Rootbeer Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Rootbeer Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_1_2.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_4 = new JButton("Dr.Pepper");
		btnNewButton_12_4_1_1_1_1_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Dr.Pepper"))) {
					tempDrink.setName("Dr.Pepper");
					textArea.append("Dr.Pepper Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Dr.Pepper Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_4.setBounds(10, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_2_4);
		
		JButton btnNewButton_12_4_1_1_1_1_3_2 = new JButton("Sprite");
		btnNewButton_12_4_1_1_1_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Sprite"))) {
					tempDrink.setName("Sprite");
					textArea.append("Sprite Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Sprite Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_3_2.setBounds(188, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_3_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_2 = new JButton("Ice Tea");
		btnNewButton_12_4_1_1_1_1_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Ice Tea"))) {
					tempDrink.setName("Ice Tea");
					textArea.append("Ice Tea Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Ice Tea Deselected\n");
					}
			}
		});
		btnNewButton_12_4_1_1_1_1_2_2_2.setBounds(352, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_2_2_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_2 = new JButton("Milk");
		btnNewButton_12_4_1_1_1_1_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDrink.getName().equalsIgnoreCase("Milk"))) {
					tempDrink.setName("Milk");
					textArea.append("Milk Selected\n");
					}
					else {
						tempDrink.setName("");
						textArea.append("Milk Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_1_1_1_2_3_2.setBounds(516, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_2_3_2);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("Drinks");
		lblNewLabel_12_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_2.setForeground(Color.RED);
		lblNewLabel_12_1_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_2.setBounds(195, 27, 284, 51);
		drinksPanel.add(lblNewLabel_12_1_2);
		
		JButton btnNewButton_13_1 = new JButton("Create");
		btnNewButton_13_1.setBounds(523, 11, 166, 69);
		drinksPanel.add(btnNewButton_13_1);
		btnNewButton_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textArea.append(tempDrink.toString());
//				drink.add(new Drinks(tempDrink.getNameOfDrink(),tempDrink.getSize()));
//				tables[numOfTable].addFood(drink.get(numOfDrink));
//				tempDrink.defaultDrink();
				drink.add(new Drinks(tempDrink.getName(),tempDrink.getSize()));
				tables[numOfTable].addFood(drink.get(numOfDrink));
				numOfDrink ++;
			}
		});
		
		dessertPanel.setLayout(null);
		layeredPane1.add(dessertPanel, "name_363207220296900");
		
		JPanel panel_7_1_1_1_1_2_1 = new JPanel();
		panel_7_1_1_1_1_2_1.setLayout(null);
		panel_7_1_1_1_1_2_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Shakes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_1.setBounds(10, 89, 708, 128);
		dessertPanel.add(panel_7_1_1_1_1_2_1);
		
		JButton btnNewButton_12_4_1_4_1_1 = new JButton("Chocolate");
		btnNewButton_12_4_1_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDessert.getName().equalsIgnoreCase("chocolateShake"))) {
					tempDessert.setName("chocolateShake");
					textArea.append("Chocolate Shake Selected\n");
					}
					else {
						tempDessert.setName("");
						textArea.append("Chocolate Shake Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_4_1_1.setBounds(10, 35, 154, 52);
		panel_7_1_1_1_1_2_1.add(btnNewButton_12_4_1_4_1_1);
		
		JButton btnNewButton_12_4_1_4_1_2 = new JButton("Strawberry");
		btnNewButton_12_4_1_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDessert.getName().equalsIgnoreCase("StrawberryShake"))) {
					tempDessert.setName("StrawberryShake");
					textArea.append("Strawberry Shake Selected\n");
					}
					else {
						tempDessert.setName("");
						textArea.append("Strawberry Shake Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_4_1_2.setBounds(188, 35, 154, 52);
		panel_7_1_1_1_1_2_1.add(btnNewButton_12_4_1_4_1_2);
		
		JButton btnNewButton_12_4_1_4_1_3 = new JButton("Vanilla");
		btnNewButton_12_4_1_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDessert.getName().equalsIgnoreCase("VanillaShake"))) {
					tempDessert.setName("VanillaShake");
					textArea.append("Vanilla Shake Selected\n");
					}
					else {
						tempDessert.setName("");
						textArea.append("Vanilla Shake Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_4_1_3.setBounds(371, 35, 154, 52);
		panel_7_1_1_1_1_2_1.add(btnNewButton_12_4_1_4_1_3);
		
		JLabel lblNewLabel_12_1_2_1 = new JLabel("Dessert");
		lblNewLabel_12_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_2_1.setForeground(Color.RED);
		lblNewLabel_12_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_2_1.setBounds(195, 27, 284, 51);
		dessertPanel.add(lblNewLabel_12_1_2_1);
		
		JPanel panel_7_1_1_1_1_2_1_1 = new JPanel();
		panel_7_1_1_1_1_2_1_1.setLayout(null);
		panel_7_1_1_1_1_2_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sundaes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_1_1.setBounds(10, 235, 708, 128);
		dessertPanel.add(panel_7_1_1_1_1_2_1_1);
		
		JButton btnNewButton_12_4_1_4_1_1_1 = new JButton("Chocolate");
		btnNewButton_12_4_1_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDessert.getName().equalsIgnoreCase("ChocolateSundae"))) {
					tempDessert.setName("ChocolateSundae");
					textArea.append("Chocolate Sundae Selected\n");
					}
					else {
						tempDessert.setName("");
						textArea.append("Chocolate Sundae Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_4_1_1_1.setBounds(10, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1.add(btnNewButton_12_4_1_4_1_1_1);
		
		JButton btnNewButton_12_4_1_4_1_2_1 = new JButton("Strawberry");
		btnNewButton_12_4_1_4_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDessert.getName().equalsIgnoreCase("StrawberrySundae"))) {
					tempDessert.setName("StrawberrySundae");
					textArea.append("Strawberry Sundae Selected\n");
					}
					else {
						tempDessert.setName("");
						textArea.append("Strawberry Sundae Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_4_1_2_1.setBounds(188, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1.add(btnNewButton_12_4_1_4_1_2_1);
		
		JButton btnNewButton_12_4_1_4_1_3_1 = new JButton("Vanilla");
		btnNewButton_12_4_1_4_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tempDessert.getName().equalsIgnoreCase("VanillaSundae"))) {
					tempDessert.setName("VanillaSundae");
					textArea.append("Vanilla Sundae Selected\n");
					}
					else {
						tempDessert.setName("");
						textArea.append("Vanilla Sundae Deselected\n");
					};
			}
		});
		btnNewButton_12_4_1_4_1_3_1.setBounds(371, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1.add(btnNewButton_12_4_1_4_1_3_1);
		
		JButton btnNewButton_13 = new JButton("Add to table");
		btnNewButton_13.setBounds(524, 9, 166, 69);
		dessertPanel.add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dessert.add(new Dessert(tempDessert.getName()));
				tables[numOfTable].addFood(dessert.get(numOfDessert));
				numOfDessert++;
			}
		});
		
		tabScreen.setBounds(728, 0, 268, 673);
		tabScreen.setBackground(new Color(245, 245, 245));
		addFoodPanel.add(tabScreen);
		tabScreen.setLayout(null);
		
		JLabel lblNewLabel_10_2_1_2 = new JLabel("Sub Total: ");
		lblNewLabel_10_2_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1_2.setBounds(15, 589, 98, 52);
		tabScreen.add(lblNewLabel_10_2_1_2);
		
		txtTest = new JTextArea();
		txtTest.setEditable(false);
		txtTest.setColumns(10);
		txtTest.setBounds(119, 599, 139, 41);
		tabScreen.add(txtTest);
		
		JButton btnNewButton_7 = new JButton("Home");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSwitcher(Main);
			}
		});
		btnNewButton_7.setBounds(10, 17, 94, 40);
		addFoodPanel.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("Selection Screen");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					panelSwitcher1(chooseFoodPanel);
					tempBurger.defaultBurger();
					tempChickenTenders.defaultTenders(); 
					tempDessert.defaultDessert();
					tempDrink.defaultDrink();
					tempSalad.defaultSalad(); 
					tempSides.defaultSides(); 
			}
		});
		btnNewButton_10.setBounds(119, 17, 125, 40);
		addFoodPanel.add(btnNewButton_10);

		frmRegister.setBounds(100, 100, 1000, 700);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
