import java.util.Random;

public class Exercitiul6 {
 public static void main(String[] args) {
	 Random rand = new Random(47); //obiect pentru generare de numere random
	 float f[] = new float[25];
	 int j = 1;
	 for(int i = 0; i < 25; i++) {
		 f[i] = rand.nextFloat(); //parcurgere, initializarea elementelor
	
		 for(float x : f) { //parcurgere vector f
		   if(x > f[j] && j < f.length - 1) {
			   System.out.println("Mai mare " + x + " > " + f[j]);
			   j ++;
		   }
		   else if(x < f[j] && j < f.length - 1) {
			   System.out.println("Mai mic " + x + " > " + f[j]);
			   j ++;
		 }
		   else if( x == f[j] && j<f.length - 1) {
			   System.out.println("Egal " + x + " = " + f[j]);
			   j++;
		   }
		 
	 }
	 
 }
 }
}
