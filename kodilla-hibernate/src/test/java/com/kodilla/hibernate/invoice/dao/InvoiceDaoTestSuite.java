package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
//    @Autowired
//    private ItemDao itemDao;
//    @Autowired
//    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Television");
        Product product2 = new Product("Water");
        Product product3 = new Product("Sugar");

        Item item1 = new Item(product1, new BigDecimal(1999), 1, new BigDecimal(1999));
        Item item2 = new Item(product2, new BigDecimal(1), 12, new BigDecimal(12));
        Item item3 = new Item(product3, new BigDecimal(2), 3, new BigDecimal(6));

        Invoice invoice = new Invoice("1/2017");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id);
    }
}
