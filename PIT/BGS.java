import java.util.Scanner;
public class BGS {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = "Christ Jissel L Roxas";
        String idNumber = "2024-305893";

        System.out.println("");
        System.err.println("Hello, " + name );
        System.out.println("");
        System.out.print("Enter your score: ");



        int score = sc.nextInt(); 
        String remark;

        if (score >= 75) {
            remark = "Pass";
        } else {
            remark = "Fail";
        }
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("----  BGS Student Result -----");
        System.out.println("------------------------------");
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("------------------------------");
        System.out.println("Result: Score = " + score + " | Remark: " + remark);
        System.out.println("");

        if (remark.equals("Pass")) {
            System.out.println("Congratulations! with " + score + " points, you have passed.");
        } else {
            System.out.println("with " + score + " points, Better luck next time.");
        }
    }
}
