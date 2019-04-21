package testJava;
/*目的：定义一个名为claAvg、返回值为double型的无参方法，求取平均值，并返回结果。
 * 过程：
 * 1.定义方法
 * 2.调用
 */
public class test_2 {
	public double claAvg(){//定义返回值为double的claAvg方法
		double a =87.6;
		double b =78.0;
		double avg=(a+b)/2;//求平均值
		return avg;	//用return返回
	}
	public static void main(String[] args){
		test_2 hello =new test_2();//创建对象
		double avg1 =hello.claAvg();//通过 对象名.方法名（）; 来调用，并赋值到avg1
		System.out.println("平均值："+avg1);
	}

}
