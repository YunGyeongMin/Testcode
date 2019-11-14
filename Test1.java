import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단의 열을 입력하시오.(종료 : 00)");
		while(true) {
		int 입력값 = scan.nextInt();
		if(입력값 == 00) break;
		for(int i = 1; i < 10; i += 입력값) {
			for(int j = 1; j < 10; j++) {
				String 행 = "";
				for(int x = 0; x < 입력값; x++) {
					if((i+x) > 9) break; 
					행 += ((i+x) + " * " + j + " = " + ((i+x) * j)+ "\t");
				}
				System.out.println(행);
				
//				String a = (i + " * " + j + " = " + ( i * j ));
//				String b = ((i+1) + " * " + j + " = " + ((i+1) * j));
//				String c = ((i+2) + " * " + j + " = " + ((i+2) * j));
//				System.out.println(a + "\t" + b + "\t" + c);
			}
		
	}
	}	
	}

}
