package com.szjz.design_pattern_imooc.design.creational.prototype;

/**
 * author:szjz
 * date:2019/7/12
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        Mail mailTemp1 = (Mail) mail.clone();
        mail.setContent("初始化模板");
        System.out.println("0000"+ mail);
        System.out.println("1111"+ mailTemp1);
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {

            Mail mailTemp = (Mail) mail.clone();
//            Mail mailTemp = new Mail();
            mailTemp.setName("姓名：" + i);
            mailTemp.setEmailAddress("地址：" + i + "@email.com");
            mailTemp.setContent("内容：" + i);
            MailUtil.sendEmail(mailTemp);
        }
        long end = System.nanoTime();
        System.err.println("用时：" + (end - start) / 1000000000.0);

        MailUtil.saveOriginMailRecord(mail);
    }
}
