package global.sesoc.library.vo;

public class book {
	
	int booknum;
	String title;
	String writer;
	String publisher;
	String P_date;
	float score;
	String introduce;
	
	public book(int booknum, String title, String writer, String publisher, String p_date, float score,
			String introduce) {
		
		this.booknum = booknum;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		P_date = p_date;
		this.score = score;
		this.introduce = introduce;
	}

	public int getBooknum() {
		return booknum;
	}

	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getP_date() {
		return P_date;
	}

	public void setP_date(String p_date) {
		P_date = p_date;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "book [booknum=" + booknum + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher
				+ ", P_date=" + P_date + ", score=" + score + ", introduce=" + introduce + "]";
	}
	
	
}
