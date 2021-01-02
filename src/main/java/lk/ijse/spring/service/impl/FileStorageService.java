package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.FileDB;
import lk.ijse.spring.repo.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public FileDB store(MultipartFile file) throws IOException {
        if (!fileDBRepository.existsByName(file.getName())) {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());

            return fileDBRepository.save(FileDB);
        } else {
            throw new RuntimeException("Image Already exist..!");
        }
    }


    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }

//    public FileDB getFilebyName(String name){
//        FileDB fileDB =fileDBRepository.findByName(name);
//
//
//    }
//    public String getIdByName(String name){
//        return fileDBRepository.getIdByName();
//    }

    public FileDB getFilebyName(String name){
        return fileDBRepository.getAllByName(name);
    }


}