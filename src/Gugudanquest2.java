import java.util.Scanner;

public class Gugudanquest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();	
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);	
		int[] result = new int[second];
		
		for(int i=2; i<=first; i++) {
			for(int j=0; j<result.length; j++) {
				result[j] = i * (j + 1);
				System.out.println(result[j]);
			}
		}
	}

}
