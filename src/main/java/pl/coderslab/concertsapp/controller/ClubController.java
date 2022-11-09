package pl.coderslab.concertsapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.concertsapp.entity.Club;
import pl.coderslab.concertsapp.service.ClubService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/club")
public class ClubController {

    private final ClubService clubService;

    @GetMapping("/all")
    public List<Club> getAllClubs(){
        return clubService.findAllClubs();
    }


}
