public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController(Student model){
        view = new StudentView();
        this.model = model;
    }
    public void setStudentName(String newNmae){
        model.setName(newNmae);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String newRollNo){
        model.setRollNo(newRollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName());
        view.setVisible(true);

    }

}
