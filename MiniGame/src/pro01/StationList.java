package pro01;

public class StationList {
	// 데이터 베이스
	private int id;
	private int line_number;
	private String station_name;

	public StationList() {
	}

	public StationList(int id, int line_number, String station_name) {
		this.id = id;
		this.line_number = line_number;
		this.station_name = station_name;
	}

	public int getId() {
		return id;
	}

	public int getLine_number() {
		return line_number;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLine_number(int line_number) {
		this.line_number = line_number;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
}