import java.util.Date;

public class countTime {
    public static String date(long t){
        Date date = new Date();
        date.setTime(10000 * t);
        return date.toString();
    }

    public static void main(String[] args) {
        System.out.println(date(1));
        System.out.println(date(10));
        System.out.println(date(100));
        System.out.println(date(1000));
        System.out.println(date(10000));
        System.out.println(date(100000));
        System.out.println(date(1000000));
        System.out.println(date(10000000));
    }
}
