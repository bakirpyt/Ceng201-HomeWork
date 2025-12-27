import java.util.*;

public class HospitalSystem {
    public PatientList patientList;
    public TreatmentQueue primaryPatients;
    public TreatmentQueue normalPatients;
    public DischargeStack dischargeStack;
    public HashMap<Integer , Patient> quickPatient;

    public HospitalSystem(){
        this.patientList = new PatientList();
        this.normalPatients = new TreatmentQueue(20);
        this.primaryPatients = new TreatmentQueue(20);
        this.dischargeStack = new DischargeStack(20);
        this.quickPatient = new HashMap<>();
    }
    public void addPatient(Patient data){
        patientList.addPatient(data);
        quickPatient.put(data.id,data);

    }
    public void addTreatmentRequest(TreatmentRequest data){
        if (data.isPrimaryPatients){
            primaryPatients.enQueue(data);
        }
        else {
            normalPatients.enQueue(data);
        }
    }
    public Patient processTreatment(){
        TreatmentRequest data;
        if (primaryPatients.count() > 0){
            data = primaryPatients.deQueue();
        } else if (normalPatients.count() > 0) {
            data = normalPatients.deQueue();
        }
        else {
            return null;
        }
        DischargeRecord patient = new DischargeRecord(data.patientId);
        dischargeStack.push(patient);
        return quickPatient.get(data.patientId);
    }
    public void printSystem(){ //print system state
        System.out.println("Patients: ");
        patientList.printList();
        System.out.println("Primary Patients: ");
        primaryPatients.printQueue();
        System.out.println("Normal Patients: ");
        normalPatients.printQueue();
        System.out.println("Discharge data: ");
        dischargeStack.printStack();
    }
    public void mergeSort(ArrayList<Patient> list,int left,int right,int mid ){
        int rightSize = right - mid;
        int leftSize = mid - left+ 1;
        ArrayList<Patient > right1 = new ArrayList<>();
        ArrayList<Patient > left1 = new ArrayList<>();
        for (int i = 0;i < leftSize;i++){
            left1.add(list.get(left + i));
        }
        for (int i = 0;i < rightSize;i++){
            right1.add(list.get(mid + 1 + i));
        }
        int rightIndex=0;
        int leftIndex=0;
        int mergeIndex = left;
        while (leftIndex < leftSize && rightIndex < rightSize){
            if (left1.get(leftIndex).severity >= right1.get(rightIndex).severity){
                list.set(mergeIndex, left1.get(leftIndex));
                leftIndex++;
            }
            else {
                list.set(mergeIndex,right1.get(rightIndex));
                rightIndex++;
                }
            mergeIndex++;
        }
        while (rightIndex < rightSize){
            list.set(mergeIndex, right1.get(rightIndex));
            rightIndex++;
            mergeIndex++;
        }
        while (leftIndex < leftSize){
            list.set(mergeIndex,left1.get(leftIndex));
            leftIndex++;
            mergeIndex++;
        }
    }
    public void mergeSortSeverity(ArrayList<Patient> list,int left, int right){
        if (left<right){
            int mid =(right + left) / 2;
            mergeSortSeverity(list,left,mid);
            mergeSortSeverity(list,mid + 1 , right);
            mergeSort(list,left,right,mid);
        }
    }
    public void printPatientSorted(){
        ArrayList<Patient> patient1 = new ArrayList<>(quickPatient.values());
        mergeSortSeverity(patient1,0,patient1.size()-1);
        System.out.println("Patient sorted severity: ");
        for (Patient patientH : patient1){
            System.out.println(patientH);
        }
    }


}
