package nora.goldenyouth.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nora.goldenyouth.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/phone/{phoneNumber}")
    public void validatePhoneNumber(@PathVariable String phoneNumber) {
        memberService.validatePhoneNumber(phoneNumber);
    }

    @GetMapping("/nickname/{nickname}")
    public void validateNickname(@PathVariable String nickname) {
        memberService.validateNickname(nickname);
    }
}
