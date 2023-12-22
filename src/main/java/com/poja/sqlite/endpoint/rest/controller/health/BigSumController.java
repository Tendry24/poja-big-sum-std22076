package com.poja.sqlite.endpoint.rest.controller.health;

import com.poja.sqlite.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@PojaGenerated
@RestController
@AllArgsConstructor
@RequestMapping("/big-sum")
public class BigSumController {

    @GetMapping
    public BigInteger bigSum(@RequestParam("a") String a, @RequestParam("b") String b) {

        BigInteger operandA = new BigInteger(a);
        BigInteger operandB = new BigInteger(b);

        BigInteger result = operandA.add(operandB);

        return result;
    }
}
