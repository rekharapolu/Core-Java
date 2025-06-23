public class Num_Tri{
	public static void main(String[] args){
		int space=4,value=-1;
		for(int i=1;i<=4;i++){
			space--;
			value+=2;
			int n=1; 
			for(int j=1;j<=space;j++){
					System.out.print(" ");
			}
			for(int j=1;j<=value;j++){
				System.out.print(n++);
			}
		System.out.println();
		}
	}
}