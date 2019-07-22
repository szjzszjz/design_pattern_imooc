package com.szjz.design_pattern_imooc.design.creational.prototype;

import java.text.MessageFormat;

/**
 * author:szjz
 * date:2019/7/12
 */
public class MailUtil {

    public static void sendEmail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址：{1},邮件内容:{2} 发送邮件 {3}";
        String format = MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent(), mail);
        System.out.println(format);
    }


    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储原始邮件记录：origin mail: " + mail.getContent());
    }
}

