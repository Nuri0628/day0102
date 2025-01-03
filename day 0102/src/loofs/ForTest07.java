package loofs;

public class ForTest07 {
	
	public static void main(String[] args) {

		//$
		//$$
		//$$$
		for(int i=0; i<3; i++) { //출력 $ $ $
			for(int j=0; j < i+1; j++) {
			System.out.print("$ ");
		}
		System.out.println();
		}
	}
}