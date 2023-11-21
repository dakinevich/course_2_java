public class MVCPatternDemo2 {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentController controller = new StudentController(model);
        controller.updateView();
    }
    public static Student retriveStudentFromDatabase(){
        Student s = new Student();
        s.setName("Ivan");
        s.setRollNo("12");
        return s;
    }
}
