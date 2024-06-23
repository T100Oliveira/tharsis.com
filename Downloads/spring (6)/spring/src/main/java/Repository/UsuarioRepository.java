package Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Model.Usuario;






@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {

}
