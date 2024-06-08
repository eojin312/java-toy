package ejlee.javatoy.order;

import ejlee.javatoy.discount.DiscountPolicy;
import ejlee.javatoy.discount.FixDiscountPolicy;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberMemoryRepository;
import ejlee.javatoy.member.MemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemberMemoryRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
