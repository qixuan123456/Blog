package com.qxx.common.dot;


import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Xuan
 * Date: 2021/11/4
 * Time: 19:24
 */
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;


}
