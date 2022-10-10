//Implement Stack using Deque
class MyStack {
    
    Deque<Integer> dq;

    public MyStack() {
        dq = new LinkedList<>();
    }
    
    public void push(int x) { //Push O(1)
        dq.addFirst(x);
    }
    
    public int pop() { //Pop O(1)
        //if(stack is empty)
        if(empty())
            return -1;
        //else(delete 1st element)
        else{
            return dq.removeFirst();
        }
    }
    
    public int top() { //Peek O(1)
        //if(stack is empty)
        if(empty())
            return -1;
        //else(return 1st element)
        else{
            return dq.peekFirst();
        }
    }
    
    public boolean empty() {
        return dq.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
