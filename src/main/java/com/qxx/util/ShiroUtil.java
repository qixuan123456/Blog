package com.qxx.util;

import com.qxx.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author Xuan
 * Date: 2021/11/5
 * Time: 10:40
 */
public class ShiroUtil {

    public static AccountProfile geProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
