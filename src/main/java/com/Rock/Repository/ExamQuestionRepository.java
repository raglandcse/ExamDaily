package com.Rock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Rock.Model.ExamAnswer;

/**
 *
 * @author Ragland
 *
 */

@Repository
public interface ExamAnswerRepository extends JpaRepository<ExamAnswer, String> {

//	@Query("select anwserNo from ExamAnswer u where u.anwserId= ?1")
//	String getAllQuestionByanwserId(final String anwserId);

	
}
