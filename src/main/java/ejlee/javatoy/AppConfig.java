package ejlee.javatoy;

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
        return new MemberServiceImpl(new MemberMemoryRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemberMemoryRepository(), new FixDiscountPolicy());
    }

}
