class MyQueue {
Stack<Integer> s = new Stack<>();
Stack<Integer> h = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
       s. push(x);
    }
    
    public int pop() {
       while(s.size() != 0 ){
        h.add(s.pop());
       }
       int x = h.pop();

       while(h.size() !=0 ){
        s.add(h.pop());
       }
       return x ;
      
    }
    
    public int peek() {
        while(s.size() != 0 ){
        h.add(s.pop());
       }
       int x = h.peek();

       while(h.size() !=0 ){
        s.add(h.pop());
       }
       return x ;
      
     
    }
    
    public boolean empty() {
       return s.empty() && h.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */