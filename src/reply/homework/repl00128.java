package reply.homework;


//Returns:
//an integer
//Name:
//countVowels
//Parameters:
//a String called s
//Purpose:
//count the number of vowels in the string s.  Assume s is all lowercase.
//
//Examples:
//countVowels("obama") ==> 3
//countVowels("happy friday! i love weekends") ==> 9
//

public class repl00128 {
	
	
	static int countVowels(String s){
		
		String str=s.replaceAll("[^aoiue]","");
		   int a=str.length();
		return a;
		}
		
		
	
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countVowels("obama")); //3
			System.out.println(countVowels("happy friday! i love weekends")); //9
		}
	}