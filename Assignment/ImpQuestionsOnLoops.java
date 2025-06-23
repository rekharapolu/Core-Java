//IMP QUESTIONS ON LOOPS

//to count digits present in a number
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int a=1234;
		int count=0;
		while(a>0){
			int rem=a%10;
			count++;
			a=a/10;
			
		}
		System.out.println(count);
	}
}*/

//to print reverse of a number
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int a=1234;
		int rev=0;
		while(a>0){
			int rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		System.out.println(rev);	}
}*/


//to print the digits in vertially
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int a=1234;
		while(a>0){
			int rem=a%10;
			System.out.println(rem);
			a=a/10;
		}
		
	}
}*/

//to print the digits in horizontally
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int n=2345;
		while(n>0){
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
	}
}*/

//to print the number from the last unit place
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int n=56749;
		while(n>0){
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
	}
}*/

//to print summation of the number
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int n=5674;
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}*/


//to check given number is palindrome or not
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int n=567765;
		int temp=n;
		int rev=0;
		while(n>0){
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==temp){
		System.out.println(temp+" is palindrome");
		}else{
		System.out.println(temp+" is not a palindrome");
		}
	}
}*/


//to check whether summation of the numbers is even or odd
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int n=56754;
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(sum%2==0){
		System.out.println(sum+"is even");

		}else{
		System.out.println(sum+"is odd");
		}
	}
}*/


//to check whether summation of the numbers is even or odd
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int n=57;
		int product=1;
		while(n>0){
			int rem=n%10;
			product=product*rem;
			n=n/10;
		}
		if(product%2==0){
		System.out.println(product+"is even");

		}else{
		System.out.println(product+"is odd");
		}
	}
}*/


//7.to print numbers between m and n except number which has 7 in it
//[NOT COMPLETED]
/*public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int m=57;
		int n=68;
		while(m<n){
			int num=0;
			int rem=m%10;
			if(rem==7){
				System.out.println();
			}
			m=m/10;
			
			
			
		}
		System.out.println(m);
		m++;
	}
}*/


//8.To print to count numbers between m and n the number which has 5 in it.
public class ImpQuestionsOnLoops{
	public static void main(String[] args){
		int m=10;
		int n=20;
		int count=0;
		while(m<=n){
			int rem=m%10;
			while(rem>0){
			if(rem==5){
				count++;
			}
			m=m/10;
			}
			m++;
		}
		
		System.out.println(count);
	}
}