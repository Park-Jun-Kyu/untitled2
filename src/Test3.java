public class Test3 {


    public static int[] main(int[] answer) {

        int count = 0;
        answer = new int[10000];
        int [] num = {1,2,3,4,5};
        for(int i=1; i<answer.length; i++){
            answer[i] = (int) (Math.random()*5)+1;
//            System.out.print(answer[i]);
            return answer;
        }

        int []people1 = {1,2,3,4,5};
        int []people2 = {2,1,2,3,2,4,2,5};
        int []people3 = {3,3,1,1,2,2,4,4,5,5};

        for(int j=0; j< 10000; j++){
            for(int i=0; i< num.length; i++){
                people1[i]=num[i];
//           System.out.print(people1[i]);
                return people1;
            }
        }

        for(int i=0; i< answer.length; i++){
            for(int j=0; j< people1.length; j++){


                if(people1[j] == answer[i]){
                    count++;


                }
            }

        }
        System.out.println("맞은개수 "+count);

        return answer;
    }
}