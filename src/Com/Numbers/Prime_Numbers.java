package Com.Numbers;

public class Prime_Numbers {
	public static void main(String[] args) {
			//x[i]=  0 1 2 3  4  6 7 8  9
		int [] x = {11,2,3,47,5,61,7,81,91};  //x[0] =1 
		System.out.println("Size of Array: "+x.length); // 10
		for (int i = 0; i < x.length; i++) { //i=11 ++ 
			int counter = 0;  //++ =1 =2
			for (int j = 1; j <=x[i]; j++) { // j=1 ++ 2++ 11 
				if (x[i]%j==0) { //11%1=0 11%2=0 11%11=0
				counter++; //++ 0>1
				}
			}
			if (counter==2) { // 1==2
				System.out.println(x[i]+" number is prime");
			}
			else
				System.out.println(x[i]+" number is not prime");
		}
	}

}
