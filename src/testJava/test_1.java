package testJava;
/*Ŀ�ģ�����һ��������ΪshowLove���޲��޷���ֵ�ķ����������ý��������Ϣ�Ĺ��ܡ�
 * ���裺
 * 1.���巽�����������η�   ����ֵ���� �������������б�{
 *    ������   }
 * 2.�������󣬲�ͨ��      ������.����������; �����÷��� 
 */

public class test_1 {
	public void showLove(){
		System.out.println("��������Ļ���");
	}
    
	public static void main(String[] args){
		//�������󣬶�����Ϊtest
		test_1 test =new test_1();
		//ͨ�� ������.�������������÷���
		test.showLove();
    }
}
