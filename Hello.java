/* 배열 */
import java.util.ArrayList;

public class Hello {

    public void replacements() {
        String a = "Hello Java";
        System.out.println(a.replaceAll("Hello", "Python"));  // Hello World 출력
        System.out.println(a.replaceAll("Java", "World"));  
        System.out.println(a);
        a = "Hello Python" ;
        System.out.println(a);
    }

	public void arls() {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.remove(0));
        System.out.println(pitches);
    }

	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		String c = "hello";
		System.out.println(a.equals(b));  // true
		System.out.println(a == b);  // false
		System.out.println(a == c);  // true
		// replacements();
		// arls();
        // helloWorld("hi", "java");
	}

}

class HelloWorld {
    public void helloWorld(String[] args) {
        System.out.println("안녕하세요, 자바 세계!");
    }
}

