public class Largest_of_5{
	public static void main(String[] args){
		int n1=1, n2=2, n3=3, n4=4, n5=5;
		int largest = n1;
		if (n2 > largest) {
            		largest = n2;
        	}
        	if (n3 > largest) {
            		largest = n3;
        	}
        	if (n4 > largest) {
            		largest = n4;
        	}
        	if (n5 > largest) {
            		largest = n5;
        	}
        	System.out.println("The largest number is: " + largest);
	}
}
