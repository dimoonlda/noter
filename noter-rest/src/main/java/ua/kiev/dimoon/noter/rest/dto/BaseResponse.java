package ua.kiev.dimoon.noter.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by lutay.d on 06.10.2016.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseResponse<T> {
    private Integer errorCode;
    private String errorMessage;
    private final T data;

    public BaseResponse(T data) {
        this.data = data;
        this.errorCode = 0;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public BaseResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public BaseResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public T getData() {
        return data;
    }
}
