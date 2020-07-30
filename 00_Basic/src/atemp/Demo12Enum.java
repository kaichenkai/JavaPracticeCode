package atemp;

/**
 * @author: kaichenkai
 * @create: 7/27/2020 11:11
 */
public class Demo12Enum {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SUN || day == Weekday.SAT) {
            System.out.println(String.format("Today is %s, work at home", day));//Today is SUN, work at home
        }
    }
}


enum Weekday {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
    public final int dayValue;//枚举类的字段也可以是非final类型，即可以在运行期修改，但是不推荐这样做！

    private Weekday(int dayValue) {
        this.dayValue = dayValue;
    }
}
