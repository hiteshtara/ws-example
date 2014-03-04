package com.joemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.sap.document.sap.rfc.functions.BAPIRET2;
import com.sap.document.sap.rfc.functions.ZFIKCRMSPXWALK;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACE;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.GRANTMESSAGES;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.RETURN;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPXWALKT;
import com.sap.document.sap.rfc.functions.ZGRANTMESSAGES;

import edu.bu.sap.kcrm.SIKCRMPROCESSOUTBOUND;

public class SIKCRMPROCESSOUTBOUNDImpl implements SIKCRMPROCESSOUTBOUND {

	

	@SOAPBinding(parameterStyle = ParameterStyle.BARE)
	@WebResult(name = "Z_GM_KCRM_INTERFACE.Response", targetNamespace = "urn:sap-com:document:sap:rfc:functions", partName = "parameters")
	@WebMethod(operationName = "SI_KCRM_PROCESS_OUTBOUND", action = "http://sap.com/xi/WebService/soap1.1")
	public ZGMKCRMINTERFACEResponse siKCRMPROCESSOUTBOUND(
			ZGMKCRMINTERFACE parameters) {
		ZGMKCRMINTERFACEResponse t = new ZGMKCRMINTERFACEResponse();
		GRANTMESSAGES gmssege = new GRANTMESSAGES();
		List<ZGRANTMESSAGES> TT= gmssege.getItem();
		
		t.setGRANTMESSAGES(gmssege);
		SPXWALKT U= new SPXWALKT();
		  List<ZFIKCRMSPXWALK> k=U.getItem();
		List<ZFIKCRMSPXWALK> pp= new ArrayList<ZFIKCRMSPXWALK>();
		k.addAll(pp);
		t.setSPXWALKT(U);
		RETURN R= new RETURN();
		
		List<BAPIRET2> bap = R.getItem();
		List<BAPIRET2>kk=new ArrayList<BAPIRET2>();
		bap.addAll(kk);
		t.setRETURN(R);
		return t;
	}

}