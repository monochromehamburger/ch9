import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Max <numbers>");
			return;
		}
        System.out.println(Arrays.toString(args));
        int max = Integer.MIN_VALUE;
        
		for (int i=0;i<args.length;i++) {
			String arg=args[i];
			int value = Integer.parseInt(arg);
			if (value > max) {
				max = value;
			}
		}
		System.out.println("The max is " + max);
    }
}
