package Revision.VaultCompositionTest;

public class VaultSecurityLock {

    private String encryptionType;

    VaultSecurityLock(String encryptionType){
        this.encryptionType = encryptionType;
    }

    public void lockStatus(){
        System.out.println("Lock Active !");
    }
}
