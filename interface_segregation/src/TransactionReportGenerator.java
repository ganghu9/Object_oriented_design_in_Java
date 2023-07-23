public class TransactionReportGenerator {

    private Reporting transactionObject;

    public TransactionReportGenerator(Reporting aTransaction) {
        System.out.println(transactionObject.getName() + " " + transactionObject.getDate() + " " +
                transactionObject.getProductBreakdown());

    }
}
