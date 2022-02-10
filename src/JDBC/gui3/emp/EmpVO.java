package gui3.emp;

public class EmpVO {
	int empno;
	String ename;
	String job;
	int sal;
	
	//constructor
	public EmpVO() {
		super();
	}

	public EmpVO(int empno, String ename, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;

	}
	
	public String toString() {
		return empno + "\t" + ename + "\t" + job + "\t" + sal + "\n";
	}



	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}


}
