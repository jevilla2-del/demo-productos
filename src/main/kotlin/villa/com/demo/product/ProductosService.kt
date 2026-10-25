package villa.com.demo.product

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductosService {
    @Autowired
    private lateinit var productsRepository: ProductsRepository

    fun Productos(): List<Product> {
        return productsRepository.DevolverTodos()
    }

    fun eliminarProducto(id: Int): Product {
        return productsRepository.eliminarProducto(id)
    }

    fun actualizarProducto(id: Int, product: Product): Product {
        return productsRepository.actualizarProducto(id, product)
    }

    fun crearProducto(product: Product): Product {
        return productsRepository.crearProducto(product)
    }

    fun ProductoId(id: Int): Product {
        return productsRepository.DevolverUno(id)
    }
}