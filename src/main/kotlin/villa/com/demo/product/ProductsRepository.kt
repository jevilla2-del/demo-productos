package villa.com.demo.product

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductsRepository : JpaRepository<Product, Int> {
    fun DevolverUno(id: Int?): Product {
        return findById(id!!).orElseThrow()
    }

    fun DevolverTodos(): List<Product> {
        return findAll()
    }

    fun crearProducto(product: Product): Product {
        return save(product)
    }

    fun actualizarProducto(id: Int, product: Product): Product {
        product.id = id
        return save(product)
    }

    fun eliminarProducto(id: Int): Product {
        val producto = DevolverUno(id)
        delete(producto)
        return producto
    }
}