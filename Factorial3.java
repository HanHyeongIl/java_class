public class Factorial3 {
    
    public static int factorial(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }
     public static void main(String[] args) {
        int[] n = {6, 5, 10, 2};       // 초깃값 지정
        // int i = 1;       // 반복 제어 
        int result = 1;  // 결과 초기값 지정하기

        for (int num: n) {

            result = factorial(num);
            System.out.println(result);

        }
        // while (i < n) { 
        //     result *= i;   //복합연산자
        //     // result = result*i;  ->일반 팩토리얼 연산 
        //     i++;         
        //     System.out.println(result); // result 출력
        // }
    }


}
