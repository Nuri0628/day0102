package loofs;

public class WhileTest04 {
	public static void main(String[] args) {
		//1~10 숫자중에 홀수만 출력하세요
		int i=1;
		while (i<=10) {
			if(i%2==0) {
				i++;
				continue; //이후 문장 실행하지 않고 조건식(while)으로 돌아감
			}
			System.out.println(i);
			i++;
		}
	}
}