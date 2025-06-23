public class LeapYearCheck{
	public static void main(String[] args){
		int a= 2023;
			if((a%4==0)&&(a%100!=0 || a%400==0)){
				System.out.println(a +"is a Leap Year");
			}
			else{
				System.out.println(a +"is not a Leap Year");
			}
	}
}