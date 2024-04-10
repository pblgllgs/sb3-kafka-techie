package com.pblgllgs.controller;
/*
 *
 * @author pblgl
 * Created on 10-04-2024
 *
 */

import com.pblgllgs.dto.User;
import com.pblgllgs.publisher.KafkaMessagePublisher;
import com.pblgllgs.util.CsvReaderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;


    @PostMapping("/publishNew")
    public ResponseEntity<?> publishEvent(@RequestBody User user) {
        try {
            List<User> users = CsvReaderUtils.readDataFromCsv();
            users.forEach(usr -> publisher.sendEvents(usr));
            return ResponseEntity.ok("Message published successfully");
        } catch (Exception exception) {
            return ResponseEntity.
                    status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
}