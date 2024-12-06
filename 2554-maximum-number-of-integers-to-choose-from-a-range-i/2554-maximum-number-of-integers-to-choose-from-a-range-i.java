// class Solution {
//     public int maxCount(int[] banned, int n, int maxSum) {
//         Set<Integer> hs = new HashSet<>();
//         for(int i:banned) hs.add(i);
//         int count = 0;
//         for(int i=1; i<=n; i++){
//             if(!hs.contains(i) && i<=maxSum){
//                 count++;
//                 maxSum -= i;
//             }else if(i>maxSum) break;
//         }
//         return count;
//     }
// }

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean set[] = new boolean[10001];
        for(int i:banned) set[i] = true;
        int count = 0;
        for(int i=1; i<=n; i++){
            if(!set[i] && i<=maxSum){
                count++;
                maxSum -= i;
            }else if(i>maxSum) break;
        }
        return count;
    }
}