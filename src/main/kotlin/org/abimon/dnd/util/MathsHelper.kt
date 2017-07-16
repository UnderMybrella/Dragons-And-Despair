package org.abimon.dnd.util

val <T: Number> T.asModifier: Int
    get() = (this.toInt() / 2) - 5