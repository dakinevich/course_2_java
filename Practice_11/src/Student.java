import java.util.Calendar;

public class Student {
    private String name, name2, profile, course, group;
    private int age, points;

    private Calendar birthDate;

    public Student(String name, String name2, String profile, String course, String group, int age, int points, Calendar birthDate) {
        this.name = name;
        this.name2 = name2;
        this.profile = profile;
        this.course = course;
        this.group = group;
        this.age = age;
        this.points = points;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return this.birthDate.getTime().toString();
    }
}
