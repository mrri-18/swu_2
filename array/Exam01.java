package array;

public class Exam01 {

	public static void main(String[] args) {
		int[]scores= {83,90,87};
		System.out.println("scores[0]: "+scores[0]);
		System.out.println("scores[1]: "+scores[1]);
		System.out.println("scores[2]: "+scores[2]);
		
		int sum1=0;
		for(int i=0;i<3;i++) {
			sum1+=scores[i];
		}
		double avg=sum1/scores.length;
		System.out.println("����: "+sum1+" ���: "+avg); //int����̶� double�̶� 
		                                              //�Ҽ����� 0���� ����
		
		int scores2[]= {83,90,87};
		int sum2=0;
		for(int i=0;i<3;i++) {
			sum2+=scores2[i];
		}
		System.out.println("����: "+sum2);
		
		
	}

}
