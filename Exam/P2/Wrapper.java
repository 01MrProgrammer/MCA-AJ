class Wrapper {
    public static void main(String[] args) {

        // Manual Boxing
        Integer intobj = Integer.valueOf(10);
        Double doubleobj = Double.valueOf(15.5);
        Boolean boolobj = Boolean.valueOf(true);

        // Manual Unboxing
        int intval = intobj.intValue();
        double doubleval = doubleobj.doubleValue();
        boolean boolval = boolobj.booleanValue();

        // Auto-boxing and Auto-unboxing
        Integer autoBoxing = 20;
        int autoUnboxing = autoBoxing;

        // Output
        System.out.println("Integer Object: " + intobj);
        System.out.println("Double Object: " + doubleobj);
        System.out.println("Boolean Object: " + boolobj);
        System.out.println("Unboxed Integer: " + intval);
        System.out.println("Unboxed Double: " + doubleval);
        System.out.println("Unboxed Boolean: " + boolval);
        System.out.println("Auto-boxing: " + autoBoxing);
        System.out.println("Auto-Unboxing: " + autoUnboxing);
    }
}
