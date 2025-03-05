public class fullinverted {
public static void main (String [] args) {
	int i, j;
		for(i=1; i<=6; i++) {
			for(j=1; j<=11; j++) {
				if((j>=i)&&(j<=12-i)) {
					if((i%2==1)&&(j%2==1)){
					System.out.print("*");
				}
					else if((i%2==0)&&(j%2==0)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
				    System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
