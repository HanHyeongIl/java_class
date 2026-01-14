public class Grade {
    
    public static void main(String[] args) {
        String[] names = {"김철수","박철수","강철수"};
        String[] subjects = {"kor","math","eng"};

        double[] kor = {50.2, 85.1, 91.0};
        double[] math = {80.1, 65.2, 78.6};
        double[] eng = {75.4, 65.8, 71.5};

        for(int i = 0; i< names.length; i++ ) {
            System.out.println(names[i] + "의 " + subjects[0] + "점수는 " + kor[i]);
            System.out.println(names[i] + "의 " + subjects[1] + "점수는 " + math[i]);
            System.out.println(names[i] + "의 " + subjects[2] + "점수는 " + eng[i]);
}   

    }
    
}
