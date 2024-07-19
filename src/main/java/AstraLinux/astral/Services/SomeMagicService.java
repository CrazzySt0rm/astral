package AstraLinux.astral.Services;

import AstraLinux.astral.dto.SomeMagicDTO;
import AstraLinux.astral.models.SomeMagic;
import AstraLinux.astral.repositories.SomeMagicRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class SomeMagicService {

    private final SomeMagicRepository someMagicRepository;

    public SomeMagic createSomeMagic(SomeMagicDTO someMagicDTO) {
        return someMagicRepository.save(SomeMagic.builder()
                .special(someMagicDTO.getSpecial())
                .build());
    }

    public List<SomeMagic> readAllSomeMagic() {
        return someMagicRepository.findAll();
    }

    public SomeMagic updateSomeMagic(SomeMagic someMagic) {
        return someMagicRepository.save(someMagic);
    }

    public void deleteSomeMagic(Long id) {
        someMagicRepository.deleteById(id);
    }
}
