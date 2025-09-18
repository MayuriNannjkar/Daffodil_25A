package Com.Mentor;

/**
 * 
 */
public class Assignment_palindrome {
public static void main(String[] args) {
	int [] x = {121,456,897,787,1001,159};
	for (int i = 0; i < x.length; i++) {
	int rem=0;
	int copy = x[i];
	int rev=0;
	
	while(x[i]>0) {
		 rem = x[i]%10;
		rev = rev*10+rem;
		x[i]= x[i]/10;
	}
	
	if(copy==rev) {
		System.out.println(copy+" "+"number is palindrome");
	} else {
		System.out.println(copy+" "+"number is not pallindrome");
	}
	}
}
}
