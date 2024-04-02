/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ya
 */
public class Project {
    private String code;
    private String priority;

    public Project(String code, String priority) {
        this.code = code;
        this.priority = priority;
    }

    public Project() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Project{" + "code=" + code + ", priority=" + priority + '}';
    }
    
}
