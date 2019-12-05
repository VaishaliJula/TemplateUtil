package com.util.template.Exceptions;

import com.util.template.commons.ErrorCode;

public class TemplateUtilException extends Exception {

    private static final long serialVersionUID = 7718828512143293558L;

    private final ErrorCode code;

    public TemplateUtilException(ErrorCode code) {
        super();
        this.code = code;
    }

    public TemplateUtilException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }

    public TemplateUtilException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

    public TemplateUtilException(Throwable cause, ErrorCode code) {
        super(cause);
        this.code = code;
    }

    public ErrorCode getCode() {
        return this.code;
    }
}
