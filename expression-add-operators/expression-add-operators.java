class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<>();
        
        dfs(num,target,list,"",0,0,0);
        
        return list;
    }
    
    public void dfs(String num, int target, List<String> list, String expr, long calcVal, long prev, int pos)   {
        if(pos == num.length())    {
            if(calcVal == target)
                list.add(expr);
            return;
        }
        
        for(int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') {
                break;
            }
            
            long curExp = Long.parseLong(num.substring(pos, i + 1));
            
            if(pos == 0)    {
                dfs(num,target,list,expr + curExp, curExp, curExp, i+1);
            } else  {
                dfs(num,target,list,expr + "+" + curExp,calcVal + curExp, curExp , i+1);
                dfs(num,target,list,expr + "-" + curExp,calcVal - curExp, -curExp, i+1);
                dfs(num,target,list,expr + "*" + curExp,calcVal - prev + prev * curExp, prev * curExp, i+1);
            }
        }
    }
}