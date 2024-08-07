package ra.ss18.dao;

import ra.ss18.model.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAll();
    Account getAccountById(Long id);
    Boolean saveAccount(Account account);
    Boolean updateAccount(Account account);
    Boolean deleteAccount(Long id);
    List<Account> getAccountByName(String accountName);
}
