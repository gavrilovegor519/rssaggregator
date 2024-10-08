package ru.gavrilovegor519.rssaggregator.exception;

public class GetFeedException extends RuntimeException {
    public GetFeedException() {
        super();
    }

    public GetFeedException(String message) {
        super(message);
    }

    public GetFeedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetFeedException(Throwable cause) {
        super(cause);
    }

    protected GetFeedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
