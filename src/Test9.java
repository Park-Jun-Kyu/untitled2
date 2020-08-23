public class Test9 {


    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int exist = 0;
            int count = 0;
            int answer = 0;

            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i] == reserve[i]){
                        exist++;
                        lost[i]--;
                        reserve[j]--;

                    }
                }
            }

            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1){
                        count++;
                        lost[i]--;
                        reserve[j]--;
                    }
                }
            }


            answer = n + lost.length + exist + count;




            return answer;
        }
    }


}



