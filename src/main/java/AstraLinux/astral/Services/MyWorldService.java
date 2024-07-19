package AstraLinux.astral.Services;

import AstraLinux.astral.dto.MyWorldDTO;
import AstraLinux.astral.models.MyWorld;
import AstraLinux.astral.repositories.MyWorldRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class MyWorldService {

    private final MyWorldRepository myWorldRepository;

    public MyWorld createMyWorld(MyWorldDTO myWorldDTO) {
        return myWorldRepository.save(MyWorld.builder()
                .name(myWorldDTO.getName())
                .build());
    }

    public List<MyWorld> readAllWorld() {
        return myWorldRepository.findAll();
    }

    public MyWorld updateMyWorld(MyWorld myWorld) {
        return myWorldRepository.save(myWorld);
    }

    public void deleteMyWorld(Long id) {
        myWorldRepository.deleteById(id);

    }
}
