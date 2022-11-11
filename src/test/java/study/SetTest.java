package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @DisplayName("Set 의 size 구하기")
    @Test
    void test1() {
        int size = numbers.size();
        assertThat(size).isEqualTo(3);
    }

    @DisplayName("contains 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test2(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @DisplayName("contains 테스트 실패 포함")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void test3(int number, boolean check) {
        org.junit.jupiter.api.Assertions.assertEquals(numbers.contains(number), check);
    }


}
