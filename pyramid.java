import java.util.*;
public class pyramid{

public static void main(String[]args) {

int i, j;
for(i=1; i<=6; i++) {
for(j=1; j<=6; j++) {
if(j<=i) {
System.out.print("* ");
}
else {
System.out.print(" ");
}
}System.out.println();
}
}
}