package reply.homework;

public class Repl113 {

	int sumEvenToX(int x){
	    
		 int sum=0;
   for (int i=0; i<=x; i+=2){
   
   sum=sum+i;
   
    }
	return sum;
  
 }
	
	
	public static void main(String[] args) {

		
		Repl113 num=new Repl113();
		
		int a=num.sumEvenToX(5);
		int b=num.sumEvenToX(8);
		System.out.println(a);
        System.out.println(b);
		 
		
		
		
		
		
		
		
		
	}

}
