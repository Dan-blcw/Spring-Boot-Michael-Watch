package com.alibou.security.demo;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codingerror.model.AddressDetails;
import com.codingerror.model.HeaderDetails;
import com.codingerror.model.Product;
import com.codingerror.model.ProductTableHeader;
import com.codingerror.service.CodingErrorPdfInvoiceCreator;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/v1/demo-controller")
@Hidden
public class DemoController {

  @GetMapping
  public ResponseEntity<String> sayHello() throws FileNotFoundException {
//    LocalDate ld= LocalDate.now();
//    String pdfName= ld+".pdf";
//    CodingErrorPdfInvoiceCreator cepdf=new CodingErrorPdfInvoiceCreator(pdfName);
//    cepdf.createDocument();
//
//    //Create Header start
//    HeaderDetails header=new HeaderDetails();
//    header.setInvoiceNo("RK35623").setInvoiceDate(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).build();
//    cepdf.createHeader(header);
//    //Header End
//
//    //Create Address start
//    AddressDetails addressDetails=new AddressDetails();
//    addressDetails
//            .setBillingCompany("Coding Error")
//            .setBillingName("Bhaskar")
//            .setBillingAddress("Bangluru,karnataka,india\n djdj\ndsjdsk")
//            .setBillingEmail("codingerror303@gmail.com")
//            .setShippingName("Customer Name \n")
//            .setShippingAddress("Banglore Name sdss\n swjs\n")
//            .build();
//
//    cepdf.createAddress(addressDetails);
//    //Address end
//
//    //Product Start
//    ProductTableHeader productTableHeader=new ProductTableHeader();
//    cepdf.createTableHeader(productTableHeader);
//    List<Product> productList=cepdf.getDummyProductList();
//    productList=cepdf.modifyProductList(productList);
//    cepdf.createProduct(productList);
//    //Product End
//
//    //Term and Condition Start
//    List<String> TncList=new ArrayList<>();
//    TncList.add("1. The Seller shall not be liable to the Buyer directly or indirectly for any loss or damage suffered by the Buyer.");
//    TncList.add("2. The Seller warrants the product for one (1) year from the date of shipment");
//    String imagePath="src/main/resources/ce_logo_circle_transparent.png";
//    cepdf.createTnc(TncList,false,imagePath);
//    // Term and condition end
//    System.out.println("pdf genrated");
    return ResponseEntity.ok("What's up, Dan from secured endpoint");
  }


//  public static void main(String[] args) throws FileNotFoundException {
//      LocalDate ld= LocalDate.now();
//      String pdfName= ld+".pdf";
//      CodingErrorPdfInvoiceCreator cepdf=new CodingErrorPdfInvoiceCreator(pdfName);
//      cepdf.createDocument();
//
//      //Create Header start
//      HeaderDetails header=new HeaderDetails();
//      header.setInvoiceNo("RK35623").setInvoiceDate(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).build();
//      cepdf.createHeader(header);
//      //Header End
//
//      //Create Address start
//      AddressDetails addressDetails=new AddressDetails();
//      addressDetails
//              .setBillingCompany("Coding Error")
//              .setBillingName("Bhaskar")
//              .setBillingAddress("Bangluru,karnataka,india\n djdj\ndsjdsk")
//              .setBillingEmail("codingerror303@gmail.com")
//              .setShippingName("Customer Name \n")
//              .setShippingAddress("Banglore Name sdss\n swjs\n")
//              .build();
//
//      cepdf.createAddress(addressDetails);
//      //Address end
//
//      //Product Start
//      ProductTableHeader productTableHeader=new ProductTableHeader();
//      cepdf.createTableHeader(productTableHeader);
//      List<Product> productList=cepdf.getDummyProductList();
//      productList=cepdf.modifyProductList(productList);
//      cepdf.createProduct(productList);
//      //Product End
//
//      //Term and Condition Start
//      List<String> TncList=new ArrayList<>();
//      TncList.add("1. The Seller shall not be liable to the Buyer directly or indirectly for any loss or damage suffered by the Buyer.");
//      TncList.add("2. The Seller warrants the product for one (1) year from the date of shipment");
//      String imagePath="src/main/resources/ce_logo_circle_transparent.png";
//      cepdf.createTnc(TncList,false,imagePath);
//      // Term and condition end
//      System.out.println("pdf genrated");
//    }

}
