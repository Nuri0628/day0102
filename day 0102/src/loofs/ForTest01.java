package loofs;

public class ForTest01 {
	
	public static void main(String[] args) {
		//사이클이 정해준 반복문의 경우
		//초기값, 조건식, 증감
		//for(초기값;조건식;증감문) {}
		//for(;true or false;) {
		//무한 루프문은 while을 더 많이 사용
		/*
		for(;;) {
			System.out.println("무한루프");
		}
		*/
		
		for (
				int i=1; //1
				i<=3 ; //2, 조건식이 생략되어 있으면 true로 간주
				++i) { //3
			System.out.println("i = "+i); //4
	}
		//5 종료
		//1번은 최초 한번만 진행 -> 2 -> 4 -> 3 순서로 진행 됨
		//2 -> 4 -> 3
		//2 -> 4 -> 3
		//5
		
}
}