import java.util.Scanner;

public class Credit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자바 기말 성적을 입력하세요: ");
        char grade = sc.next().charAt(0);

        // char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("4.0");
                break;
            case 'B':
                System.out.println("3.0");
                break;
            case 'C':
                System.out.println("2.0");
                break;
            case 'D':
                System.out.println("1.0");
                break;
            // case 'F':
            //     System.out.println("Fail");
            //     break;
            default:
                System.out.println("Fail 입니다.");
        }
    }
}          