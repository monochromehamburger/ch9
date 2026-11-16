import java.util.Arrays;
public class Stats {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Stats <numbers>");
			return;
		}
		int count=args.length;
		int sum=0;
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
		for (int i=0;i<args.length;i++) {
			String arg=args[i];
			int value = Integer.parseInt(arg);
			if (value > max) {
				max = value;
			}
			if(value<min){
				min=value;
			}
			sum+=value;
		}
		System.out.println("Count: "+count);
		System.out.println("Sum: "+sum);
		System.out.println("Min: "+min);
		System.out.println("Max: " + max);
		System.out.printf("Average: %.2f", (double)sum/count);
		System.out.println();
    }
}
