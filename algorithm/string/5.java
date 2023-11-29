import java.util.Scanner;

class Main {

    public String solution(String str) {
        String answer = "";

        char[] chArray = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while (lt<rt) {
            if(!Character.isAlphabetic(chArray[lt])) {
                lt++;
            }
            else if(!Character.isAlphabetic(chArray[rt])) {
                rt--;
            }
            else {
                char tmp = chArray[lt];
                chArray[lt] = chArray[rt];
                chArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(chArray);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}