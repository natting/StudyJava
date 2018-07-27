package JumpToJava;

public class Animal {
	String name;
	
	public void setName (String name) {
		this.name = name;// this 는 객체 자신을 지칭..
	}
	
	public String say() {
		return "Hi";
	}
	
	public static void main (String[] args) {
		Animal cat = new Animal();
		cat.setName("body");//메소드 호출
		
		Animal dog = new Animal();
		dog.setName("happy");

		System.out.println(dog.name);
		System.out.println(cat.name);
		
		Animal test = new Animal();
		String a = test.say();
		System.out.println(a);
	}
}
