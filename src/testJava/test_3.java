package testJava;
/*Ŀ�ģ������޲ε�����ֵ�ķ�����ʵ�ַ������ֵ��
 */
/**import java.util.Arrays;
public class test_3 {
	public static void main(String[] args){  
	    int[] age={18,23,21,19,25,29,17};	
	    Arrays.sort(age);	   
	    System.out.println("���ֵ��"age[6]);
  }
}
*/
public class test_3 {
	public static void main(String[] args){
		test_3 hello =new test_3(); //��������
		int max = hello.getMax();//����  ������.����������;�����÷���������ֵ������
		System.out.println("���ֵ��" +max);
	}

    public int getMax() { //����int�� ��ΪgetMax�ķ���
    	int [] age={18,23,21,19,25,29,17};//����һά����
    	int max =age[0];//����һ���ٶ����ֵ
    	for(int i=0;i<age.length;i++){
    		if(age[i]>max){//if�ж����ֵ
    			max=age[i];//���ֵ��ֵ	
    		}
    	}
    	return max;//��return�������ֵ
    	
    }
    
}