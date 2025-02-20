package com.example.demo.controller;

import com.example.demo.entity.MessageReceipt;
import com.example.demo.service.MessageReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/receipts")
@RequiredArgsConstructor
public class MessageReceiptController {
    private final MessageReceiptService receiptService;

    @PostMapping
    public MessageReceipt createReceipt(@RequestBody MessageReceipt receipt) {
        return receiptService.createReceipt(receipt);
    }

    @GetMapping("/user/{userId}")
    public List<MessageReceipt> getReceiptsByUser(@PathVariable UUID userId) {
        return receiptService.getReceiptsByUser(userId);
    }
}