package ch08.class09;

public class Song {
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
	
	// getter를 이용해서 값을 Main으로 보내주고, setter를 이용해서 해당 필드에 값을 할당.
	// 이때 getter는 void X, return 사용	setter는 void O, return X
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//setter 방식
	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}	

	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	
}
