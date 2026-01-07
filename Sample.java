public class Sample {

    int a;  // 객체변수 a

    void varTest(Sample sample2) {
        sample2.a++;
    }

    public static void main(String[] args) {
        Sample sample1 = new Sample();
        sample1.a = 1;
        sample1.varTest(sample1);
        System.out.println(sample1.a);
    }
}
