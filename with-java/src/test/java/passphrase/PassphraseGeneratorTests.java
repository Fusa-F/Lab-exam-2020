package passphrase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class PassphraseGeneratorTests {

    private final List<String> lowers;
    private final List<String> uppers;
    private final List<String> numbers;

    PassphraseGeneratorTests() {
        this.lowers = Arrays.asList("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(","));
        this.uppers = Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z".split(","));
        this.numbers = Arrays.asList("1,2,3,4,5,6,7,8,9,0".split(","));
    }

    @Test
    /* 1024文字のパスワードを10000回生成して、大文字が含まれていないかを検証する */
    void generatePassphraseNotContainUppers() {
        var pgTest = new PassphraseGeneratorTests();
        // 小文字、数字を使用する
        var generator = new PassphraseGenerator(true, false, true);

        for(int i = 0; i < 10000; i++) {
            var passphrase = generator.generate(1024);

            for(String upper : pgTest.uppers) {
                // パスワードに大文字が含まれているとき不合格となる
                assertFalse(passphrase.contains(upper));
            }
        }
    }

    @Test
    /* 指定した長さのパスワードを生成するかを検証する */
    void generatePassphraseBySpecifiedLength() {
        // 大文字、小文字、数字を使用する
        var generator = new PassphraseGenerator(true, true, true);

        int passLength = 8; // 指定する長さ
        var passphrase = generator.generate(passLength);

        // パスワードの長さと指定した長さの値が同じとき合格となる
        assertEquals(passphrase.length(), passLength);
    }

    @Test
    /* すべての文字を使用しないとき、空白を生成するかを検証する */
    void generateEmptyWhenAllConfigIsFalse() {
        // すべての文字を使用しない
        var generator = new PassphraseGenerator(false, false, false);
        var passphrase = generator.generate(8);

        // パスワードが空白のとき合格となる
        assertEquals(passphrase, "");
    }
}
