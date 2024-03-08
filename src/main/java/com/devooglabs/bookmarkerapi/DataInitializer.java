package com.devooglabs.bookmarkerapi;

import com.devooglabs.bookmarkerapi.domain.Bookmark;
import com.devooglabs.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null,"DivoogLabs","https://www.devoog.com", Instant.now()));
        repository.save(new Bookmark(null,"SpringLabs","https://www.devoog.com/spring", Instant.now()));
        repository.save(new Bookmark(null,"QuarkusLabs","https://www.devoog.com/quarkus", Instant.now()));

        repository.save(new Bookmark(null,"DivoogLabs","https://www.devoog.com", Instant.now()));
        repository.save(new Bookmark(null,"SpringLabs","https://www.devoog.com/spring", Instant.now()));
        repository.save(new Bookmark(null,"QuarkusLabs","https://www.devoog.com/quarkus", Instant.now()));

        repository.save(new Bookmark(null,"DivoogLabs","https://www.devoog.com", Instant.now()));
        repository.save(new Bookmark(null,"SpringLabs","https://www.devoog.com/spring", Instant.now()));
        repository.save(new Bookmark(null,"QuarkusLabs","https://www.devoog.com/quarkus", Instant.now()));

        repository.save(new Bookmark(null,"DivoogLabs","https://www.devoog.com", Instant.now()));
        repository.save(new Bookmark(null,"SpringLabs","https://www.devoog.com/spring", Instant.now()));
        repository.save(new Bookmark(null,"QuarkusLabs","https://www.devoog.com/quarkus", Instant.now()));

        repository.save(new Bookmark(null,"DivoogLabs","https://www.devoog.com", Instant.now()));
        repository.save(new Bookmark(null,"SpringLabs","https://www.devoog.com/spring", Instant.now()));
        repository.save(new Bookmark(null,"QuarkusLabs","https://www.devoog.com/quarkus", Instant.now()));
    }
}
