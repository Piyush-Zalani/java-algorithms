import java.util.Scanner;

public class painting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testCase = scn.nextInt();
		int count = 0;
		for (int i = 0; i < testCase; i++) {
			int X = scn.nextInt();
			int Y = scn.nextInt();
			int Z = scn.nextInt();
				for(;(X >= 3 || Y >= 3 || Z >= 3); ) {
					if (X >= 3) {
						count++;
						X = X - 3;
					}
					if (Y >= 3) {
						count++;
						Y = Y - 3;
					}
					if (Z >= 3) {
						count++;
						Z = Z - 3;
					}
				} 
				for ( ;(X < 3 || Y < 3 || Z < 3 ) && (X > 0 && Y > 0 && Z > 0); ) {
					X = X - 1;
					Y = Y - 1;
					Z = Z - 1;

					count++;
				}
			System.out.println(count);
			count = 0;
		}

		scn.close();
	}

}
