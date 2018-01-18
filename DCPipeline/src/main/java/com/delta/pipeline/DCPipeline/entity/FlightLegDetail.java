package com.delta.pipeline.DCPipeline.entity;


import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "FLT_LEG_DTL")
public class FlightLegDetail
{
    @Column(name = "CRR_CD", length = 3)
    private String            crrCd;
    
    @Column(name = "ARR_TRPN_STN_CD", length = 5)
    private String            destStnCd;
    @Column(name = "FLET_CD", length = 5)
    private String            fletCd;
    @Temporal(TemporalType.DATE)
    @Column(name = "FLT_ORIG_DT", insertable = false, updatable = false)
    private java.util.Date    flightOriginDate;
    @Column(name = "FLT_CXN_IND", length = 1)
    private char              fltCxnInd;
    @Id
    @Column(name = "FLT_LEG_ID")
    private Integer           fltLegId;
    @Column(name = "FLT_NB", length = 4)
    private int               fltNb;
    @Column(name = "FLT_ORIG_DT")
    private Date              fltOrigDt;
    @Transient
    /** @Column(name = "LST_UPDT_LTS", length = 6)*/
    private Timestamp         lstUpdtTs;
    @Transient
    /** @Column(name = "LST_UPDT_USR_ID", length = 10)*/
    private String            lstUpdtUsrId;
    @Column(name = "DPRT_TRPN_STN_CD", length = 5)
    private String            origStnCd;
    @Transient
    /** @Column(name = "REC_CRTN_INSRT_TS", length = 6)*/
    private Timestamp         recCrtnInsrtTs;
    @Transient
    /** @Column(name = "REC_CRTN_USR_ID", length = 10)*/
    private String            recCrtnUsrId;
    @Column(name = "SCHD_OUT_GTS")
    private Timestamp         schdDprtGts;
    @Column(name = "AC_NB", length = 6)
    private String            shipNb;

    public String getCrrCd()
    {
        return crrCd;
    }

  

    public String getDestStnCd()
    {
        return destStnCd;
    }

    public String getFletCd()
    {
        return fletCd;
    }

    public java.util.Date getFlightOriginDate()
    {
        return flightOriginDate;
    }

    public char getFltCxnInd()
    {
        return fltCxnInd;
    }

    public Integer getFltLegId()
    {
        return fltLegId;
    }

    public int getFltNb()
    {
        return fltNb;
    }

    public Date getFltOrigDt()
    {
        return fltOrigDt;
    }

    public Timestamp getLstUpdtTs()
    {
        return lstUpdtTs;
    }

    public String getLstUpdtUsrId()
    {
        return lstUpdtUsrId;
    }

    public String getOrigStnCd()
    {
        return origStnCd;
    }

    public Timestamp getRecCrtnInsrtTs()
    {
        return recCrtnInsrtTs;
    }

    public String getRecCrtnUsrId()
    {
        return recCrtnUsrId;
    }

    public Timestamp getSchdDprtGts()
    {
        return schdDprtGts;
    }

    public String getShipNb()
    {
        return shipNb;
    }

    public void setCrrCd( String crrCd )
    {
        this.crrCd = crrCd;
    }

 

    public void setDestStnCd( String destStnCd )
    {
        this.destStnCd = destStnCd;
    }

    public void setFletCd( String fletCd )
    {
        this.fletCd = fletCd;
    }

    public void setFltCxnInd( char fltCxnInd )
    {
        this.fltCxnInd = fltCxnInd;
    }

    public void setFltLegId( Integer fltLegId )
    {
        this.fltLegId = fltLegId;
    }

    public void setFltNb( int fltNb )
    {
        this.fltNb = fltNb;
    }

    public void setFltOrigDt( Date fltOrigDt )
    {
        this.fltOrigDt = fltOrigDt;
    }

    public void setLstUpdtTs( Timestamp lstUpdtTs )
    {
        this.lstUpdtTs = lstUpdtTs;
    }

    public void setLstUpdtUsrId( String lstUpdtUsrId )
    {
        this.lstUpdtUsrId = lstUpdtUsrId;
    }

    public void setOrigStnCd( String origStnCd )
    {
        this.origStnCd = origStnCd;
    }

    public void setRecCrtnInsrtTs( Timestamp recCrtnInsrtTs )
    {
        this.recCrtnInsrtTs = recCrtnInsrtTs;
    }

    public void setRecCrtnUsrId( String recCrtnUsrId )
    {
        this.recCrtnUsrId = recCrtnUsrId;
    }

    public void setSchdDprtGts( Timestamp schdDprtGts )
    {
        this.schdDprtGts = schdDprtGts;
    }

    public void setShipNb( String shipNb )
    {
        this.shipNb = shipNb;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder( getClass().getSimpleName() ).append( "[" );
        builder.append( " fltLegId :: " ).append( fltLegId );
        builder.append( ", fltNb :: " ).append( fltNb );
        builder.append( ", crrCd :: " ).append( crrCd );
        builder.append( ", fltOrigDt :: " ).append( fltOrigDt );
        builder.append( ", origStnCd :: " ).append( origStnCd );
        builder.append( ", destStnCd :: " ).append( destStnCd );
        builder.append( ", acNb :: " ).append( shipNb );
        return builder.append( "]" ).toString();
    }
}