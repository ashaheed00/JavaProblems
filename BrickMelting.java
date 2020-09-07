import java.util.Scanner;

public class BrickMelting {

	public static int sumOfColoumn(int[][] wall) {
		int n = wall.length;
		int sum = 0;
		int max_sum1 = 0;
		int max_sum2 = 0;
		
// Checking column wise sum of total C(i.e 1) elements
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				sum += wall[i][j];
			}
			if (sum > max_sum1)
				max_sum1 = sum;
			sum = 0;
		}
// Same thing row wise because they can rotate the whole set up 90 degree wise
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += wall[i][j];
			}
			if (sum > max_sum2)
				max_sum2 = sum;
			sum = 0;
		}
		return (max_sum1 > max_sum2) ? max_sum1 : max_sum2;
	}

// This is the main function where we are taking input and giving output
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] wall = new int[n][n];  // 2D Array to store C D Wall
		String brick = "";
// Storing C=1 and D=0
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				brick = sc.next();
				if (brick.equals("D"))
					wall[i][j] = 0;
				else
					wall[i][j] = 1;
			}
		}
		sc.close();
		System.out.println(sumOfColoumn(wall));	//Output
	}
}
