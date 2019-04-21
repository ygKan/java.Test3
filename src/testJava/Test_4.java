package testJava;
/*java静态成分(静态变量、静态方法、静态初始化快）练习。关键字 static
 */
public class Test_4 {
	int age;//声明变量
	String name ;
	static char sex;
	public Test_4(){//构造方法
		age = 23;
		System.out.println("通过构造方法进行赋值");
	}
	{// 初始化块
		name ="tanaka";
		System.out.println("通过初始化块进行赋值");
	}
	static {//静态初始化块
		 sex='男';
		 System.out.println("通过静态初始化块进行赋值");
	}
   public void show(){//创建一个方法，来输出全部变量
	   System.out.println("age:"+age+"  name:"+name+"  sex:"+sex);
   }
	
	public static void main(String[] args){
    Test_4 hello =new Test_4();//创建对象
    System.out.println("age:"+hello.age);
    System.out.println("name:"+hello.name);
    System.out.println("sex:"+sex);
    System.out.println();
    hello.show();//使用对象名.方法名(); 形式来调用此方法
    	}
}
