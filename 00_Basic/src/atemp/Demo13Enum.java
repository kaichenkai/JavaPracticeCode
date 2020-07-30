package atemp;

/**
 * @author: kaichenkai
 * @create: 7/27/2020 11:11
 * 覆写 toString 方法
 */
public class Demo13Enum {
    public static void main(String[] args) {
        WeekdayCopy day = WeekdayCopy.SUN;
        if (day == WeekdayCopy.SAT || day == WeekdayCopy.SUN) {
            System.out.println(String.format("Today is %s, work at home", day.describe));//Today is 周日, work at home
        }
        //通过name()获取常量定义的字符串，注意不要使用toString()；
        System.out.println(day.name());//SUN
        System.out.println(day.describe);//周日
    }
}


enum WeekdayCopy {
    MON(1, "周一"), TUE(2, "周二"), WED(3, "周三"), THU(4, "周四"), FRI(5, "周五"), SAT(6, "周六"), SUN(0, "周日");
    public final int dayValue;//枚举类的字段也可以是非final类型，即可以在运行期修改，但是不推荐这样做！
    public final String describe;

    private WeekdayCopy(int dayValue, String describe) {
        this.dayValue = dayValue;
        this.describe = describe;
    }

    @Override
    public String toString() {
        return this.describe;
    }
}


