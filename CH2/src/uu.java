import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Please enter a score for 5 people");
		int [] test = new int [5];
		
		for(int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s = 0; s < test.length-1; s++){
			for(int t = s+1; t < test.length; t++) {
				if(test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}	
		}
		for(int i = 0; i < test.length; i++) {
			System.out.println("Clause " + (i + 1) + " the score of the name is " +test[i]);
		}
	}
}
