package com.belajarspringboot.entity;

public class Guru {
    private Long nip;
    private String name;
    private String kelamin;
    private String pass;
    private String walikelas;
    private String alamat;
    private String telepon;

    public Guru() {
    }

    public Guru(Long nip, String name, String kelamin, String pass, String walikelas, String alamat, String telepon) {
        this.nip = nip;
        this.name = name;
        this.kelamin = kelamin;
        this.pass = pass;
        this.walikelas = walikelas;
        this.alamat = alamat;
        this.telepon = telepon;
    }


    public Long getNip() {
        return this.nip;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKelamin() {
        return this.kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getWalikelas() {
        return this.walikelas;
    }

    public void setWalikelas(String walikelas) {
        this.walikelas = walikelas;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void add(Guru guru) {
    }
    
}
