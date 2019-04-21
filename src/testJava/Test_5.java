package testJava;
/*目的:构造方法的使用
 *   public 构造方法(){  初始化代码块
 *            }
 * 构造方法与类同名，但没有返回值。有参、无参构造方法。
 */
public class Test_5 {
	public static void main(String[] args){
		Test_5 hello =new Test_5(2f, 6f);
		//在构造方法使用时，new+构造方法就已经调用不需再     对象名+类名（）; 的形式调用
	}
  float screen;
  float cup;
  public Test_5(float newscreen,float newcup){
	  if(newscreen<3f){//此判断是为了防止有参赋值时有误
		  System.out.println("您输入的数值有误，自动赋值5f");
		  screen=5f; 
	  }else{
	  screen=newscreen;
	  }
	  cup=newcup;
	  System.out.println("有参构造法执行了");    
  }
}
