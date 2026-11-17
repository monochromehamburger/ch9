public class Fraction{
	
	private int numerator;
	private int denominator;
	public Fraction(){
		numerator=1;
		denominator=1;
	}
	public Fraction(String input){
		numerator=Integer.parseInt(input.substring(0,input.indexOf('/')));
		denominator=Integer.parseInt(input.substring(input.indexOf('/')+1));
		if(denominator==0){
			denominator=1;
			System.out.println("Error: Denominator cannot be 0");
		}
	}
	public int getNum(){
		return numerator;
	}
	public int getDenom(){
		return denominator;
	}
	public String toString(){
		return numerator+"/"+denominator;
	}
	public double toDouble(){
		return (double)numerator/denominator;
	}
	public void reduce(){
		for (int i=Math.min(numerator, denominator);i>1;i--){
			if(numerator%i==0 && denominator%i==0){
				numerator/=i;
				denominator/=i;
			}
		}
	}
	public void setNum(int input){
		numerator=input;
	}
	public void setDenom(int input){
		denominator=input;
	} 
	public static Fraction multiply(Fraction a, Fraction b){
		Fraction output=new Fraction(a.getNum()*b.getNum()+"/"+a.getDenom()*b.getDenom());
		output.reduce();
		return output;
	}
		
	
	
}
