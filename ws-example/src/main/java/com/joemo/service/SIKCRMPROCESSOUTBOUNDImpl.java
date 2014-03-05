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
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPONSOREDPROGRAMSMESSAGES;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPONSORMESSAGES;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPXWALKT;
import com.sap.document.sap.rfc.functions.ZGRANTMESSAGES;
import com.sap.document.sap.rfc.functions.ZSPONSORMESSAGES;
import com.sap.document.sap.rfc.functions.ZSPPROGRAMMESSAGES;

import edu.bu.sap.kcrm.SIKCRMPROCESSOUTBOUND;

public class SIKCRMPROCESSOUTBOUNDImpl implements SIKCRMPROCESSOUTBOUND {

	@SOAPBinding(parameterStyle = ParameterStyle.BARE)
	@WebResult(name = "Z_GM_KCRM_INTERFACE.Response", targetNamespace = "urn:sap-com:document:sap:rfc:functions", partName = "parameters")
	@WebMethod(operationName = "SI_KCRM_PROCESS_OUTBOUND", action = "http://sap.com/xi/WebService/soap1.1")
	public ZGMKCRMINTERFACEResponse siKCRMPROCESSOUTBOUND(
			ZGMKCRMINTERFACE parameters) {
		ZGMKCRMINTERFACEResponse t = new ZGMKCRMINTERFACEResponse();
		GRANTMESSAGES gmssege = new GRANTMESSAGES();
		List<ZGRANTMESSAGES> TT = gmssege.getItem();

		t.setGRANTMESSAGES(gmssege);
		SPXWALKT U = new SPXWALKT();
		List<ZFIKCRMSPXWALK> k = U.getItem();
		List<ZFIKCRMSPXWALK> pp = new ArrayList<ZFIKCRMSPXWALK>();
		ZFIKCRMSPXWALK obj0= new ZFIKCRMSPXWALK();
		obj0.setFNDUNTDPTPRESUF("22222");
		obj0.setINTERNALORDER("999999");
		obj0.setSPONSOREDPROG("abcedef");
		obj0.setSPPROGRAMNUMBER("6666888");
		obj0.setTYPE("xxxxx");
		obj0.setZZREFERENCE("ZZZZZZ");
		pp.add(obj0);
		k.addAll(pp);
		t.setSPXWALKT(U);
		// add return
		RETURN R = new RETURN();

		List<BAPIRET2> bap = R.getItem();
		List<BAPIRET2> kk = new ArrayList<BAPIRET2>();
		BAPIRET2 bp2= new BAPIRET2();
		bp2.setFIELD("99");
		bp2.setID("6645636");
		bp2.setLOGMSGNO("bddjvn");
		bp2.setMESSAGE("program interfacing");
		kk.add(bp2);
		bap.addAll(kk);
		t.setRETURN(R);
		// ad sponsor program messages
		SPONSORMESSAGES sp = new SPONSORMESSAGES();
		List<ZSPONSORMESSAGES> ll = sp.getItem();
		List<ZSPONSORMESSAGES> ppp = new ArrayList<ZSPONSORMESSAGES>();
		ZSPONSORMESSAGES obj1= new ZSPONSORMESSAGES();
		obj1.setMESSAGE("testing sap Interface");
		obj1.setSPONSOR("BU");
		obj1.setTYPE("test");
		ppp.add(obj1);
		ll.addAll(ppp);
		t.setSPONSORMESSAGES(sp);
		// set sponsored program messages
		SPONSOREDPROGRAMSMESSAGES op = new SPONSOREDPROGRAMSMESSAGES();
		List<ZSPPROGRAMMESSAGES> st = op.getItem();
		List<ZSPPROGRAMMESSAGES> pppk = new ArrayList<ZSPPROGRAMMESSAGES>();
		ZSPPROGRAMMESSAGES obj5= new ZSPPROGRAMMESSAGES();
		obj5.setMESSAGE("pppp");
		obj5.setSPONSOREDPROG("6654");
		obj5.setTYPE("uuu");
		pppk.add(obj5);
		st.addAll(pppk);

		t.setSPONSOREDPROGRAMSMESSAGES(op);
		// now set grant messages
		GRANTMESSAGES gm = new GRANTMESSAGES();
		List<ZGRANTMESSAGES> SGM = gm.getItem();
		List<ZGRANTMESSAGES> SGMM = new ArrayList<ZGRANTMESSAGES>();
		ZGRANTMESSAGES obj2= new ZGRANTMESSAGES();
		obj2.setGRANTNBR("1234");
		obj2.setMESSAGE("testing sap award");
		obj2.setTYPE("test");
		SGM.addAll(SGMM);
		t.setGRANTMESSAGES(gm);

		return t;
	}

}