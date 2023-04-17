package com.squarecross.photoalbum.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository {
    int countByAlbum_AlbumId(Long AlbumId);
}
