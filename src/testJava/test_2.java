package testJava;
/*Ŀ�ģ�����һ����ΪclaAvg������ֵΪdouble�͵��޲η�������ȡƽ��ֵ�������ؽ����
 * ���̣�
 * 1.���巽��
 * 2.����
 */
public class test_2 {
	public double claAvg(){//���巵��ֵΪdouble��claAvg����
		double a =87.6;
		double b =78.0;
		double avg=(a+b)/2;//��ƽ��ֵ
		return avg;	//��return����
	}
	public static void main(String[] args){
		test_2 hello =new test_2();//��������
		double avg1 =hello.claAvg();//ͨ�� ������.����������; �����ã�����ֵ��avg1
		System.out.println("ƽ��ֵ��"+avg1);
	}

}
