import java.util.Scanner;

public class Gugudanquest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] result = new int[num];
		
		for(int i=2; i<=num; i++) {
			for(int j=0; j<result.length; j++) {
				result[j] = i * (j + 1);
				System.out.println(result[j]);
			}
		}
		

	}

}
