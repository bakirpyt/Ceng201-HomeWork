public class PatientList {
    public class Node{
        Patient data;
        Node next;

        Node(Patient data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        return head==null;
    }

    public void addPatient(Patient data){
        Node person = new Node(data);
        if (head == null){ // list is empty.
            head = person;
            System.out.println(person.data.name + " added.");
            return;
        }
        else {
            Node last = head;
            while(last.next!=null){ // list is not empty.
                last = last.next;
            }
            last.next = person;
            System.out.println(person.data.name + " added.");
        }
        return;
    }

    public void removePatient( int key){
        Node curr =  head;
        Node prev = null;
        if (curr == null){
            System.out.println("List is empty.");
        }
        if (curr != null && curr.data.id == key){
            head = curr.next;
            System.out.println(key + " found and deleted.");
            return;
        }
        while (curr != null && curr.data.id != key ){
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
            System.out.println(key + " found and deleted.");
        }else {
            System.out.println(key + " is not found.");
        }
        return;
    }

    public boolean findPatient( int key){
        Node curr = head;
        while (curr != null){
            if (curr.data.id == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void printList(){
        Node curr = head;
        if (curr == null){
            System.out.println("List is empty.");
        }
        while (curr != null){
            System.out.println("Patient's id: " + curr.data.id +
                    " Patient's name: " + curr.data.name +
                    " Severity level of ilness Patient's: " + curr.data.severity +
                    " Patient's age: " + curr.data.age);
            curr = curr.next;
        }
    }
}
