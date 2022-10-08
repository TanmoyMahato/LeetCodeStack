class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0; i<tokens.length; i++){
            
            if(tokens[i].equals("+")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b+a);
            }
            else if(tokens[i].equals("-")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b-a);
            }
            else if(tokens[i].equals("*")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b*a);
            }
            else if(tokens[i].equals("/")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b/a);
            }
            else{
               stk.push(Integer.valueOf(tokens[i])); 
            }
        }
        
        return stk.pop();
    }
}