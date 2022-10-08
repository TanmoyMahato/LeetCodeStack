class MinStack {
    
    class ListNode{
        int val;
        int minVal;
        ListNode next;
        
        ListNode(int val){
            this.val = val;
            next = null;
        }
    }
    
    ListNode head;

    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        
        if(head.next == null){            
            head.minVal = val;
        }
        else{
            head.minVal = Math.min(val, head.next.minVal);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */