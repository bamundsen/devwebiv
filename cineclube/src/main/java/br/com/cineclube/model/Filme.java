package br.com.cineclube.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long filmeId;
	
	@Past
	@NotNull(message = "Não pode estar vazio.")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate release;
	
	@NotNull
	private Category category;
	
	@NotNull(message = "Não pode estar vazio.")
	@Min(message = "Deve ser maior ou igual a 0.", value = 0)
	@Max(message = "Deve ser menor ou igual a 10.", value = 10)
	private BigDecimal score;
	
	@NotBlank(message = "Não pode estar vazio.")
	private String title;
	
	public Filme() {}
	
	public Filme (String title, LocalDate release, Category cat, BigDecimal score) {
		
		this.title = title;
		this.release = release;
		this.category = cat;
		this.score = score;
	}
	
	public Long getFilmeId() {
		return filmeId;
	}
	public void setFilmeId(Long filmeId) {
		this.filmeId = filmeId;
	}
	public LocalDate getRelease() {
		return release;
	}
	public void setRelease(LocalDate release) {
		this.release = release;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}
	
}
	
	
	