import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String s : strArr) {
            char[] chArr =  s.toCharArray();
            int lt = 0, rt = s.length()-1;

            while(lt<rt) {
                char tmp = chArr[lt];
                chArr[lt] = chArr[rt];
                chArr[rt] = tmp;

                lt++;
                rt--;
            }
            String tmp = String.valueOf(chArr);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strArr = new String[n];

        for(int i=0; i<n; i++) {
            strArr[i] = scanner.next();
        }
        for(String s : T.solution(strArr)) {
            System.out.println(s);
        }
    }
}