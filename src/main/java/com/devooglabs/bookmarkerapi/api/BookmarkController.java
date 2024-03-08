package com.devooglabs.bookmarkerapi.api;

import com.devooglabs.bookmarkerapi.domain.Bookmark;
import com.devooglabs.bookmarkerapi.domain.BookmarkDTO;
import com.devooglabs.bookmarkerapi.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarkDTO getBookmarks(@RequestParam(name = "page",defaultValue = "0") Integer page){
        return bookmarkService.getBookmarks(page);
    }
}
