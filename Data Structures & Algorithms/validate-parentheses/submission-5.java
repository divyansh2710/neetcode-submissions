class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        boolean flag = false;
        for (int i = 0; i< c.length; i++) {
            if(c[i] == '(' ||c[i] == '['||c[i] == '{') {
                stack.push(c[i]);
            } else {
  if(stack.isEmpty()) {
  flag = true;
  break;
  }
                Character data = stack.pop();
                
                    System.out.println("data" +data);
                if(data == '(' && c[i] == ')' ||data == '{' && c[i] == '}' ||data == '[' && c[i] == ']'  ) {
                    System.out.println("continue" +c[i]);
                    continue;
                } else {
                    System.out.println("break" +c[i]);
                    flag = true;
                    break;
                }
                
            }
            
        }
        return stack.isEmpty() && !flag;
        
    }
}
