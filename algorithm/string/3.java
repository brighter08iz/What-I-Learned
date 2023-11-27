import java.util.Scanner;

class Main {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while ((pos=str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);

            if(tmp.length() > max) {
                max = tmp.length();
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if(str.length() > max) {
            answer = str;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.print(T.solution(str));
    }
}