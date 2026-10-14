package mathematics;

public class pow {
    public void calculatePower(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println("Power = " + result);
    }
}