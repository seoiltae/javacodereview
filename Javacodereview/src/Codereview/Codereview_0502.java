package Codereview;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Codereview_0502 {
  
public static void main(String[] args) {
       //one(); 1번문제 실행
      //two(); 2번문제 실행
      
   }
   public static void one() {
      Date date = new Date(); // 현재 날짜 확인 클래스 객체 생성
      
      // 데이트라는 객체를 원하는 형식으로 보요주는 포맷
      SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 mm월 dd일");
      System.out.println("오늘은 "+dateForm.format(date)+"입니다");
      
      
      // 대길, 길, 중길, 소길, 흉의 배열
      String[] luck = {"대길", "길", "중길", "소길", "흉"}; 
      double num = (Math.random()*5); //새로운 변수로 배열안에 랜덤값을 주기 위함! 더블형이기에 인트형으로 형변환 시켜줬다다
      System.out.println("오늘의 운세는 "+luck[(int) num]+"입니다");
      
   }
   public static void two() {
      Scanner sc = new Scanner(System.in);
      System.out.println("요소수를 입력: ");
      int num = sc.nextInt(); // 배열의 요소를 직접 입력
      int[] a = new int[num];  // 직접입력한 요소를 배열안에 넣어줌으로 써 배열의 사이즈가 완성
      System.out.println("원하는 요소들을 입력하세요");
      for(int i=0; i<num; i++) { 
         a[i] = sc.nextInt(); //배열 안에 들어갈 값을 직접입력하게 하는 부분
         System.out.print(a[i]+"\t");
      }
      System.out.println(); // 줄바꾸기 위해 사용
      System.out.println("삭제할 요소의 인덱스를 입력: ");
      int de = sc.nextInt(); // 삭제할 요소의 인덱스 입력
      // a[0], a[1], a[2]
 
         // 배열의 인덱스와 삭제할 요소의 인덱스의 값이 같게 한다
      	//같게 하고 배열의 크기를 감소 시키고 줄어든 배열요소에 +1을 해줌으로 써 원하는 인덱스를 삭제 한것처럼 보이게 한다
           for(int k=de; k<num-1; k++) {
              a[k] = a[k+1];
           }
           for(int i=0; i<num-1; i++) { 
               System.out.print(a[i]+"\t");
            }
      }
   }
     
      
