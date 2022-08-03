package hjc.queue;

public class Test {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(3);
        q.addData(10);
        q.addData(20);
        q.addData(30);
        q.addData(40);
        try {
            q.getData();
            q.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }

        q.addData(50);
        q.addData(60);
        q.addData(70);

    }
}
