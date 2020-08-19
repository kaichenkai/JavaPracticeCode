package com.company.user.dto;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:37
 */
public class UserAddDto {
    @NotNull(message = "username 不能为空")
    @Length(min = 2, max = 10, message = "username 用户名格式错误")
    private String username;

    @NotNull(message = "password 不能为空")
    @Length(min = 6, max = 20, message = "password 密码格式错误")
    private String password;

    public UserAddDto() {
    }

    public UserAddDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
