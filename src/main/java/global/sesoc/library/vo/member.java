package global.sesoc.library.vo;

/**
 * 회원 정보 VO
 */
public class member {
	String id;
	String password;
	String name;
	int number;
	int photo;
	
	
	public member(String id, String password, String name, int number, int photo) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.number = number;
		this.photo = photo;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPhoto() {
		return photo;
	}
	public void setPhoto(int photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "member [id=" + id + ", password=" + password + ", name=" + name + ", number=" + number + ", photo="
				+ photo + "]";
	}
	

}
