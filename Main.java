package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        ReportFactory politeFactory = new PoliteReportFactory();
        Report politeReport = politeFactory.createReport("reporte anual", "este es el contenido del reporte anual", "antonio perez");
        politeReport.createReport();

        ReportFactory numericFactory = new NumericReportFactory();
        Report numericReport = numericFactory.createReport("reporte financiero", "este es el contenido del reporte financiero", "caroline smith");
        numericReport.createReport();

        ReportFactory webFactory = new WebReportFactory();
        Report webReport = webFactory.createReport("reporte web", "este es el contenido del reporte web", "christopher taipe");
        webReport.createReport();
    }

}
