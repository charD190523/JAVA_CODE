 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Sach implements Serializable{
    private int ma;
    private String ten, tgia, cn;
    private int sluong;
    private static int sma = 10000;

    public Sach(int ma, String ten, String tgia, String cn, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tgia = tgia;
        this.cn = cn;
        this.sluong = sluong;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTgia() {
        return tgia;
    }

    public String getCn() {
        return cn;
    }

    public int getSluong() {
        return sluong;
    }

    public static int getSma() {
        return sma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object [] toObjects () {
        return new Object[] {
            ma, ten, tgia, cn, sluong
        };
    }
}
