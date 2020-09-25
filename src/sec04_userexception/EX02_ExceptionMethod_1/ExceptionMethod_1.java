package sec04_userexception.EX02_ExceptionMethod_1;

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		
		//#1. 예외객체 생성시 메시지 전달하지 않는 경우
		try {
			throw new Exception(); //이 시점에서 예외 발생
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		//#2. 예외객체 생성시 메시지 전달하는 경우 
		try {
			throw new Exception("예외메세지"); //이 시점에서 예외 발생
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
