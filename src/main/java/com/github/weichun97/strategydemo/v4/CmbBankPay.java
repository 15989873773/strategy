package com.github.weichun97.strategydemo.v4;

/**
 * @author lsf
 * @date 2021/6/24 10:43
 */
public class CmbBankPay implements BasePay {
    @Override
    public String getSign() {
        // 此处省略100行.......
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        System.out.println("招商支付签名");
        return "招商支付签名";
    }

    @Override
    public String pay(String sign) {
        // 此处省略100行.......
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        System.out.println("招商支付");
        return "招商支付返回的结果";
    }

    @Override
    public void callback(String res) {
        // 此处省略100行.......
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        System.out.println("招商回调");
    }
}
