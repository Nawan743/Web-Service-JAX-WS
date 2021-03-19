package com.nawan;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.nawan.ExemploService")
public class ExemploServiceImpl implements ExemploService {

	@WebMethod
	public int calcula(int id) {
		return id + 10;
	}

	@WebMethod
	public String nome() {
		return "Nawan Soares Novais";
	}

}
