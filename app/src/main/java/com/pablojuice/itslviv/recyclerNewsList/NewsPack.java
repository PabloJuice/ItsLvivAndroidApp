package com.pablojuice.itslviv.recyclerNewsList;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

public class NewsPack implements Parcelable {

    private long id;
    private String imgSource;
    private String header;
    private String address;
    private String mark;
    private String info;
    private double mapX;
    private double mapY;

    public NewsPack() {

    }

    public NewsPack(String imgSource, String header, String address, String mark, String info, double mapX, double mapY) {
        this.imgSource = imgSource;
        this.header = header;
        this.address = address;
        this.mark = mark;
        this.info = info;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    protected NewsPack(Parcel in) {
        id = in.readLong();
        imgSource = in.readString();
        header = in.readString();
        address = in.readString();
        mark = in.readString();
        info = in.readString();
        mapX = in.readDouble();
        mapY = in.readDouble();

    }

    public static final Creator<NewsPack> CREATOR = new Creator<NewsPack>() {
        @Override
        public NewsPack createFromParcel(Parcel in) {
            return new NewsPack(in);
        }

        @Override
        public NewsPack[] newArray(int size) {
            return new NewsPack[size];
        }
    };

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getImgSource() {
        return imgSource;
    }
    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public double getMapX() {
        return mapX;
    }
    public void setMapX(double mapX) {
        this.mapX = mapX;
    }

    public double getMapY() {
        return mapY;
    }
    public void setMapY(double mapY) {
        this.mapY = mapY;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(imgSource);
        dest.writeString(header);
        dest.writeString(address);
        dest.writeString(mark);
        dest.writeString(info);
        dest.writeDouble(mapX);
        dest.writeDouble(mapY);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, imgSource, header, address, mark, info, mapX, mapY);
    }



}
