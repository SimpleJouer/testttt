package cn.hhit.springbootfreemaker.pojo;

/**
 * @Auther:搬砖小能手
 * @Date:2020/4/25
 * @Description:cn.hhit.springbootfreemaker.pojo
 * @version:1.0
 */
public class User {
    private String uname;
    private String password;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }
    public User(){

    }
}
