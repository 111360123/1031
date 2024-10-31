import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class nn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("How many times do you want to end the cycle? (1-10)");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Clause  " + i + "  several times of processing");
			if(i == res)
				break;
		}
		
		}
	}
