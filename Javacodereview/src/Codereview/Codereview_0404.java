package Codereview;
import java.util.Scanner;

public class Codereview_0404 {
   //출력 메인
   public static void main(String[] args) { 
         Ex();
      }
   
      // 진수변환 관리
      public static void Ex() {
         Scanner sc = new Scanner(System.in);
          
         System.out.println("10진수를 입력하세요");
         int num = sc.nextInt(); //변환할 숫자 입력
         int ch = sc.nextInt(); // 변환할 진수 입력
         switch (ch) { // 10진수 입력 후 변활할 진수를 2,8,16 입력
         case 2: //2진수 변환
            num2(num);
            break;
            
         case 8:   
            num8(num);
            break;
            
         case 16:
            num16(num);
            break;
            
            default:
               System.out.println("제대로 다시입력");
         }
      }
      
      //2진수 변환 
      public static void num2(int num) {
         StringBuffer resuBuffer = new StringBuffer(); //Stringuffer 사용 문자값수정가능
            while (num !=0) { // 입력한 숫자값이 0이 아닐경우 반복
               resuBuffer.insert(0, String.valueOf(num % 2)); // 나머지= 0이면 0, 나머지=1이면 1
               num = num / 2; 
            }            
            System.out.println("변환된 2진수 : "+resuBuffer.toString());
            }
      
      //8진수 변환
      public static void num8(int num) {
         StringBuffer resuBuffer = new StringBuffer();
         while (num !=0) { // 입력한 숫자값이 0이 아닐경우 반복
            resuBuffer.insert(0, String.valueOf(num % 8)); 
            num = num / 8; 
         }
         System.out.println("변환된 8진수 : "+resuBuffer.toString());
         
      }
      
      //16진수 변환
      public static void num16(int num) {
         StringBuffer resuBuffer = new StringBuffer();
         char[] arr = new char[]{'A', 'B', 'C', 'D', 'E', 'F'}; //16진수 10, 11, 12, 13, 14, 15
         while (num !=0) { // 입력한 숫자값이 0이 아닐경우 반복
            int sum = num % 16;
            if(sum>9) {
               resuBuffer.insert(0, arr[sum-10]);
                  // 0 1 2 3 4 5
                  // arr[sum - 10] 10 11 12 13 14 15
               num = num / 16;
            } else {
               resuBuffer.insert(0, String.valueOf(num % 16 )); 
               num = num / 16; 
            }
            
            
         }
         System.out.println("변환된  16진수: "+resuBuffer.toString());
         
      }
}