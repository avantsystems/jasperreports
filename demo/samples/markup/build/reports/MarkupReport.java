/*
 * Generated by JasperReports - 8/31/19, 9:16 PM
 */
import java.awt.Color;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYBubbleRenderer;

import net.sf.jasperreports.charts.*;
import net.sf.jasperreports.charts.design.*;
import net.sf.jasperreports.charts.util.*;
import net.sf.jasperreports.crosstabs.*;
import net.sf.jasperreports.crosstabs.design.*;
import net.sf.jasperreports.crosstabs.fill.calculation.BucketDefinition;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.base.JRBaseChartPlot.JRBaseSeriesColor;
import net.sf.jasperreports.engine.base.JRBaseFont;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.type.*;
import net.sf.jasperreports.engine.util.ReportCreator;


public class MarkupReport implements ReportCreator
{

  public JasperDesign create() throws JRException
  {
    JasperDesign jasperDesign = new JasperDesign();
    jasperDesign.setName("MarkupReport");
    jasperDesign.setLanguage("java");
    jasperDesign.setPageWidth( 595);
    jasperDesign.setPageHeight( 842);
    jasperDesign.setWhenNoDataType(net.sf.jasperreports.engine.type.WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
    jasperDesign.setColumnWidth( 555);
    jasperDesign.setColumnSpacing( 0);
    jasperDesign.setLeftMargin( 20);
    jasperDesign.setRightMargin( 20);
    jasperDesign.setTopMargin( 30);
    jasperDesign.setBottomMargin( 30);
    
    
    
    //styles
    JRDesignStyle Sans_Normal = new JRDesignStyle();
    Sans_Normal.setName("Sans_Normal");
    Sans_Normal.setDefault(true);
    Sans_Normal.setFontName("DejaVu Sans");
    Sans_Normal.setFontSize(10f);
    Sans_Normal.setBold(false);
    Sans_Normal.setItalic(false);
    Sans_Normal.setUnderline(false);
    Sans_Normal.setStrikeThrough(false);
    JRParagraph Sans_NormalParagraph = Sans_Normal.getParagraph();
    jasperDesign.addStyle(Sans_Normal);

    JRDesignDataset reportMainDataset = new JRDesignDataset(true);
    reportMainDataset.setName("MarkupReport");
    JRDesignParameter reportMainDatasetParameter18 = new JRDesignParameter();
    reportMainDatasetParameter18.setName("RtfText");
    reportMainDatasetParameter18.setValueClassName("java.lang.String");
    reportMainDataset.addParameter(reportMainDatasetParameter18);
    JRDesignParameter reportMainDatasetParameter19 = new JRDesignParameter();
    reportMainDatasetParameter19.setName("HtmlText");
    reportMainDatasetParameter19.setValueClassName("java.lang.String");
    reportMainDataset.addParameter(reportMainDatasetParameter19);
    jasperDesign.setMainDataset(reportMainDataset);
    //title

    //band name = titleBand

    JRDesignBand titleBand = new JRDesignBand();
    titleBand.setHeight( 350);
    JRDesignStaticText titleBand_0 = new JRDesignStaticText(jasperDesign);
    titleBand_0.setPositionType(net.sf.jasperreports.engine.type.PositionTypeEnum.FIX_RELATIVE_TO_TOP);
    titleBand_0.setMode(net.sf.jasperreports.engine.type.ModeEnum.OPAQUE);
    titleBand_0.setX( 0);
    titleBand_0.setY( 0);
    titleBand_0.setWidth( 555);
    titleBand_0.setHeight( 110);
    titleBand_0.setBackcolor(new Color(192, 192, 192));
    titleBand_0.setMarkup("styled");
    titleBand_0.setFontSize(16f);
    JRParagraph titleBand_0Paragraph = titleBand_0.getParagraph();
    titleBand_0.setText("This is a <style isBold=\"true\" isItalic=\"true\" isUnderline=\"true\">static text</style> element containing styled text. <style backcolor=\"yellow\" isBold=\"true\" isItalic=\"true\">Styled text</style> elements are introduced by setting the <style forecolor=\"blue\" isItalic=\"true\">markup</style> attribute available for the <style isBold=\"true\" forecolor=\"magenta\">textElement</style> tag to <style forecolor=\"red\" isItalic=\"true\">styled</style> and by formatting the text content using nested <style isBold=\"true\" forecolor=\"green\">style</style> tags and simple HTML tags, including <a type=\"Reference\" href=\"http://jasperreports.sf.net\" target=\"Blank\"><style isItalic=\"true\" isBold=\"true\" isUnderline=\"true\" forecolor=\"yellow\">hyperlinks</style></a>.");
    titleBand.addElement(titleBand_0);

    JRDesignTextField titleBand_1 = new JRDesignTextField(jasperDesign);
    titleBand_1.setStretchWithOverflow(true);
    titleBand_1.setPositionType(net.sf.jasperreports.engine.type.PositionTypeEnum.FLOAT);
    titleBand_1.setMode(net.sf.jasperreports.engine.type.ModeEnum.OPAQUE);
    titleBand_1.setX( 0);
    titleBand_1.setY( 120);
    titleBand_1.setWidth( 555);
    titleBand_1.setHeight( 110);
    titleBand_1.setBackcolor(new Color(192, 192, 192));
    titleBand_1.setMarkup("rtf");
    titleBand_1.setFontSize(16f);
    JRParagraph titleBand_1Paragraph = titleBand_1.getParagraph();
    JRDesignExpression titleBand_1Expression = new JRDesignExpression();
    titleBand_1Expression.setId( 8);
    titleBand_1Expression.setText("$P{RtfText}");
    titleBand_1.setExpression(titleBand_1Expression);
    titleBand.addElement(titleBand_1);

    JRDesignTextField titleBand_2 = new JRDesignTextField(jasperDesign);
    titleBand_2.setStretchWithOverflow(true);
    titleBand_2.setPositionType(net.sf.jasperreports.engine.type.PositionTypeEnum.FLOAT);
    titleBand_2.setMode(net.sf.jasperreports.engine.type.ModeEnum.OPAQUE);
    titleBand_2.setX( 0);
    titleBand_2.setY( 240);
    titleBand_2.setWidth( 555);
    titleBand_2.setHeight( 110);
    titleBand_2.setBackcolor(new Color(192, 192, 192));
    titleBand_2.setMarkup("html");
    titleBand_2.setFontSize(16f);
    JRParagraph titleBand_2Paragraph = titleBand_2.getParagraph();
    JRDesignExpression titleBand_2Expression = new JRDesignExpression();
    titleBand_2Expression.setId( 9);
    titleBand_2Expression.setText("$P{HtmlText}");
    titleBand_2.setExpression(titleBand_2Expression);
    titleBand.addElement(titleBand_2);

    jasperDesign.setTitle(titleBand);

    return jasperDesign;
  }

}
