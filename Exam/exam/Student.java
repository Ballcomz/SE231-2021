package exam;

public class Student {
    private String fname;
    private String lname;
    private String id;
    private int score;

    Student(){

    }
    public void setFname(String fname){
        this.fname = fname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public String getId(){
        return id;
    }
    public int getScore(){
        return score;
    }
    public String toString(){
        return "\n First name:"+fname+" Last name:"+lname+" Id:"+id+" score:"+score;
    }
    public void grade(int score){
        if(score>49)
        System.out.println("You pass");
        else
        System.out.println("You fail");
    }

}
