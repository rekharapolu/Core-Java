public class Symm{
	public static void main(String[] args){
		int space=-1,star=9;
		for(int i=1;i<=7;i++){
		if(i<=4){
			space++;
			star-=2;
		}else{
		      space--;
		      star+=2;
		 }
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


