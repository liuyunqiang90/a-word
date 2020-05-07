package algorithm.queue;

public class QueueMain {
    public static void main(String[] args) {

//        ArrayQueue<String> objectArrayQueue = new ArrayQueue<>();
//
//        objectArrayQueue.enqueue1("11");
//        objectArrayQueue.enqueue1("22");
//        objectArrayQueue.enqueue1("33");
//        objectArrayQueue.enqueue1("44");
////        objectArrayQueue.dequeue1();
//        System.out.println(objectArrayQueue);
//        objectArrayQueue.enqueue1("55");
//        Object dequeue = objectArrayQueue.dequeue();
//        Object dequeue1 = objectArrayQueue.dequeue();
//        System.out.println(objectArrayQueue);
//        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
//        linkedQueue.enqueue("11");
//        linkedQueue.enqueue("22");
//        linkedQueue.enqueue("33");
//        linkedQueue.enqueue("44");
//        linkedQueue.dequeue();
//        linkedQueue.dequeue();
        AnnularQueue<String> annularQueue = new AnnularQueue<>(4);
        annularQueue.enqueue("11");
        annularQueue.enqueue("22");
        annularQueue.enqueue("33");
        String dequeue = annularQueue.dequeue();
//        annularQueue.enqueue("44");
        System.out.println(annularQueue);
        annularQueue.enqueue("44");
        String dequeue1 = annularQueue.dequeue();
        annularQueue.enqueue("55");
        String dequeue2 = annularQueue.dequeue();
        annularQueue.enqueue("66");
        String dequeue3 = annularQueue.dequeue();
        String dequeue4 = annularQueue.dequeue();
        String dequeue5 = annularQueue.dequeue();
        annularQueue.enqueue("77");
        annularQueue.enqueue("88");
    }
}
