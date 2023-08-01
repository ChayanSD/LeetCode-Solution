class Solution {
    List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        generate(new StringBuilder(),0,n);
        return res;
    }
    private void generate(StringBuilder sb , int close , int n){
        if(n==0 && close ==0){
            res.add(sb.toString());
            return;
        }

        if(n>0){
            sb.append('(');
            generate(sb,close+1,n-1);
            sb.setLength(sb.length()-1);
        }


        if(close>0){
            sb.append(')');
            generate(sb,close-1,n);
            sb.setLength(sb.length()-1);
        }
    }
}
