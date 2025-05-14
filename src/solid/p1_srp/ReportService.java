package src.solid.p1_srp;

public class ReportService {
    // this service class 2 responsibilities  , which violates SRP
    public void genrateReport(){
        // getting data from external resource and making report out of it
    }

    public void saveReportToDB(){
        // saving report to DB
    }
}
