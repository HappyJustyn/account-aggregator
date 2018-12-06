package com.juvenxu.mvnbook.account.email;

/**
 * @author Justyn
 * @date 2018/11/20 10:57
 */
public interface AccountEmailService {
    void sendEmail(String to, String subject, String htmlText) throws AccountEmailException;
}
