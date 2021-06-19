package anything.zhiniutang.day1;

public class demo1 {
    public static void main(String[] args) {
        double high = 100;
        double sum = 100;
        for (int i = 1; i < 11; i++) {
            high = high/2;
            System.out.println("第"+i+"次落地时共经过"+sum+"米");
            sum+=high+high;
            System.out.println("第"+i+"次反弹"+high+"米");
        }
    }
}
