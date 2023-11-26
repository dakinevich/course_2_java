public class Main_MVCPattern {
    public static void main(String[] args) {
        Application model = retriveStudentFromDatabase();
        ApplicationController controller = new ApplicationController(model);
        controller.updateView();
    }
    public static Application retriveStudentFromDatabase(){
        Application s = new Application();
        s.setName("Ivan");
        s.setRollNo("12");
        return s;
    }
}
