class Solution {
    public String simplifyPath(String path) {
        char ch[] = path.toCharArray();
        
        Stack<String> stk = new Stack<>();
        
        for(int i=0; i<ch.length; i++){
            
            if(ch[i] == '/') //if(1st element is /)
                continue;
            
            String temp = "";
            while(i<ch.length && ch[i]!='/'){
                temp += ch[i++];
            }
            
            if(temp.equals(".")){
                continue;
            }
            else if(temp.equals("..")){
                if(!stk.isEmpty())
                    stk.pop();
            }
            else{
                stk.push(temp);
            }
        }
        
        if(stk.isEmpty()){
            return "/";
        }
        else{
            String newPath = "";
            while(!stk.isEmpty()){
                newPath = "/" + stk.pop() + newPath;  
            } 
            return newPath;
        }                                                   
                
    }
}