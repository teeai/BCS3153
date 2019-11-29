package edu.ijse.gdse41.dominos.view.controller;

import edu.ijse.gdse41.dominos.DB.DBConnection;
import javafx.embed.swing.SwingNode;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Created by SHEHANKA on 6/1/2017.
 */
public class JasperReportViewerController {
    public void setView(JasperPrint print){
        SwingNode node=new SwingNode();
        JRViewer view=new JRViewer(print);
        view.setZoomRatio((float) 0.54);
        view.setPreferredSize(new Dimension(print.getPageWidth(),print.getPageHeight()));
        view.requestFocusInWindow();
        view.repaint();
        view.revalidate();
        JPanel pnl=new JPanel();
        pnl.add(view);
        pnl.setSize(print.getPageWidth(),print.getPageHeight());
        node.setContent(pnl);
        node.requestFocus();
        //((Stage)())
    }

    //Method 2
    //For Parameterized Custom Query Report..!

    public void viewReport(JasperDesign report) throws SQLException, JRException{

        try {
            Connection conn = DBConnection.getDBConnection().getConnection();
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp,false);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }

}
}
