package com.zhh.v1;

/**
 * @author zhh
 * @description 资源内容
 * @date 2020-03-03 17:15
 */
public class ResourceContent extends Content {

    /**
     * 是否需要登录
     */
    private boolean needLogin;

    public ResourceContent(String name, boolean needLogin) {
        super(name);
        this.needLogin = needLogin;
    }

    public boolean isNeedLogin() {
        return needLogin;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
