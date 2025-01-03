package loofs;

public class ForTest03 {
	public static void main(String[] args) {
		
		//1~10까지 합을 구하세요
		//지역변수(local variable)는 최초 초기화 해야 사용 가능
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		//10회전 후 아래문장 실행
		System.out.println("1~10까지의 합? "+sum);
	}
}