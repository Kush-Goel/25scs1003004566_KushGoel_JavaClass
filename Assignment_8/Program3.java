class MaxFinder {
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public double max(double a, double b) {
        return Math.max(a, b);
    }
}

public class Maximum {
    public static void main(String[] args) {
        MaxFinder finder = new MaxFinder();

        System.out.println("Max of two integers (10, 25): " + finder.max(10, 25));
        System.out.println("Max of three integers (12, 45, 23): " + finder.max(12, 45, 23));
        System.out.println("Max of two decimals (15.5, 12.8): " + finder.max(15.5, 12.8));
    }
}
