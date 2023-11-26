import java.util.Scanner;

class Main {
    public String solution(String str) {
        String answer = "";

        char[] chArr = str.toCharArray();

        for(char ch : chArr) {
            if(ch>=65 && ch<=90) {
                answer += (char)(ch+32);
            }
            else {
                answer += (char)(ch-32);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
