public class Logical{

	public static void main(String[] args){
		System.out.println((50>10)&&(20<'a'));//true
		System.out.println(('A'>50)&&(100<'b'));//false
		System.out.println((10<15)||(10<20));//true
		System.out.println(!(100>90));//false
		System.out.println(((10<23)&&('k'<'u'))||(('l'<'r')&&('k'<'r')));//true
		//System.out.println(!("Rekha"));//CTE
	}
}