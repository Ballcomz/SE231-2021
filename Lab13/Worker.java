package Lab13;

public class Worker extends Employee{
    private String task;

    public Worker(){
        super();
        task = "";
    }

    public Worker(String name,String position,double salary,String task){
        super(name,position,salary);
        this.task = task;
    }

    public void setTask(String taskName){
        this.task = taskName;
    }

    public String toString(){
        return super.toString()+"and has task :"+ this.task;
    }
}
