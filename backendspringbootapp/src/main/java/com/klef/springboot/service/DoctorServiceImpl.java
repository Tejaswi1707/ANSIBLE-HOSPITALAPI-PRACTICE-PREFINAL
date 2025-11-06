package com.klef.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.springboot.model.Doctor;
import com.klef.springboot.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService
{
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor addDoctor(Doctor doctor) 
    {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() 
    {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(int id) 
    {
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) 
    {
        return doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctorById(int id) 
    {
        doctorRepository.deleteById(id);
    }
}
