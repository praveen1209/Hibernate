package StringExamples;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Student {

	private String Name;
	private String City;
	private int RollNUM;
	
	
	public String getName(){
		return Name;
	}
	
	public void setRollNUM(int RollNum){
		this.RollNUM=RollNum;
	}
}

 class Test {

	public static void main(String[] args) throws Exception {
		Class c =  Class.forName("Student");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m){
			System.out.println(m1);
		}
		Field[] f= c.getDeclaredFields();
		for(Field f1:f){
			System.out.println(f1);
		}
	}
	
	}