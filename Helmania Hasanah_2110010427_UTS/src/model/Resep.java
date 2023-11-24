/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tapin
 */
public class Resep {
    private int id;
    private String nama;
    private String bahan;
    private String caranya;

    public Resep(int id, String nama, String bahan, String caranya) {
        this.id = id;
        this.nama = nama;
        this.bahan = bahan;
        this.caranya = caranya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getCaranya() {
        return caranya;
    }

    public void setCaranya(String caranya) {
        this.caranya = caranya;
    }
    
}
