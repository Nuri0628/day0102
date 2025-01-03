package loofs;

public class ForTest06 {
	
	public static void main(String[] args) {

		//중첩 예제
		for(int i=0; i<3; i++){
			
			for(int j=0; j<3 ; j++) {
				System.out.print("$ "); //
			} //j변수 범위 - i변수 안에 소속되어 있기 때문에 j를 사용
			
			System.out.println();
		
		} //i변수 범위
	}
}