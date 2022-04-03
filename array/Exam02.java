package array;

public class Exam02 {

	public static void main(String[] args) {
		
		String strNum1=args[0];
		String strNum2=args[1];
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result=num1+num2;
		System.out.println(num1+" + "+num2+" = "+result);
		int[] arr1=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		
		double[]arr2=new double[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr2["+i+"]: "+arr2[i]);
		}
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		for(int i=0;i<3;i++) {
			System.out.println("arr2["+i+"]: "+arr2[i]);
		}
        		
	}

}
