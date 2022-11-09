package pl.coderslab.concertsapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.concertsapp.entity.Club;
import pl.coderslab.concertsapp.entity.User;
import pl.coderslab.concertsapp.service.ClubService;
import pl.coderslab.concertsapp.service.UserService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/club")
public class ClubController {

    private final ClubService clubService;
    private final UserService userService;

    @GetMapping("/all")
    public List<Club> getAllClubs(){
        return clubService.findAllClubs();
    }

    @GetMapping("/{clubId}")
    public Club getClubById(@PathVariable long clubId){
        return clubService.findClubById(clubId);
    }


    @PostMapping("/{userId}/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addClub(@RequestBody Club clubToSave, @PathVariable long userId){

        User user = userService.findById(userId);
        clubToSave.setUser(user);
        clubService.saveClub(clubToSave);

    }

    @DeleteMapping("/{clubId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClubById(@PathVariable long clubId){
        clubService.deleteClubById(clubId);
    }


}
