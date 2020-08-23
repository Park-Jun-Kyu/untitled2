import java.util.ArrayList;
import java.util.List;

public class Test11 {


    public static void main(String[] args) {

        int[] multiply = {1, 2, 3, 4};
        int[] multiply2 = {5, 6, 7};

        Test00 test = new Test00();


       List<Integer> answer1 = test.sum(multiply);
       List<Integer> answer2 = test.sum(multiply2);

       int [] array = answer1.stream().mapToInt(i->i).toArray();
       int [] array2 = answer2.stream().mapToInt(i->i).toArray();
        System.out.println("반환값:"+array[0]);
        System.out.println("반환값2:"+array2[1]);

       if(array[0] == 10 && array2[1] == 210){
           System.out.println("성공");
       }else{
           System.out.println("실패");
       }


    }

    public static class Test00 {

        public List<Integer> sum(int [] array) {

            int sum = 0;
            int mul = 1;
            List<Integer>list = new ArrayList<Integer>();

            for (int i = 0; i < array.length; i++) {

                sum = sum + array[i];
                System.out.println("배열의 합 : " + sum);

            }
            list.add(sum);
            for (int i = 0; i < array.length; i++) {

                mul = mul * array[i];
                System.out.println("배열의 곱 : " + mul);

            }
            list.add(mul);
            return list;
        }
    }
}

