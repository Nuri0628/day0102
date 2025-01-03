package loofs;

public class WhileTest06 {
	public static void main(String[] args) {
		//1~10 숫자중에 홀수만 출력하세요
		int i=1;
		while (i<10) { //무한 루프
			i+=2;
			System.out.println(i); //3~11까지 출력 됨, 정확한 값이 출력 안됨
		}
	}
}