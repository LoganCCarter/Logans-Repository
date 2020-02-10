import javax.swing.*;
class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar
	}

	public int getValue(Moneys coin){

		int value = 0;
		switch (coin){
			case penny:
				value = 1;
				break;
			case nickel:
				value = 5;
				break;
			case dime:
				value = 10;
				break;
			case quarter:
				value = 25;
				break;
			case halfdollar:
				value = 50;
				break;
			case dollar:
				value = 100;
				break;
		}

		return value;
	}
}

class dinero extends JFrame{
	
	public static robertD.Moneys newCoin(){
		int randomNumber;
		randomNumber = (int) (Math.random() * 6);
/*		robertD.Moneys[] randomCoin = new robertD.Moneys[]{robertD.Moneys.penny, 
														   robertD.Moneys.nickel, 
														   robertD.Moneys.dime, 
														   robertD.Moneys.quarter, 
														   robertD.Moneys.halfdollar, 
														   robertD.Moneys.dollar};*/
		return robertD.Moneys.values()[randomNumber];
	}
	
	JPanel pnl = new JPanel();
	
	JTextField txt1 = new JTextField( 38 ) ;
	JTextField txt2 = new JTextField( "Default Text", 38 ) ;
	
	JTextArea txtArea = new JTextArea( 5, 37);
	
	JScrollPane pane = new JScrollPane( txtArea ) ;
	
	public dinero()
	{
		super( "Coins Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		txtArea.setLineWrap( true ) ;
		txtArea.setWrapStyleWord( true ) ;

		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		pnl.add( txt1 ) ;
		pnl.add( txt2 ) ;
		pnl.add( pane ) ;

		setVisible( true );
	}
	
	public static void main( String[] args ){
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[100];

		// give each of the coins a value		
		for(int index = 0; index < Duckets.pocketChange.length; index++){
			Duckets.pocketChange[index] = newCoin();
		}
		
		int sum=0;
		
		for(robertD.Moneys coin: Duckets.pocketChange){ 
			System.out.print(coin + " |" );
			sum += Duckets.getValue(coin);
		}
		System.out.println( );

		System.out.println("$"+(double)sum/100.00 );
		
		dinero gui = new dinero();
		
		//Show me the coins in your pocketChange.
		
		
		//Give me the sum of those coins.
		
	}
}