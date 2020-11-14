package html;

public class Main {
    public static void main(String[] args) {
        FormatDetection format = new FormatDetection("0000000", "sapporo", "aaa@aaa.com");
        System.out.println("Tel:" + format.getTelephone());
        System.out.println("Address:" + format.getAddress());
        System.out.println("E-mail:" + format.getEmail());
        format.setAddress("Chitose");
        System.out.println("NewAddress:" + format.getAddress());
    }
}
