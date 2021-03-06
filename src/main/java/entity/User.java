package entity;

import java.util.Date;

/**
 * 用户模型
 *
 * @author StarZou
 * @since 2014年7月5日 下午12:07:20
 **/
public class User {
    private Long id;

    private String username;

    private String password;

    private String state;

    private Date createTime;

    private  Course course;

    private String role_id;//学院id

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public User() {
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", state=" + state + ", createTime=" + createTime + "]";
    }

}