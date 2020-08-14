import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String[]arr= a.split(":");

        for(int i=0; i<arr.length; i++){
            String b = arr[i];
            if(i==1){
                System.out.println(b);
            }
        }



    }
}
