package global.sesoc.library.vo;

public class shelf {

	String id;
	int booknum;
	String recent;
	
	public shelf(String id, int booknum, String recent) {
		super();
		this.id = id;
		this.booknum = booknum;
		this.recent = recent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBooknum() {
		return booknum;
	}

	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}

	public String getRecent() {
		return recent;
	}

	public void setRecent(String recent) {
		this.recent = recent;
	}

	@Override
	public String toString() {
		return "shelf [id=" + id + ", booknum=" + booknum + ", recent=" + recent + "]";
	}
	
}
