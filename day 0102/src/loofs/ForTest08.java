package loofs;

public class ForTest08 {
	
	public static void main(String[] args) {

		//$$$
		//$$
		//$
		
		//첫번째 방법
		for(int i=0; i<3; i++) {
			for(int j=0; j < 3-i; j++) {
			System.out.print("$ ");
		}
		System.out.println();
		}
		
		//두번째 방법
		for(int i=3; i>0; i--) {
			for(int j=0; j < i; j++) {
			System.out.print("$ ");
		}
		System.out.println();
	}
}
}