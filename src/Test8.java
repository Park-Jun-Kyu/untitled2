public class Test8 {

        public int solution(int n, int[] lost, int[] reserve) {
            int exist = 0;
            int count = 0;
            int answer = 0;

            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i] == reserve[j]){
                        exist++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1){
                        count++;

                        reserve[j] = -1;
                        break;
                    }
                }
            }


            answer = n - lost.length + exist + count;



            return answer;
        }
    }