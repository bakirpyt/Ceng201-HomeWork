public class HospitalSystemTest {
    static void main(String[] args) {
        HospitalSystem patientH = new HospitalSystem();
        System.out.println("Adding patients:");
        patientH.addPatient(new Patient(11,"Mehmet",1,42));//add patients
        patientH.addPatient(new Patient(12,"Zehra",4,39));
        patientH.addPatient(new Patient(13,"Gülsüm",3,10));
        patientH.addPatient(new Patient(14,"Furkan",2,16));
        patientH.addPatient(new Patient(15,"Bakır",8,20));
        patientH.addPatient(new Patient(16,"Ahmet",5,33));
        patientH.addPatient(new Patient(17,"Mesut",7,27));
        patientH.addPatient(new Patient(18,"Canan",9,35));
        patientH.addPatient(new Patient(19,"Ece",6,20));
        patientH.addPatient(new Patient(20,"Mustafa",10,49));
        System.out.println();
        System.out.println("SOrted patients: ");
        patientH.printPatientSorted();
        System.out.println();
        System.out.println("Adding treatment requests: ");
        patientH.addTreatmentRequest(new TreatmentRequest(21,false));
        patientH.addTreatmentRequest(new TreatmentRequest(22,false));
        patientH.addTreatmentRequest(new TreatmentRequest(23,false));
        patientH.addTreatmentRequest(new TreatmentRequest(24,false));
        patientH.addTreatmentRequest(new TreatmentRequest(25,false));

        patientH.addTreatmentRequest(new TreatmentRequest(26,true));
        patientH.addTreatmentRequest(new TreatmentRequest(27,true));
        patientH.addTreatmentRequest(new TreatmentRequest(28,true));
        System.out.println();
        System.out.println("Proccess treatment: ");
        patientH.processTreatment();
        patientH.processTreatment();
        patientH.processTreatment();
        patientH.processTreatment();
        System.out.println();
        System.out.println("Discharge: ");
        patientH.dischargeStack.push(new DischargeRecord(29));
        patientH.dischargeStack.push(new DischargeRecord(30));
        System.out.println();
        System.out.println("Final State: ");
        patientH.printSystem();


    }
}
