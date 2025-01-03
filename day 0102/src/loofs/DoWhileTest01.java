package loofs;

public class DoWhileTest01 {
	
	public static void main(String[] args) {
		/*
		do {
			//이곳 수식을 실행
		} while(조건식);
		*/
		//일단 {}실행한 후 조건이 true이면 {}실행, false이면 {}를 빠져나감
		//조건과 상관없이 최소 한번은 실행, 일단 실행
		do {
			System.out.println("여기 실행하나?");
		}while (false);
	}

}
