public class Assignment3 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No values");
		}
		else {
			String comma="";
			for(String name : args) {
				System.out.print(comma+name);
				comma=",";
			}
		}
	}
}
