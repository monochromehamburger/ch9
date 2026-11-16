import java.util.Arrays;
public class Longest {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java Longest <words>");
			return;
		}
		String longest=args[0];
		String firstAlphabetically=args[0];
        
		for (int i=0;i<args.length;i++) {
			String arg=args[i];
			if(arg.length()>longest.length()){
				longest=arg;
			}
			if(firstAlphabetically.compareTo(arg)>0){
				firstAlphabetically=arg;
			}
		}
		System.out.println("Longest: "+ longest);
		System.out.println("First alphabetically: "+firstAlphabetically);
    }
}
