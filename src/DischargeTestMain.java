public class DischargeTestMain {
    static void main(String[] args) {
        DischargeStack patient = new DischargeStack(5);
        patient.push(new DischargeRecord(20));//add discharge patient
        patient.push(new DischargeRecord(21));//add discharge patient
        patient.push(new DischargeRecord(22));//add discharge patient
        patient.push(new DischargeRecord(23));//add discharge patient
        patient.push(new DischargeRecord(24));//add discharge patient
        patient.pop();//delete discharge patient
        patient.pop();//delete discharge patient
        patient.printStack();
    }
}
