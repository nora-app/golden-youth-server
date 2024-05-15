package nora.goldenyouth.global.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


/**
 * 공통 응답 DTO
 * @param <T> : 데이터의 타입을 나타내는 제네릭 타입
 **/
@Getter
@Setter
@RequiredArgsConstructor
public class ResponseDTO<T> {
    private final boolean success;
    private String message;
    private T data;

    public static <T> ResponseDTO<T> success(String message, T data) {
        ResponseDTO<T> response = new ResponseDTO<>(true);
        response.setData(data);
        response.setMessage(message);
        return response;
    }

    public static ResponseDTO<?> error(String message) {
        ResponseDTO<?> response = new ResponseDTO<>(false);
        response.setMessage(message);
        return response;
    }
}
