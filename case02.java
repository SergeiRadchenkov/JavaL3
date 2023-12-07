public class case02 {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }

    private static Object Sum(Object i, Object j) {
        if (i instanceof Double && j instanceof Double) {
            return (Object)((Double) i + (Double) j);
        } else if (i instanceof Integer && j instanceof Integer) {
            return (Object)((Integer) i + (Integer) j);
        } else return 0;
    }
}