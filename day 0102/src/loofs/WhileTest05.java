package loofs;

public class WhileTest05 {
	public static void main(String[] args) {
		//1~10 숫자중에 홀수만 출력하세요
		int i=1;
		while (true) { //무한 루프
			if (i>10) {
				break; //명령문 탈출
			} //if 명령문 위치에 따라 출력값에 차이가 생김
			System.out.println(i);
			i+=2;
		}
	}
}