package com.zhouyi.store.dao.imp;
import com.zhouyi.store.dao.CustomerDao;
import com.zhouyi.store.domain.Customer;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDaoImpJdbcTest {

    CustomerDao dao;

    @BeforeEach
    void setup(){
        dao = new CustomerDaoImpJdbc();
    }

    @AfterEach
    void tearDown(){
        dao = null;
    }

    @Test
    void findByPk() {
        Customer customer = dao.findByPk("1000");
        assertNotNull(customer);
        assertEquals("1000", customer.getId());
        assertEquals("yizhou", customer.getName());
        assertEquals("zhouyi1992", customer.getPassword());
        assertEquals("perth", customer.getAddress());
        assertEquals("17721087899", customer.getPhone());
        assertEquals(19920220, customer.getBirthday().getTime());

    }

    @Test
    void findAll() {
        List<Customer> list = dao.findAll();
        assertEquals(list.size(),1);
    }

    @Test
    void create() {
        Customer customer = new Customer();
        customer.setId("1001");
        customer.setName("Ben");
        customer.setPassword("admin");
        customer.setAddress("Shanghai");
        customer.setPhone("10086");
        customer.setBirthday(new Date(122222222));
        dao.create(customer);
        //按照主键查询
        Customer customer2 = dao.findByPk("1001");
        assertEquals("1001", customer2.getId());
        assertEquals("Ben", customer2.getName());
        assertEquals("admin", customer2.getPassword());
        assertEquals("Shanghai", customer2.getAddress());
        assertEquals("10086", customer2.getPhone());
        assertEquals(122222222, customer2.getBirthday().getTime());

    }

    @Test
    void modify() {
        Customer customer = new Customer();
        customer.setId("1001");
        customer.setName("NewBen");
        customer.setPassword("admin2");
        customer.setAddress("Shanghai2");
        customer.setPhone("100862");
        customer.setBirthday(new Date(1222222222));
        dao.modify(customer);
        Customer customer2 = dao.findByPk("1001");
        assertEquals("1001", customer2.getId());
        assertEquals("NewBen", customer2.getName());
        assertEquals("admin2", customer2.getPassword());
        assertEquals("Shanghai2", customer2.getAddress());
        assertEquals("100862", customer2.getPhone());
        assertEquals(1222222222, customer2.getBirthday().getTime());

    }

    @Test
    void remove() {
        dao.remove("1001");
        Customer customer = dao.findByPk("1001");
        assertNull(customer);
    }
}