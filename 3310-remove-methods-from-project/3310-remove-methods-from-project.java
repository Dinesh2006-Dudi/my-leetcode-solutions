class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
       
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
        
        for(int[] call : invocations){
            int a = call[0];
            int b = call[1];
            graph.get(a).add(b); 
        }
        
       
        boolean[] bad = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        bad[k] = true;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int next : graph.get(cur)){
                if(!bad[next]){
                    bad[next] = true;
                    q.offer(next);
                }
            }
        }
        
       
        for(int[] call : invocations){
            int a = call[0];
            int b = call[1];
            if(!bad[a] && bad[b]){ 
                List<Integer> ans = new ArrayList<>();
                for(int i = 0; i < n; i++) ans.add(i);
                return ans;
            }
        }
        
       
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!bad[i]) ans.add(i);
        }
        return ans;
    }
}