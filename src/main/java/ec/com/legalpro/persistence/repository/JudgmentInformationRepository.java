package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.JudgmentInformation;

public interface JudgmentInformationRepository extends JpaRepository<JudgmentInformation, Long>{

	public List<JudgmentInformation> findByJudgmentNumber(String judgmentNumber);
	public List<JudgmentInformation> findByJudicialLocker(String judicialLocker);
	public List<JudgmentInformation> findByElectronicLocker(String electronicLocker);
	
}
