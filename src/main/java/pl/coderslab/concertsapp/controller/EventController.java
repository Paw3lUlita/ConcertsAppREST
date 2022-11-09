package pl.coderslab.concertsapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.concertsapp.entity.Band;
import pl.coderslab.concertsapp.entity.Club;
import pl.coderslab.concertsapp.entity.Event;
import pl.coderslab.concertsapp.entity.User;
import pl.coderslab.concertsapp.service.AskService;
import pl.coderslab.concertsapp.service.BandService;
import pl.coderslab.concertsapp.service.ClubService;
import pl.coderslab.concertsapp.service.EventService;

import javax.validation.Valid;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/event")
public class EventController {



}
