package com.company.user.dto;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:37
 */
public class UserAddDto {
    private String username;
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
