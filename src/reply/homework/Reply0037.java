package reply.homework;

import java.util.Scanner;

public class Reply0037 {

	public static void main(String[] args) {
	/*
	 * For you to do:
Take 2 boolean inputs from a user:
 
"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"

Output:
"Looks like you need ___ "
	 */
		
	Scanner scan=new Scanner(System.in);
	String drink;
	System.out.println("Are you thirsty?");
	boolean thirsty=scan.nextBoolean();
	
	System.out.println("Are you sleepy?");
	boolean sleepy=scan.nextBoolean();
		
	if (thirsty && !sleepy) {
		drink="Water";
	}else if (thirsty && sleepy) {
		drink="Coffee";
	}else if (!thirsty && sleepy) {
		drink="Tea";
	}else {
		drink="Nothing";
	}
		System.out.println("Looks like you need to "+drink);
	
	
		
		

	}

}
