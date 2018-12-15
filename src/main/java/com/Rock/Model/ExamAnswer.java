package com.Rock.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Ragland
 *
 */

@Entity
@Table(name = "ExamAnswer")
public class ExamAnswer  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// This is for generate tempID manually using Category and  QuestionNo (when uploading)
	@Column
	private String tempID;

	
	// This is for generate anwserId  manually using Category and  id
	@Column
	private String anwserId;

	@Column
	private String QuestionNo;
	
	@Column(columnDefinition = "TEXT")
	private String correctAnswer;

	@Column(columnDefinition = "TEXT")
	private String explanation;

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
	 * @return the anwserId
	 */
	public String getAnwserId() {
		return anwserId;
	}

	/**
	 * @param anwserId the anwserId to set
	 */
	public void setAnwserId(String anwserId) {
		this.anwserId = anwserId;
	}

	/**
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	/**
	 * @param correctAnswer the correctAnswer to set
	 */
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	/**
	 * @return the explanation
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * @param explanation the explanation to set
	 */
	public void setExplanation(String explanation) {
		this.explanation = explanation;
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
