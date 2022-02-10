package z_info;

// VO == DAO
public class InfoVO {
	String name;
	String id;
	String tel;
	String sex;
	int age;
	String home;
	
	// constructor 인자 없는 생성자 함수
	public InfoVO() {
	}
	
	// constructor 인자 있는 생성자 함수
	public InfoVO(String name, String id, String tel, String sex, int age, String home) {
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.sex = sex;
		this.age = age;
		this.home = home;
	}
	
	
	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	public String toString() {
		 return name + "\t" + id + "\t" + tel + "\t" +
		            sex + "\t" + age + "\t" + home + "\n";
	}
}
