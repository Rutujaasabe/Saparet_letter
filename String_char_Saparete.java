import java.util.*;
class String_char_Saparete{
	public static void main(String[]rt){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println(s.length());
		
		for(int i=0; i<s.length(); i++){
			System.out.println(s.charAt(i));
		  
			
		}	
	}
}