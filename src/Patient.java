public class Patient {
    int id; //Patient's id
    String name; //Patient's name
    int severity; // Severity level of patient's ilness
    int age; //Patient's age

    public Patient(int id, String name, int severity, int age){
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    public String toString(){
        return "Id: " + id + "Name: " + name + "Severity: " + severity + "Age: " + age;
    }

}
