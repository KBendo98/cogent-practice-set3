package exercises3;

public class MethodOverriding extends ParentClass{

	@Override
	public void overrideThis() {
		System.out.println("From MethodOverriding");
	}
	
	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		parent.overrideThis();
		
		ParentClass obj = new MethodOverriding();
		obj.overrideThis();
	}
}
