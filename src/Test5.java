import java.util.ArrayList;
import java.util.List;

public class Test5 {



    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int point[] = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (supo1[i] == answers[i]) {
                point[0]++;
            }
            if (supo2[i] == answers[i]) {
                point[1]++;
            }
            if (supo3[i] == answers[i]) {
                point[2]++;
            }

            int max = Math.max(Math.max(point[0], point[1]), point[2]);

            List<Integer> list = new ArrayList<Integer>();

            if (point[0] == max) {
                list.add(1);
            }
            if (point[1] == max) {
                list.add(2);
            }
            if (point[2] == max) {
                list.add(3);
            }

            answer = new int[list.size()];

            for (int j = 0; j < answer.length; j++) {
                answer[j] = list.get(j);
            }


        }
        return answer;


    }
}




