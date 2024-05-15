package nora.goldenyouth.domain.music.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nora.goldenyouth.domain.music.repository.MusicRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class MusicService {
    private final MusicRepository musicRepository;

    /**
     * 음악 등록
     */

    /**
     * 음악 목록 조회
     */

    /**
     * 음악 한 개 조회
     */
}
