package ejlee.javatoy;

import ejlee.javatoy.discount.DiscountPolicy;
import ejlee.javatoy.discount.FixDiscountPolicy;
import ejlee.javatoy.discount.RateDiscountPolicy;
import ejlee.javatoy.member.MemberMemoryRepository;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.member.MemberServiceImpl;
import ejlee.javatoy.order.OrderService;
import ejlee.javatoy.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * interface 에 대한 구현체를 대신해서 생성
 */
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(getMemberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return getFixDiscountPolicy();
    }

    private RateDiscountPolicy getFixDiscountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    private MemberMemoryRepository getMemberRepository() {
        return new MemberMemoryRepository();
    }

}
