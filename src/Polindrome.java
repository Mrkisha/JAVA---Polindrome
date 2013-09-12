import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Polindrome {
	
	private String polindrome, outcome, input;
	private String reverse = "";
	
	public static void main(String[] args) { 
		
		
	}
	
	
	public void setPolindrome(String string){
		polindrome = string;
	}
	
	public String getPolindrome(){
		return polindrome;
	}
	
	void input(){
		System.out.print("Type the polindrom: ");
		Scanner scanString = new Scanner(System.in);
		input = scanString.nextLine();
		
		this.setPolindrome(input);
	}
	
	public void Polindrome() {
		
		input();
		
		// process the string and trim all the white space
		this.polindrome = polindrome.replaceAll("\\s+","");
		
		// get the char count
		int charCount = polindrome.length();
		
		for (int i = charCount - 1; i >= 0; i--) {
			reverse = reverse + polindrome.charAt(i);
		}
		
		if (polindrome.equalsIgnoreCase(reverse)) {
			System.out.println("It is a polindrome!");
		} else {
			System.out.println("It is not a polindrome");
		}
		
		
		
	}

}
