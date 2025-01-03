package loofs;

public class ForTest04 {
	public static void main(String[] args) {
		//홀수의 합은?
		int sum = 0;
		
		for (int i=1; i <= 10; i++) {
			if(i%2==0) 
				continue; //짝수이면 증감문으로 이동하여 조건문 실행.
			//홀수만 아래문장이 실행 됩니다.
			sum += i; //sum = sum + i
		}
		System.out.println("1~10중 홀수의 합은? " + sum);
	}

}
