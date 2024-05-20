package nora.goldenyouth.member.repository;

import nora.goldenyouth.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByPhoneNumber(String phoneNumber);
    Optional<Member> findByNickname(String nickname);
}