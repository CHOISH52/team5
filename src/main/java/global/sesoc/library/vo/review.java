package global.sesoc.library.vo;

public class review {
	int reviewnum;
	int booknum;
	String id;
	String contents;
	String inputdate;
	int photo;
	
	public review(int reviewnum, int booknum, String id, String contents, String inputdate, int photo) {
		super();
		this.reviewnum = reviewnum;
		this.booknum = booknum;
		this.id = id;
		this.contents = contents;
		this.inputdate = inputdate;
		this.photo = photo;
	}

	public int getReviewnum() {
		return reviewnum;
	}

	public void setReviewnum(int reviewnum) {
		this.reviewnum = reviewnum;
	}

	public int getBooknum() {
		return booknum;
	}

	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	public int getPhoto() {
		return photo;
	}

	public void setPhoto(int photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "review [reviewnum=" + reviewnum + ", booknum=" + booknum + ", id=" + id + ", contents=" + contents
				+ ", inputdate=" + inputdate + ", photo=" + photo + "]";
	}
	
}
