class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int eval_sum = 0;
        int odd_sum = 0;
        for (int i=0; i< num_list.length; i++){
            if(i % 2 == 0){
                eval_sum += num_list[i];
            }
            else{
                odd_sum += num_list[i];
            }
        }
        return eval_sum > odd_sum ? eval_sum : odd_sum;
    }
}
