public class DischargeStack {
    public class Node{
        DischargeRecord record;
        Node next;
        public Node(DischargeRecord record){
            this.record = record;
            next = null;
        }
    }
    int size;
    Node top;
    int cnt;
    public DischargeStack(int size){
        this.size = size;
        top = null;
        cnt = 0;
    }
    public boolean isEmpty(){
        return cnt == 0;
    }
    public boolean isFull(){
        return cnt == size;
    }
    public void push(DischargeRecord record){
        Node temp = new Node(record);
        if (isFull()){
            System.out.println("Stack is full!!");
        }
        else{
            if (isEmpty()){
                top = temp;//firs element
                System.out.println(top.record.patientId + " added stack as first element");
                cnt++;
            }
            else {
                temp.next = top;
                top = temp;
                System.out.println(temp.record.patientId + " added.");
                cnt++;
            }
        }
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty!!");
        }
        else {
            System.out.println(top.record.patientId + " deleted.");
            top = top.next;
            cnt--;
        }
    }
    public DischargeRecord peek(){
        if (isEmpty()){
            return null;}
        return top.record;
    }
    public void printStack(){
        if (isEmpty()){
            System.out.println("Stack is empty!!");
        }
        else{
            Node temp = top;
            while (temp != null){
                System.out.println("Patient ID: " + temp.record.patientId + " Dischagre time: " + temp.record.dischargeTime );
                temp = temp.next;
            }
        }
    }
}
