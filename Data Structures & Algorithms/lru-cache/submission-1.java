class Node {
    int key;
    int value;
    Node prev;
    Node next;
    
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    int capacity;
    HashMap<Integer, Node> cache;
    Node head;
    Node tail;


    public LRUCache(int capacity) {
         this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        
    }

        private void addNode(Node node) {
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }

    private void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void moveToFront(Node node) {
        removeNode(node);
        addNode(node);
    }
    
    public int get(int key) {
         Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToFront(node);
        return node.value;
        
    }
    
    public void put(int key, int value) {
         Node node = cache.get(key);
        if (node == null) {
            if (cache.size() == capacity) {
                Node last = tail.prev;
                cache.remove(last.key);
                removeNode(last);
            } 
                Node newNode = new Node(key, value);
                cache.put(key, newNode);
                addNode(newNode);
        
        } else {
            node.value = value;
            moveToFront(node);
        }
        
    }
}
