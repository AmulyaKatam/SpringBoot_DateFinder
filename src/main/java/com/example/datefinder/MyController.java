package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.*;

@RestController
public class MyController {
    @GetMapping("/")
    public String getDate(){
        LocalDate now = LocalDate.now();
        now = now.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = now.format(format1);
        return formattedDate;
    }
    
}
