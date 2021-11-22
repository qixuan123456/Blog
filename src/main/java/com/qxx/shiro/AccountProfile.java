package com.qxx.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Xuan
 * Date: 2021/11/4
 * Time: 18:36
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
