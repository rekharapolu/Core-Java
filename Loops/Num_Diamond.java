public class Num_Diamond{
	public static void main(String[] args){
		int space=3,value=-1;
		for(int i=1;i<=5;i++){
			if(i<=3){
				space--;
				value+=2;
			}else{
			      space++;
			      value-=2;
			 }
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