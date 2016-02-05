import java.util.*;

public class test2 {

	public int area(int breadth, int height) throws Exception{
		
		if(breadth >= 100 && height <= -100){
			throw new Exception();
		}
		
		int result = breadth*height;
		return result;
		
	}
	
	public static void main(String[] args) {
	
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		test2 call = new test2();
		
		int bred = in1.nextInt();
		int heig = in2.nextInt();
		
		try {
			int result = call.area(bred, heig);
			
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
