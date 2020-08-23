import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public int[] solution(int[] answers) {
        int[] answer = {};
        int [] supo1 = {1,2,3,4,5};
        int [] supo2 = {2,1,2,3,2,4,2,5};
        int [] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int [] point = new int[3];
        for(int i =0; i< answers.length; i++){
            if(supo1[i] == answers[i]){
                point[0] +=1;
            }
            if(supo2[i] == answers[i]){
                point[1] +=1;
            }
            if(supo3[i] == answers[i]){
                point[2] +=1;
            }
        }
        int max = (Math.max(Math.max(point[0],point[1]),point[2]));

            ArrayList<Integer>winner = new ArrayList<Integer>();
            if(max==point[0]) winner.add(1);
            if(max==point[1]) winner.add(2);
            if(max==point[2]) winner.add(3);

            answer = new int[winner.size()];

            for(int i=0; i< answers.length; i++){
                answer[i] = winner.get(i);
            }



//        int winner = point[0];
//
//        for(int i=0; i< point.length; i++){
//            if(winner < point[i]){
//                winner = point[i];
//
//            }
//        }
//        List<Integer> win = new ArrayList<>();
//
//        for(int i=0; i< point.length; i++){
//            if(winner == point[i]){
//                win.add(i);
//            }
//        }
//
//        answer = new int[win.size()];
//
//        for(int i =0; i<win.size(); i++){
//            answer[i]=win.get(i)+1;
//        }
//
//
//
        return answer;

    }
}
