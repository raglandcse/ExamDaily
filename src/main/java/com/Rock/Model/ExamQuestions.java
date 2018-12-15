package com.Rock.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Ragland
 *
 */

@Entity
@Table(name="ExamQuestions")
public class ExamQuestions  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/// This is for generate tempID manually using Category and  QuestionNo (when uploading)
	@Column
	private String tempID;
	
	// This is for generate questionID manually using Category and  id
	@Column
	private String questionID;
	
	@Column
	private String QuestionNo;
	
	@Column(columnDefinition = "TEXT")
	private String question;
	
	@Column(columnDefinition = "TEXT")
	private String optionA;
	
	@Column(columnDefinition = "TEXT")
	private String optionB;
	
	@Column(columnDefinition = "TEXT")
	private String optionC;
	
	@Column(columnDefinition = "TEXT")
	private String optionD;
	
	@OneToOne
	@JoinColumn(name = "anwserId")
	private ExamAnswer examAnswer;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate")
	private Date createdDate = new Date(System.currentTimeMillis());

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdatedDate")
	private Date updatedDate;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tempID
	 */
	public String getTempID() {
		return tempID;
	}

	/**
	 * @param tempID the tempID to set
	 */
	public void setTempID(String tempID) {
		this.tempID = tempID;
	}

	/**
	 * @return the questionID
	 */
	public String getQuestionID() {
		return questionID;
	}

	/**
	 * @param questionID the questionID to set
	 */
	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}

	/**
	 * @return the questionNo
	 */
	public String getQuestionNo() {
		return QuestionNo;
	}

	/**
	 * @param questionNo the questionNo to set
	 */
	public void setQuestionNo(String questionNo) {
		QuestionNo = questionNo;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the optionA
	 */
	public String getOptionA() {
		return optionA;
	}

	/**
	 * @param optionA the optionA to set
	 */
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	/**
	 * @return the optionB
	 */
	public String getOptionB() {
		return optionB;
	}

	/**
	 * @param optionB the optionB to set
	 */
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	/**
	 * @return the optionC
	 */
	public String getOptionC() {
		return optionC;
	}

	/**
	 * @param optionC the optionC to set
	 */
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	/**
	 * @return the optionD
	 */
	public String getOptionD() {
		return optionD;
	}

	/**
	 * @param optionD the optionD to set
	 */
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	/**
	 * @return the examAnswer
	 */
	public ExamAnswer getExamAnswer() {
		return examAnswer;
	}

	/**
	 * @param examAnswer the examAnswer to set
	 */
	public void setExamAnswer(ExamAnswer examAnswer) {
		this.examAnswer = examAnswer;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	
	
	
	

}
