package peaksoft.jwtpracticeprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.jwtpracticeprojekt.dto.CompanyRequest;
import peaksoft.jwtpracticeprojekt.dto.CompanyResponse;
import peaksoft.jwtpracticeprojekt.service.CompanyService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService service;

    @PostMapping
    public CompanyResponse create(@RequestBody @Valid CompanyRequest companyRequest) {
        return service.create(companyRequest);

    }

    @PutMapping("{id}")
    public CompanyResponse update(@PathVariable Long id, @RequestBody CompanyRequest companyRequest) {
        return service.update(id, companyRequest);
    }

    @GetMapping("{id}")
    public CompanyResponse getById(@PathVariable Long id) {
        return service.getCompany(id);
    }

    @DeleteMapping("{id}")
    public CompanyResponse deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }
    @GetMapping("/all")
    public List<CompanyResponse> getAllCompany(){

        return service.getAllCompany();
    }

}
