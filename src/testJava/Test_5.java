package testJava;
/*Ŀ��:���췽����ʹ��
 *   public ���췽��(){  ��ʼ�������
 *            }
 * ���췽������ͬ������û�з���ֵ���вΡ��޲ι��췽����
 */
public class Test_5 {
	public static void main(String[] args){
		Test_5 hello =new Test_5(2f, 6f);
		//�ڹ��췽��ʹ��ʱ��new+���췽�����Ѿ����ò�����     ������+��������; ����ʽ����
	}
  float screen;
  float cup;
  public Test_5(float newscreen,float newcup){
	  if(newscreen<3f){//���ж���Ϊ�˷�ֹ�вθ�ֵʱ����
		  System.out.println("���������ֵ�����Զ���ֵ5f");
		  screen=5f; 
	  }else{
	  screen=newscreen;
	  }
	  cup=newcup;
	  System.out.println("�вι��취ִ����");    
  }
}
