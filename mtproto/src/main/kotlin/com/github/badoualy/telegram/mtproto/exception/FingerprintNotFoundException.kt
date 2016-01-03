package com.github.badoualy.telegram.mtproto.exception

class FingerprintNotFoundException : Exception {

    constructor() {
    }

    constructor(s: String) : super(s) {
    }

    constructor(s: String, throwable: Throwable) : super(s, throwable) {
    }

    constructor(throwable: Throwable) : super(throwable) {
    }
}
