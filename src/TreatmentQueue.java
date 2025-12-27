public class TreatmentQueue {
    public class Node{
        TreatmentRequest data;
        Node next;

        public Node(TreatmentRequest data){
            this.data= data;
            next = null;
        }
    }
    int size;
    Node rear;
    Node front;
    int cnt;
    public TreatmentQueue(int size){
        this.size = size;
        rear = null;
        front = null;
        cnt = 0;
    }
    boolean isEmpty(){
        return cnt == 0;
    }
    boolean isFull(){
        return cnt == size;
    }
    public void enQueue(TreatmentRequest data){
        Node temp = new Node(data);
        if (isFull()){
            System.out.println("Queue is full!!");
        }
        else {
            if (isEmpty()){
                front = temp;
                rear = temp;
                System.out.println(temp.data.patientId + " added queue as front");
                cnt++;
            }
            else {
                rear.next = temp;
                rear = rear.next;
                System.out.println(temp.data.patientId + " added queue");
                cnt++;
            }
        }
    }
    public TreatmentRequest deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty!!");
            return null;
        }else {
            TreatmentRequest request= front.data;
            System.out.println(front.data.patientId + " is deleted");
            front = front.next;
            cnt--;
            return request;
        }
    }
    public int count(){
        return cnt;
    }
    void printQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty!!");
        }
        else {
            Node temp = front;
            while (temp != null){
                System.out.println("Patient ID: " + temp.data.patientId + ". Arrival time: " + temp.data.arrivalTime);
                temp = temp.next;
            }
        }
    }
}
