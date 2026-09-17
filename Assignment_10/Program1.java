class AutoboxingDemo
{
    public static void main(String[] args)
    {
        int a = 100;
        double b = 25.5;
        char c = 'A';
        boolean d = true;

        Integer obj1 = a;
        Double obj2 = b;
        Character obj3 = c;
        Boolean obj4 = d;

        System.out.println("Integer: " + obj1);
        System.out.println("Double: " + obj2);
        System.out.println("Character: " + obj3);
        System.out.println("Boolean: " + obj4);
    }
}
