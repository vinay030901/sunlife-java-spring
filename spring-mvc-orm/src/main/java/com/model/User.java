package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@ApiModel(description = "Details about user")
public class User {

	@Id
	@GeneratedValue
	@ApiModelProperty("ID must be unique")
	private int uid;
	private String username;
	private String email;
	private String password;
	private String city;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
}
