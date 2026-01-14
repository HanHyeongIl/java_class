public class Test{
    public static void main(String[] args){
        String[] numbers = {"one", "two", "three"};
        for (int i=0; i<numbers.length;i++) {
            System.out.println(i);
        }
    }
    
    @Override
    void PlintHello() {
        System.out.println("override");
    }
}