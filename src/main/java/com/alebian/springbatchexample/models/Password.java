package com.alebian.springbatchexample.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "passwords")
public class Password {
	@Id
	@NotNull
	@Column(name = "original")
	private String original;

	@Column(name = "md5", columnDefinition = "bpchar")
	private String md5;

	@Column(name = "sha1", columnDefinition = "bpchar")
	private String sha1;

	@Column(name = "sha256", columnDefinition = "bpchar")
	private String sha256;

	@Column(name = "sha512", columnDefinition = "bpchar")
	private String sha512;

	public Password() {
	}

	public Password(String original, String md5, String sha1, String sha256, String sha512) {
		this.original = original;
		this.md5 = md5;
		this.sha1 = sha1;
		this.sha256 = sha256;
		this.sha512 = sha512;
	}
}
