
public class Main{
	public static void main(String[] args){
		Fraction f=new Fraction("128/48");
		f.reduce();
		System.out.println(f.getNum()+" "+f.getDenom());
		Fraction f2=new Fraction("67/6767");
		Fraction f3=Fraction.multiply(f,f2);
		System.out.println(f3.getNum()+"/"+f3.getDenom());
	}
}
