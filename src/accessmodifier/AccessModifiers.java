package accessmodifier;

public class AccessModifiers {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Private Variable: " + obj.privateVar);
        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);
    }
}
