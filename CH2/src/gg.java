import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class  gg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Pls input a or b");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		switch(letter) {
			case 'a': {
				System.out.println("The input is a");
				break;
			}
			case 'b': {
				System.out.println("The input is b");
				break;
			}
			default: {
				System.out.println("Pls input a or b");
				break;
			}
		}
	}

}
