package day02;
import java.util.Scanner;
import java.util.Random;
/*
 *  컴퓨터가 임의의 난수를 만들어 유저가 입력한 값과 비교
 *  0: 가위
 *  1: 바위
 *  2: 보
 *  난수의 범위는 0,1,2 까지 3개의 정수
 */
public class RPC {

	public static void main(String[] args) {
	
		int com, user;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
		com = rand.nextInt(3);// 0<= r< 3
		
		System.out.println("가위(0): 바위(1): 보(2) 중 하나를 입력하세요");
		user = scan.nextInt();
		if(user == 3) {
			System.out.println("잘못된 입력 이네요...다음에 다시 입력 하세요");
			break;
		
		}
		// 조건 판단....
		// 1. user가 승리 할 경우: 가위:0,보:2, 바위:가위, 보:바위
		if((user==0 && com==1) || (user ==1 && com==0) || (user == 2 && com==1)){
			System.out.println("유저 승~~~");
			System.out.println(com);
		}else if((user==0 && com==0) || (user ==1 && com==1) || (user == 2 && com==2)) {
			System.out.println("둘다 비김~~");
			System.out.println(com);
		}
		
		// 2. 비기는 경우: 가위:가위, 바위:바위: 보:보
		else {
			System.out.println("유저 패~~");
			System.out.println(com);
		}
		
		}// 무한 반복 
		
		

	}

}

