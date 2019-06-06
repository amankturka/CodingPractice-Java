class Solution {
    public boolean isValid(String s) {
        //Algorithm
        // Push if ( , { ,[ )
        // compare closing if same pop
        //else return false
        //if stack is empty at end return ture
        Stack<Character> stack = new Stack<>(); 
        int len = s.length();
        if(len == 0) return true;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(stack.isEmpty())  return false;
                if(stack.peek() == '(' && s.charAt(i) == ')'){
                    stack.pop();
                }
                else if(stack.peek() == '{' && s.charAt(i) == '}'){
                    stack.pop();
                }
                else if(stack.peek() == '[' && s.charAt(i) == ']'){
                    stack.pop();
                }
              else
                  return false;
            }
            }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}



