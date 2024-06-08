package ejlee.javatoy.discount;

import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("정율할인 10% 할인")
    void rateDiscount() {
        // given
        Member member = new Member(1L, "memberVip", Grade.VIP);

        // when
        int discount = rateDiscountPolicy.discount(member, 10000);

        // then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("실패테스트 / VIP 가 아니면 0원이어야함")
    void vip_o() {
        // given
        Member member = new Member(1L, "memberBasic", Grade.BASIC);

        // when
        int discount = rateDiscountPolicy.discount(member, 10000);

        // then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

}