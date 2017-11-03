package com.finley.util.ip;

public class IPEntry {
    public String beginIp;
    public String endIp;
    public String country;
    public String area;
    public IPEntry() {
        beginIp = endIp = country = area = "";
    }
    public String toString() {
        return this.area + " " + this.country + " IP:" + this.beginIp + "-" + this.endIp;
    }
}