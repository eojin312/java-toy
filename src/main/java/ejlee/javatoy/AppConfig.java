package ejlee.javatoy;

import ejlee.javatoy.discount.DiscountPolicy;
import ejlee.javatoy.discount.FixDiscountPolicy;
import ejlee.javatoy.member.MemberMemoryRepository;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.member.MemberServiceImpl;
import ejlee.javatoy.order.OrderService;
import ejlee.javatoy.order.OrderServiceImpl;

/**
 * interface 에 대한 구현체를 대신해서 생성
 */
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(getMemberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return getFixDiscountPolicy();
    }

    private FixDiscountPolicy getFixDiscountPolicy() {
        return new FixDiscountPolicy();
    }

    private MemberMemoryRepository getMemberRepository() {
        return new MemberMemoryRepository();
    }

}
