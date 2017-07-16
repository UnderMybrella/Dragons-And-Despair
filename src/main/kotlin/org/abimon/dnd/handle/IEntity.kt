package org.abimon.dnd.handle

interface IEntity {
    /** Stats */
    val strength: Int
    val dexterity: Int
    val constitution: Int
    val intelligence: Int
    val wisdom: Int
    val charisma: Int

    val armorClass: Int
    val speed: Int
}