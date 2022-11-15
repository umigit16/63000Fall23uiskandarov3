public class FibbonacciSeq {

    static void FibbonociNums(int N) {

        int num1 = 0, num2 = 1;

        int count = 0;

        while (count < N ) {
            System.out.print(num1  + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count ++;

        }
    }

    public static void main(String[] args) {
        FibbonociNums (5);
        FibbonociNums(7);
        FibbonociNums(8);
        FibbonociNums(9);
        FibbonociNums(10);
        FibbonociNums(11);

    }


}
