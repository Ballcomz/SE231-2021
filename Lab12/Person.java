package Lab12;

public class Person {
  protected String name;
  protected static String address;
  protected static String phoneNumber;
  protected static String email;

  Person(String name,String address,String phoneNumber,String email) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
  
  public String getName() {
    return name;
  }
  public String getAdd(){
    return address;
  }
  public String getPhone(){
    return phoneNumber;
  }
  public String getEmail(){
    return email;
  }
  public void setAddress(String add){
    address = add;
  }
  public void setPhone(String ph){
    phoneNumber = ph;
  }
  public void setEmail(String mail){
    email = mail;
  }


  
  @Override
  public String toString() {
    return "Person: " + name+ " Address:"+address+" Phonenumber:"+phoneNumber+" eMail:"+email;
    }
}
