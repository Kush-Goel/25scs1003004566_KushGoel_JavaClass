class UnboxingDemo
{
    public static void main(String[] args)
    {
        Integer a = 100;
        Double b = 25.5;
        Character c = 'A';
        Boolean d = true;

        int x = a;
        double y = b;
        char z = c;
        boolean w = d;

        System.out.println("int: " + x);
        System.out.println("double: " + y);
        System.out.println("char: " + z);
        System.out.println("boolean: " + w);
    }
}
