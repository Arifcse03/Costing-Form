package model.entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 18 14:54:57 BDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XX_OM_POC_L_TEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        FobId {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFobId();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFobId((Number)value);
            }
        }
        ,
        PocId {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getPocId();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        SystemId {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getSystemId();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        WashName {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getWashName();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setWashName((String)value);
            }
        }
        ,
        Color {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getColor();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        FobWitoutComm {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFobWitoutComm();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFobWitoutComm((Number)value);
            }
        }
        ,
        FobWithComm {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFobWithComm();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFobWithComm((Number)value);
            }
        }
        ,
        FobWithSmsSample {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFobWithSmsSample();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFobWithSmsSample((Number)value);
            }
        }
        ,
        Cost {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCost();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCost((Number)value);
            }
        }
        ,
        Finance {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFinance();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFinance((Number)value);
            }
        }
        ,
        Profit {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getProfit();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setProfit((Number)value);
            }
        }
        ,
        ItemId {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getItemId();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setItemId((Number)value);
            }
        }
        ,
        CommisonPrcnt {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCommisonPrcnt();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCommisonPrcnt((Number)value);
            }
        }
        ,
        Fob {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFob();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFob((Number)value);
            }
        }
        ,
        FabricCost {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFabricCost();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFabricCost((Number)value);
            }
        }
        ,
        TrimCost {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getTrimCost();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setTrimCost((Number)value);
            }
        }
        ,
        WashCost {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getWashCost();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setWashCost((Number)value);
            }
        }
        ,
        CmMerchand {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCmMerchand();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCmMerchand((Number)value);
            }
        }
        ,
        Smv {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getSmv();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setSmv((Number)value);
            }
        }
        ,
        FactoryAvgEf {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFactoryAvgEf();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFactoryAvgEf((Number)value);
            }
        }
        ,
        ProdCostLinePerH {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getProdCostLinePerH();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setProdCostLinePerH((Number)value);
            }
        }
        ,
        CmManagement {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCmManagement();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCmManagement((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        FabricDesc {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getFabricDesc();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setFabricDesc((String)value);
            }
        }
        ,
        Cm {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCm();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCm((Number)value);
            }
        }
        ,
        Others {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getOthers();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setOthers((Number)value);
            }
        }
        ,
        SmsQty {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getSmsQty();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setSmsQty((Number)value);
            }
        }
        ,
        Sam {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getSam();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setSam((Number)value);
            }
        }
        ,
        CostNew {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getCostNew();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setCostNew((Number)value);
            }
        }
        ,
        TotalCost {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getTotalCost();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setTotalCost((Number)value);
            }
        }
        ,
        StyleEfficiency {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getStyleEfficiency();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setStyleEfficiency((Number)value);
            }
        }
        ,
        OtherCharge {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getOtherCharge();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setOtherCharge((Number)value);
            }
        }
        ,
        Shipment {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getShipment();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setShipment((String)value);
            }
        }
        ,
        ShipmentValue {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getShipmentValue();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setShipmentValue((Number)value);
            }
        }
        ,
        XX_OM_POC_H_TEO {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getXX_OM_POC_H_TEO();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setXX_OM_POC_H_TEO((XX_OM_POC_H_TEOImpl)value);
            }
        }
        ,
        XX_OM_POC_D1_TEO {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getXX_OM_POC_D1_TEO();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        XX_OM_POC_D2_TEO {
            public Object get(XX_OM_POC_L_TEOImpl obj) {
                return obj.getXX_OM_POC_D2_TEO();
            }

            public void put(XX_OM_POC_L_TEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(XX_OM_POC_L_TEOImpl object);

        public abstract void put(XX_OM_POC_L_TEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int FOBID = AttributesEnum.FobId.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int SYSTEMID = AttributesEnum.SystemId.index();
    public static final int WASHNAME = AttributesEnum.WashName.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int FOBWITOUTCOMM = AttributesEnum.FobWitoutComm.index();
    public static final int FOBWITHCOMM = AttributesEnum.FobWithComm.index();
    public static final int FOBWITHSMSSAMPLE = AttributesEnum.FobWithSmsSample.index();
    public static final int COST = AttributesEnum.Cost.index();
    public static final int FINANCE = AttributesEnum.Finance.index();
    public static final int PROFIT = AttributesEnum.Profit.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int COMMISONPRCNT = AttributesEnum.CommisonPrcnt.index();
    public static final int FOB = AttributesEnum.Fob.index();
    public static final int FABRICCOST = AttributesEnum.FabricCost.index();
    public static final int TRIMCOST = AttributesEnum.TrimCost.index();
    public static final int WASHCOST = AttributesEnum.WashCost.index();
    public static final int CMMERCHAND = AttributesEnum.CmMerchand.index();
    public static final int SMV = AttributesEnum.Smv.index();
    public static final int FACTORYAVGEF = AttributesEnum.FactoryAvgEf.index();
    public static final int PRODCOSTLINEPERH = AttributesEnum.ProdCostLinePerH.index();
    public static final int CMMANAGEMENT = AttributesEnum.CmManagement.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int FABRICDESC = AttributesEnum.FabricDesc.index();
    public static final int CM = AttributesEnum.Cm.index();
    public static final int OTHERS = AttributesEnum.Others.index();
    public static final int SMSQTY = AttributesEnum.SmsQty.index();
    public static final int SAM = AttributesEnum.Sam.index();
    public static final int COSTNEW = AttributesEnum.CostNew.index();
    public static final int TOTALCOST = AttributesEnum.TotalCost.index();
    public static final int STYLEEFFICIENCY = AttributesEnum.StyleEfficiency.index();
    public static final int OTHERCHARGE = AttributesEnum.OtherCharge.index();
    public static final int SHIPMENT = AttributesEnum.Shipment.index();
    public static final int SHIPMENTVALUE = AttributesEnum.ShipmentValue.index();
    public static final int XX_OM_POC_H_TEO = AttributesEnum.XX_OM_POC_H_TEO.index();
    public static final int XX_OM_POC_D1_TEO = AttributesEnum.XX_OM_POC_D1_TEO.index();
    public static final int XX_OM_POC_D2_TEO = AttributesEnum.XX_OM_POC_D2_TEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XX_OM_POC_L_TEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.XX_OM_POC_L_TEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for FobId, using the alias name FobId.
     * @return the FobId
     */
    public Number getFobId() {
        return (Number)getAttributeInternal(FOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FobId.
     * @param value value to set the FobId
     */
    public void setFobId(Number value) {
        setAttributeInternal(FOBID, value);
    }

    /**
     * Gets the attribute value for PocId, using the alias name PocId.
     * @return the PocId
     */
    public Number getPocId() {
        return (Number)getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PocId.
     * @param value value to set the PocId
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * Gets the attribute value for SystemId, using the alias name SystemId.
     * @return the SystemId
     */
    public Number getSystemId() {
        return (Number)getAttributeInternal(SYSTEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SystemId.
     * @param value value to set the SystemId
     */
    public void setSystemId(Number value) {
        setAttributeInternal(SYSTEMID, value);
    }

    /**
     * Gets the attribute value for WashName, using the alias name WashName.
     * @return the WashName
     */
    public String getWashName() {
        return (String)getAttributeInternal(WASHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for WashName.
     * @param value value to set the WashName
     */
    public void setWashName(String value) {
        value=  value.trim();   // added on 11mar 2021 by arif to eliminate space before or after value
        setAttributeInternal(WASHNAME, value);
    }

    /**
     * Gets the attribute value for Color, using the alias name Color.
     * @return the Color
     */
    public String getColor() {
        return (String)getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Color.
     * @param value value to set the Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for FobWitoutComm, using the alias name FobWitoutComm.
     * @return the FobWitoutComm
     */
    public Number getFobWitoutComm() {
        return (Number)getAttributeInternal(FOBWITOUTCOMM);
    }

    /**
     * Sets <code>value</code> as the attribute value for FobWitoutComm.
     * @param value value to set the FobWitoutComm
     */
    public void setFobWitoutComm(Number value) {
        setAttributeInternal(FOBWITOUTCOMM, value);
    }

    /**
     * Gets the attribute value for FobWithComm, using the alias name FobWithComm.
     * @return the FobWithComm
     */
    public Number getFobWithComm() {
        return (Number)getAttributeInternal(FOBWITHCOMM);
    }

    /**
     * Sets <code>value</code> as the attribute value for FobWithComm.
     * @param value value to set the FobWithComm
     */
    public void setFobWithComm(Number value) {
        setAttributeInternal(FOBWITHCOMM, value);
    }

    /**
     * Gets the attribute value for FobWithSmsSample, using the alias name FobWithSmsSample.
     * @return the FobWithSmsSample
     */
    public Number getFobWithSmsSample() {
        return (Number)getAttributeInternal(FOBWITHSMSSAMPLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FobWithSmsSample.
     * @param value value to set the FobWithSmsSample
     */
    public void setFobWithSmsSample(Number value) {
        setAttributeInternal(FOBWITHSMSSAMPLE, value);
    }

    /**
     * Gets the attribute value for Cost, using the alias name Cost.
     * @return the Cost
     */
    public Number getCost() {
        return (Number)getAttributeInternal(COST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cost.
     * @param value value to set the Cost
     */
    public void setCost(Number value) {
        setAttributeInternal(COST, value);
    }

    /**
     * Gets the attribute value for Finance, using the alias name Finance.
     * @return the Finance
     */
    public Number getFinance() {
        return (Number)getAttributeInternal(FINANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Finance.
     * @param value value to set the Finance
     */
    public void setFinance(Number value) {
        setAttributeInternal(FINANCE, value);
    }

    /**
     * Gets the attribute value for Profit, using the alias name Profit.
     * @return the Profit
     */
    public Number getProfit() {
        return (Number)getAttributeInternal(PROFIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Profit.
     * @param value value to set the Profit
     */
    public void setProfit(Number value) {
        setAttributeInternal(PROFIT, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the ItemId
     */
    public Number getItemId() {
        return (Number)getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(Number value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for CommisonPrcnt, using the alias name CommisonPrcnt.
     * @return the CommisonPrcnt
     */
    public Number getCommisonPrcnt() {
        return (Number)getAttributeInternal(COMMISONPRCNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommisonPrcnt.
     * @param value value to set the CommisonPrcnt
     */
    public void setCommisonPrcnt(Number value) {
        setAttributeInternal(COMMISONPRCNT, value);
    }

    /**
     * Gets the attribute value for Fob, using the alias name Fob.
     * @return the Fob
     */
    public Number getFob() {
        return (Number)getAttributeInternal(FOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fob.
     * @param value value to set the Fob
     */
    public void setFob(Number value) {
        setAttributeInternal(FOB, value);
    }

    /**
     * Gets the attribute value for FabricCost, using the alias name FabricCost.
     * @return the FabricCost
     */
    public Number getFabricCost() {
        return (Number)getAttributeInternal(FABRICCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabricCost.
     * @param value value to set the FabricCost
     */
    public void setFabricCost(Number value) {
        setAttributeInternal(FABRICCOST, value);
    }

    /**
     * Gets the attribute value for TrimCost, using the alias name TrimCost.
     * @return the TrimCost
     */
    public Number getTrimCost() {
        return (Number)getAttributeInternal(TRIMCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrimCost.
     * @param value value to set the TrimCost
     */
    public void setTrimCost(Number value) {
        setAttributeInternal(TRIMCOST, value);
    }

    /**
     * Gets the attribute value for WashCost, using the alias name WashCost.
     * @return the WashCost
     */
    public Number getWashCost() {
        return (Number)getAttributeInternal(WASHCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for WashCost.
     * @param value value to set the WashCost
     */
    public void setWashCost(Number value) {
        setAttributeInternal(WASHCOST, value);
    }

    /**
     * Gets the attribute value for CmMerchand, using the alias name CmMerchand.
     * @return the CmMerchand
     */
    public Number getCmMerchand() {
        return (Number)getAttributeInternal(CMMERCHAND);
    }

    /**
     * Sets <code>value</code> as the attribute value for CmMerchand.
     * @param value value to set the CmMerchand
     */
    public void setCmMerchand(Number value) {
        setAttributeInternal(CMMERCHAND, value);
    }

    /**
     * Gets the attribute value for Smv, using the alias name Smv.
     * @return the Smv
     */
    public Number getSmv() {
        return (Number)getAttributeInternal(SMV);
    }

    /**
     * Sets <code>value</code> as the attribute value for Smv.
     * @param value value to set the Smv
     */
    public void setSmv(Number value) {
        setAttributeInternal(SMV, value);
    }

    /**
     * Gets the attribute value for FactoryAvgEf, using the alias name FactoryAvgEf.
     * @return the FactoryAvgEf
     */
    public Number getFactoryAvgEf() {
        return (Number)getAttributeInternal(FACTORYAVGEF);
    }

    /**
     * Sets <code>value</code> as the attribute value for FactoryAvgEf.
     * @param value value to set the FactoryAvgEf
     */
    public void setFactoryAvgEf(Number value) {
        setAttributeInternal(FACTORYAVGEF, value);
    }

    /**
     * Gets the attribute value for ProdCostLinePerH, using the alias name ProdCostLinePerH.
     * @return the ProdCostLinePerH
     */
    public Number getProdCostLinePerH() {
        return (Number)getAttributeInternal(PRODCOSTLINEPERH);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdCostLinePerH.
     * @param value value to set the ProdCostLinePerH
     */
    public void setProdCostLinePerH(Number value) {
        setAttributeInternal(PRODCOSTLINEPERH, value);
    }

    /**
     * Gets the attribute value for CmManagement, using the alias name CmManagement.
     * @return the CmManagement
     */
    public Number getCmManagement() {
        return (Number)getAttributeInternal(CMMANAGEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CmManagement.
     * @param value value to set the CmManagement
     */
    public void setCmManagement(Number value) {
        setAttributeInternal(CMMANAGEMENT, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for FabricDesc, using the alias name FabricDesc.
     * @return the FabricDesc
     */
    public String getFabricDesc() {
        return (String)getAttributeInternal(FABRICDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabricDesc.
     * @param value value to set the FabricDesc
     */
    public void setFabricDesc(String value) {
        setAttributeInternal(FABRICDESC, value);
    }

    /**
     * Gets the attribute value for Cm, using the alias name Cm.
     * @return the Cm
     */
    public Number getCm() {
        return (Number)getAttributeInternal(CM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cm.
     * @param value value to set the Cm
     */
    public void setCm(Number value) {
        setAttributeInternal(CM, value);
    }

    /**
     * Gets the attribute value for Others, using the alias name Others.
     * @return the Others
     */
    public Number getOthers() {
        return (Number)getAttributeInternal(OTHERS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Others.
     * @param value value to set the Others
     */
    public void setOthers(Number value) {
        setAttributeInternal(OTHERS, value);
    }

    /**
     * Gets the attribute value for SmsQty, using the alias name SmsQty.
     * @return the SmsQty
     */
    public Number getSmsQty() {
        return (Number)getAttributeInternal(SMSQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SmsQty.
     * @param value value to set the SmsQty
     */
    public void setSmsQty(Number value) {
        setAttributeInternal(SMSQTY, value);
    }

    /**
     * Gets the attribute value for Sam, using the alias name Sam.
     * @return the Sam
     */
    public Number getSam() {
        return (Number)getAttributeInternal(SAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Sam.
     * @param value value to set the Sam
     */
    public void setSam(Number value) {
        setAttributeInternal(SAM, value);
    }

    /**
     * Gets the attribute value for CostNew, using the alias name CostNew.
     * @return the CostNew
     */
    public Number getCostNew() {
        return (Number)getAttributeInternal(COSTNEW);
    }

    /**
     * Sets <code>value</code> as the attribute value for CostNew.
     * @param value value to set the CostNew
     */
    public void setCostNew(Number value) {
        setAttributeInternal(COSTNEW, value);
    }

    /**
     * Gets the attribute value for TotalCost, using the alias name TotalCost.
     * @return the TotalCost
     */
    public Number getTotalCost() {
        return (Number)getAttributeInternal(TOTALCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalCost.
     * @param value value to set the TotalCost
     */
    public void setTotalCost(Number value) {
        setAttributeInternal(TOTALCOST, value);
    }

    /**
     * Gets the attribute value for StyleEfficiency, using the alias name StyleEfficiency.
     * @return the StyleEfficiency
     */
    public Number getStyleEfficiency() {
        return (Number)getAttributeInternal(STYLEEFFICIENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for StyleEfficiency.
     * @param value value to set the StyleEfficiency
     */
    public void setStyleEfficiency(Number value) {
        setAttributeInternal(STYLEEFFICIENCY, value);
    }

    /**
     * Gets the attribute value for OtherCharge, using the alias name OtherCharge.
     * @return the OtherCharge
     */
    public Number getOtherCharge() {
        return (Number)getAttributeInternal(OTHERCHARGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OtherCharge.
     * @param value value to set the OtherCharge
     */
    public void setOtherCharge(Number value) {
        setAttributeInternal(OTHERCHARGE, value);
    }

    /**
     * Gets the attribute value for Shipment, using the alias name Shipment.
     * @return the Shipment
     */
    public String getShipment() {
        return (String)getAttributeInternal(SHIPMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shipment.
     * @param value value to set the Shipment
     */
    public void setShipment(String value) {
        setAttributeInternal(SHIPMENT, value);
    }

    /**
     * Gets the attribute value for ShipmentValue, using the alias name ShipmentValue.
     * @return the ShipmentValue
     */
    public Number getShipmentValue() {
        return (Number)getAttributeInternal(SHIPMENTVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipmentValue.
     * @param value value to set the ShipmentValue
     */
    public void setShipmentValue(Number value) {
        setAttributeInternal(SHIPMENTVALUE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity XX_OM_POC_H_TEOImpl.
     */
    public XX_OM_POC_H_TEOImpl getXX_OM_POC_H_TEO() {
        return (XX_OM_POC_H_TEOImpl)getAttributeInternal(XX_OM_POC_H_TEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XX_OM_POC_H_TEOImpl.
     */
    public void setXX_OM_POC_H_TEO(XX_OM_POC_H_TEOImpl value) {
        setAttributeInternal(XX_OM_POC_H_TEO, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXX_OM_POC_D1_TEO() {
        return (RowIterator)getAttributeInternal(XX_OM_POC_D1_TEO);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXX_OM_POC_D2_TEO() {
        return (RowIterator)getAttributeInternal(XX_OM_POC_D2_TEO);
    }


    /**
     * @param fobId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number fobId) {
        return new Key(new Object[]{fobId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("XX_OM_POC_L_T_SEQ",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setFobId(sVal); 
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
