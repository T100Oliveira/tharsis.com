package Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import Model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda ,Long> {
	


}
