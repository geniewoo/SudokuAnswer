import java.util.Scanner;

public class MySugarOrm {
	char[] a1=new char[81];
	
	public MySugarOrm(){
		init();
	}
	private void init(){
		Scanner scan=new Scanner(System.in);
		String data=null;
		
		data=scan.nextLine();
		System.out.println(data);
	}
}
