package ejlee.javatoy.member;

import ejlee.javatoy.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        // given
        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);


        // when
        Member findMember = memberService.findMember(member.getId());

        // then
        Assertions.assertEquals(member.getId(), findMember.getId());
    }

}