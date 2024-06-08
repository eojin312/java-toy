package ejlee.javatoy.discount;

import ejlee.javatoy.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
