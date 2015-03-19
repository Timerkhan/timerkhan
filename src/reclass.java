public class ReClass {
    public static String getnumberstandart(String a) {
        return a.toLowerCase().replaceAll("\\s|\\.", "");
    }
    public static void main(String[] args) throws java.lang.Exception {
        {
            String n = "wasD.12as 2e daDv.sW";
            System.out.println(getnumberstandart(n));
        }

    }
}
