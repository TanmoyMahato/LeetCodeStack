class Solution {
    public boolean isValid(String str) {
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<str.length();i++){
            //check for any opening bracket
            if( Character.compare(str.charAt(i),'(')==0 || Character.compare(str.charAt(i),'[')==0 || Character.compare(str.charAt(i),'{')==0 )
                stk.push(str.charAt(i));                            
                
            
            else{
                //if(stack is empty but string has closing bracket)
                if(stk.empty())
                    return false;
                
                //1st bracket check
                if(Character.compare(str.charAt(i),')')==0){
                    if(Character.compare(stk.peek(),'(')==0)
                        stk.pop();                    
                    else
                        return false;
                }
                
                //2nd bracket check
                if(Character.compare(str.charAt(i),']')==0){
                    if(Character.compare(stk.peek(),'[')==0)
                        stk.pop();                    
                    else
                        return false;
                }
                
                //3rd bracket check
                if(Character.compare(str.charAt(i),'}')==0){
                    if(Character.compare(stk.peek(),'{')==0)
                        stk.pop();                    
                    else
                        return false;
                }
            }
        }
        
        if(stk.empty())
            return true;
        else
            return false;
        
        
    }
}