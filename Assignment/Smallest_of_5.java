public class Smallest_of_5{
	public static void main(String[] args){
		int n1=1, n2=2, n3=3, n4=4, n5=5;
		int smallest = n1;
		if (n2 < smallest) {
            		smallest = n2;
        	}
        	if (n3 < smallest) {
            		smallest = n3;
        	}
        	if (n4 < smallest) {
            		smallest = n4;
        	}
        	if (n5 < smallest) {
            		smallest = n5;
        	}
        	System.out.println("The smallest number is: " + smallest);
	}
}
