package model.entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 19 17:09:47 BDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XX_OM_POC_D1_TEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getDetailId();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        FobId {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getFobId();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setFobId((Number)value);
            }
        }
        ,
        ItemPrefix {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getItemPrefix();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setItemPrefix((Number)value);
            }
        }
        ,
        RefCode {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getRefCode();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setRefCode((String)value);
            }
        }
        ,
        ItemDesc {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getItemDesc();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setItemDesc((String)value);
            }
        }
        ,
        Uom {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getUom();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setUom((String)value);
            }
        }
        ,
        PaymentTermId {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getPaymentTermId();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setPaymentTermId((String)value);
            }
        }
        ,
        DeliveryTermId {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getDeliveryTermId();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setDeliveryTermId((String)value);
            }
        }
        ,
        ActualUnitPrice {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getActualUnitPrice();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setActualUnitPrice((Number)value);
            }
        }
        ,
        AddChargeLc {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getAddChargeLc();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setAddChargeLc((Number)value);
            }
        }
        ,
        AddPriceFob {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getAddPriceFob();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setAddPriceFob((Number)value);
            }
        }
        ,
        AddPriceMoq {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getAddPriceMoq();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setAddPriceMoq((Number)value);
            }
        }
        ,
        FinalUnitPrice {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getFinalUnitPrice();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setFinalUnitPrice((Number)value);
            }
        }
        ,
        ConsPerPcs {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getConsPerPcs();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setConsPerPcs((Number)value);
            }
        }
        ,
        WastageInPer {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getWastageInPer();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setWastageInPer((Number)value);
            }
        }
        ,
        WastageInQty {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getWastageInQty();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setWastageInQty((Number)value);
            }
        }
        ,
        ConsWithWastage {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getConsWithWastage();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setConsWithWastage((Number)value);
            }
        }
        ,
        Bufer {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getBufer();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setBufer((Number)value);
            }
        }
        ,
        FinalCons {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getFinalCons();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setFinalCons((Number)value);
            }
        }
        ,
        CostPerPcs {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getCostPerPcs();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setCostPerPcs((Number)value);
            }
        }
        ,
        AddDeductCost {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getAddDeductCost();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setAddDeductCost((Number)value);
            }
        }
        ,
        FinalCostPerPcs {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getFinalCostPerPcs();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setFinalCostPerPcs((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        AddCrgPrcnt {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getAddCrgPrcnt();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setAddCrgPrcnt((Number)value);
            }
        }
        ,
        PriceUom {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getPriceUom();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setPriceUom((String)value);
            }
        }
        ,
        UomConv {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getUomConv();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setUomConv((Number)value);
            }
        }
        ,
        FabFinanceCost {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getFabFinanceCost();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setFabFinanceCost((Number)value);
            }
        }
        ,
        Status {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getStatus();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        PrefixDesc {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getPrefixDesc();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setPrefixDesc((String)value);
            }
        }
        ,
        XX_OM_POC_L_TEO {
            public Object get(XX_OM_POC_D1_TEOImpl obj) {
                return obj.getXX_OM_POC_L_TEO();
            }

            public void put(XX_OM_POC_D1_TEOImpl obj, Object value) {
                obj.setXX_OM_POC_L_TEO((XX_OM_POC_L_TEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(XX_OM_POC_D1_TEOImpl object);

        public abstract void put(XX_OM_POC_D1_TEOImpl object, Object value);

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


    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int FOBID = AttributesEnum.FobId.index();
    public static final int ITEMPREFIX = AttributesEnum.ItemPrefix.index();
    public static final int REFCODE = AttributesEnum.RefCode.index();
    public static final int ITEMDESC = AttributesEnum.ItemDesc.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int PAYMENTTERMID = AttributesEnum.PaymentTermId.index();
    public static final int DELIVERYTERMID = AttributesEnum.DeliveryTermId.index();
    public static final int ACTUALUNITPRICE = AttributesEnum.ActualUnitPrice.index();
    public static final int ADDCHARGELC = AttributesEnum.AddChargeLc.index();
    public static final int ADDPRICEFOB = AttributesEnum.AddPriceFob.index();
    public static final int ADDPRICEMOQ = AttributesEnum.AddPriceMoq.index();
    public static final int FINALUNITPRICE = AttributesEnum.FinalUnitPrice.index();
    public static final int CONSPERPCS = AttributesEnum.ConsPerPcs.index();
    public static final int WASTAGEINPER = AttributesEnum.WastageInPer.index();
    public static final int WASTAGEINQTY = AttributesEnum.WastageInQty.index();
    public static final int CONSWITHWASTAGE = AttributesEnum.ConsWithWastage.index();
    public static final int BUFER = AttributesEnum.Bufer.index();
    public static final int FINALCONS = AttributesEnum.FinalCons.index();
    public static final int COSTPERPCS = AttributesEnum.CostPerPcs.index();
    public static final int ADDDEDUCTCOST = AttributesEnum.AddDeductCost.index();
    public static final int FINALCOSTPERPCS = AttributesEnum.FinalCostPerPcs.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ADDCRGPRCNT = AttributesEnum.AddCrgPrcnt.index();
    public static final int PRICEUOM = AttributesEnum.PriceUom.index();
    public static final int UOMCONV = AttributesEnum.UomConv.index();
    public static final int FABFINANCECOST = AttributesEnum.FabFinanceCost.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int PREFIXDESC = AttributesEnum.PrefixDesc.index();
    public static final int XX_OM_POC_L_TEO = AttributesEnum.XX_OM_POC_L_TEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XX_OM_POC_D1_TEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.XX_OM_POC_D1_TEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DetailId, using the alias name DetailId.
     * @return the DetailId
     */
    public Number getDetailId() {
        return (Number)getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailId.
     * @param value value to set the DetailId
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
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
     * Gets the attribute value for ItemPrefix, using the alias name ItemPrefix.
     * @return the ItemPrefix
     */
    public Number getItemPrefix() {
        return (Number)getAttributeInternal(ITEMPREFIX);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemPrefix.
     * @param value value to set the ItemPrefix
     */
    public void setItemPrefix(Number value) {
        setAttributeInternal(ITEMPREFIX, value);
    }

    /**
     * Gets the attribute value for RefCode, using the alias name RefCode.
     * @return the RefCode
     */
    public String getRefCode() {
        return (String)getAttributeInternal(REFCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefCode.
     * @param value value to set the RefCode
     */
    public void setRefCode(String value) {
        setAttributeInternal(REFCODE, value);
    }

    /**
     * Gets the attribute value for ItemDesc, using the alias name ItemDesc.
     * @return the ItemDesc
     */
    public String getItemDesc() {
        return (String)getAttributeInternal(ITEMDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemDesc.
     * @param value value to set the ItemDesc
     */
    public void setItemDesc(String value) {
        setAttributeInternal(ITEMDESC, value);
    }

    /**
     * Gets the attribute value for Uom, using the alias name Uom.
     * @return the Uom
     */
    public String getUom() {
        return (String)getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Uom.
     * @param value value to set the Uom
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for PaymentTermId, using the alias name PaymentTermId.
     * @return the PaymentTermId
     */
    public String getPaymentTermId() {
        return (String)getAttributeInternal(PAYMENTTERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentTermId.
     * @param value value to set the PaymentTermId
     */
    public void setPaymentTermId(String value) {
        setAttributeInternal(PAYMENTTERMID, value);
    }

    /**
     * Gets the attribute value for DeliveryTermId, using the alias name DeliveryTermId.
     * @return the DeliveryTermId
     */
    public String getDeliveryTermId() {
        return (String)getAttributeInternal(DELIVERYTERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryTermId.
     * @param value value to set the DeliveryTermId
     */
    public void setDeliveryTermId(String value) {
        setAttributeInternal(DELIVERYTERMID, value);
    }

    /**
     * Gets the attribute value for ActualUnitPrice, using the alias name ActualUnitPrice.
     * @return the ActualUnitPrice
     */
    public Number getActualUnitPrice() {
        return (Number)getAttributeInternal(ACTUALUNITPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActualUnitPrice.
     * @param value value to set the ActualUnitPrice
     */
    public void setActualUnitPrice(Number value) {
        setAttributeInternal(ACTUALUNITPRICE, value);
    }

    /**
     * Gets the attribute value for AddChargeLc, using the alias name AddChargeLc.
     * @return the AddChargeLc
     */
    public Number getAddChargeLc() {
        return (Number)getAttributeInternal(ADDCHARGELC);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddChargeLc.
     * @param value value to set the AddChargeLc
     */
    public void setAddChargeLc(Number value) {
        setAttributeInternal(ADDCHARGELC, value);
    }

    /**
     * Gets the attribute value for AddPriceFob, using the alias name AddPriceFob.
     * @return the AddPriceFob
     */
    public Number getAddPriceFob() {
        return (Number)getAttributeInternal(ADDPRICEFOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddPriceFob.
     * @param value value to set the AddPriceFob
     */
    public void setAddPriceFob(Number value) {
        setAttributeInternal(ADDPRICEFOB, value);
    }

    /**
     * Gets the attribute value for AddPriceMoq, using the alias name AddPriceMoq.
     * @return the AddPriceMoq
     */
    public Number getAddPriceMoq() {
        return (Number)getAttributeInternal(ADDPRICEMOQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddPriceMoq.
     * @param value value to set the AddPriceMoq
     */
    public void setAddPriceMoq(Number value) {
        setAttributeInternal(ADDPRICEMOQ, value);
    }

    /**
     * Gets the attribute value for FinalUnitPrice, using the alias name FinalUnitPrice.
     * @return the FinalUnitPrice
     */
    public Number getFinalUnitPrice() {
        return (Number)getAttributeInternal(FINALUNITPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinalUnitPrice.
     * @param value value to set the FinalUnitPrice
     */
    public void setFinalUnitPrice(Number value) {
        setAttributeInternal(FINALUNITPRICE, value);
    }

    /**
     * Gets the attribute value for ConsPerPcs, using the alias name ConsPerPcs.
     * @return the ConsPerPcs
     */
    public Number getConsPerPcs() {
        return (Number)getAttributeInternal(CONSPERPCS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConsPerPcs.
     * @param value value to set the ConsPerPcs
     */
    public void setConsPerPcs(Number value) {
        setAttributeInternal(CONSPERPCS, value);
    }

    /**
     * Gets the attribute value for WastageInPer, using the alias name WastageInPer.
     * @return the WastageInPer
     */
    public Number getWastageInPer() {
        return (Number)getAttributeInternal(WASTAGEINPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for WastageInPer.
     * @param value value to set the WastageInPer
     */
    public void setWastageInPer(Number value) {
        setAttributeInternal(WASTAGEINPER, value);
    }

    /**
     * Gets the attribute value for WastageInQty, using the alias name WastageInQty.
     * @return the WastageInQty
     */
    public Number getWastageInQty() {
        return (Number)getAttributeInternal(WASTAGEINQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for WastageInQty.
     * @param value value to set the WastageInQty
     */
    public void setWastageInQty(Number value) {
        setAttributeInternal(WASTAGEINQTY, value);
    }

    /**
     * Gets the attribute value for ConsWithWastage, using the alias name ConsWithWastage.
     * @return the ConsWithWastage
     */
    public Number getConsWithWastage() {
        return (Number)getAttributeInternal(CONSWITHWASTAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConsWithWastage.
     * @param value value to set the ConsWithWastage
     */
    public void setConsWithWastage(Number value) {
        setAttributeInternal(CONSWITHWASTAGE, value);
    }

    /**
     * Gets the attribute value for Bufer, using the alias name Bufer.
     * @return the Bufer
     */
    public Number getBufer() {
        return (Number)getAttributeInternal(BUFER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bufer.
     * @param value value to set the Bufer
     */
    public void setBufer(Number value) {
        setAttributeInternal(BUFER, value);
    }

    /**
     * Gets the attribute value for FinalCons, using the alias name FinalCons.
     * @return the FinalCons
     */
    public Number getFinalCons() {
        return (Number)getAttributeInternal(FINALCONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinalCons.
     * @param value value to set the FinalCons
     */
    public void setFinalCons(Number value) {
        setAttributeInternal(FINALCONS, value);
    }

    /**
     * Gets the attribute value for CostPerPcs, using the alias name CostPerPcs.
     * @return the CostPerPcs
     */
    public Number getCostPerPcs() {
        return (Number)getAttributeInternal(COSTPERPCS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CostPerPcs.
     * @param value value to set the CostPerPcs
     */
    public void setCostPerPcs(Number value) {
        setAttributeInternal(COSTPERPCS, value);
    }

    /**
     * Gets the attribute value for AddDeductCost, using the alias name AddDeductCost.
     * @return the AddDeductCost
     */
    public Number getAddDeductCost() {
        return (Number)getAttributeInternal(ADDDEDUCTCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddDeductCost.
     * @param value value to set the AddDeductCost
     */
    public void setAddDeductCost(Number value) {
        setAttributeInternal(ADDDEDUCTCOST, value);
    }

    /**
     * Gets the attribute value for FinalCostPerPcs, using the alias name FinalCostPerPcs.
     * @return the FinalCostPerPcs
     */
    public Number getFinalCostPerPcs() {
        return (Number)getAttributeInternal(FINALCOSTPERPCS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinalCostPerPcs.
     * @param value value to set the FinalCostPerPcs
     */
    public void setFinalCostPerPcs(Number value) {
        setAttributeInternal(FINALCOSTPERPCS, value);
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
     * Gets the attribute value for AddCrgPrcnt, using the alias name AddCrgPrcnt.
     * @return the AddCrgPrcnt
     */
    public Number getAddCrgPrcnt() {
        return (Number)getAttributeInternal(ADDCRGPRCNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddCrgPrcnt.
     * @param value value to set the AddCrgPrcnt
     */
    public void setAddCrgPrcnt(Number value) {
        setAttributeInternal(ADDCRGPRCNT, value);
    }

    /**
     * Gets the attribute value for PriceUom, using the alias name PriceUom.
     * @return the PriceUom
     */
    public String getPriceUom() {
        return (String)getAttributeInternal(PRICEUOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for PriceUom.
     * @param value value to set the PriceUom
     */
    public void setPriceUom(String value) {
        setAttributeInternal(PRICEUOM, value);
    }

    /**
     * Gets the attribute value for UomConv, using the alias name UomConv.
     * @return the UomConv
     */
    public Number getUomConv() {
        return (Number)getAttributeInternal(UOMCONV);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomConv.
     * @param value value to set the UomConv
     */
    public void setUomConv(Number value) {
        setAttributeInternal(UOMCONV, value);
    }

    /**
     * Gets the attribute value for FabFinanceCost, using the alias name FabFinanceCost.
     * @return the FabFinanceCost
     */
    public Number getFabFinanceCost() {
        return (Number)getAttributeInternal(FABFINANCECOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabFinanceCost.
     * @param value value to set the FabFinanceCost
     */
    public void setFabFinanceCost(Number value) {
        setAttributeInternal(FABFINANCECOST, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the Status
     */
    public String getStatus() {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
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
     * Gets the attribute value for PrefixDesc, using the alias name PrefixDesc.
     * @return the PrefixDesc
     */
    public String getPrefixDesc() {
        return (String)getAttributeInternal(PREFIXDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrefixDesc.
     * @param value value to set the PrefixDesc
     */
    public void setPrefixDesc(String value) {
        setAttributeInternal(PREFIXDESC, value);
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
     * @return the associated entity XX_OM_POC_L_TEOImpl.
     */
    public XX_OM_POC_L_TEOImpl getXX_OM_POC_L_TEO() {
        return (XX_OM_POC_L_TEOImpl)getAttributeInternal(XX_OM_POC_L_TEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XX_OM_POC_L_TEOImpl.
     */
    public void setXX_OM_POC_L_TEO(XX_OM_POC_L_TEOImpl value) {
        setAttributeInternal(XX_OM_POC_L_TEO, value);
    }


    /**
     * @param detailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detailId) {
        return new Key(new Object[]{detailId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        //super.create(attributeList);
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("XX_OM_POC_D1_T_SEQ",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetailId(sVal);
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
