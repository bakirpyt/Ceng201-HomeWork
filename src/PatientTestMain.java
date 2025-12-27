public class PatientTestMain {
    static void main(String[] args) {
        PatientList list = new PatientList();
        list.addPatient(new Patient(1, "Mehmet", 2, 42));//adding patient
        list.addPatient(new Patient(2, "Zehra", 1, 39));//adding patient
        list.addPatient(new Patient(3, "Gülsüm", 3, 10));//adding patient
        list.addPatient(new Patient(4, "Furkan", 4, 16));//adding patient
        list.addPatient(new Patient(5, "Bakır", 6, 20));//adding patient
        list.removePatient(2);//remove on by id
        boolean s = list.findPatient(3);
        System.out.println(s);//search patient
        list.printList();
    }
}
