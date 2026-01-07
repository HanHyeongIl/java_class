public class Score4 {
    public static void main(String[] args) {
        String[] names = {"김", "이", "박"};  // 이름 지정
        String[] subjects = {"국어", "수학", "영어"}; // 과목 지정 둘 다 str에 저장

        double[] kor = {50.2, 85.1, 91.0};
        double[] math = {80.1, 65.2, 78.6};
        double[] eng = {75.4, 65.8, 71.5};

        // double[] korean = new double[3];

        //for i in range(len(names)): 파이썬에서의 for문 
        for(int i = 0; i< names.length; i++ ) {
            System.out.println(names[i] + "의 " + subjects[0] + "점수는 " + kor[i]);
            System.out.println(names[i] + "의 " + subjects[1] + "점수는 " + math[i]);
            System.out.println(names[i] + "의 " + subjects[2] + "점수는 " + eng[i]);
            System.out.printf("%s의 평균 점수: %.1f\n", names[i], ((kor[i] + math[i] + eng[i]) / 3));
            System.out.println();
        }
        
        System.out.println();
    } 
}
