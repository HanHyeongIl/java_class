class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {  // Animal 클래스를 상속한다.
}

public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("puppy");
        System.out.println(dog.name);
    }
}
