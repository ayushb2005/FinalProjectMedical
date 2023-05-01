package com.medicalapi.medical;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class MedicalService {
    @Autowired
    MedicalRepository medicalRepository;
}
