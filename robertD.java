class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar
	}
​
	public int getValue(Moneys coin){
​
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
​
		return value;
	}
}
​
class dinero{
	public static void main(String... v){
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[20];
		sum = 1
		// give each of the coins a value
		/*
		for (robertD.Moneys coin:
		*/
		for(robertD.Moneys coin: Duckets.pocketChange){ //might need different for loop
			//System.out.println(Duckets.getValue(coin) );
			coin = robertD.Moneys.penny;
			coin = robertD.Moneys.nickel;
			coin = robertD.Moneys.dime;
			coin = robertD.Moneys.quarter;
			coin = robertD.Moneys.penny;
			coin = robertD.Moneys.quarter;
			coin = robertD.Moneys.dollar;
			coin = robertD.Moneys.dollar;
			coin = robertD.Moneys.penny;
			coin = robertD.Moneys.nickel;
			coin = robertD.Moneys.dime;
			coin = robertD.Moneys.quarter;
			coin = robertD.Moneys.penny;
			coin = robertD.Moneys.quarter;
			coin = robertD.Moneys.dollar;
			coin = robertD.Moneys.dollar;
			//System.out.println(Duckets.getValue(coin) );
			Duckets.pocketChange[0] = coin;
			
		}
		
		System.out.println(Duckets.getValue(Duckets.pocketChange[0]) );
		//Show me the coins in your pocketChange.
		
		
		//Give me the sum of those coins.
		System.out.println(Duckets.getValue + sum)
			
			
			
			
			
			
			
	}
}