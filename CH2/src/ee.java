import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Input Number :");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num) {
			case 1: {
				System.out.println("The input is 1");
				break;
			}
			case 2: {
				System.out.println("The input is 2");
				break;
			}
			default: {
				System.out.println("Pls input 1 or 2");
				break;
			}
		}
	}

}
