package de.rnnyntn.femoja.rest.math.controller;

import de.rnnyntn.femoja.rest.math.dto.MathSheetDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathSheetController {

    @GetMapping(value="/mathsheet")
    public MathSheetDto getMathSheet() {
        return new MathSheetDto(1,"Hallo Welt");
    }
}
