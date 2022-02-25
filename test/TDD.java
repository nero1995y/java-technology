package test;

import com.tdd.Calculator;
import com.tdd.LottoNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TDD {

    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        assertEquals(3, result);
        assertEquals(5, Calculator.plus(4, 1));
    }

    @Test
    @DisplayName("로또 번호 갯수 테스트")
    public void generate(){
        // given
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();

        final int price = 1000;

        // when
        final List<Integer> lottoNumber = lottoNumberGenerator.generate(price);

        // then
        assertEquals(lottoNumber.size(), 6);
        //assertThat(lotto.stream().allMatch(v -> v >= 1 && v <= 45)).isTrue();

        //allMatch() 모든 요소들이 매개값(Predicate)으로 주어진 조건을 만족하는지 조사
        assertTrue(lottoNumber.stream().allMatch(v -> v >= 1 && v <= 45)); //true

    }

    @Test
    @DisplayName("잘못된 로또 금액 테스트")
    public void lottoNumberInvalidMoneyTest(){
        // given
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();

        final int price = 2000;

        // when
        final RuntimeException exception = assertThrows(
                RuntimeException.class, () -> lottoNumberGenerator.generate(price));

        // then
        assertEquals(exception.getMessage(), "올바른 금액이 아닙니다.");
    }

}