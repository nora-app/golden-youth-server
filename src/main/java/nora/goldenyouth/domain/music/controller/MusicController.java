package nora.goldenyouth.domain.music.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nora.goldenyouth.domain.music.service.MusicService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1/music")
public class MusicController {
    private final MusicService musicService;

    /**
     * 음악 등록
     */

}
