public class reclass {
    public static String GetNumberStandart(String a) {
        a = a.toLowerCase();
        String result = a.replaceAll("\\s|\\.", "");
        return  result;

    }
    public static void main(String[] args) throws java.lang.Exception {
        {
            String n = "wasD.12as 2e daDv.sW";
            System.out.println(GetNumberStandart(n));
        }

    }
}