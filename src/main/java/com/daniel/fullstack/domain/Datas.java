package com.daniel.fullstack.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static String getData() {
		DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		return dataFormat.format(agora);
	}

}
