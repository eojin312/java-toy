package ejlee.javatoy.member;

import java.util.HashMap;
import java.util.Map;

public class MemberMemoryRepository implements MemberRepository{
    private static Map<Long, Member> members = new HashMap<>();

    @Override
    public void save(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return members.get(id);
    }
}
