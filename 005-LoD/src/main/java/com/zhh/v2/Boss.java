package com.zhh.v2;

/**
 * @author zhh
 * @description 老板类
 * @date 2020-02-07 10:59
 */
public class Boss {

    /**
     * 老板要求职工查商品的数量
     * @param staff 职工
     */
    public void requireCheckNumber(Staff staff) {
        staff.checkNumber();
    }
}
