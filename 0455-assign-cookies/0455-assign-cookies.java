class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childpoint=0;
        int cookpoint=0;
        while(childpoint<g.length && cookpoint<s.length){
            if(s[cookpoint] >= g[childpoint]){
                childpoint++;
            }
            cookpoint++;
        }
        return childpoint;

    }
    
}