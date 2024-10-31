import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class cc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Input Number :");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			System.out.println("The input is 1");
		}
		else {
		System.out.println("A number other than 1 is selected");
		}
	}

}
