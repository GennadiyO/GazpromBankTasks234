package com.gazprombank.task4;

public class Valute {
    private String id;
    private int numCode;
    private String charCode;
    private int nominal;
    private String name;
    private String value;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getNumCode() {
        return numCode;
    }
    public void setNumCode(int numCode) {
        this.numCode = numCode;
    }
    public String getCharCode() {
        return charCode;
    }
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }
    public int getNominal() {
        return nominal;
    }
    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Valute(String id, int numCode, String charCode, int nominal, String name, String value) {
        this.id = id;
        this.numCode = numCode;
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
    }
}
