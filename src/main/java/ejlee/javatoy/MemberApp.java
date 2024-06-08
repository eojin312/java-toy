package ejlee.javatoy;

import ejlee.javatoy.member.Grade;
import ejlee.javatoy.member.Member;
import ejlee.javatoy.member.MemberService;
import ejlee.javatoy.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        // 관심사 분리로 AppConfig 가 대신 생성해서 주입
        // AppConfig appConfig = new AppConfig();
        // MemberService memberService = appConfig.memberService();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = context.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member: " + member.getName());
        System.out.println("find Member: " + findMember.getName());

    }
}
