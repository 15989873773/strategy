package com.github.weichun97.strategydemo.v4;

/**
 * 异常的支付类型
 *
 * @author lsf
 * @date 2021/6/24 11:44
 */
public class NullPay implements BasePay {
    @Override
    public void truePay() {
        System.out.println("错误的支付类型");
    }

    @Override
    public String getSign() {
        return null;
    }

    @Override
    public String pay(String sign) {
        return null;
    }

    @Override
    public void callback(String res) {

    }
}
