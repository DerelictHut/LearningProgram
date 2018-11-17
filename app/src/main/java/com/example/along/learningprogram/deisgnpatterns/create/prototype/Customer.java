package com.example.along.learningprogram.deisgnpatterns.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author $汪金龙$
 * @desc 客户类其中包含一个地址类Address
 * @date 2018/11/13 12:53
 */
public class Customer implements Cloneable, Serializable {
    private String mName;
    private Address mAddress;

    public Customer(String name, Address address) {
        mName = name;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(Address address) {
        mAddress = address;
    }

    @Override
    public String toString() {
        return "Customer [address=" + mAddress + ", name=" + mName + "]";
    }

    @Override
    public Customer clone() {
        Customer customer = null;
        try {
            customer = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return customer;
    }

    /**
     * 此代码为Address实现Cloneable接口的深克隆方式
     */
    public Customer deepClone() {
        Customer customer = null;
        try {
            customer = (Customer) super.clone();
            customer.mAddress = this.mAddress.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return customer;
    }

    /**
     * 对象的深度克隆，此处的对象涉及Collection接口和Map接口下对象的深度克隆
     * 利用序列化和反序列化的方式进行深度克隆对象
     * 下边的方法可以抽出为工具
     *
     * @param object 待克隆的对象
     * @param <T>    待克隆对象的数据类型
     * @return 已经深度克隆过的对象
     */
    public <T extends Serializable> T deepClone(T object) {
        T deepClone = null;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            deepClone = (T) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bais != null) {
                    bais.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return deepClone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.mName.equals(this.mName) &&
                    customer.mAddress.equals(this.mAddress);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * this.mName.hashCode();
        result += 31 * this.mAddress.hashCode();
        return result;
    }
}
