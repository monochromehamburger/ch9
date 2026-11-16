import java.util.Arrays;
public class Calc {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Calc <numbers>");
			return;
		}
		int count=args.length;
		int sum=0;
		int product=1;
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        args[0]=args[0].toLowerCase();
        if(args[0].equals("add")){
			for(int i=1;i<args.length;i++){
				int value=Integer.parseInt(args[i]);
				sum+=value;
			}
			System.out.println(sum);
        }
        else if(args[0].equals("mult")){
			for(int i=1;i<args.length;i++){
				int value=Integer.parseInt(args[i]);
				product*=value;
			}
			System.out.println(product);
		}
		else if(args[0].equals("max")){
			for (int i=1;i<args.length;i++) {
				String arg=args[i];
				int value = Integer.parseInt(arg);
				if (value > max) {
					max = value;
				}
			}
			System.out.println(max);
		}
		else if(args[0].equals("min")){
			for (int i=1;i<args.length;i++) {
				String arg=args[i];
				int value = Integer.parseInt(arg);
				if (value < min1) {
					min = value;
				}
			}
			System.out.println(min);
		}
		else{
			System.out.println("Unknown operation: "+args[0]);
		}
    }
}
