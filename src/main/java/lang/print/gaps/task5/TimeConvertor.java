package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds=minutes*60;
        System.out.println(minutes+" minutes= "+seconds+" seconds");
    }

    public static void main(String[] args) {
        TimeConvertor t=new TimeConvertor();
        t.convert(3);

    }
}
