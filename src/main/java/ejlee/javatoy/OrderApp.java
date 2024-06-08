package ejlee.javatoy;

import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.member.MemberServiceImpl;
import ejlee.javatoy.order.Order;
import ejlee.javatoy.order.OrderService;
import ejlee.javatoy.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "A", Grade.VIP);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order" + order);
    }
}
