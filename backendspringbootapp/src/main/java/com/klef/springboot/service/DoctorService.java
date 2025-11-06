package com.klef.springboot.service;

import java.util.List;
import com.klef.springboot.model.Doctor;

public interface DoctorService
{
    public Doctor addDoctor(Doctor doctor);
    public List<Doctor> getAllDoctors();
    public Doctor getDoctorById(int id);
    public Doctor updateDoctor(Doctor doctor);
    public void deleteDoctorById(int id);
}
