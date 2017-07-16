package org.abimon.dnd.handle

interface IEntity {
    /** Stats */
    val strength: Int
    val dexterity: Int
    val constitution: Int
    val intelligence: Int
    val wisdom: Int
    val charisma: Int

    /** The maximum health this entity can have */
    val maxHP: Int
    /** The temporary health **modifier** this entity has */
    var tmpHP: Int
    /** The current health this entity has */
    var hp: Int

    val armorClass: Int
    val speed: Int
}