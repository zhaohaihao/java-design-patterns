package com.zhh.v10;

/**
 * @author zhh
 * @description 枚举单例模式
 * @date 2020-02-12 16:08
 */
public enum EnumSingleton {
    INSTANCE {
        @Override
        public void method() {
            System.out.println("任何其他方法");
        }
    };

    public abstract void method();
}
