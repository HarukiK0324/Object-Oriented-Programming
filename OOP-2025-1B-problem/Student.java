public class Student extends Person {
    private String id;
    Student(String name, String id){
        setName(name);
        setID(id);
    }
    public String getID() {
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public void introduce() {
        System.out.println("My name is " + getName());
        System.out.println("My student ID is " + getID());
    }
}