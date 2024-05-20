package nora.goldenyouth.member.service;

public interface MemberService {

    void checkPhoneNumberDuplication(String phoneNumber);

    void checkNicknameDuplication(String nickname);
//
//    void sendVerificationCode();
//
//    void verifyVerificationCode();
}
