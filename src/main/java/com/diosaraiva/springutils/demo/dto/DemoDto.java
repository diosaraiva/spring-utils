package com.diosaraiva.springutils.demo.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemoDto implements Serializable
{
	private static final long serialVersionUID = 1L;

	private long id;

	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime time;

	//landio-api
	private String test;
}