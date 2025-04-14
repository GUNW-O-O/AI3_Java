package ProgrammingTest1.Ex03;

class Student {
	int no;
	String name;
	int score;
	String major;
	
	
	public Student() {
		this(0, "", 0, "");
	}

	public Student(int no, String name, int score, String major) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.major = major;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return getNo() +
			"\t" + getName() +
			"\t" + getScore() +
			"\t" + getMajor()
			;
	}
	

}