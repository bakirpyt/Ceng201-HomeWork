public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isPrimaryPatients;
    public TreatmentRequest(int patientId,boolean isPrimaryPatients ){
        this.patientId = patientId;
        arrivalTime = System.currentTimeMillis();
        this.isPrimaryPatients = isPrimaryPatients;
    }

}
