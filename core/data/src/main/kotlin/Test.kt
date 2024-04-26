import androidx.compose.material.Text
import androidx.compose.runtime.Composable

object Test {
    @JvmStatic
    val hello: String = "Hello World"

    @Composable
    fun test() {
        Text(hello)
    }
}
