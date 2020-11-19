package pedro_bernardo_sanchez.atividadeAvaliativa2bi.mentor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MentorService {
    
    private MentorRepository repo;

    public void cadastrarMentor(String nome, int idade, int tempoMentorando) {
        
        repo.save(new Mentor(nome, idade, tempoMentorando));

    }

}
