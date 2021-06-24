package sec02_exceptionhandlingsyntax.EX04_MultiCatch_3;

public class MultiCatch_3 {
	public static void main(String[] args) {
		
		//#1. catch블록을 각각 처리한 경우
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");			
		}	
		catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");			
		}
		catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");			
		}


		//#2. catch 블록을 하나로 통합한 경우 		
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");			
		}		
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");			
		}
		
	}
}
