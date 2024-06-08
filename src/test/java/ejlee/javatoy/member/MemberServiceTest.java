package ejlee.javatoy.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

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