import java.util.Scanner;

public class GugudanTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i=0; i<first-1; i++) {
			for(int j=0; j<second; j++) {
				System.out.println((i+2)*(j+1));
			}
		}

	}
}
