package nora.goldenyouth.member.service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nora.goldenyouth.member.domain.Member;
import nora.goldenyouth.member.repository.MemberRepository;
import nora.goldenyouth.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    @Transactional(readOnly = true)
    public boolean validatePhoneNumber(String phoneNumber) {
        return !isDuplicatePhoneNumber(phoneNumber);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean validateNickname(String nickname) {
        return !isDuplicateNickname(nickname);
    }

    private boolean isDuplicatePhoneNumber(String phoneNumber) {
        Optional<Member> member = memberRepository.findByPhoneNumber(phoneNumber);
        return member.isPresent();
    }

    private boolean isDuplicateNickname(String nickname) {
        Optional<Member> member = memberRepository.findByNickname(nickname);
        return member.isPresent();
    }
}
