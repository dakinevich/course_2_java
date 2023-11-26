public class ApplicationController {
    private Application model;
    private ApplicationView view;
    public ApplicationController(Application model){
        view = new ApplicationView();
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
        view.showWindow(model.getName());
        view.setVisible(true);

    }

}
