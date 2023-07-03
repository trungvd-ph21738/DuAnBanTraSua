/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_qlbantrasua.DomainModels;

/**
 *
 * @author TrungVD
 */
public class Size {
    private String id;
    private String ma;
    private String ten;
    private double gia;
    private int trangThai;

    public Size() {
    }

    public Size(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public Size(String id,String ma, String ten, double gia) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public Size(String id, String ma, String ten, double gia, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return ten;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Size){
            Size size = (Size) obj;
            if(this.id.equals(size.id)){
                return true;
            }
        }
        return false;
    }
    
    
}
