package org.abimon.dnd.util

import java.util.*
import javax.script.ScriptEngineManager

object RandomHelper {
    private val nashorn = ScriptEngineManager().getEngineByName("nashorn")

    fun eval(script: String): Any? = nashorn.eval(script.replace("[^0-9+\\-*/=^&| ]".toRegex(), "").let { if(it.isBlank()) "1+1" else it })
}

fun Random.roll(sides: Int): Int = nextInt(sides) + 1

fun Random.d6(): Int = roll(6)
fun Random.d20(): Int = roll(20)

fun Random.rollWithModifiers(sides: Int, modifiers: String): Int = (RandomHelper.eval("${roll(sides)}$modifiers") as? Int) ?: 1