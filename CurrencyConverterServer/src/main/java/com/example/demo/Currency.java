package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Currency {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "date")
	private String date;
	@Column(name = "AUD")
	private String AUD;
	@Column(name = "ATS")
	private String ATS;
	@Column(name = "GBP")
	private String GBP;
	@Column(name = "BEF")
	private String BEF;
	@Column(name = "NLG")
	private String NLG;
	@Column(name = "DEM")
	private String DEM;

	@Column(name = "DKK")
	private String DKK;
	@Column(name = "ITL")
	private String ITL;
	@Column(name = "CAD")
	private String CAD;
	@Column(name = "NOK")
	private String NOK;

	@Column(name = "USD")
	private String USD;
	@Column(name = "FIM")
	private String FIM;

	@Column(name = "FRF")
	private String FRF;
	@Column(name = "SEK")
	private String SEK;
	@Column(name = "CHF")
	private String CHF;

	@Column(name = "JPY")
	private String JPY;
	@Column(name = "XEU")
	private String XEU;
	@Column(name = "ESP")
	private String ESP;
	@Column(name = "GRD")
	private String GRD;
	@Column(name = "IEP")
	private String IEP;
	@Column(name = "ISK")
	private String ISK;
	@Column(name = "KWD")
	private String KWD;
	@Column(name = "LBP")
	private String LBP;
	@Column(name = "PTE")
	private String PTE;
	@Column(name = "SGD")
	private String SGD;
	@Column(name = "TRL")
	private String TRL;
	@Column(name = "ХDR")
	private String ХDR;
	@Column(name = "LVL")
	private String LVL;
	@Column(name = "EEK")
	private String EEK;
	@Column(name = "LTL")
	private String LTL;
	@Column(name = "UAK")
	private String UAK;
	@Column(name = "RUR")
	private String RUR;
	@Column(name = "KZT")
	private String KZT;
	@Column(name = "MDL")
	private String MDL;
	@Column(name = "BYR")
	private String BYR;
	@Column(name = "UZS")
	private String UZS;
	@Column(name = "TJR")
	private String TJR;
	@Column(name = "TMM")
	private String TMM;
	
	public Currency() {
		super();
	}

	public Currency( String date, String aUD, String aTS, String gBP, String bEF, String nLG, String dEM,
			String dKK, String iTL, String cAD, String nOK, String uSD, String fIM, String fRF, String sEK, String cHF,
			String jPY, String xEU, String eSP, String gRD, String iEP, String iSK, String kWD, String lBP, String pTE,
			String sGD, String tRL, String хDR, String lVL, String eEK, String lTL, String uAK, String rUR, String kZT,
			String mDL, String bYR, String uZS, String tJR, String tMM) {
		super();
		this.date = date;
		AUD = aUD;
		ATS = aTS;
		GBP = gBP;
		BEF = bEF;
		NLG = nLG;
		DEM = dEM;
		DKK = dKK;
		ITL = iTL;
		CAD = cAD;
		NOK = nOK;
		USD = uSD;
		FIM = fIM;
		FRF = fRF;
		SEK = sEK;
		CHF = cHF;
		JPY = jPY;
		XEU = xEU;
		ESP = eSP;
		GRD = gRD;
		IEP = iEP;
		ISK = iSK;
		KWD = kWD;
		LBP = lBP;
		PTE = pTE;
		SGD = sGD;
		TRL = tRL;
		ХDR = хDR;
		LVL = lVL;
		EEK = eEK;
		LTL = lTL;
		UAK = uAK;
		RUR = rUR;
		KZT = kZT;
		MDL = mDL;
		BYR = bYR;
		UZS = uZS;
		TJR = tJR;
		TMM = tMM;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAUD() {
		return AUD;
	}

	public void setAUD(String aUD) {
		AUD = aUD;
	}

	public String getATS() {
		return ATS;
	}

	public void setATS(String aTS) {
		ATS = aTS;
	}

	public String getGBP() {
		return GBP;
	}

	public void setGBP(String gBP) {
		GBP = gBP;
	}

	public String getBEF() {
		return BEF;
	}

	public void setBEF(String bEF) {
		BEF = bEF;
	}

	public String getNLG() {
		return NLG;
	}

	public void setNLG(String nLG) {
		NLG = nLG;
	}

	public String getDEM() {
		return DEM;
	}

	public void setDEM(String dEM) {
		DEM = dEM;
	}

	public String getDKK() {
		return DKK;
	}

	public void setDKK(String dKK) {
		DKK = dKK;
	}

	public String getITL() {
		return ITL;
	}

	public void setITL(String iTL) {
		ITL = iTL;
	}

	public String getCAD() {
		return CAD;
	}

	public void setCAD(String cAD) {
		CAD = cAD;
	}

	public String getNOK() {
		return NOK;
	}

	public void setNOK(String nOK) {
		NOK = nOK;
	}

	public String getUSD() {
		return USD;
	}

	public void setUSD(String uSD) {
		USD = uSD;
	}

	public String getFIM() {
		return FIM;
	}

	public void setFIM(String fIM) {
		FIM = fIM;
	}

	public String getFRF() {
		return FRF;
	}

	public void setFRF(String fRF) {
		FRF = fRF;
	}

	public String getSEK() {
		return SEK;
	}

	public void setSEK(String sEK) {
		SEK = sEK;
	}

	public String getCHF() {
		return CHF;
	}

	public void setCHF(String cHF) {
		CHF = cHF;
	}

	public String getJPY() {
		return JPY;
	}

	public void setJPY(String jPY) {
		JPY = jPY;
	}

	public String getXEU() {
		return XEU;
	}

	public void setXEU(String xEU) {
		XEU = xEU;
	}

	public String getESP() {
		return ESP;
	}

	public void setESP(String eSP) {
		ESP = eSP;
	}

	public String getGRD() {
		return GRD;
	}

	public void setGRD(String gRD) {
		GRD = gRD;
	}

	public String getIEP() {
		return IEP;
	}

	public void setIEP(String iEP) {
		IEP = iEP;
	}

	public String getISK() {
		return ISK;
	}

	public void setISK(String iSK) {
		ISK = iSK;
	}

	public String getKWD() {
		return KWD;
	}

	public void setKWD(String kWD) {
		KWD = kWD;
	}

	public String getLBP() {
		return LBP;
	}

	public void setLBP(String lBP) {
		LBP = lBP;
	}

	public String getPTE() {
		return PTE;
	}

	public void setPTE(String pTE) {
		PTE = pTE;
	}

	public String getSGD() {
		return SGD;
	}

	public void setSGD(String sGD) {
		SGD = sGD;
	}

	public String getTRL() {
		return TRL;
	}

	public void setTRL(String tRL) {
		TRL = tRL;
	}

	public String getХDR() {
		return ХDR;
	}

	public void setХDR(String хDR) {
		ХDR = хDR;
	}

	public String getLVL() {
		return LVL;
	}

	public void setLVL(String lVL) {
		LVL = lVL;
	}

	public String getEEK() {
		return EEK;
	}

	public void setEEK(String eEK) {
		EEK = eEK;
	}

	public String getLTL() {
		return LTL;
	}

	public void setLTL(String lTL) {
		LTL = lTL;
	}

	public String getUAK() {
		return UAK;
	}

	public void setUAK(String uAK) {
		UAK = uAK;
	}

	public String getRUR() {
		return RUR;
	}

	public void setRUR(String rUR) {
		RUR = rUR;
	}

	public String getKZT() {
		return KZT;
	}

	public void setKZT(String kZT) {
		KZT = kZT;
	}

	public String getMDL() {
		return MDL;
	}

	public void setMDL(String mDL) {
		MDL = mDL;
	}

	public String getBYR() {
		return BYR;
	}

	public void setBYR(String bYR) {
		BYR = bYR;
	}

	public String getUZS() {
		return UZS;
	}

	public void setUZS(String uZS) {
		UZS = uZS;
	}

	public String getTJR() {
		return TJR;
	}

	public void setTJR(String tJR) {
		TJR = tJR;
	}

	public String getTMM() {
		return TMM;
	}

	public void setTMM(String tMM) {
		TMM = tMM;
	}
	
	
	
	


	
	
}
