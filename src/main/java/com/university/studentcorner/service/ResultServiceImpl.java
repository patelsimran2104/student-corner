package com.university.studentcorner.service;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Result;
import com.university.studentcorner.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultRepository resultRepository;

    /**
     * @param result object with values to save in database
     */
    @Override
    public void addResult(Result result) {
        resultRepository.save(result);
    }

    /**
     * @return List of all results.
     */
    @Override
    public List<Result> getAllResult() {
        return resultRepository.findAll();
    }

    /**
     * @param id to find User
     * @return Object of Result
     * @throws UserNotFoundException if user id does not exist
     */
    @Override
    public Result getResultByUserId(int id) throws UserNotFoundException {
        Optional<Result> optional = resultRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new UserNotFoundException();
        }
    }
}
