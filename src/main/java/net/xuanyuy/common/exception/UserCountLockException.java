package net.xuanyuy.common.exception;

import org.springframework.security.core.AuthenticationException;

/**
 */
public class UserCountLockException extends AuthenticationException {

    public UserCountLockException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserCountLockException(String msg) {
        super(msg);
    }
}
