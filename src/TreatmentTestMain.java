public class TreatmentTestMain {
    static void main(String[] args) {
        TreatmentQueue patient = new TreatmentQueue(8);
        patient.enQueue(new TreatmentRequest(10,false));//add treatment request
        patient.enQueue(new TreatmentRequest(11,false));//add treatment request
        patient.enQueue(new TreatmentRequest(12,false));//add treatment request
        patient.enQueue(new TreatmentRequest(13,false));//add treatment request
        patient.enQueue(new TreatmentRequest(14,false));//add treatment request
        patient.enQueue(new TreatmentRequest(15,false));//add treatment request
        patient.enQueue(new TreatmentRequest(16,false));//add treatment request
        patient.enQueue(new TreatmentRequest(17,false));//add treatment request
        patient.deQueue();//delete treatment request
        patient.deQueue();//delte treatment request
        patient.deQueue();//delete treatment request
        patient.printQueue();//print treatment request queue

    }
}
