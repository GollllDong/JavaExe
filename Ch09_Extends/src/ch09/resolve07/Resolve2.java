package ch09.resolve07;

public class Resolve2 {
	private int height;
	private int down_line;
	
	public Resolve2(int height, int down_line){
		this.height=height;
		this.down_line=down_line;
	}
	void setHeight(int _height) {
		height = _height;
		
	}
	void setDownLine(int down_line) {
		this.down_line = down_line;
	}
	
	int TriArea() {
		return height*down_line/2;
	}
}
