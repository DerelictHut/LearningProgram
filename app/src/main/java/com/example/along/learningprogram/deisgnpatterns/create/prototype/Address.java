package com.example.along.learningprogram.deisgnpatterns.create.prototype;

import java.io.Serializable;

/**
 * @author $汪金龙$
 * @desc 地址类
 * @date 2018/11/13 12:54
 */
public class Address implements Cloneable, Serializable {
    /**
     * 国家
     */
    private String mCountry;
    /**
     * 省
     */
    private String mProvince;
    /**
     * 市
     */
    private String mCity;

    public Address(String country, String province, String city) {
        mCountry = country;
        mProvince = province;
        mCity = city;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getProvince() {
        return mProvince;
    }

    public void setProvince(String province) {
        mProvince = province;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    @Override
    public String toString() {
        return "Address [city=" + mCity + ", country=" + mCountry + ", province="
                + mProvince + "]";
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return address.mCountry.equals(this.mCountry) &&
                    address.mProvince.equals(this.mProvince) &&
                    address.mCity.equals(this.mCity);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * mCountry.hashCode();
        result += 31 * mProvince.hashCode();
        result += 31 * mCity.hashCode();
        return result;
    }
}
