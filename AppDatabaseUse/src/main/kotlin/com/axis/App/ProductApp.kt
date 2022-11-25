package com.axis.App
import com.axis.ProductModal.Product
import com.axis.ProduServices.ProductServices
import java.util.*

fun main(){
    var serviceobj=ProductServices()
    var scan=Scanner(System.`in`)
    println("Enter ProductId:")
    var productid=scan.nextInt()
    println("Enter ProductName:")
    var productname=scan.next()
    println("Enter ProductPrice:")
    var productprice=scan.nextDouble()
    println("Enter ProductQuantity:")
    var productquantity=scan.nextInt()

    var product=Product(productid,productname,productprice,productquantity)


    //serviceobj.insert()
    serviceobj.insertUserInput(product)
    serviceobj.viewAllProductDetails()
}
