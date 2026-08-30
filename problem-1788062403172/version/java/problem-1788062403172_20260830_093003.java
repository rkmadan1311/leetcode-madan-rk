// Last updated: 30/08/2026, 09:30:03
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer>seen=new HashSet<>();
4        Set<Integer>invalid=new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(i==0||nums[i]!=nums[i-1]){
7                if(seen.contains(nums[i])){
8                    invalid.add(nums[i]);
9                }else{
10                    seen.add(nums[i]);
11                }
12                }
13            }
14        return seen.size()-invalid.size();
15        }
16    }
17