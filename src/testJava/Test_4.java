package testJava;
/*java��̬�ɷ�(��̬��������̬��������̬��ʼ���죩��ϰ���ؼ��� static
 */
public class Test_4 {
	int age;//��������
	String name ;
	static char sex;
	public Test_4(){//���췽��
		age = 23;
		System.out.println("ͨ�����췽�����и�ֵ");
	}
	{// ��ʼ����
		name ="tanaka";
		System.out.println("ͨ����ʼ������и�ֵ");
	}
	static {//��̬��ʼ����
		 sex='��';
		 System.out.println("ͨ����̬��ʼ������и�ֵ");
	}
   public void show(){//����һ�������������ȫ������
	   System.out.println("age:"+age+"  name:"+name+"  sex:"+sex);
   }
	
	public static void main(String[] args){
    Test_4 hello =new Test_4();//��������
    System.out.println("age:"+hello.age);
    System.out.println("name:"+hello.name);
    System.out.println("sex:"+sex);
    System.out.println();
    hello.show();//ʹ�ö�����.������(); ��ʽ�����ô˷���
    	}
}
