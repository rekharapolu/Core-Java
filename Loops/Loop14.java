public class Loop14{
	public static void main(String[] args){
	char ch1='A',ch2='z';
	int i=1;
		while(ch1<='Z'){
		System.out.println(ch1+""+i+""+ch2);
		ch1++;
		ch2--;
		i++;
		}
	}
}
