package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.*;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.LightSequence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class frq5 {
    @PostMapping("/inviteMessage")
  
    //https://codingnconcepts.com/spring-boot/jackson-json-request-response-mapping/ --> Use seperate class to get params and use getter to access in Controller
    public String inviteMessage(@RequestBody InviteParams params,
                                Model model) {
        InvitationFRQ5 frq5_1;

        if (params.getHostName().equals("Host")){
            frq5_1 = new InvitationFRQ5(params.getAddress());
        }
        else {
            frq5_1 = new InvitationFRQ5(params.getHostName(), params.getAddress());
        }

        String message = frq5_1.invite(params.getAttendee());

        return message;
    }
}
