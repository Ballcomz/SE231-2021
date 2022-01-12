package Lab13;

public class Specialist extends Employee{
    private String certificate;
    
    public Specialist(){
        super();
        certificate = "";
    }
    
    public Specialist(String name, String position, double salary, String certificate){
        super(name, position, salary);
        this.certificate = certificate;
    }
    
    public void setCertificate(String c){
        this.certificate = c;
    }
    
    public String toString(){
        return super.toString() + " and has certificate in " + this.certificate;
    }

}
