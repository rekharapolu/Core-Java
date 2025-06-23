public class Numbers{
	public static void main(String[] args){

//to count no. of digits present in given no.

		/*int n=123;
		int count=0;
		while(n!=0){
		n=n/10;
		count++;
		}
		System.out.println(count);*/

//TO PRINT EVEN DIGITS FROM GIVEN NO.
		
		/*int n=123;
		while(n!=0){
		int rem=n%10;
			if(rem%2==0){
			System.out.println(rem);
			}
		n=n/10;
		}*/

//to find sum of digits of given numbers

		/*int n=8432;
		int sum=0;
		while(n!=0){
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		System.out.println(sum);*/

//to find product of digits of given number
		
		/*int n=841;
		int product=1;
		while(n!=0){
		int rem=n%10;
		product=product*rem;
		n=n/10;
		}
		System.out.println(product);*/

//to print given number digits from last position

		/*int n=8987;
		while(n!=0){
		int rem=n%10;
		System.out.println(rem);
		n=n/10;
		}*/

//to reverse given no.

		/*int n=9484;
		int rev=0;
		while(n!=0){
		int rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
		}
		System.out.println(rev);*/

//to check given number is palindrome or not

		/*int n=989;
		int temp=n;
		int rev=0;
		while(n!=0){
		int rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
		}
		if(rev==temp){
		System.out.println(temp+"is a palindrome");
		}
		else{
		System.out.println(temp+"is not a palindrome");
		}*/

//to check given no.is neon number

		/*int n=81;
		int temp=n;
		int square=n*n;
		int sum=0;
		while(square!=0){
		int digit =square%10;
		sum=sum+digit;
		square=square/10;
		}
		if(sum==temp){
		System.out.println(temp+"is a neon number");
		}
		else{
		System.out.println(temp+"is not a neon number");
		}*/

//to find factorial of given no.

		/*int n=4;
		int product=1;
		while(n!=0){
		product=product*n;
		n--;
		}
		System.out.println(product);*/

//to find x^n of given number

		/*int x=2;
		int n=4;
		int power=1;
		while(n!=0){
		power=power*x;
		n--;
		}
		System.out.println(power);*/

//to check given no. is spy no. or not

		/*int n=224;
		int temp=n;
		int sum=0;
		int product=1;
		while(n!=0){
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		if(sum==product){
		System.out.println(temp+"is a spy number");
		}
		else{
		System.out.println(temp+"is not a spy number");
		}*/

//to print factors of given no.s

		/*int n=20;
		int i=1;
		while(i<=6){
		if(n%i==0){
		System.out.println(i);	
		}
		i++;
		}*/

//to print sum of factors of given no.s

		/*int n=20;
		int i=1;
		int sum=0;
		while(i<=n){
		if(n%i==0){
		sum=sum+i;
		}
		i++;
		}
		System.out.println(sum);*/

//to check given number is perfect or not

		/*int n=6;
		int factor=1;
		int sum=0;
		while(factor<n){
		if(n%factor==0){
		sum=sum+factor;
		}
		factor++;
		}
		if(n==sum){
		System.out.println(n+"is a perfect number");
		}
		else{
		System.out.println(n+"is not a perfect number");
		}*/

//to check given no. is prime or not

		/*int n=7;
		int fact=1;
		int count=0;
		while(fact<=n){
		if(n%fact==0){
		count++;
		}
		fact++;
		}
		if(count==2){
		System.out.println(n +"is a prime number");
		}
		else{
		System.out.println(n +"is not a prime number");
		}*/

//to check given number is harshad no. or not

		/*int n=171;
		int temp=n;
		int sum=0;
		while(n!=0){
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		if(temp%sum==0){
		System.out.println(temp + "is a Harshad Number");
		}
		else{
		System.out.println(temp + "is not a Harshad Number");
		}*/

// to print fibonicci series upto given range

		/*int n1=0,n2=1,i,res=0;
		System.out.println(n1);
		System.out.println(n2);
		while(res<=50){
		res=n1+n2;
		System.out.println(res);
		n1=n2;
		n2=res;
		}*/

//to check given no. is even or odd without using modulus and division operator

		/*int n=20;
		while(n>0){
		n=n-2;
		}
		if(n==0){
		System.out.println("Even");
		}
		else{
		System.out.println("Odd");
		}*/

//to print PEL series

		/*int a=0,b=1;
		int res=0;
		System.out.println(a);
		System.out.println(b);
		while(res<=100){
		res=a+(2*b);
		System.out.println(res);
		a=b;
		b=res;
		}*/

//to find sum of extreme digits and mean digits of a given no.

		/*int n=9094;
		int temp=n;
		int extreme=0;
		int mean=0;
		while(n!=0){
		int rem=n%10;
		if(n==temp||n<=9){
		extreme=extreme+rem;
		}
		else{
		mean=mean+rem;
		}
		n=n/10;
		}
		System.out.println(extreme);
		System.out.println(mean);*/

//to check given no. is xylem and phloem no.

		int n=7234;
		int extreme=0;
		int mean=0;
		int temp=n;
		while(n!=0){
		int rem=n%10;
		if(n==temp||n<=9){
		extreme=extreme+rem;
		}
		else{
		mean=mean+rem;
		}
		n=n/10;
		}
		if(extreme==mean){
		System.out.println("is a xylem number");
		}
		else{
		System.out.println("is a phloem number");
		}

//to check given no. is perfect square or not

		/*int n=92;
		int count=0;
		int i=1;
		while(i<=n){
		int sq=i*i;
		if(sq==n){
		System.out.println("Perfect Square");
		count++;
		break;
		}
		i++;
		}
		if(count==0){
		System.out.println("not a Perfect Square");
		}*/												

//to print multiplication table to given number

		/*int n=7;
		int i=1;
		while(i<=10){
		int product=n*i;
		System.out.println(n+""+"*"+i+"="+product);
		i++;
		}*/

	}
}