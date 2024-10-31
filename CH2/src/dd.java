import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class dd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Input Number :");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			System.out.println("The input is 1");
		}
		else if(num == 2){
			System.out.println("The input is 2");
		}
		else {
			System.out.println("Pls input 1 or 2");
		}
	}

}
