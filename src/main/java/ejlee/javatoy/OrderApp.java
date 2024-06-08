package ejlee.javatoy;

import ejlee.javatoy.discount.DiscountPolicy;
import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.order.Order;
import ejlee.javatoy.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        // AppConfig 에 선언되어있는걸 스프링 컨테이너에 모두 넣어줌
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        MemberService memberService = context.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "itemA", 10000);
        System.out.println("order + " + order);
    }
}
