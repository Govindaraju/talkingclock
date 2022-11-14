package com.lbg.gk.talkingclock.controller;

import com.lbg.gk.talkingclock.model.TalkingClockResponse;
import com.lbg.gk.talkingclock.service.TalkingClockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class HumanFriendlyTimeRestController {

    @GetMapping(value = "/{input}")
    public TalkingClockResponse time(@PathVariable(value = "input") String input) {
        return TalkingClockService.pronounceTheTime(input);
    }

}
