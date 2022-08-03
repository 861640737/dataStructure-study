package hjc.queue;

/**
 * 队列
 */

public class MyQueue {
    private int[] queue;
    private int front;
    private int end;

    /**
     * 显示队列所有元素
     */
    public void showQueue() {
        for(int i = front; i != end; i = (i + 1) % queue.length) {
            System.out.println(queue[i] + "--");
        }
    }

    public int getData() throws Exception {
        if(isNull()) {
            Exception PatternSyntaxException = new Exception();
            throw PatternSyntaxException;
        }
        int a = queue[front];
        front = (front + 1) % queue.length;
        return a;
    }

    /**
     * 向队列添加数据
     * @param data
     */
    public void addData(int data) {
        if (isFill()) {
            System.out.println("队列已满");
            return;
        }
        queue[end] = data;
        end = (end + 1) % queue.length;
    }

    /**
     * 判断队列是否满
     * @return  true || false
     */
    public boolean isFill() {
        return (end + 1) % queue.length == front;
    }

    /**
     * 判断队列是否为空
     * @return  true || false
     */
    public boolean isNull() {
        return front == end;
    }

    /**
     * 设置队列长度
     * @param maxSize
     */
    public void setMaxSize(int maxSize) {
        queue = new int[maxSize + 1];
    }

    public MyQueue() {
    }

    public MyQueue(int size) {
        queue = new int[size + 1];
    }
}
