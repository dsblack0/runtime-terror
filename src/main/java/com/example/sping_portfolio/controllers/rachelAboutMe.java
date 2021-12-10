package com.example.sping_portfolio.controllers;
import lombok.Getter;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class rachelAboutMe {

    @GetMapping("/rachelAbout")

    public String rachelAbout(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://numbersapi.p.rapidapi.com/6/21/date?fragment=true&json=true"))
                .header("x-rapidapi-host", "numbersapi.p.rapidapi.com")
                .header("x-rapidapi-key", "9a16ccee4amsh053f92cf2a5be5ep1bc6d6jsna65e7be00215")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        var data = new ObjectMapper().readValue(response.body(), HashMap.class);
        model.addAttribute("data", data);
        model.addAttribute("text", data.get("text"));
        model.addAttribute("year", data.get("year"));
        model.addAttribute("number", data.get("number"));
        model.addAttribute("found", data.get("found"));
        model.addAttribute("type", data.get("date"));
        model.addAttribute("name", name);

        return "Pages/aboutMePages/rachelAbout";

    }
}