import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class  hh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Excuse me, are you a boy?");
		System.out.println("Pls input Y or N");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		if(letter == 'Y' || letter =='y') {
				System.out.println("You is a boy");
			}
		else if(letter == 'N' || letter =='n') {
				System.out.println("You is girl");
			}
		else {
				System.out.println("Pls input Y or N");
			}
		}
	}
