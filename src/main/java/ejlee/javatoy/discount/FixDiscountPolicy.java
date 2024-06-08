package ejlee.javatoy.discount;

import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
