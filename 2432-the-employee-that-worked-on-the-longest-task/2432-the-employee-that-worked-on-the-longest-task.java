class Solution {
    public int hardestWorker(int n, int[][] logs) {

        Map<Integer, Integer> map = new TreeMap<>();

        // First employee's work time
        map.put(logs[0][0], logs[0][1]);

        // Calculate work time for remaining logs
        for (int i = 1; i < logs.length; i++) {

            int work = logs[i][1] - logs[i - 1][1];

            // Keep the maximum work time for that employee
            map.put(
                logs[i][0],
                Math.max(map.getOrDefault(logs[i][0], 0), work)
            );
        }

        int max = -1;
        int answer = Integer.MAX_VALUE;

        // Find maximum time
        // If same time, choose smaller ID
        for (int id : map.keySet()) {

            int time = map.get(id);

            if (time > max) {
                max = time;
                answer = id;
            }
            else if (time == max && id < answer) {
                answer = id;
            }
        }

        return answer;
    }
}