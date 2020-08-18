public class Test2 {


    public static int[] main(String[] args) {


        int[] answer = new int[10000];
        int [] num = {1,2,3,4,5};
        for(int i=1; i<answer.length; i++){
            answer[i] = (int) (Math.random()*5)+1;
//            System.out.print(answer[i]);
            return answer;
        }
        int []people11 = new int[10000];
        int []people1 = new int[10000];
        int []people2 = new int[10000];
        int []people3 = new int[10000];

        for(int j=1; j< answer.length; j++){
            int count = 0;
            for(int i=0; i< num.length; i++){
                people1[i]=num[i];
                System.out.print(answer[j]);
//           System.out.print(people1[i]);
           if(people1[i] == answer[j]){
               count++;

           }
                System.out.println("맞은개수"+count);
            }
        }

//        for(int i=0; i<people1.length; i++){
//            System.out.print(people1[i]);
//        }


        for(int i=0; i< answer.length; i++){
            for(int j=1; j< people1.length; j++){
//                System.out.println("정답"+answer[i]);
//                System.out.println("수포자1:"+people1[j]);


                int count = 0;
                if(people1[j] == answer[i]){
                    count++;
//                    System.out.println("맞은개수 "+count);

                }
            }

        }


        return answer;
    }
}