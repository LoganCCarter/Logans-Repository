//Import Swings
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
//Extend JFrame and Implements ActionListener
class codingBat extends JFrame implements ActionListener{
	
	public boolean cigarParty(int cigars, boolean isWeekend) {  
	  if(isWeekend && cigars >= 40)
		return true;
		
	  if(cigars >= 40 && cigars <= 60)
		return true;
		
	  return false;
	}
	
	public int[] plusTwo(int[] a, int[] b) {
	  int[] x = new int[4];
	  x[0]=a[0];
	  x[1]=a[1];
	  x[2]=b[0];
	  x[3]=b[1];
	  return x;
	}
	
	JPanel party = new JPanel();
	JPanel plus2 = new JPanel(new BorderLayout());
	JPanel whatV = new JPanel(new GridBagLayout());
	//Labels
	JLabel pTitle = new JLabel("Cigar Party");
	JLabel pCigars = new JLabel("Number of Cigars");
	JLabel pWeekend = new JLabel("Party Like The Weekend?");
	JLabel pBlank1 = new JLabel(" ");
	JLabel pBlank2 = new JLabel(" ");
	JLabel pBlank3 = new JLabel(" ");
	JLabel pBlank4 = new JLabel(" ");
	JLabel pBlank5 = new JLabel(" ");
	JLabel pBlank6 = new JLabel(" ");
	JLabel pBlank7 = new JLabel(" ");
	JLabel pBlank8 = new JLabel(" ");
	JLabel twoTitle = new JLabel("Plus Two Arrays");
	
	JTextField pCigarCount = new JTextField(5);
	JTextField pResults = new JTextField(25);
	JTextField twoA0 = new JTextField(5);
	JTextField twoA1 = new JTextField(5);
	JTextField twoB0 = new JTextField(5);
	JTextField twoB1 = new JTextField(5);
	JTextField twoC0 = new JTextField(5);
	JTextField twoC1 = new JTextField(5);
	JTextField twoC2 = new JTextField(5);
	JTextField twoC3 = new JTextField(5);
	
	
	JCheckBox pIsWeekend = new JCheckBox();
	//Buttons
	JButton pGo = new JButton("GO!");
	JButton twoGo = new JButton("GO!");
	JButton twoNo = new JButton("NO!");

	
	JMenuItem cb1, cb2, cb3;
	
	JMenu Skillz;
	
	JMenuBar CodingBAMenu;
	
	
	JPanel partyGrid = new JPanel(new GridLayout(5,3));
	JPanel plus2Grid = new JPanel(new GridLayout(2,2));
	JPanel plus2GridSouth = new JPanel(new GridLayout(1,4));	
	public codingBat(){
		super("CodingBat App");
		setSize( 900,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
	
		//Menu Bars
		CodingBAMenu = new JMenuBar();
		Skillz = new JMenu("Hello");
		cb1 = new JMenuItem("Goodbye");
		cb2 = new JMenuItem("greenTicket");
		cb3 = new JMenuItem("OK Boomer");
		
		pGo.addActionListener(this);
		twoGo.addActionListener(this);
		//Creates Panel
		partyGrid.add(pBlank1);
		partyGrid.add(pTitle);
		partyGrid.add(pBlank2);
		
		partyGrid.add(pCigars);
		partyGrid.add(pBlank3);
		partyGrid.add(pWeekend);

		partyGrid.add(pCigarCount);
		partyGrid.add(pBlank4);
		partyGrid.add(pIsWeekend);
		
		partyGrid.add(pBlank5);
		partyGrid.add(pGo);
		partyGrid.add(pBlank6);
		
		partyGrid.add(pBlank7);
		partyGrid.add(pResults);
		partyGrid.add(pBlank8);
		//Text Grids
		party.add(partyGrid);
		
		plus2.add("North", twoTitle);
		plus2Grid.add(twoA0);
		plus2Grid.add(twoA1);
		plus2Grid.add(twoB0);
		plus2Grid.add(twoB1);
		plus2.add("Center", plus2Grid);
		plus2.add("West", twoGo);
		plus2.add("East", twoNo);
		plus2GridSouth.add( twoC0);
		plus2GridSouth.add( twoC1);
		plus2GridSouth.add( twoC2);
		plus2GridSouth.add( twoC3);
		plus2.add("South",plus2GridSouth);
		

		//Menu Item Listener
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		
		Skillz.add(cb1);
		Skillz.add(cb2);
		Skillz.add(cb3);

		CodingBAMenu.add(Skillz);
		
		setJMenuBar(CodingBAMenu);

		setLayout(new BorderLayout());

		add("Center",party);
		
		setVisible( true );
	}
	
	public static void main ( String[] args ){
		
		codingBat gui = new codingBat();

	} 
	
	public void cigarAction(){
		
		int CountOfCigars = Integer.valueOf(pCigarCount.getText());
		boolean weekend = pIsWeekend.isSelected();
		String output = "";//////////////
		if (cigarParty(CountOfCigars, weekend))
			output = "Party!!!";
		else
			output = "!!!ɿɈɿɒԳ";
		
		pResults.setText(output);
	}
	
	/*
	public int greenTicket(int a, int b, int c) {

    if(a == b && b == c)
        return 20;
  
     if((a == b && a != c) | (b == c & b!= a) |(a == c & a!= b))
        return 10;
  
   return 0;
	*/
	
	
	
	public void plus2Action(){
		
		int[] firstArray = new int[]{Integer.valueOf(twoA0.getText()),Integer.valueOf(twoA1.getText())};
		int[] nextArray = new int[]{Integer.valueOf(twoB0.getText()),Integer.valueOf(twoB1.getText())};
		
		int[] output =  plusTwo(firstArray, nextArray);
		
		twoC0.setText(String.valueOf(output[0]));
		twoC1.setText(String.valueOf(output[1]));
		twoC2.setText(String.valueOf(output[2]));
		twoC3.setText(String.valueOf(output[3]));
		
	}
	
	public void actionPerformed( ActionEvent event ){
		if(event.getSource()== pGo)
			cigarAction();
		
		if(event.getSource()== twoGo)
			plus2Action();
		
		if(event.getSource()== cb1)
			smokePressed();
		if(event.getSource()== cb2)
			plus2Pressed();
		if(event.getSource()== cb3)
			whatEverDude();
	//if sources pannel 44
		//pannel44Action
	}
	
	
	public void smokePressed(){
		add("Center",party);
		party.setVisible(true);
		plus2.setVisible(false);
		whatV.setVisible(false);
	}
	
	public void plus2Pressed(){
		add("Center",plus2);
		party.setVisible(false);
		plus2.setVisible(true);
		whatV.setVisible(false);		
	}
	
	public void whatEverDude(){
		add("Center",whatV);
		party.setVisible(false);
		plus2.setVisible(false);
		whatV.setVisible(true);
	}
	
}