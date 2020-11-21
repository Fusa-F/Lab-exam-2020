package passphrase;

/**
 * パスワードを変換するクラス
 *
 * <code>
 *     var rawPassphrase = "xxxxxYYYYY";
 *     var encodedPassphrase = PassphraseEncoder.encode(rawPassphrase);
 *     var decodedPassphrase = PassphraseEncoder.decode(encodedPassphrase);
 * </code>
 *
 * @author fukushi71
 * @version 1.0
 * @since 1.0
 */
public class PassphraseEncoder {

    /**
     * パスワードをエンコードする
     * @param rowPassphrase 元の文字列
     * @return 変換された文字列
     */
    public static String encode(String rowPassphrase) {
        return UpperToLowerAndLowerToUpper(rowPassphrase);
    }

    /**
     * パスワードをデコードする
     * @param encodedPassphrase 変換された文字列
     * @return 元の文字列
     */
    public static String decode(String encodedPassphrase) {
        return UpperToLowerAndLowerToUpper(encodedPassphrase);
    }

    /**
     * 引数で渡された文字列の大文字と小文字を入れ替える
     * @param text 変換前の文字列
     * @return 変換後の文字列
     */
    private static String UpperToLowerAndLowerToUpper(String text) {
        String convertedText = "";

        for(var i = 0; i < text.length(); i++) {
            char checkPoint =  text.charAt(i);

            if(Character.isUpperCase(checkPoint)) {
                convertedText += Character.toLowerCase(checkPoint);
            }
            else if(Character.isLowerCase(checkPoint)) {
                convertedText += Character.toUpperCase(checkPoint);
            }
            else {
                convertedText += checkPoint;
            }
        }
        return convertedText;
    }
}
