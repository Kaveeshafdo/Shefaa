/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Jamith
 */
public class Patient {
    private int pid;
    private String name;
    private String residanceType;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidanceType() {
        return residanceType;
    }

    public void setResidanceType(String residanceType) {
        this.residanceType = residanceType;
    }
}
