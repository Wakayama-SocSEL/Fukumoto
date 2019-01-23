public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

	//calculateクラスの関数を取って来て計算結果を代入
        int subAnswer = calculate.subtraction(a, b);
        int addAnswer = calculate.add(a, b);
	int mulAnswer = calculate.multiplication(a, b);
	    
	//計算式と計算結果を表示
        System.out.println("5 + 2 = " + addAnswer);
        System.out.println("5 - 2 = " + subAnswer);
	System.out.println("5 * 2 = " + mulAnswer);
    }
}
