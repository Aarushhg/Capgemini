package com.cg.services;

import com.cg.dao.ITrainee;
import com.cg.dto.EntityMapper;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TraineeService implements ITraineeService {
    @Autowired
    private ITrainee repo;

    @Override
    public List<Trainee> getAll() {
        return repo.findAll();
    }

    @Override
    public TraineeDTO createTrainee(TraineeDTO t) {
        repo.save(EntityMapper.convertDtoToEntity(t));
        return t;
    }

    @Override
    public TraineeDTO getTraineeById(int tid) {
        Trainee t=repo.findById(tid).get();
        if (t!=null)
            return EntityMapper.convertEntityToDto(t);
        else
            return null;
    }

    @Override
    public String removeTrainee(int tid) {
        if (repo.findById(tid).isPresent()) {
            repo.deleteById(tid);
            return "Trainee deleted " + tid;
        }else
            return "No Such Trainee With id: "+tid;
    }

    @Override
    public TraineeDTO updateTrainee(TraineeDTO t) {
        Trainee existing = repo.findById(EntityMapper.convertDtoToEntity(t).getTraineeId()).orElse(null);
        if(existing != null) {
            Trainee te = EntityMapper.convertDtoToEntity(t);
            repo.saveAndFlush(te);
        }else{
            return null;
        }
        return t;
    }

    @Override
    public List<TraineeDTO> getTraineeByName(String name) {
        List<Trainee>trainee=repo.findByTraineeName(name);
        List<TraineeDTO> traineeDto=new ArrayList<TraineeDTO>();
        trainee.forEach(t->traineeDto.add(EntityMapper.convertEntityToDto(t)));
        return traineeDto;
    }
}