package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void test1() {
        String data1 = "1,2";
        String[] splitData1 = data1.split(",");
        assertThat(splitData1).contains("1", "2");

        String data2 = "1";
        String[] splitData2 = data2.split(",");
        assertThat(splitData2).containsExactly("1");
    }

    @Test
    void test2() {
        String data1 = "(1,2)";
        String substring = data1.substring(1,4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException 테스트")
    void test3() {
        String data1 = "abc";
        int length = data1.length();
        assertThatThrownBy(() -> data1.charAt(3)).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: %d", length);
    }

    void test4() {

    }


}
