package com.belajarspringboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.belajarspringboot.entity.Guru;

@Service
public class GuruService {
    
    private static List<Guru> guruu = new ArrayList<Guru>(){
        {
            add(new Guru(19800000002L, "Haryanto", "L", "haryanto", "XI Bahasa 1", "Bogor"," 021-55555"));
            add(new Guru(19800000003L, "Bowo Prakorso", "L","bowo", "XII Bahasa 2", "Jakarta", "021-54444"));
            add(new Guru(198002017051007L, "Haryono,Spd", "L", "haryono", "XI IPA 1", "Ds Cimanggis 006/005 Bojonggede-Bogor", "021-444556"));
            add(new Guru(19800201800007L, "Lidyawati,Spd", "P","lidyawati", "XI IPS 1", "Ds Cimanggis 006/005 Bojonggede-Bogor", "021-777667"));
           
        }
    };

    public List<Guru> findAlList(){
        return guruu;
    }

    public void addGuru(Guru guru) {
        guruu.add(guru);
    }

    public void deleteById(long nip){
        guruu.removeIf(p -> p.getNip() == nip);
    }

    public Optional<Guru> findByID(long nip){
        return guruu.stream().filter(p -> p.getNip() == nip).findFirst();
    }

    public void updateGuru(Guru guru){
        deleteById(guru.getNip());
        guruu.add(guru);
    }

}
