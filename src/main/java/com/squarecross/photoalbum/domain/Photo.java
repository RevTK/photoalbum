package com.squarecross.photoalbum.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "photo", schema = "photo_album", uniqueConstraints = {@UniqueConstraint(columnNames = "photo_id")})
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id", unique = true, nullable = false)
    private Long photoId;

    @Column(name = "file_name", unique = false, nullable = true)
    private String fileName;

    @Column(name = "file_size", unique = false, nullable = true)
    private int fileSize;

    @Column(name="original_url", unique = false, nullable = true)
    private String originalUrl;

    @Column(name="thumb_url", unique = false, nullable = true)
    private String thumbUrl;

    @Column(name="uploaded_at", unique = false, nullable = true)
    @CreationTimestamp
    private Date uploadedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="album_id")
    private Album album;

    public Photo() {
    }

    public Photo(Long photoId, String fileName, int fileSize, String originalUrl, String thumbUrl, Date uploadedAt, Album album) {
        this.photoId = photoId;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.originalUrl = originalUrl;
        this.thumbUrl = thumbUrl;
        this.uploadedAt = uploadedAt;
        this.album = album;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Date getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(Date uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoId=" + photoId +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", originalUrl='" + originalUrl + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", uploadedAt=" + uploadedAt +
                ", album=" + album +
                '}';
    }
}
