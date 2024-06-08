package ejlee.javatoy;

import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member: " + member.getName());
        System.out.println("find Member: " + findMember.getName());
    }
}
