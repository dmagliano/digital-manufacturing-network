package br.dev.magliano.digitalmanufacturingnetwork.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/workshop")
public class WorkshopController {

    @Autowired
    private WorkShopRepository workShopRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(WorkshopRequestDTO workshopInfo) {
        Workshop newWorkshop = workshopInfo.toEntity();
        workShopRepository.save(newWorkshop);
    }

}
