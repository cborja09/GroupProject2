public class Task7Tester {

    public static void main(String[] args) {

        Task7 studentA = new A(80, 90, 70);
        double percentageA = studentA.getPercentage();
        System.out.println("Student A Percentage: " + percentageA + "%");

        Task7 studentB = new B(75, 85, 80, 90);
        double percentageB = studentB.getPercentage();
        System.out.println("Student B Percentage: " + percentageB + "%");
    }
}
