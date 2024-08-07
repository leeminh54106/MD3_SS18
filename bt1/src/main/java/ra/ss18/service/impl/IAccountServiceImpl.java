package ra.ss18.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.ss18.dao.IAccountDao;
import ra.ss18.dao.impl.IAccountDaoImpl;
import ra.ss18.model.Account;
import ra.ss18.service.IAccountService;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IAccountServiceImpl implements IAccountService {


    private final IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public Boolean saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public Boolean updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public Boolean deleteAccount(Long id) {
        return accountDao.deleteAccount(id);
    }

    @Override
    public List<Account> getAccountByName(String accountName) {
        return accountDao.getAccountByName(accountName);
    }
}
