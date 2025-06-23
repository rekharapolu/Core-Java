public class Num_Char{
	public static void main(String[] args){
		int star=0;
		for(int i=1;i<=4;i++){
			int n=1;char ch='a';
			star++;
			for(int j=1;j<=star;j++){
				if(i%2==0)
					System.out.print(ch++);
				else
					System.out.print(n++);
			}
		System.out.println();
		}
	}
}