package com.example.alticciapi.Resource;

import com.example.alticciapi.Service.IService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/alticci")
public class Resource {

    @Autowired
    IService iService;

    @GetMapping(value = "/{index}")
    @ApiOperation(value = "Returns Alticci Sequenci", response = Long.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity<Long> alticciSequence(@PathVariable(value = "index") Long index) {

        return ResponseEntity.ok().body(iService.alticciSequence(index));
    }
}
