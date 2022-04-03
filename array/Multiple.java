package array;

public class Multiple {

	public static void main(String[] args) {
 		int[][] aa=new int[3][3];
 		int i,j;
 		int value=1;
 		for(i=0;i<3;i++) {
 			for(j=0;j<aa[i].length;j++) {
 				aa[i][j]=value;
 			}
 		}
 		for(i=0;i<3;i++) {
 			for(j=0;j<aa[i].length;j++) {
 				System.out.printf("%3d",aa[i][j]);
 			}
 			System.out.println();
 		}
 		

	}

}
