package ma.lydec.client.releve.entities;

/**
 * @author Sidoine BOSSO, Ingenieur étude et réalisation DSI/Développement,
 *         Lyonnaise des eaux de Casablanca, bossosidoine@yahoo.fr
 */
public class PdaTournee {
	private Long _id;
	private String frnCod;
	private String polNum;
	private String polEtat;
	private Integer cliId;
	private Integer locId;
	private String cliNom;
	private String cptNum;
	private String adrCons;
	private String numGsm;
	private Integer refSec;
	private Integer refTrn;
	private Integer refOrd;
	private String locIdg;
	private String polTypc;
	private String cptFils;
	private String cptTens;
	private String cptAmp;
	private Integer cptCal=0;
	private Integer cptSys=0;
	private String typeBr;
	private String empCpt;
	private String cptRoue;
	private String cptCoef;
	private String plombe;
	private String marque;
	private String rlvProd;
	private Integer refTournee;
	private Integer refFolio;
	private Integer nvFolio;
	private String rlvADate;
	private String rlvNDate1;
	private String rlvNDate2;
	private Integer rlvAIdx;
	private Integer rlvNIdx1;
	private Integer rlvNIdx2;
	private Integer rlvCons1;
	private Integer rlvCons2;
	private String refAbs;
	private String rlvObs;
	private String rlvECpt;
	private String rlvAnoc;
	private String rlvCode;
	private Integer consNa1;
	private Integer consN1a1;
	private Integer consM1;
	private Integer consM2;
	private Integer consMoy;
	private String rlvTypc;
	private String puit;
	private Integer nbrAbs;
	private Integer matrRlv;
	private Integer matrResp;
	private String fraude;
	private String cptCoupe;
	private String datePose;
	private Integer nvClient;
	private Integer numCycle;
	private Integer cdRelecture;
	private Integer longitude;
	private Integer latitude;
	private Integer nbrCompteur;
	private String polUsag;
	// MEKTOUBI RR
	private int rap;
	private int fraudeInt;
	// MEKTOUBI GCRF
	private int numFlux;
	private int facNum;
	private int relecture=0;

	/** Données ajoutée pour la gestion des fenetre - subActivity */
	private String positionIndex;
	private String positionRoue;
	private String positionAno;
	private Boolean isCloture;

	/***/
	private Boolean isImageCompteur = false;

	public PdaTournee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PdaTournee(String frnCod, Integer cliId, String cliNom, String cptNum, Integer refTournee) {



		this.frnCod = frnCod;///

		this.cliId = cliId;

		this.cliNom = cliNom;

		this.refTournee = refTournee;

		this.nbrCompteur = nbrCompteur;
		this.cptNum=cptNum;

	}


	public Boolean getCloture() {
		return isCloture;
	}

	public void setCloture(Boolean cloture) {
		isCloture = cloture;
	}

	public Boolean getImageCompteur() {
		return isImageCompteur;
	}

	public void setImageCompteur(Boolean imageCompteur) {
		isImageCompteur = imageCompteur;
	}

	public String getFrnCod() {
		return frnCod;
	}

	public void setFrnCod(String frnCod) {
		this.frnCod = frnCod;
	}

	public String getPolNum() {
		return polNum;
	}

	public void setPolNum(String polNum) {
		this.polNum = polNum;
	}

	public String getPolEtat() {
		return polEtat;
	}

	public void setPolEtat(String polEtat) {
		this.polEtat = polEtat;
	}

	public Integer getCliId() {
		return cliId;
	}

	public void setCliId(Integer cliId) {
		this.cliId = cliId;
	}

	public Integer getLocId() {
		return locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	public String getCliNom() {
		return cliNom;
	}

	public void setCliNom(String cliNom) {
		this.cliNom = cliNom;
	}

	public String getCptNum() {
		return cptNum;
	}

	public void setCptNum(String cptNum) {
		this.cptNum = cptNum;
	}

	public String getAdrCons() {
		return adrCons;
	}

	public void setAdrCons(String adrCons) {
		this.adrCons = adrCons;
	}

	public String getNumGsm() {
		return numGsm;
	}

	public void setNumGsm(String numGsm) {
		this.numGsm = numGsm;
	}

	public Integer getRefSec() {
		return refSec;
	}

	public void setRefSec(Integer refSec) {
		this.refSec = refSec;
	}

	public Integer getRefTrn() {
		return refTrn;
	}

	public void setRefTrn(Integer refTrn) {
		this.refTrn = refTrn;
	}

	public Integer getRefOrd() {
		return refOrd;
	}

	public void setRefOrd(Integer refOrd) {
		this.refOrd = refOrd;
	}

	public String getLocIdg() {
		return locIdg;
	}

	public void setLocIdg(String locIdg) {
		this.locIdg = locIdg;
	}

	public String getPolTypc() {
		return polTypc;
	}

	public void setPolTypc(String polTypc) {
		this.polTypc = polTypc;
	}

	public String getCptFils() {
		return cptFils;
	}

	public void setCptFils(String cptFils) {
		this.cptFils = cptFils;
	}

	public String getCptTens() {
		return cptTens;
	}

	public void setCptTens(String cptTens) {
		this.cptTens = cptTens;
	}

	public String getCptAmp() {
		return cptAmp;
	}

	public void setCptAmp(String cptAmp) {
		this.cptAmp = cptAmp;
	}

	public Integer getCptCal() {
		return cptCal;
	}

	public void setCptCal(Integer cptCal) {
		this.cptCal = cptCal;
	}

	public Integer getCptSys() {
		return cptSys;
	}

	public void setCptSys(Integer cptSys) {
		this.cptSys = cptSys;
	}

	public String getTypeBr() {
		return typeBr;
	}

	public void setTypeBr(String typeBr) {
		this.typeBr = typeBr;
	}

	public String getEmpCpt() {
		return empCpt;
	}

	public void setEmpCpt(String empCpt) {
		this.empCpt = empCpt;
	}

	public String getCptRoue() {
		return cptRoue;
	}

	public void setCptRoue(String cptRoue) {
		this.cptRoue = cptRoue;
	}

	public String getCptCoef() {
		return cptCoef;
	}

	public void setCptCoef(String cptCoef) {
		this.cptCoef = cptCoef;
	}

	public String getPlombe() {
		return plombe;
	}

	public void setPlombe(String plombe) {
		this.plombe = plombe;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getRlvProd() {
		return rlvProd;
	}

	public void setRlvProd(String rlvProd) {
		this.rlvProd = rlvProd;
	}

	public Integer getRefTournee() {
		return refTournee;
	}

	public void setRefTournee(Integer refTournee) {
		this.refTournee = refTournee;
	}

	public Integer getRefFolio() {
		return refFolio;
	}

	public void setRefFolio(Integer refFolio) {
		this.refFolio = refFolio;
	}

	public Integer getNvFolio() {
		return nvFolio;
	}

	public void setNvFolio(Integer nvFolio) {
		this.nvFolio = nvFolio;
	}

	public String getRlvADate() {
		return rlvADate;
	}

	public void setRlvADate(String rlvADate) {
		this.rlvADate = rlvADate;
	}

	public String getRlvNDate1() {
		return rlvNDate1;
	}

	public void setRlvNDate1(String rlvNDate1) {
		this.rlvNDate1 = rlvNDate1;
	}

	public String getRlvNDate2() {
		return rlvNDate2;
	}

	public void setRlvNDate2(String rlvNDate2) {
		this.rlvNDate2 = rlvNDate2;
	}

	public Integer getRlvAIdx() {
		return rlvAIdx;
	}

	public void setRlvAIdx(Integer rlvAIdx) {
		this.rlvAIdx = rlvAIdx;
	}

	public Integer getRlvNIdx1() {
		return rlvNIdx1;
	}

	public void setRlvNIdx1(Integer rlvNIdx1) {
		this.rlvNIdx1 = rlvNIdx1;
	}

	public Integer getRlvNIdx2() {
		return rlvNIdx2;
	}

	public void setRlvNIdx2(Integer rlvNIdx2) {
		this.rlvNIdx2 = rlvNIdx2;
	}

	public Integer getRlvCons1() {
		return rlvCons1;
	}

	public void setRlvCons1(Integer rlvCons1) {
		this.rlvCons1 = rlvCons1;
	}

	public Integer getRlvCons2() {
		return rlvCons2;
	}

	public void setRlvCons2(Integer rlvCons2) {
		this.rlvCons2 = rlvCons2;
	}

	public String getRefAbs() {
		return refAbs;
	}

	public void setRefAbs(String refAbs) {
		this.refAbs = refAbs;
	}

	public String getRlvObs() {
		return rlvObs;
	}

	public void setRlvObs(String rlvObs) {
		this.rlvObs = rlvObs;
	}

	public String getRlvECpt() {
		return rlvECpt;
	}

	public void setRlvECpt(String rlvECpt) {
		this.rlvECpt = rlvECpt;
	}

	public String getRlvAnoc() {
		return rlvAnoc;
	}

	public void setRlvAnoc(String rlvAnoc) {
		this.rlvAnoc = rlvAnoc;
	}

	public String getRlvCode() {
		return rlvCode;
	}

	public void setRlvCode(String rlvCode) {
		this.rlvCode = rlvCode;
	}

	public Integer getConsNa1() {
		return consNa1;
	}

	public void setConsNa1(Integer consNa1) {
		this.consNa1 = consNa1;
	}

	public Integer getConsN1a1() {
		return consN1a1;
	}

	public void setConsN1a1(Integer consN1a1) {
		this.consN1a1 = consN1a1;
	}

	public Integer getConsM1() {
		return consM1;
	}

	public void setConsM1(Integer consM1) {
		this.consM1 = consM1;
	}

	public Integer getConsM2() {
		return consM2;
	}

	public void setConsM2(Integer consM2) {
		this.consM2 = consM2;
	}

	public Integer getConsMoy() {
		return consMoy;
	}

	public void setConsMoy(Integer consMoy) {
		this.consMoy = consMoy;
	}

	public String getRlvTypc() {
		return rlvTypc;
	}

	public void setRlvTypc(String rlvTypc) {
		this.rlvTypc = rlvTypc;
	}

	public String getPuit() {
		return puit;
	}

	public void setPuit(String puit) {
		this.puit = puit;
	}

	public Integer getNbrAbs() {
		return nbrAbs;
	}

	public void setNbrAbs(Integer nbrAbs) {
		this.nbrAbs = nbrAbs;
	}

	public Integer getMatrRlv() {
		return matrRlv;
	}

	public void setMatrRlv(Integer matrRlv) {
		this.matrRlv = matrRlv;
	}

	public Integer getMatrResp() {
		return matrResp;
	}

	public void setMatrResp(Integer matrResp) {
		this.matrResp = matrResp;
	}

	public String getFraude() {
		return fraude;
	}

	public void setFraude(String fraude) {
		this.fraude = fraude;
	}

	public String getCptCoupe() {
		return cptCoupe;
	}

	public void setCptCoupe(String cptCoupe) {
		this.cptCoupe = cptCoupe;
	}

	public String getDatePose() {
		return datePose;
	}

	public void setDatePose(String datePose) {
		this.datePose = datePose;
	}

	public Integer getNvClient() {
		return nvClient;
	}

	public void setNvClient(Integer nvClient) {
		this.nvClient = nvClient;
	}

	public Integer getNumCycle() {
		return numCycle;
	}

	public void setNumCycle(Integer numCycle) {
		this.numCycle = numCycle;
	}

	public Integer getCdRelecture() {
		return cdRelecture;
	}

	public void setCdRelecture(Integer cdRelecture) {
		this.cdRelecture = cdRelecture;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getNbrCompteur() {
		return nbrCompteur;
	}

	public void setNbrCompteur(Integer nbrCompteur) {
		this.nbrCompteur = nbrCompteur;
	}

	public String getPolUsag() {
		return polUsag;
	}

	public void setPolUsag(String polUsag) {
		this.polUsag = polUsag;
	}

	public Boolean isImageCompteur() {
		return isImageCompteur;
	}

	public void setIsImageCompteur(Boolean isImageCompteur) {
		this.isImageCompteur = isImageCompteur;
	}

	public void setPositionIndex(String positionIndex) {
		this.positionIndex = positionIndex;
	}

	public String getPositionIndex() {
		return positionIndex;
	}

	public void setPositionRoue(String positionRoue) {
		this.positionRoue = positionRoue;
	}

	public String getPositionRoue() {
		return positionRoue;
	}

	public void setPositionAno(String positionAno) {
		this.positionAno = positionAno;
	}

	public String getPositionAno() {
		return positionAno;
	}

	public void setIsCloture(Boolean isCloture) {
		this.isCloture = isCloture;
	}

	public Boolean getIsCloture() {
		return isCloture;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public Long get_id() {
		return _id;
	}

	public int getRap() {
		return rap;
	}

	public void setRap(int rap) {
		this.rap = rap;
	}

	public Boolean getIsImageCompteur() {
		return isImageCompteur;
	}

	public int getFraudeInt() {
		return fraudeInt;
	}

	public void setFraudeInt(int fraudeInt) {
		this.fraudeInt = fraudeInt;
	}

	public int getNumFlux() {
		return numFlux;
	}

	public void setNumFlux(int numFlux) {
		this.numFlux = numFlux;
	}


	public int getFacNum() {
		return facNum;
	}

	public void setFacNum(int facNum) {
		this.facNum = facNum;
	}

	public int getRelecture() {
		return relecture;
	}

	public void setRelecture(int relecture) {
		this.relecture = relecture;
	}

	@Override
	public String toString() {
		return refTournee+" : "+cliNom ;
	}
}
