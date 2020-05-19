import java.util.Scanner;

public class JenkinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		
		int n = sc.nextInt();
		
		if(n > 5) {
			System.out.println("Number is greater than 5 >>>>>>>" +n);
			
		}else {
			System.out.println("number is less than 5 >>>>>>>" +n);
		}

	}

}
