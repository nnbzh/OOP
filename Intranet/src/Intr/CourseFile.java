package Intr;

public class CourseFile {
	String fileName;
	public CourseFile(String fileName) {
		this.fileName = fileName;
	}
	public boolean equals(Object o) {
		if(o == this) return true;
		if (!(o instanceof CourseFile)) return false;
		CourseFile courseFile = (CourseFile) o;
		return courseFile.fileName.equals(fileName);
	}
	public int hashcode() {
		int result = 17;
		result = result * 31 + fileName.hashCode();
		return result;
	}
}
