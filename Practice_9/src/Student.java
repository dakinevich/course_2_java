public class Student implements myComparable<Student> {
    public int points;
    public String name;

    public Student(int id, String name){
        this.points = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.points, student.points);
    }
}
