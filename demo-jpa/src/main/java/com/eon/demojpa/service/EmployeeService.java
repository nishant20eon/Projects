package com.eon.demojpa.service;

import com.eon.demojpa.exception.EmployeeNotFoundException;
import com.eon.demojpa.model.CreateEmployeeRequest;
import com.eon.demojpa.model.Employee;
import com.eon.demojpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public void createEmployee(CreateEmployeeRequest createEmployeeRequest) {
/*        Employee employee = createEmployeeRequest.to();
//        We will get user info from createEmployeeRequest only
//        save() - To save employee details in database
//        our moto here to save data so, no need to return anything so, return type will be void
          employeeRepository.save(employee);
*/

        Employee employee= createEmployeeRequest.to();

        if(employee.getAge()==null)
        {
            Integer age= calculateAgeFromDOB(employee.getDob());
            employee.setAge(age);
        }

//            this time we are not generating ID auto in Employee class so,
//            for now we just create random ID
        employee.setId(new Random().nextInt());

        employeeRepository.save(employee);
    }

    private Integer calculateAgeFromDOB(String dob)
    {
        if(dob==null){
            return null;
        }

        LocalDate dobDate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();

        return Period.between(dobDate, currentDate).getYears();
    }

//    To get Emp details using ID
    public Employee getEmployee(int id) throws EmployeeNotFoundException {
//        1st Way
//          Optional<Employee> employeeOptional = employeeRepository.findById(id);
//              if(employeeOptional.isPresent())
//              return employeeOptional.get();

//        2nd Way
//         Employee employee = employeeRepository.findById(id).orElse(null);
//         return employee;
//            If we want to throw our customize exception
//        3rd way
            return employeeRepository.findById(id).orElseThrow(()->
        new EmployeeNotFoundException("Employee with ID"+id+" Not Found"));


    }

    public List<Employee> getAllEmployee() {

        List<Employee> AllEmpDetails = employeeRepository.findAll();
        return AllEmpDetails;

    }
}
