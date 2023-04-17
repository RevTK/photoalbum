package com.squarecross.photoalbum.repository;

import com.squarecross.photoalbum.domain.Album;
import com.squarecross.photoalbum.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    //앨범명으로 앨범 목록을 조회
    List<Album> findByAlbumName(String name);
    //Album 내 Photo 중 입력된 파일명을 가지고있는 앨범 리스트 추출
    List<Photo> findByPhoto_FileName(String name);
}
