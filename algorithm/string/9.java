import java.util.Scanner;

class Main {

    public int solution(String str) {
        String answer = "";

        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                answer += ch;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}