package peaksoft.jwtpracticeprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.CompanyResponse;
import peaksoft.jwtpracticeprojekt.entity.Company;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {

    public CompanyResponse viewCompany(Company company) {

        if (company == null) {
            return null;
        }
        CompanyResponse response = new CompanyResponse();
        if (company.getId() != null) {
            response.setId(Long.valueOf(company.getId()));
        }

        response.setCompanyName(company.getCompanyName());
        response.setCompanyName(company.getCompanyName());
        response.setLocatedCountry(company.getLocatedCountry());
        response.setCourses(company.getCourses());

        return response;
    }

    public List<CompanyResponse> viewCompanies(List<Company> companies){

        List<CompanyResponse> responses=new ArrayList<>();
        for (Company c:companies) {
            responses.add(viewCompany(c));

        }
        return responses;
    }
}
