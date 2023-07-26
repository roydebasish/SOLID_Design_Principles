
/**
 *SOLID Principles
 * SOLID is an acronym for the first five object-oriented design (ODD)
 * principles by Robert C. Martin
 *
 * S -> Single Responsibility Principle -
 *              A class should have one and only one reason to change.
 * O ->
 * L ->
 * I ->
 * D ->
 */


public class SingleResponsiblityExp1 {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();
    }
}

class AccountService{

    AccountRepository accountRepository = new AccountRepository();
    NotificationService notificationService = new NotificationService();


    public void openAccount(){
        System.out.println("Fill up account details");

        accountRepository.create();
        notificationService.sendNotification();
    }
}

class AccountRepository{
    public void create(){
        System.out.println("Store account details in a database");
    }
}

class NotificationService{
    public void sendNotification(){
        System.out.println("Send out welcome message");
    }
}
