package testJava;
/*目的：定义一个方法名为showLove的无参无返回值的方法，并调用进行输出信息的功能。
 * 步骤：
 * 1.定义方法：访问修饰符   返回值类型 方法名（参数列表）{
 *    方法体   }
 * 2.创建对象，并通过      对象名.方法名（）; 来调用方法 
 */

public class test_1 {
	public void showLove(){
		System.out.println("四月是你的谎言");
	}
    
	public static void main(String[] args){
		//创建对象，对象名为test
		test_1 test =new test_1();
		//通过 对象名.方法名（）调用方法
		test.showLove();
    }
}
