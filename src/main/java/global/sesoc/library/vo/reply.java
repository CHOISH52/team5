package global.sesoc.library.vo;

public class reply {
	
	int replynum;
	int boardnum;
	String id;
	String text;
	String date;
	
	public reply(int replynum, int boardnum, String id, String text, String date) {
		this.replynum = replynum;
		this.boardnum = boardnum;
		this.id = id;
		this.text = text;
		this.date = date;
	}

	public int getReplynum() {
		return replynum;
	}

	public void setReplynum(int replynum) {
		this.replynum = replynum;
	}

	public int getBoardnum() {
		return boardnum;
	}

	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "reply [replynum=" + replynum + ", boardnum=" + boardnum + ", id=" + id + ", text=" + text + ", date="
				+ date + "]";
	}
	
	
}
