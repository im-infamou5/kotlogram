package com.github.badoualy.telegram.tl.api.contacts

/**
 * contacts.topPeersNotModified#de266ef5
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLTopPeersNotModified : TLAbsTopPeers() {
    private val _constructor: String = "contacts.topPeersNotModified#de266ef5"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLTopPeersNotModified) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xde266ef5.toInt()
    }
}