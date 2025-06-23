//STANDARD PROGRAMS
//6.To check whether given number is a SPY number or not
/*public class StandardPrograms{
	public static void main(String[] args){
		int a=123;
		int sum=0;
		int product=1;
		while(a>0){
			int rem=a%10;
			sum=sum+rem;
			product=product*rem;
			a=a/10;
			
		}
		if(sum==product){
			System.out.println("Given number is SPY number");
		}else{
			System.out.println("Given number is not SPY number");
		}
	}
}*/


//7.to check whether given number is perfect number or not
/*public class StandardPrograms{
	public static void main(String[] args){
		int a=6;
		int fact=1;
		int sum=0;
		while(fact<a){
			if(a%fact==0){
				sum=sum+fact;
			}
			
			fact++;
		}
		if(sum==a){
			System.out.println(a+" is  PERFECT number");

		}else{
			System.out.println(a+" is not a  PERFECT number");

		}
	}
}*/


//8.to check whether given number is perfect square or not
/*public class StandardPrograms{
	public static void main(String[] args){
		int a=16;
		int i=1,count=0;
		while(i<=a/2){
			int sq=i*i;
			if(sq==a){
				System.out.println(a+"is perfect square");
				count++;
			}
			i++;
		}
		if(count==0){
				System.out.println(a+"is not a perfect square");
			}
	}
}*/
public class StandardPrograms{
	public static void main(String[] args){
		int a=16;
		int i=1;
		int sq=1;
		while(i<=a/i){
			sq=i*i;
			i++;
			}
			if(sq==a){
				System.out.println(a+"is perfect square");
			}else{
				System.out.println(a+"is not a perfect square");
			}
		
	}
}
}*/


//9.to print factorial of a number
/*public class StandardPrograms{
	public static void main(String[] args){
		int a=5;
		int fact=1;
		int product=1;
		while(fact<=a){
			product=product*fact;
			fact++;
			
			}
			
			System.out.println(product);	
	}
}*/

//10.to print given number is strong number or not
//NOT COMPLETED
/*public class StandardPrograms{
	public static void main(String[] args){
		int a=145;
		int fact=1;
		int product=1;
		while(a>0){
			int rem=a%10;
			
			product=product*fact;
	}
}*/			

//11.to print x power n
/*public class StandardPrograms{
	public static void main(String[] args){
		int x=5;
		int n=2;
		int product=1;
		while(n>=1){
			product=product*x;
			n--;
			
			}
			
			System.out.println(product);	
	}
}*/

//12.check whether given number is prime or not
/*public class StandardPrograms{
	public static void main(String[] args){
		int a=5;
		int fact=1;
		int count=0;
		while(fact<=a){
			if(a%fact==0){
			count++;
			}
			fact++;
			
			}
			if(count==2){
			
			System.out.println(a+"is a prime number");
			}else{
			System.out.println(a+"is not a prime number");

			}
	
	}
}*/


//13.to print prime number by reading its position of number
//NOT COMPLETED
public class StandardPrograms{
	public static void main(String[] args){
		
		int a=1456;
		int count=0;
		while(a>0){
			int rem=a%10;
		
		for(int fact=1;fact<=a;fact++){
			if(rem%fact==0){
			count++;
			}
			fact++;
			}
			

		}
		a=a/10;
		
	}
}