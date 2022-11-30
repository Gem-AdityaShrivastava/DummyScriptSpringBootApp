package com.gemini.DummyScript.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gemini.DummyScript.entity.demo.tables.pojos.Language;
import com.gemini.DummyScript.service.LanguageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
public class LanguageController {

    private static final Logger log = LoggerFactory.getLogger(LanguageController.class);

    @Autowired
    LanguageService objectService;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping({"/Language/{Id}"})
        public ResponseEntity<com.gemini.DummyScript.model.Language> getLanguage(@PathVariable Integer Id) {
            com.gemini.DummyScript.model.Language result=objectMapper.convertValue(objectService.getLanguage(Id), com.gemini.DummyScript.model.Language.class);
            com.gemini.DummyScript.model.Language dummyBody = null;
                if(result!=null){
                    log.info("Data fetched successfully");
                    return new ResponseEntity<>(result, HttpStatus.OK);
                }
                else{
                     log.info("Data not found : {}",Id);
                     return new ResponseEntity<>(dummyBody, HttpStatus.NOT_FOUND);
                }
    }

    @PutMapping({"/Language/{Id}"})
    public ResponseEntity<Language> updateLanguage(@Valid @RequestBody Language body, @PathVariable Integer Id){
       Language dummyBody = null;
       body.setId(Id);
       int result=objectService.updateLanguage(body);
       if(result == 1){
                log.info("Updated successfully");
                return new ResponseEntity<>(body, HttpStatus.OK);
           }
           else{
                log.info("Data to be updated does not exist : {} ", body.getId());
                return new ResponseEntity<>(dummyBody, HttpStatus.NOT_FOUND);
           }
    }

    @PatchMapping({"/Language/{Id}"})
    public ResponseEntity<Language> patchUpdateLanguage(@Valid @RequestBody Language body, @PathVariable Integer Id){
       Language dummyBody = null;
       body.setId(Id);
       Language result=objectService.patchUpdateLanguage(body);
       if(result!=null){
                log.info("Updated successfully");
                return new ResponseEntity<>(body, HttpStatus.OK);
           }
           else{
                log.info("Data to be updated does not exist : {} ", body.getId());
                return new ResponseEntity<>(dummyBody, HttpStatus.NOT_FOUND);
           }
    }


    @PostMapping({"/Language"})
    public ResponseEntity<Language> addLanguage(@Valid @RequestBody Language body) {
        log.info("Record inserted successfully");
        return new ResponseEntity<>(objectService.addLanguage(body), HttpStatus.CREATED);
    }

    @DeleteMapping({"/Language/{Id}"})
    public ResponseEntity deleteLanguage(@PathVariable Integer Id) {
        int result=objectService.deleteLanguage(Id);
        if(result==1){
            log.info("Deleted successfully : {} ", Id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        }
        else{
            log.info("Data to be deleted does not exist : {} ", Id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data to be deleted does not exist");
        }
    }

}

