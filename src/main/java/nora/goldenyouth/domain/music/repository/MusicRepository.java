package nora.goldenyouth.domain.music.repository;

import nora.goldenyouth.domain.music.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MusicRepository extends JpaRepository<Music, Long> {
    Optional<Music> findById(Long id);
}
