package com.devooglabs.bookmarkerapi.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;

    @ReadOnlyProperty
    public BookmarkDTO getBookmarks(Integer page){
        int pageNo = page < 1 ? 0 : page -1 ;
        Pageable pageable= PageRequest.of(pageNo,10, Sort.Direction.DESC,"createdAt");
        return new BookmarkDTO(repository.findAll(pageable)) ;
    }
}
