package exam01;

public class Break {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=100) {
			sum+=i;
			i++;
			if(sum>=1000)
				break;
		}
        System.out.println("1~"+(i-1)+"까지의 합은: "+sum);
	}

}
