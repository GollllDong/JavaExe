package ch01.sec02.exam02;

import java.util.List;

/* ArrayList와 동일하다.
 * 
 * 다만 멀티스레드 환경에서 2개이상의 스레드가 동시접근할 때 안전하다.
 * 1개 스레드일 때는 ArrayList보다 약간 성능 저하가 있다.(동기화 처리때문)
 * 공부만 하면 스레드 1개, 공부, 커피, 노래를 동시에 들으려면 스레드 3개 필요.
 * */

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list = new Vector<>();
		
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			public void run() {
				// 객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));
				}
			}	
		};
		
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			public void run() {
				// 객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));
				}
			}
		};
		
		// 작업 스레드 실행
		threadA.start();
		threadB.start();
		
		// 작업 스레드들이 모두 종료될 때까지 메인 스레드르 기다리게 함
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
			
		}
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 :" + size);
		System.out.println();
	}
}
