package com.jpollo.user;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by shenjie on 14-1-2.
 */
public class UserAction extends ActionSupport {

    private User user;
    private  UserService service;

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
       this.service = service;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public String execute(){
        if (service.save(user)!=null) {
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

}
