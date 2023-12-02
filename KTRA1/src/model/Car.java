/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Car {
    private String code, loai;
    private int muc, so;

    public Car(String code, String loai, int muc, int so) {
        this.code = code;
        this.loai = loai;
        this.muc = muc;
        this.so = so;
    }

    public String getCode() {
        return code;
    }

    public String getLoai() {
        return loai;
    }

    public int getMuc() {
        return muc;
    }

    public int getSo() {
        return so;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setMuc(int muc) {
        this.muc = muc;
    }

    public void setSo(int so) {
        this.so = so;
    }
    
}
