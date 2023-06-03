import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Define variables
        int math, physics, chemistry, turkish, history, music;

        // Create instance of Scanner to receive input
        Scanner receiver = new Scanner(System.in);

        // Receive input from user to assign notes...
        System.out.print("Enter Math grade : ");
        math = receiver.nextInt();

        System.out.print("Enter physics grade : ");
        physics = receiver.nextInt();

        System.out.print("Enter chemistry grade : ");
        chemistry = receiver.nextInt();

        System.out.print("Enter turkish grade : ");
        turkish = receiver.nextInt();                

        System.out.print("Enter history grade : ");
        history = receiver.nextInt();
        
        System.out.print("Enter music grade : ");
        music = receiver.nextInt();   
        
        // Calculating sum...
        int sum = math + physics + chemistry + turkish + history + music;

        // Calculating averageof grades ...
        double average = sum / 6.0;

        String result = (average > 60) ? "Sınıfı geçti" : "Sınıfta kaldı.";
        System.out.println("Average ...:" + average);
        System.out.println("Result => " + result);

    }
}
