package com.jpollo.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by shenjie on 14-1-15.
 */
public class LoginAction extends ActionSupport{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;

    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String execute() throws Exception {

        if(getUsername().equals("shenjie") && getPassword().equals("1234")) {
            ActionContext.getContext().getSession().put("user", getUsername());
            System.out.println("Login Sucess");
            return SUCCESS;
        }else {
            return ERROR;
        }

    }
}
