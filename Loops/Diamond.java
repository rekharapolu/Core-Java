public class Diamond{
	public static void main(String[] args){
		int space=3,star=-1;
		for(int i=1;i<=5;i++){
		if(i<=3) space--;
		else space++;
		if (i<=3) star+=2;
		else star-=2;
		for(int j=1;j<=space;j++){
		System.out.print(" ");
		}
		for(int j=1;j<=star;j++){
		System.out.print("*");
		}
		System.out.println();
		}
	}
}