import java.util.Stack;

public interface ValidParentheses {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in)
        String s = sc.next();
     
        System.out.println(isValid(s));
    

    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for( char c : s.toCharArray()){
            if(c=='[' || c=='{' || c=='('){
                stack.add(c);  //push into the stack.
            }else{
                if(stack.isEmpty()) return false; //Stack is empty means nothig to match.
                if(c==']'  && stack.peek() != '[') return false; //Closing is ok but if its opening bracket alos to of the stack that means this is not valid.
                if(c=='}'  && stack.peek() != '{') return false;
                if(c==')'  && stack.peek() != '(') return false;
                stack.pop();  //if valid then remove from the stack.
            }
        }
        return stack.isEmpty(); //At last my stack is empty means this is a valid parentheses. Its return true of false.
      
        }

    } 

