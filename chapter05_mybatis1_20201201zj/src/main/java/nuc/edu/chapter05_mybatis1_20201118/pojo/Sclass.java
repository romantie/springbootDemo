package nuc.edu.chapter05_mybatis1_20201118.pojo;

public class Sclass {
	private int id;
	private String name;
	private Teacher teacher;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Class 【class_id="+id
				+"，class_name="+name
				+",class_teacher="+teacher+"】";
	}
}
