package queue_in_Java;
import java.util.Scanner;
public class StaticQueueinjava {

	public static void main(String[] args) {
		// Create a queue of capacity 4
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter queue capacity: ");
				int n = scan.nextInt();
				
				Queue q = new Queue(n);

				// print Queue elements
				q.queueDisplay();

				// inserting elements in the queue
				//q.queueEnqueue(20);
				//q.queueEnqueue(30);
				//q.queueEnqueue(40);
				//q.queueEnqueue(50);
				int i;
				for(i=0; i<n; i++) {
					System.out.println("Enter value for queue: ");
					int v = scan.nextInt();
					q.queueEnqueue(v);
				}

				// print Queue elements
				q.queueDisplay();

				// insert element in the queue
				q.queueEnqueue(60);

				// print Queue elements
				q.queueDisplay();

				q.queueDequeue();
				q.queueDequeue();
				System.out.printf("\n\nafter two node deletion\n\n");

				// print Queue elements
				q.queueDisplay();

				// print front of the queue
				q.queueFront();
	}

}
