package hust.iwsrc.dao;

import java.io.Serializable;

/**
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 18:42 2018/5/5
 * @Description:
 */

public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String userName) {
        this.username = userName;

    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        System.out.println();


        return id + username;
    }

}
