public class Ascorder{
	public static void main(String[] args){
	 	int number = 451567; 
        	int original = number; 

        	while (number > 0) {
            	int digit = number % 10;

            //System.out.println("Last digit is : " + digit + " of number : " + number); 
            	int temp = number / 10;
            		while(temp > 0) {
                	//System.out.println("Subchunk is " + temp);
                	int t = temp % 10; 
                		if(t < digit) {  
                    		digit = t;
                		temp = temp / 10;
            			}
            		//System.out.println("Smalled digit in " + number  + " is " + digit);
            		store = (store * 10) + digit; 

            		//System.out.println("Store is : " + store);
            		number = getReducedNumber(number, digit); 
        		}
		}
        System.out.println("Ascending order of " + original + " is " + store); 
	
	}
}