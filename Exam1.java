import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] names = {"김", "이", "박"};
        String[] subjects = {"국어", "수학", "영어"};
        int[] scores = new int[3];

        for (int i=0; i<scores.length; i++) {
            System.out.printf("%s 점수를 입력하세요: ", subjects[i]);
            scores[i] = sc.nextInt();
        }


        if (scores[0] >= 60 && scores[1] >= 50 && scores[2] >= 45) {
            
            System.out.println("합격입니다."); 
        } else {
            System.out.println("목표점수 미달, 과락입니다.");
        }


        // int korea = 70;
        // int math = 60;
        // int english = 70;

        // if (korea < 60) {
        //     System.out.println("국어 점수 미달: 과락");
        // }
        // else if (math < 50) {
        //     System.out.println("수학 점수 미달: 과락");

        // }
        // else if (english < 45) {
        //     System.out.println("영어 점수 미달: 과락");

        // }
        // else {
        //     System.out.println("합격입니다.");
        // }
    }
    
}
