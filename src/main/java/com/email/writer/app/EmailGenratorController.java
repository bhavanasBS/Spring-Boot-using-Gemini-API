package com.email.writer.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGenratorController {


    private final EmailGeneratorService emailGeneratorService;

    @GetMapping("/")
    public String home() {
        return "✅ Email Writer Backend is running successfully!";
    }
    @PostMapping("/generate")
    public ResponseEntity<String> GenrateEmail(@RequestBody EmailRequest emailRequest) {
        String response=emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
