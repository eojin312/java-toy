package ejlee.javatoy;

import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        // 관심사 분리로 AppConfig 가 대신 생성해서 주입
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member: " + member.getName());
        System.out.println("find Member: " + findMember.getName());

    }
}
