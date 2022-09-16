
public class Split {
		  public static void main(String[] args) {
		    String text = "Java is a fun programming language";

		    // split string from space
		    String[] result = text.trim().split(" ");


		    System.out.print("result = ");
		    for (String str : result) {
		      System.out.print(str + ", ");
		    }
		  }

}
