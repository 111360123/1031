import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ii {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Would you like to take a route?");
		System.out.println("Input Number");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res == 1) ? 'A':'B';
		
		System.out.println("choose  " + ans + "  route");
		}
	}
