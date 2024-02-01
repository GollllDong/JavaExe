package ch08.class09.answer04;

public class SongMain {
	
	public static void show(Song s) {
		System.out.println("노래 제목 : " + s.getTitle());
		System.out.println("가수 : " + s.getArtist());
		System.out.println("앨범 제목 : " + s.getAlbum());
		System.out.println("작곡가 : " + s.getComposer());
		System.out.println("노래 발표 연도 : " + s.getYear());
		System.out.println("앨범에서의 트랙 번호 : " + s.getTrack());
	}
//	4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
//	   <필드>
//	    노래제목 title
//	    가수    artist
//	    앨범제목 album
//	    작곡가  composer
//	    노래가 발표된 연도 year
//	    노래가 속한 앨범에서의 트랙 번호를 나타내는 track
//
//	   <메서드>
//	    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
//	    노래의 정보를 나타내는 show()
//
//	   <main 실행>
//	    ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
//	    Show()로 출력하세요
	public static void main(String[] args) {
		Song s1 = new Song();
		
		s1.setSongInfo("팔레트", "아이유", "물감", "GD", 2015, 3);
		
//		s1.setTitle("팔레트");	// setter를 통해 Song.java의 필드에 할당.
//		s1.setArtist("아이유");
//		s1.setAlbum("물감");
//		s1.setComposer("GD");
//		s1.setYear(2015);
//		s1.setTrack(1);
		
		show(s1);
		
		System.out.println();
		
		Song s2 = new Song();
		s2.setSongInfo("As it was", "Harry Styles", "Exit", "GD", 2019, 6);
		show(s2);
	}

}
