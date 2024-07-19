package AstraLinux.astral.controllers;

import AstraLinux.astral.Services.SomeMagicService;
import AstraLinux.astral.dto.SomeMagicDTO;
import AstraLinux.astral.models.SomeMagic;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class SomeMagicController {

    private final SomeMagicService someMagicService;

    @PostMapping("/magic")
    public ResponseEntity createSomeMagic(@RequestBody SomeMagicDTO someMagicDTO) {
        return new ResponseEntity<>(someMagicService.createSomeMagic(someMagicDTO), HttpStatus.OK);
    }

    @GetMapping("/magic")
    public ResponseEntity readAllMagic() {
        return new ResponseEntity<>(someMagicService.readAllSomeMagic(), HttpStatus.OK);
    }

    @PutMapping("/magic")
    public ResponseEntity updateSomeM(@RequestBody SomeMagic someMagic) {
        return new ResponseEntity<>(someMagicService.updateSomeMagic(someMagic), HttpStatus.OK);
    }

    @DeleteMapping("/magic/{id}")
    public HttpStatus deleteSomeM(@PathVariable(value = "id") Long id) {
        someMagicService.deleteSomeMagic(id);
        return HttpStatus.OK;
    }

}
