package com.BBI.project.model;

import jakarta.persistence.*;

@Entity
@Table(name ="Top3Kat")
public class ViewSales {
    @Id
    @Column(name = "row_id")
    private Integer id;

    @Column(name = "kategori_barang")
    private String kategoriBarang;

    @Column(name = "jml_barang")
    private Integer jmlBarang;

    @Column(name = "total_harga_terjual")
    private Float totalHargaTerjual;

    public ViewSales() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    public Integer getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(Integer jmlBarang) {
        this.jmlBarang = jmlBarang;
    }

    public Float getTotalHargaTerjual() {
        return totalHargaTerjual;
    }

    public void setTotalHargaTerjual(Float totalHargaTerjual) {
        this.totalHargaTerjual = totalHargaTerjual;
    }
}
