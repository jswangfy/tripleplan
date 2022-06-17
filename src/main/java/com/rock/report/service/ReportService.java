package com.rock.report.service;

import org.springframework.stereotype.Service;
import com.rock.report.entity.User;
import com.rock.report.repository.ReportRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;
    
    public void saveUser(User user) {
    	reportRepository.save(user);    	
    }
    
    public Iterable<User> findAll() {
    	return reportRepository.findAll();
    }
    
}
