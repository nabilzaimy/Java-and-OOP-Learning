package Revision.VaultCompositionTest;

import java.util.ArrayList;

public class CentralVault {

    VaultSecurityLock securityLock;
    ArrayList<AuditLog> auditTrail;

    CentralVault(){
        this.securityLock = new VaultSecurityLock("AES-256");
        this.auditTrail = new ArrayList<>();
    }

    public void RecordTransaction(Double amount , String type){
        AuditLog log = new AuditLog(amount , type);
        auditTrail.add(log);
    }

    public void printAuditReport(){
        System.out.println("--- AUDIT REPORT LOG ---");
        for(AuditLog log : auditTrail){
            System.out.println(log);
            System.out.println("--------------------------------");
        }
    }
}
