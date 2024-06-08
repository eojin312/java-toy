package ejlee.javatoy;

import ejlee.javatoy.discount.DiscountPolicy;
import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.order.Order;
import ejlee.javatoy.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        OrderService orderService = appConfig.orderService();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "itemA", 10000);
        System.out.println("order + "+ order);
    }
}
