package testJava;
/*目的：定义无参道返回值的方法来实现返回最大值。
 */
/**import java.util.Arrays;
public class test_3 {
	public static void main(String[] args){  
	    int[] age={18,23,21,19,25,29,17};	
	    Arrays.sort(age);	   
	    System.out.println("最大值："age[6]);
  }
}
*/
public class test_3 {
	public static void main(String[] args){
		test_3 hello =new test_3(); //创建对象
		int max = hello.getMax();//运用  对象名.方法名（）;来调用方法，并赋值到变量
		System.out.println("最大值：" +max);
	}

    public int getMax() { //定义int型 名为getMax的方法
    	int [] age={18,23,21,19,25,29,17};//定义一维数组
    	int max =age[0];//定义一个假定最大值
    	for(int i=0;i<age.length;i++){
    		if(age[i]>max){//if判断最大值
    			max=age[i];//最大值赋值	
    		}
    	}
    	return max;//用return返回最大值
    	
    }
    
}