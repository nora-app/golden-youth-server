package nora.goldenyouth.member.repository;

import nora.goldenyouth.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}