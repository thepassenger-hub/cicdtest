package com.example.githubpagesdemo.Unit

import com.example.githubpagesdemo.controller.Controller
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment


@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
class ControllerUnitTests {

    private val controller = Controller()

    @Test
    fun `Assert calling the getHello method does return "hello world"`() = runBlocking {
        assertDoesNotThrow { controller.getHello() }
        val out = controller.getHello()
        assert(out == "hello world")
    }
}