public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int subAnswer = calculate.subtraction(a, b);
        int addAnswer = calculate.add(a, b);
	    
        System.out.println("5 + 2 = " + addAnswer);
        System.out.println("5 - 2 = " + subAnswer);
    }
}
