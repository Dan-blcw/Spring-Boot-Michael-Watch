package com.alibou.security.controller;

import com.alibou.security.model.dto.Ob.ObDtos;
import com.alibou.security.model.dto.Ob.Test;
import com.alibou.security.model.dto.Message;
import com.alibou.security.service.ObService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
@RequiredArgsConstructor
public class AdminController {

    private final ObService service;

    @PostMapping("/add-ob")
    public ResponseEntity<?> save(
            @RequestBody ObDtos request
    ) {
        Boolean response = service.save(request);
        if(response){
//            return ResponseEntity.ok(Message.builder().message("Save Watch Successfully").status("200").build());
            return ResponseEntity.status(201).body(Message.builder().message("Save Watch Successfully").status(201).build());
        }else {
            return ResponseEntity.badRequest().body(Message.builder().message("This Watch already exist").status(400).build());
        }
    }

    @DeleteMapping("/delete-ob/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update-ob/{id}")
    public ResponseEntity<?> update(
            @PathVariable Integer id,
            @RequestBody Test request
    ) {
        service.update(id,request);
        return ResponseEntity.ok().build();
    }



//    @PostMapping
//    @PreAuthorize("hasAuthority('admin:create')")
//    @Hidden
//    public String post() {
//        return "POST:: admin controller";
//    }
//
//    @GetMapping
//    @PreAuthorize("hasAuthority('admin:read')")
//    public String get() {
//        return "GET:: admin controller";
//    }
//
//    @PutMapping
//    @PreAuthorize("hasAuthority('admin:update')")
//    @Hidden
//    public String put() {
//        return "PUT:: admin controller";
//    }
//    @DeleteMapping
//    @PreAuthorize("hasAuthority('admin:delete')")
//    @Hidden
//    public String delete() {
//        return "DELETE:: admin controller";
//    }
}
