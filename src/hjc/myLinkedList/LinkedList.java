package hjc.myLinkedList;

public class LinkedList {
    private Node node;

    /**
     * 返回链表长度
     * @return
     */
    public int length() {
        int i = 0;
        Node temp = this.node;
        while (true) {
            if (temp == null) return i;
            temp = temp.getNext();
            i++;
        }
    }

    /**
     * 删除节点
     * @param id
     */
    public void del(int id) {
        if(this.node == null) return;
        Node temp = this.node;
        if(temp.getId() == id) {
            this.node = temp.getNext();
        }
        while (true) {
            if(temp.getNext() == null) break;
            if(temp.getNext().getId() == id) {
                temp.setNext(temp.getNext().getNext());
                break;
            }
            temp = temp.getNext();
        }
    }

    /**
     * 修改节点
     * @param node
     */
    public void revise(Node node) {
//        if(this.node == null) return;
        Node temp = this.node;
        while(true) {
            if(temp == null) break;
            if(temp.getId() == node.getId()) {
//                temp.setId(node.getId());
                temp.setName(node.getName());
            }
            temp = temp.getNext();
        }
    }

    /**
     * 添加一个节点进链表
     * @param node  需要添加的节点
     */
    public void add(Node node) {

        if (this.node == null) {
            this.node = node;
            return;
        }
        Node temp = this.node;
        while (true) {
            if (temp.getId() == node.getId()) {
                temp.setName(node.getName());
                return;
            }
            if (temp.getNext() == null) {
                temp.setNext(node);
                return;
            }
            temp = temp.getNext();
        }

        //添加新节点时自动排序,弃用
//        Node temp = this.node;
//        if (this.node == null) {
//            this.node = node;
//            return;
//        }else if (this.node.getId() > node.getId()) {
//            node.setNext(temp);
//            this.node = node;
//            return;
//        }
//        while (true) {
//            if (node.getId() == temp.getId()) {
//                temp.setId(node.getId());
//                temp.setName(node.getName());
//                break;
//            }else if(temp.getNext() == null){
//                temp.setNext(node);
//                break;
//            }else if(temp.getNext().getId() > node.getId()) {
//                node.setNext(temp.getNext());
//                temp.setNext(node);
//                break;
//            }
//            temp = temp.getNext();
//        }
    }

    /**
     * 显示所有节点
     */
    public void showLink() {
//        if(node == null) return;
        Node temp = this.node;
        while(true) {
            if(temp == null) break;
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }

    public LinkedList() {
    }

    public LinkedList(Node node) {
        this.node = node;
    }
}
