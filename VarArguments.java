import java.util.*;
public class VarArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s = new Student();
			s.show(1.23f,2.4434f,3f,4,5f);
	}

}
class Student{
	void show(float ... a) {
		for(float k:a) {
		System.out.println(k);
	}}
}