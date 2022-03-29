package peaksoft.jwtpracticeprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.jwtpracticeprojekt.dto.CompanyRequest;
import peaksoft.jwtpracticeprojekt.dto.CompanyResponse;
import peaksoft.jwtpracticeprojekt.entity.Company;
import peaksoft.jwtpracticeprojekt.mapper.CompanyEditMapper;
import peaksoft.jwtpracticeprojekt.mapper.CompanyViewMapper;
import peaksoft.jwtpracticeprojekt.repository.CompanyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyViewMapper viewMapper;
    private final CompanyRepository repository;
    private final CompanyEditMapper editMapper;


    public CompanyResponse create(CompanyRequest companyRequest){
        return viewMapper.viewCompany(repository.
                save(editMapper.create(companyRequest)));
    }

    public CompanyResponse update(Long id,CompanyRequest companyRequest){
        Company company=repository.findById(id).get();
        editMapper.update(company,companyRequest);
        return viewMapper.viewCompany(repository.save(company));

    }

    public  CompanyResponse getCompany(long id){
        return viewMapper.viewCompany(repository.findById(id).get());
    }

    public CompanyResponse deleteById(long id){
        Company company=repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCompany(company);
    }

    public List<CompanyResponse> getAllCompany(){
        return viewMapper.viewCompanies(repository.findAll());
    }
}
