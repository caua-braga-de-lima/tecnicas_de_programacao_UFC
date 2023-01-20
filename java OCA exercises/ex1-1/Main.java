public class Main 
{
    public static void main(String[] args) 
    {
        Apple apple = new Apple("biteersweet", "red", "apple tree");
        
        System.out.println(apple.getColor());
        System.out.println(apple.getFlavor());
        System.out.println(apple.getTree());
    }
}
