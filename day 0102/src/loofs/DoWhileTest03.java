package loofs;

import java.util.Scanner;

public class DoWhileTest03 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
		int n;
		do {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.게임시작 2.종료");
			System.out.println("선택 > ");
			n=in.nextInt();
			if(n!=1 && n!=2) System.out.println("메뉴를 잘못 선택 하셨습니다.");
		}while(n!=1 && n!=2);
		
		switch(n) {
		case 1:System.out.println("게임을 시작합니다."); break;
		case 2:System.out.println("게임종료!");
		
		//in.close();
	}

}
}