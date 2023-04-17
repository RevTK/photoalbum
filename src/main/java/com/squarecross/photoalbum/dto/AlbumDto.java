package com.squarecross.photoalbum.dto;

import java.util.Date;

public class AlbumDto {
    Long albumId;
    String albumName;
    Date createdAt;
    int count;

    public AlbumDto() {
    }

    public AlbumDto(Long albumId, String albumName, Date createdAt, int count) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.createdAt = createdAt;
        this.count = count;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "AlbumDto{" +
                "albumId=" + albumId +
                ", albumName='" + albumName + '\'' +
                ", createdAt=" + createdAt +
                ", count=" + count +
                '}';
    }
}
