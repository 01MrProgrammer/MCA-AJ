public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 10;
        // Converting int to Integer (Autoboxing)
        Integer aObj = a;
        // Converting Integer to int (Unboxing)
        int b = aObj;
        // Using wrapper methods
        String str = "123";
        int parsedValue = Integer.parseInt(str);
        System.out.println("Original int: " + a);
        System.out.println("Integer object: " + aObj);
        System.out.println("Parsed value from string: " + parsedValue);
        System.out.println("Compare 10 to 20: " + Integer.compare(10, 20));
        System.out.println("Max of 10 and 20: " + Integer.max(10, 20));
    }
}
