package hello;

public class HelloWorld{
	public static void main(String[] args){
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.sayHi());
	}
	public String sayHi() {
		return ("Hello world!");
	}
}
