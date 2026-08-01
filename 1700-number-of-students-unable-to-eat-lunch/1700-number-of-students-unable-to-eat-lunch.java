class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>q=new ArrayDeque<>();
        for(int i:sandwiches){
            q.offer(i);
        }
        Queue<Integer>q1=new ArrayDeque<>();
        for(int i:students){
            q1.offer(i);
        }
        int ans=0;
        
            int count=0;
        while(!q1.isEmpty()){
            if(q1.peek()==q.peek()){
                q.poll();
                q1.poll();
                count=0;
            }
            if(q1.peek()!=q.peek()){
                int ele=q1.poll();
                q1.offer(ele);
                count++;
            }
            
            if(count>=q1.size()){
                return q1.size();
            }
        }
        return 0;
    }
}