public class Solution1 {


    public int[] solution(int[] answers) {
        int[] answer = {10000};
        int [] num = {1,2,3,4,5};
        for(int i=0; i<answer.length; i++){
            answer[i] = (int) Math.random()*5;
        }

        int []people1 = {};
        int []people2 = {};
        int []people3 = {};

        for(int i=0; i<=10000; i++){
            people1[i] = num[i];

        }
        System.out.println(people1);


//        for(int i=0; i<=10000; i++){
//            for(int j=1; i<=5; j++){
//                people1[j] += j;
//                people1[i]
//                return people1;
//            }
//        }

//        for(int i=0; i< answer.length; i++){
//
//        }


        return answer;
    }
}


