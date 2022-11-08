package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        System.out.println(toBeDivided/5);
    }

    public static void main(String[] args) {
        NumberDivider numberDivider=new NumberDivider();
        numberDivider.divide(25);
    }
}
