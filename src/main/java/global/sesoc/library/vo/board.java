package global.sesoc.library.vo;

/**
 * 게시판 게시글 정보 VO
 */
public class board {
	
	int boardnum;
	String id;
	String title;
	String contents;
	String inputdate;
	int hits;
	String originalfile;
	String savedfile;
	
	
	public board(int boardnum, String id, String title, String contents, String inputdate, int hits,
			String originalfile, String savedfile) {
		this.boardnum = boardnum;
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.inputdate = inputdate;
		this.hits = hits;
		this.originalfile = originalfile;
		this.savedfile = savedfile;
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
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


	public int getHits() {
		return hits;
	}


	public void setHits(int hits) {
		this.hits = hits;
	}


	public String getOriginalfile() {
		return originalfile;
	}


	public void setOriginalfile(String originalfile) {
		this.originalfile = originalfile;
	}


	public String getSavedfile() {
		return savedfile;
	}


	public void setSavedfile(String savedfile) {
		this.savedfile = savedfile;
	}


	@Override
	public String toString() {
		return "board [boardnum=" + boardnum + ", id=" + id + ", title=" + title + ", contents=" + contents
				+ ", inputdate=" + inputdate + ", hits=" + hits + ", originalfile=" + originalfile + ", savedfile="
				+ savedfile + "]";
	}
	
	
}