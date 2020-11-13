package html;

/**
 * Htmlの{@code <meta>}で使用するformat-detectionの値を管理するクラス
 *
 * @author oketa216 you
 * @version 1.0
 * @since 1.0
 */
public class FormatDetection {

    /**
     * 電話番号にリンクを作成する
     * {@code yes}, {@code no}
     */
    private String telephone;

    /**
     * 住所にリンクを作成する
     * {@code yes}, {@code no}
     */
    private String address;

    /**
     * メールアドレスにリンクを作成する
     * {@code yes}, {@code no}
     */
    private String email;

    public FormatDetection(String telephone, String address, String email) {
        this.telephone = telephone;
        this.address = address;
        this.email = email;
    }

    public FormatDetection() {

    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
