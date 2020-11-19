package html;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Q2.2.1");
        FormatDetection format = new FormatDetection("0000000", "sapporo", "aaa@aaa.com");
        System.out.println("Tel:" + format.getTelephone());
        System.out.println("Address:" + format.getAddress());
        System.out.println("E-mail:" + format.getEmail());
        format.setAddress("Chitose");
        System.out.println("NewAddress:" + format.getAddress());

        System.out.println("- Q2.2.2");
        final var metaBd = Meta.builder()
                .lang("ja")
                .contentType("text/html")
                .charset("utf-8")
                .author(null) // フィールドの値がnullであることを許可するか
                .description("This is Exam-Code.")
                .formatDetection(format)
                /* .robots("noindex")/ */ // フィールドの個数増減の許容を調べるためrobotsは除いた
                .build();

        System.out.println(metaBd.getStringAsHtml());
    }
}
