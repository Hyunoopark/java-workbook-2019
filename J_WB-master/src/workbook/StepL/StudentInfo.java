package workbook.StepL;

public class StudentInfo {
	private String name;
	private int id;
	private String gender;
	private String address;
	private String phone_num;
	private String re;
	
	public StudentInfo(String n, int i, String g, String a, String p, String r) {
		g = g.toUpperCase();
		r = r.toUpperCase();
		name = n;
		id = i;
		gender = g;
		address = a;
		phone_num = p;
		re = r;
	}
	
	public void print() {
		System.out.println(name + "\t" + id + "\t" + gender + "\t" + address + "\t" + phone_num + "\t" + re);
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCheckReturn() {
		return re;
	}

}
