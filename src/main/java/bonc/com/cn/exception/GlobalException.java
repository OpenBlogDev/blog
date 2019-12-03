package bonc.com.cn.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String maxUploadSizeExceededExceptionHandler(MaxUploadSizeExceededException maxUploadSizeExceededException) {

        return "error/duplicate";
    }

}
