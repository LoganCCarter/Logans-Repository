
class Xamples{
	
	public String ShowYours() {
		String C = new String("Color");
		return C;
	}
	
	public String ShowMine() {
		String D = new String("Dude");
		return D;
	}
	
	public int ShowYours(String C) {
		int C = 100;
		return C;
	}
	
	public int ShowMine(String D) {
		int D = 50;
		return D;
	}
	
	public double ShowYours(int C) {
		double C = 11.11;
		return C;
	}
	
	public double ShowMine(int D) {
		double D =33.33;
		return D;
	}

}


class useIt{
	
	Xamples iWill = new Xamples();
	
	int saveInt = 0;
	String SaveString = "testing";
	double SaveDouble = 42.42;
	
	public void Z(){
	iWill.ShowMine();
	}
	public void Y(){
	iWill.ShowYours();
	}
	public void X(){
	iWill.ShowMine("i'm telling mom");
	}
	public void W(){
	iWill.ShowYours("ok");
	}
	public void V(){
	iWill.ShowMine(42);
	}
	public void U(){
	iWill.ShowYours(24);
	}
	
	public static void main (String...V){
	System.out.println();
	System.out.println();
	System.out.println();
	}
}
