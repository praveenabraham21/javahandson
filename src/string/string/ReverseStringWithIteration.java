package string.string;

public class ReverseStringWithIteration {

	public static void main(String[] args) {
		String s = "Sachin Tendulkar";
		char[] c = s.toCharArray();
		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {
			rev += c[i];
		}
		System.out.println(rev);
	}

}
