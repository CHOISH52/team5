package global.sesoc.library.vo;

public class habit {
	
	String id;
	int amount;
	int time;
	String inputdate;
	
	public habit(String id, int amount, int time, String inputdate) {
		super();
		this.id = id;
		this.amount = amount;
		this.time = time;
		this.inputdate = inputdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	@Override
	public String toString() {
		return "habit [id=" + id + ", amount=" + amount + ", time=" + time + ", inputdate=" + inputdate + "]";
	}
	
	
}
