package member;

public class Member1DTO {
	private String userid;
	private String passwd; 
	private String name;
	//getter, setter,생성자(기본, 파라미터), toString()
	public Member1DTO() {
		super();
	}
	public Member1DTO(String userid, String passwd, String name) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member1DTO [userid=" + userid + ", passwd=" + passwd + ", name=" + name + "]";
	}
	
}
