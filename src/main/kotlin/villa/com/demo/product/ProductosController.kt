package villa.com.demo.product

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class ProductosController {
    @Autowired
    lateinit var productosService: ProductosService

    @GetMapping("/productos")
    fun obtenerProductos(): List<Product> {
        return productosService.Productos()
    }

    @GetMapping("/producto/{id}")
    fun obtenerProducto(@PathVariable id: Int): Product {
        return productosService.ProductoId(id)
    }

    @PostMapping("/producto")
    fun crearProducto(@RequestBody producto: Product): Product {
        return productosService.crearProducto(producto)
    }

    @DeleteMapping("/producto/{id}")
    fun eliminarProducto(@PathVariable id: Int): Product {
        return productosService.eliminarProducto(id)
    }

    @PatchMapping("/producto/{id}")
    fun actualizarProducto(@PathVariable id: Int, @RequestBody producto: Product): Product {
        return productosService.actualizarProducto(id, producto)
    }
}