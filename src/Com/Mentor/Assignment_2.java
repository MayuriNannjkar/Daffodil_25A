package Com.Mentor;

import java.util.Scanner;

public class Assignment_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");							//a
		int num = sc.nextInt(); 										//1 2 
		for (int line = 1; line <=num; line++) {						//a b c 
			char ch ='a';												//1 2 3 4 
			if (line%2==0) {
				for (int number = 1; number <=line; number++) {
					System.out.print(number+" ");
				}
			}else
				for (int character = 1; character <=line; character++) {
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
		}
	}

}
