package model.services;

import java.sql.CallableStatement;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import model.services.common.AppModule;

import model.views.XX_OM_POC_D2_TVO2Impl;
import model.views.XX_OM_POC_D2_TVOImpl;

import model.views.XX_OM_POC_H_TVOImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;


import oracle.jbo.server.ViewObjectImpl;

import oracle.jdbc.OracleTypes;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 12 11:38:11 BDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }


    /**
     * Container's getter for XX_OM_POC_H_TVO1.
     * @return XX_OM_POC_H_TVO1
     */
    public ViewObjectImpl getXX_OM_POC_H_TVO1() {
        return (ViewObjectImpl)findViewObject("XX_OM_POC_H_TVO1");
    }

    /**
     * Container's getter for XX_OM_POC_L_TVO1.
     * @return XX_OM_POC_L_TVO1
     */
    public ViewObjectImpl getXX_OM_POC_L_TVO1() {
        return (ViewObjectImpl)findViewObject("XX_OM_POC_L_TVO1");
    }

    /**
     * Container's getter for XxOmPocLFkLink1.
     * @return XxOmPocLFkLink1
     */
    public ViewLinkImpl getXxOmPocLFkLink1() {
        return (ViewLinkImpl)findViewLink("XxOmPocLFkLink1");
    }


    /**
     * Container's getter for XX_OM_POC_D1_TVO1.
     * @return XX_OM_POC_D1_TVO1
     */
    public ViewObjectImpl getXX_OM_POC_D1_TVO1() {
        return (ViewObjectImpl)findViewObject("XX_OM_POC_D1_TVO1");
    }

    /**
     * Container's getter for LineFobidviaD1Fobid1.
     * @return LineFobidviaD1Fobid1
     */
    public ViewLinkImpl getLineFobidviaD1Fobid1() {
        return (ViewLinkImpl)findViewLink("LineFobidviaD1Fobid1");
    }


    /**
     * Container's getter for XX_OM_POC_D2_TVO1.
     * @return XX_OM_POC_D2_TVO1
     */
    public ViewObjectImpl getXX_OM_POC_D2_TVO1() {
        return (ViewObjectImpl)findViewObject("XX_OM_POC_D2_TVO1");
    }

    /**
     * Container's getter for line_fobidviad2_fobidVL1.
     * @return line_fobidviad2_fobidVL1
     */
    public ViewLinkImpl getline_fobidviad2_fobidVL1() {
        return (ViewLinkImpl)findViewLink("line_fobidviad2_fobidVL1");
    }


    /**
     * Container's getter for XX_OM_POC_D2_TVO2_1.
     * @return XX_OM_POC_D2_TVO2_1
     */
    public ViewObjectImpl getXX_OM_POC_D2_TVO2_1() {
        return (ViewObjectImpl)findViewObject("XX_OM_POC_D2_TVO2_1");
    }

    /**
     * Container's getter for linetowetVL1.
     * @return linetowetVL1
     */
    public ViewLinkImpl getlinetowetVL1() {
        return (ViewLinkImpl)findViewLink("linetowetVL1");
    }

    public void validateLines() {

        ViewObject vo = getXX_OM_POC_L_TVO1();

        RowSetIterator it = vo.createRowSetIterator("it");

        HashSet<String> hset = new HashSet<String>();
        HashSet<String> hset1 = new HashSet<String>();
        ArrayList list = new ArrayList();

        int count = 0;
        int flag = 0;
        String status = null;
        while (it.hasNext()) {
            count++;
            Row r = it.next();
            String washName = r.getAttribute("WashName").toString();
            String color = r.getAttribute("Color").toString();
            washName = washName.trim().toUpperCase();
            color = color.trim().toUpperCase();
            hset.add(washName + color);
            if (count != hset.size()) {
                list.add(count);

                String remark = null;
                // remark=remark.trim().toUpperCase();
                try {
                    flag++;
                    remark = r.getAttribute("Remarks").toString();
                    remark = remark.trim().toUpperCase();
                    hset1.add(remark);
                    if (flag != hset1.size()) {
                        String message = "Duplicate remark";
                        FacesMessage fm = new FacesMessage(message);
                        fm.setSeverity(FacesMessage.SEVERITY_INFO);
                        FacesContext context =
                            FacesContext.getCurrentInstance();
                        context.addMessage(null, fm);
                    }

                } catch (Exception ex) {

                    remark = "check";
                }


                if (remark == "check") {
                    String message = "Check remark";
                    FacesMessage fm = new FacesMessage(message);
                    fm.setSeverity(FacesMessage.SEVERITY_INFO);
                    FacesContext context = FacesContext.getCurrentInstance();
                    context.addMessage(null, fm);


                }
            }

        } //end

        //.....................mywork...................//

        System.out.println("---------------------------------------------------------------====" +
                           list);

        it.closeRowSetIterator();


    } //end of looop


    /**
     * Container's getter for trackingVO1.
     * @return trackingVO1
     */
    
    public ViewObjectImpl gettrackingVO1() {
        return (ViewObjectImpl)findViewObject("trackingVO1");
    }

    public String copyRecords(String type, String PocId, String FobId) {

        System.out.println("======Type============" + type);
        System.out.println("==========PocId========" + PocId);
        System.out.println("===============FobId===" + FobId);

        String value = null;
        String stmt =
            "BEGIN :1 := PRECOSTING_COMMON_PKG.MAKE_COPY(:2,:3, :4); end;";
        //   "BEGIN :1 := mnj_precosting_common_pkg.MAKE_COPY(:2,:3, :4); end;";

        java.sql.CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.registerOutParameter(1, OracleTypes.VARCHAR);
            cs.setString(2, type);
            cs.setString(3, PocId);
            cs.setString(4, FobId);
            cs.execute();
            value = cs.getString(1);
            cs.close();
        } catch (Exception e) {
            value = e.getMessage();
        }
        getXX_OM_POC_L_TVO1().executeQuery();
        return value;

    }
    
    public void CopyItemsDetail(){

    ViewObject hvo = getXX_OM_POC_D1_TVO1();
    Row r = hvo.getCurrentRow();
    String DetailId = r.getAttribute("DetailId").toString();
    System.out.println("DetailId-------------->>"+DetailId);
    String stmt = "BEGIN PRECOSTING_COMMON_PKG.Copy_Item_Detail(:1); end;";
    double amount = 0.0;
    CallableStatement cs =
    getDBTransaction().createCallableStatement(stmt, 1);
    try {
    cs.setInt(1, Integer.parseInt(DetailId));
    cs.execute();
    cs.close();
    } catch (Exception e) { ; }
    hvo.executeQuery();
    System.out.println("DetailId 123-------------->>"+DetailId);

    }
    
    /* Poc Front page Copy Button */

    public void CopyPrecost(String type) {

        if (type == "V") {

            System.out.println("=== VERSION_PRECOSTING ==");

            ViewObject vo = getXX_OM_POC_H_TVO1();
            String PocId = vo.getCurrentRow().getAttribute("PocId").toString();


            System.out.println("====VERSION_PRECOSTING===" + type);

            String stmt =
                "BEGIN TEST_PRECOSTING_COMMON_PKG.VERSION_PRECOSTING(:1, :2); end;";

            CallableStatement cs =
                getDBTransaction().createCallableStatement(stmt, 1);
            try {

                // cs.registerOutParameter(1, OracleTypes.NUMBER);
                cs.setInt(1, Integer.parseInt(PocId));
                cs.setString(2, type);
                cs.execute();
                cs.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            vo.executeQuery();
            System.out.println("CopyPrecost AM 3---->>" + PocId);

        } else {
            System.out.println("CopyPrecost AM 1");

            ViewObject vo = getXX_OM_POC_H_TVO1();
            String PocId = vo.getCurrentRow().getAttribute("PocId").toString();
            
            Map sessionScope = ADFContext.getCurrent().getSessionScope();
            String userId = (String)sessionScope.get("userIdS");
            
            System.out.println("<<---- User Id ---->>" + userId);

            System.out.println("CopyPrecost AM 2---->>" + PocId);

            System.out.println("CopyPrecost type 2---->>" + type);

            String stmt =
                "BEGIN TEST_PRECOSTING_COMMON_PKG.COPY_PRECOSTING(:1,:2,:3); end;";

            CallableStatement cs =
                getDBTransaction().createCallableStatement(stmt, 1);
            try {

                // cs.registerOutParameter(1, OracleTypes.NUMBER);
                cs.setInt(1, Integer.parseInt(PocId));
                cs.setString(2, type);
                cs.setInt(3, Integer.parseInt(userId));
                cs.execute();
                cs.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            vo.executeQuery();
            System.out.println("CopyPrecost AM 3---->>" + PocId);
        }

    }
    
    /****************************************************************
     * POC Approvale Procedures
     ****************************************************************/


    public void Approve(String PocId) {

        int status = 0;
        String stmt = "BEGIN MNJ_POC_WF_PKG.wf_poc_appr_main(:1,:2); end;";

        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        
        String userId = (String)sessionScope.get("userIdS");
        
//         String userId = "1207";
        
        System.out.println("<<----  userId ---->>"+userId);


        CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {

            // cs.registerOutParameter(1, OracleTypes.NUMBER);
            cs.setInt(1, Integer.parseInt(PocId));
            cs.setString(2, userId);
            cs.execute();
            cs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        ViewObject vo = getXX_OM_POC_H_TVO1();
//      vo.getCurrentRow().setAttribute("GmStatus", "In process");
        vo.getCurrentRow().setAttribute("GmApproval", "I");
        getDBTransaction().commit();

        System.out.println("Inquiry Id-" + PocId);
    
        System.out.println("========== Status ===============");

    }

    public void CopyAllPrecost(String type) {

        ViewObject vo = getXX_OM_POC_H_TVO1();
        String PocId = vo.getCurrentRow().getAttribute("PocId").toString();

        String stmt = "BEGIN cust_mnj_ont_pkg.COPY_PRECOSTING(:1, :2); end;";

        CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.setInt(1, Integer.parseInt(PocId));
            cs.setString(2, type);
            cs.execute();
            cs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        vo.executeQuery();
    }

    /**
     * Container's getter for POCLinesCopyVO1.
     * @return POCLinesCopyVO1
     */
    public ViewObjectImpl getPOCLinesCopyVO1() {
        return (ViewObjectImpl)findViewObject("POCLinesCopyVO1");
    }
    
    public void SystemIdGenarate(String PocId) {

            System.out.println("============SystemIdGenarate======PocId====="+PocId);  

            String stmt = "BEGIN XX_OM_POC_L_SYS_ID_UPDATE(:1); end;";

            CallableStatement cs =
                getDBTransaction().createCallableStatement(stmt, 1);
            try {
                cs.setInt(1, Integer.parseInt(PocId));
                cs.execute();
                cs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public String createItems(String PocId) {
        SystemIdGenarate(PocId);
        String value = null;
        System.out.println("===========POCId== CREATEITEM===========" + PocId);
        value = "OK";
        if (!value.equalsIgnoreCase("OK")) {

            return "Duplicate wash & color found . Please enter correct data.";
        }
        try {
            String stmt =
                "BEGIN MNJIT_ITEM_API_PRECOSTING.XX_FG_ITEM_CREATE_API_PROC(:1,:2); end;";
            // MNJIT_ITEM_API_PRECOSTING.MNJIT_CREATE_ITEM_API(:1,:2)
            java.sql.CallableStatement cs =
                getDBTransaction().createCallableStatement(stmt, 1);
            cs.registerOutParameter(2, OracleTypes.VARCHAR);
            cs.setString(1, PocId);
            cs.execute();
            value = cs.getString(2);
            cs.close();
        } catch (Exception e) {
            value = e.getMessage();
            e.printStackTrace();
        }
        return value;
    }

    public void setSessionValues(String userId, String orgId, String respId,
                                 String respApplId) {

        if (userId != null) {
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExternalContext ectx = fctx.getExternalContext();
            HttpSession userSession = (HttpSession)ectx.getSession(false);
            userSession.setAttribute("orgIdS", orgId);
            userSession.setAttribute("userIdS", userId);
            userSession.setAttribute("respIdS", respId);
            userSession.setAttribute("respApplIdS", respApplId);
            userSession.setAttribute("KeyFlag", getRespKey(respId));
        }
    }
    
    public String getRespKey(String respId) {

        String value = null;
        String stmt = "BEGIN :1 := mnj_precosting_common_pkg.getKey(:2); end;";
        java.sql.CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.registerOutParameter(1, OracleTypes.VARCHAR);
            cs.setString(2, respId);
            cs.execute();
            value = cs.getString(1);
            cs.close();
        } catch (Exception e) {
            ;
        }
        return value;
    }

    /**
     * Container's getter for SearchVO1.
     * @return SearchVO1
     */
    public ViewObjectImpl getSearchVO1() {
        return (ViewObjectImpl)findViewObject("SearchVO1");
    }
}


