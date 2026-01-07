public class Cal1019 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        
        System.out.println("C1 calculator result: ");
        System.out.println(c1.add(3));
        System.out.println(c1.add(5));

        System.out.println("C2 calculator result: ");
        System.out.println(c2.add(7));
        System.out.println(c2.add(8));

        System.out.println("Object's result value:");
        System.out.println("C1.result : " + c1.result);
        System.out.println("C2.result : " + c2.result);
    }
}


class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }

}

/*
class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }

}
*/

/* 
 * 
class Calculator {
    private int result = 0;

    int getResult() {
        return result;
    }

    void setResult(int num) {
        result = num;
    }

    int add(int num) {
        result += num;
        return result;
    }

}
 */