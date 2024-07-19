package AstraLinux.astral.controllers;

import AstraLinux.astral.Services.MyWorldService;
import AstraLinux.astral.dto.MyWorldDTO;
import AstraLinux.astral.models.MyWorld;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class MyWorldController {

    private final MyWorldService myWorldService;

    @PostMapping("/world")
    public ResponseEntity createMW(@RequestBody MyWorldDTO myWorldDTO) {
        return new ResponseEntity<>(myWorldService.createMyWorld(myWorldDTO), HttpStatus.OK);
    }

    @GetMapping("/world")
    public ResponseEntity readAllW() {
        return new ResponseEntity<>(myWorldService.readAllWorld(), HttpStatus.OK);
    }

    @PutMapping("/world")
    public ResponseEntity updateMW(@RequestBody MyWorld myWorld) {
        return new ResponseEntity<>(myWorldService.updateMyWorld(myWorld), HttpStatus.OK);
    }

    @DeleteMapping("/world/{id}")
    public HttpStatus deleteMW(@PathVariable(value = "id") Long id) {
        myWorldService.deleteMyWorld(id);
        return HttpStatus.OK;
    }
}
