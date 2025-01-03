package loofs;

public class WhileTest01 {
	
	public static void main(String[] args) {
		//if(조건식) {}
		//while(조건식) {} 조건식이 참인 동안 수행문을 반복해서 수행
		//두개의 차이: while은 true 일 때 {}구간을 실행하고 다시 조건을 확인. false일 때 {}을 빠져나가고 종료함.
		/*
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		*/
		//무한루프
		//while(true) {
			//System.out.println("안녕하세요.");	
		//}
		
		//3번 반복
		int i=0; //1.초기화 변수 선언
		while(i<3) { //2.조건식
			System.out.println("안녕하세요.");	
			++i; //(==++i;) 3.증감문
		//!!반복문 3요소: 초기값 조건식 증감문
		}
		
	}

}
