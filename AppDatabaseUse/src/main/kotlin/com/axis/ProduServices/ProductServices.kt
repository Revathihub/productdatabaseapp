package com.axis.ProduServices
import com.axis.ProductModal.Product
import com.axis.ProductUtility.ProductUtility

class ProductServices{
    var productUtility=ProductUtility()

    fun insert() {
        var res=productUtility.insert()
        println(res)
    }
    fun viewAllProductDetails(){
        productUtility.selectAllDetails()
    }
    fun insertUserInput(product:Product) {
        productUtility.userInputInsert(product)
    }

}