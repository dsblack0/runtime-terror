package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.*;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.LightSequence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class frq5 {
    @PostMapping("/inviteMessage")
    public String inviteMessage(@RequestParam(name="hostName", required = false, defaultValue = "Host") String hostName,
                                @RequestParam(name="address", required = false, defaultValue = "1234 Walnut Street") String address,
                                @RequestParam(name="attendee", required = false, defaultValue = "Cheryl") String attendee,
                                Model model) {
        InvitationFRQ5 frq5_1;
        if (hostName.equals("Host")){
            frq5_1 = new InvitationFRQ5(address);
        }
        else {
            frq5_1 = new InvitationFRQ5(hostName, address);
        }

        String message = frq5_1.invite(attendee);

        return message;
    }
}
