package ra.ss18.service;

import ra.ss18.model.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();
    Account getAccountById(Long id);
    Boolean saveAccount(Account account);
    Boolean updateAccount(Account account);
    Boolean deleteAccount(Long id);
    List<Account> getAccountByName(String accountName);
}
