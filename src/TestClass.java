public class TestClass {

    public static void main(String[] args) {

        String a ="abc";
        String b ="bac";

        System.out.println(a.equals(b));

        int hash1 = a.hashCode();
        int hash2 = b.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
    }
}
