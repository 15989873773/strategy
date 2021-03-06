package com.github.weichun97.strategydemo.v4;

/**
 * @author lsf
 * @date 2021/6/24 10:41
 */
public interface BasePay {

    /**
     * 模板方法
     *
     * 真实支付方法
     */
    default void truePay(){
        String sign = getSign();
        String pay = pay(sign);
        callback(pay);
    }

    /**
     * 获取签名
     * @return
     */
    String getSign();

    /**
     * 支付
     * @param sign
     * @return
     */
    String pay(String sign);

    /**
     * 支付回调
     * @param res
     */
    void callback(String res);
}
