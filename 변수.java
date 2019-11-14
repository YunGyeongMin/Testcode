import java.util.Scanner;
public class 변수 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int c;
		int d;
		int e;
		int f;
		int g;
		while(true) {
		System.out.println("a의값을 입력하시오.");
		System.out.println("(종료키 : 00)");
		int a = scan.nextInt();
		if(a == 00) break;
		System.out.println("+,-,*,/,% 연산자를 고르시오");
		String 연산자 = scan.next();
		System.out.println("b의값을 입력하시오.");
		int b = scan.nextInt();
		switch(연산자) {

		case "+" :  System.out.println("덧셈의 값 입니다.");
					c = 덧셈(a,b);
					System.out.println(c);
					break;
		case "-" :	System.out.println("뺄셈의 값 입니다.");
					d = 뺄셈(a,b);
					System.out.println(d);
					break;
		case "*" :	System.out.println("곱셈의 값 입니다.");
					e = 곱셈(a,b);
					System.out.println(e);
					break;
		case "/" : 	System.out.println("나눗셈의 값 입니다.");
					f = 나눗셈(a,b);
					System.out.println(f);
					break;
		case "%" : 	System.out.println("나머지의 값 입니다.");
	    			g = 나머지(a,b);
	    			System.out.println(g);
	    			break;
		default : 	System.out.println("잘못된 연산자입니다.");
					break;
	}
	}		
		
	}	
	static int 덧셈(int a, int b) {
		return a + b;
	}
	static int 뺄셈(int a, int b) {
		return (a - b);
	}
	static int 곱셈(int a, int b) {
		return a * b;
	}
	static int 나눗셈(int a, int b) {
		return a / b;
	}
	static int 나머지(int a, int b) {
		return a % b;
	}
	}


