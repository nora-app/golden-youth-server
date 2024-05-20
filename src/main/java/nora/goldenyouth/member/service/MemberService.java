package nora.goldenyouth.member.service;

public interface MemberService {

    boolean validatePhoneNumber(String phoneNumber);

    boolean validateNickname(String nickname);
//
//    void sendVerificationCode();
//
//    void verifyVerificationCode();
}
