package com.juvenxu.mvnbook.account.email;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.GreenMailUtil;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.Message;

import static org.junit.Assert.*;

/**
 * @author Justyn
 * @date 2018/11/20 12:27
 */
public class AccountEmailServiceImplTest {

    private GreenMail greenMail;

    /**
     * 开启接收邮件服务器
     */
//    @Before
//    public void startMailServer() {
//        greenMail = new GreenMail(ServerSetup.SMTP);
//        greenMail.setUser("justynren@juvenxu.com", "123456");
//        greenMail.start();
//    }

    /**
     * 发送邮件
     */
    @Test
    public void sendEmail() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("account-email.xml");
        AccountEmailService accountEmailService = (AccountEmailService) ctx.getBean("accountEmailService");
        String subject = "Test Subject";
        String htmlText = "<h3>Test</h3>";
        // 发送邮件，邮件地址需要网络能达到
        accountEmailService.sendEmail("justynren@qq.com", subject, htmlText);
//        greenMail.waitForIncomingEmail(2000, 1);
//        Message[] msgs = greenMail.getReceivedMessages();
//        System.out.println(msgs[0].getSubject());
//        assertEquals(1, msgs.length);
//        assertEquals(subject, msgs[0].getSubject());
//        assertEquals(htmlText, GreenMailUtil.getBody(msgs[0]).trim());
    }

    /**
     * 关闭接收邮件服务器
     */
//    @After
//    public void stopMailServer() {
//        greenMail.stop();
//    }

}