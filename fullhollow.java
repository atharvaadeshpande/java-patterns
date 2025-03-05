public class fullhollow {
public static void main(String [] args) {
	int i, j;
		for(i=1; i<=6; i++) {
			for(j=1; j<=11; j++) {
				if((j<=5+i)&&(j>=7-i)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
}
}
