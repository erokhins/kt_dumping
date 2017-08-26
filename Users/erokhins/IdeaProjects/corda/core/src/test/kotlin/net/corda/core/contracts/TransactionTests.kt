'TestDependencyInjectionBase' @ [18:26] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'keys' @ [20:23] ==> value-parameter vararg keys: KeyPair defined in net.corda.core.contracts.TransactionTests.makeSigned[ValueParameterDescriptorImpl]

'map' @ [20:28] ==> public inline fun <T, R> Array<out KeyPair>.map(transform: (KeyPair) -> TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair
    <R> -> TransactionSignature

'it' @ [20:34] ==> value-parameter it: KeyPair defined in net.corda.core.contracts.TransactionTests.makeSigned.<anonymous>[ValueParameterDescriptorImpl]

'sign' @ [20:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [20:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'wtx' @ [20:55] ==> value-parameter wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.makeSigned[ValueParameterDescriptorImpl]

'id' @ [20:59] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'SignatureMetadata' @ [20:63] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [20:84] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [20:91] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [20:111] ==> value-parameter it: KeyPair defined in net.corda.core.contracts.TransactionTests.makeSigned.<anonymous>[ValueParameterDescriptorImpl]

'public' @ [20:114] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [20:122] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'if (notarySig) {
            keySigs + DUMMY_NOTARY_KEY.sign(SignableData(wtx.id, SignatureMetadata(1, Crypto.findSignatureScheme(DUMMY_NOTARY_KEY.public).schemeNumberID)))
        } else {
            keySigs
        }' @ [21:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TransactionSignature>, elseBranch: List<TransactionSignature>): List<TransactionSignature>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TransactionSignature>

'notarySig' @ [21:24] ==> value-parameter notarySig: Boolean = ... defined in net.corda.core.contracts.TransactionTests.makeSigned[ValueParameterDescriptorImpl]

'keySigs' @ [22:13] ==> val keySigs: List<TransactionSignature> defined in net.corda.core.contracts.TransactionTests.makeSigned[LocalVariableDescriptor]

'DUMMY_NOTARY_KEY' @ [22:23] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'sign' @ [22:40] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [22:45] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'wtx' @ [22:58] ==> value-parameter wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.makeSigned[ValueParameterDescriptorImpl]

'id' @ [22:62] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'SignatureMetadata' @ [22:66] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [22:87] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [22:94] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY_KEY' @ [22:114] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [22:131] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [22:139] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keySigs' @ [24:13] ==> val keySigs: List<TransactionSignature> defined in net.corda.core.contracts.TransactionTests.makeSigned[LocalVariableDescriptor]

'SignedTransaction' @ [26:16] ==> public constructor SignedTransaction(ctx: CoreTransaction, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.SignedTransaction[DeserializedClassConstructorDescriptor]

'wtx' @ [26:34] ==> value-parameter wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.makeSigned[ValueParameterDescriptorImpl]

'sigs' @ [26:39] ==> val sigs: List<TransactionSignature> defined in net.corda.core.contracts.TransactionTests.makeSigned[LocalVariableDescriptor]

'Test' @ [29:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateKeyPair' @ [31:18] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [32:18] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [33:18] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ak' @ [34:20] ==> val ak: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'public' @ [34:23] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'bk' @ [35:20] ==> val bk: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'public' @ [35:23] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'ck' @ [36:20] ==> val ck: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'public' @ [36:23] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'CompositeKey' @ [37:18] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [37:31] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [37:41] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'apub' @ [37:49] ==> val apub: (PublicKey..PublicKey?) defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'bpub' @ [37:55] ==> val bpub: (PublicKey..PublicKey?) defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'build' @ [37:61] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [38:23] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [38:36] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [38:46] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'c1' @ [38:54] ==> val c1: PublicKey defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'cpub' @ [38:58] ==> val cpub: (PublicKey..PublicKey?) defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'build' @ [38:64] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'WireTransaction' @ [39:19] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'listOf' @ [40:26] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'StateRef' @ [40:33] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [40:42] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [40:53] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [41:31] ==> public fun <T> emptyList(): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'emptyList' @ [42:27] ==> public fun <T> emptyList(): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'listOf' @ [43:28] ==> public fun <T> listOf(element: Command<TypeOnlyCommandData>): List<Command<TypeOnlyCommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<TypeOnlyCommandData>

'dummyCommand' @ [43:35] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'compKey' @ [43:48] ==> val compKey: PublicKey defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [43:57] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [43:69] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_KEY_2' @ [43:77] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [43:89] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_NOTARY' @ [44:26] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<(PublicKey..PublicKey?)>, actual: Set<(PublicKey..PublicKey?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<(java.security.PublicKey..java.security.PublicKey?)>

'setOf' @ [48:17] ==> public fun <T> setOf(vararg elements: (PublicKey..PublicKey?)): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'compKey' @ [48:23] ==> val compKey: PublicKey defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_2' @ [48:32] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [48:44] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertFailsWith' @ [49:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): SignedTransaction.SignaturesMissingException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> SignaturesMissingException

'makeSigned' @ [49:81] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [49:92] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [49:97] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'verifyRequiredSignatures' @ [49:110] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'missing' @ [49:139] ==> public final val missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedPropertyDescriptor]

'assertEquals' @ [52:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<(PublicKey..PublicKey?)>, actual: Set<(PublicKey..PublicKey?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<(java.security.PublicKey..java.security.PublicKey?)>

'setOf' @ [53:17] ==> public fun <T> setOf(vararg elements: (PublicKey..PublicKey?)): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'compKey' @ [53:23] ==> val compKey: PublicKey defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_2' @ [53:32] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [53:44] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertFailsWith' @ [54:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): SignedTransaction.SignaturesMissingException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> SignaturesMissingException

'makeSigned' @ [54:81] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [54:92] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [54:97] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'ak' @ [54:110] ==> val ak: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [54:114] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'missing' @ [54:143] ==> public final val missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedPropertyDescriptor]

'makeSigned' @ [56:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [56:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [56:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_KEY_2' @ [56:38] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'ak' @ [56:51] ==> val ak: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'bk' @ [56:55] ==> val bk: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [56:59] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'makeSigned' @ [57:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [57:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [57:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_KEY_2' @ [57:38] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'ck' @ [57:51] ==> val ck: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [57:55] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'makeSigned' @ [58:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [58:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [58:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_KEY_2' @ [58:38] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'ak' @ [58:51] ==> val ak: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'bk' @ [58:55] ==> val bk: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'ck' @ [58:59] ==> val ck: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [58:63] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'makeSigned' @ [59:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [59:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [59:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_KEY_2' @ [59:38] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'ak' @ [59:51] ==> val ak: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'verifySignaturesExcept' @ [59:55] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'compKey' @ [59:78] ==> val compKey: PublicKey defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'makeSigned' @ [60:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [60:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [60:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'ak' @ [60:38] ==> val ak: KeyPair defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'verifySignaturesExcept' @ [60:42] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'compKey' @ [60:65] ==> val compKey: PublicKey defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures - CompositeKey`[LocalVariableDescriptor]

'DUMMY_KEY_2' @ [60:74] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [60:86] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Test' @ [63:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'WireTransaction' @ [65:19] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'listOf' @ [66:26] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'StateRef' @ [66:33] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [66:42] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [66:53] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [67:31] ==> public fun <T> emptyList(): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'emptyList' @ [68:27] ==> public fun <T> emptyList(): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'listOf' @ [69:28] ==> public fun <T> listOf(element: Command<TypeOnlyCommandData>): List<Command<TypeOnlyCommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<TypeOnlyCommandData>

'dummyCommand' @ [69:35] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'DUMMY_KEY_1' @ [69:48] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [69:60] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_KEY_2' @ [69:68] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [69:80] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_NOTARY' @ [70:26] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertFailsWith' @ [73:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'makeSigned' @ [73:53] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [73:64] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [73:88] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [75:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<(PublicKey..PublicKey?)>, actual: Set<(PublicKey..PublicKey?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<(java.security.PublicKey..java.security.PublicKey?)>

'setOf' @ [76:17] ==> public fun <T> setOf(element: (PublicKey..PublicKey?)): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'DUMMY_KEY_1' @ [76:23] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [76:35] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertFailsWith' @ [77:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): SignedTransaction.SignaturesMissingException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> SignaturesMissingException

'makeSigned' @ [77:81] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [77:92] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'DUMMY_KEY_2' @ [77:97] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'verifyRequiredSignatures' @ [77:110] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'missing' @ [77:139] ==> public final val missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedPropertyDescriptor]

'assertEquals' @ [79:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<(PublicKey..PublicKey?)>, actual: Set<(PublicKey..PublicKey?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<(java.security.PublicKey..java.security.PublicKey?)>

'setOf' @ [80:17] ==> public fun <T> setOf(element: (PublicKey..PublicKey?)): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'DUMMY_KEY_2' @ [80:23] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [80:35] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertFailsWith' @ [81:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): SignedTransaction.SignaturesMissingException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> SignaturesMissingException

'makeSigned' @ [81:81] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [81:92] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [81:97] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'verifyRequiredSignatures' @ [81:110] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'missing' @ [81:139] ==> public final val missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedPropertyDescriptor]

'assertEquals' @ [83:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<(PublicKey..PublicKey?)>, actual: Set<(PublicKey..PublicKey?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<(java.security.PublicKey..java.security.PublicKey?)>

'setOf' @ [84:17] ==> public fun <T> setOf(element: (PublicKey..PublicKey?)): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'DUMMY_KEY_2' @ [84:23] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [84:35] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertFailsWith' @ [85:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): SignedTransaction.SignaturesMissingException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> SignaturesMissingException

'makeSigned' @ [85:81] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [85:92] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [85:97] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'verifySignaturesExcept' @ [85:120] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'DUMMY_KEY_1' @ [85:143] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [85:155] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'missing' @ [85:165] ==> public final val missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedPropertyDescriptor]

'makeSigned' @ [88:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [88:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [88:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'verifySignaturesExcept' @ [88:38] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'DUMMY_KEY_2' @ [88:61] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [88:73] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'makeSigned' @ [89:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [89:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'DUMMY_KEY_2' @ [89:25] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'verifySignaturesExcept' @ [89:38] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'DUMMY_KEY_1' @ [89:61] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [89:73] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'makeSigned' @ [91:9] ==> private final fun makeSigned(wtx: WireTransaction, vararg keys: KeyPair, notarySig: Boolean = ...): SignedTransaction defined in net.corda.core.contracts.TransactionTests[SimpleFunctionDescriptorImpl]

'wtx' @ [91:20] ==> val wtx: WireTransaction defined in net.corda.core.contracts.TransactionTests.`signed transaction missing signatures`[LocalVariableDescriptor]

'DUMMY_KEY_1' @ [91:25] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_KEY_2' @ [91:38] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'verifyRequiredSignatures' @ [91:51] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [94:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TransactionState' @ [96:28] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: DummyContract.SingleOwnerState, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> SingleOwnerState

'DummyContract' @ [96:45] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'SingleOwnerState' @ [96:59] ==> public constructor SingleOwnerState(magicNumber: Int = ..., owner: AbstractParty) defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[DeserializedClassConstructorDescriptor]

'ALICE' @ [96:79] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [96:87] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'emptyList' @ [97:22] ==> public fun <T> emptyList(): List<StateAndRef<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<*>

'listOf' @ [98:23] ==> public fun <T> listOf(vararg elements: TransactionState<DummyContract.SingleOwnerState>): List<TransactionState<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<SingleOwnerState>

'baseOutState' @ [98:30] ==> val baseOutState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'baseOutState' @ [98:44] ==> val baseOutState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'copy' @ [98:57] ==> public final fun copy(data: DummyContract.SingleOwnerState = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [98:71] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'baseOutState' @ [98:79] ==> val baseOutState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'copy' @ [98:92] ==> public final fun copy(data: DummyContract.SingleOwnerState = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'BOB' @ [98:106] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'emptyList' @ [99:24] ==> public fun <T> emptyList(): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'emptyList' @ [100:27] ==> public fun <T> emptyList(): List<Attachment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'SecureHash' @ [101:18] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [101:29] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'PrivacySalt' @ [103:40] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[DeserializedClassConstructorDescriptor]

'LedgerTransaction' @ [104:46] ==> public constructor LedgerTransaction(inputs: List<StateAndRef<ContractState>>, outputs: List<TransactionState<ContractState>>, commands: List<AuthenticatedObject<CommandData>>, attachments: List<Attachment>, id: SecureHash, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt) defined in net.corda.core.transactions.LedgerTransaction[DeserializedClassConstructorDescriptor]

'inputs' @ [105:17] ==> val inputs: List<StateAndRef<*>> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'outputs' @ [106:17] ==> val outputs: List<TransactionState<DummyContract.SingleOwnerState>> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'commands' @ [107:17] ==> val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'attachments' @ [108:17] ==> val attachments: List<Attachment> defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'id' @ [109:17] ==> val id: SecureHash.SHA256 defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'timeWindow' @ [111:17] ==> val timeWindow: TimeWindow? defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'privacySalt' @ [112:17] ==> val privacySalt: PrivacySalt defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'transaction' @ [115:9] ==> val transaction: LedgerTransaction defined in net.corda.core.contracts.TransactionTests.`transactions with no inputs can have any notary`[LocalVariableDescriptor]

'verify' @ [115:21] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'StateRef' @ [120:24] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [120:33] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [120:44] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'WireTransaction' @ [121:34] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'listOf' @ [122:26] ==> public fun <T> listOf(vararg elements: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'stateRef' @ [122:33] ==> val stateRef: StateRef defined in net.corda.core.contracts.TransactionTests.`transaction cannot have duplicate inputs`[LocalVariableDescriptor]

'stateRef' @ [122:43] ==> val stateRef: StateRef defined in net.corda.core.contracts.TransactionTests.`transaction cannot have duplicate inputs`[LocalVariableDescriptor]

'emptyList' @ [123:31] ==> public fun <T> emptyList(): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'emptyList' @ [124:27] ==> public fun <T> emptyList(): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'listOf' @ [125:28] ==> public fun <T> listOf(element: Command<TypeOnlyCommandData>): List<Command<TypeOnlyCommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<TypeOnlyCommandData>

'dummyCommand' @ [125:35] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'DUMMY_KEY_1' @ [125:48] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [125:60] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_KEY_2' @ [125:68] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [125:80] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_NOTARY' @ [126:26] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertFailsWith' @ [130:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalStateException

'buildTransaction' @ [130:50] ==> local final fun buildTransaction(): WireTransaction defined in net.corda.core.contracts.TransactionTests.`transaction cannot have duplicate inputs`[SimpleFunctionDescriptorImpl]

'Test' @ [133:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DUMMY_NOTARY' @ [135:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionState' @ [136:23] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: DummyContract.SingleOwnerState, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> SingleOwnerState

'DummyContract' @ [136:40] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'SingleOwnerState' @ [136:54] ==> public constructor SingleOwnerState(magicNumber: Int = ..., owner: AbstractParty) defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[DeserializedClassConstructorDescriptor]

'ALICE' @ [136:74] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'notary' @ [136:82] ==> val notary: Party defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'inState' @ [137:24] ==> val inState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'copy' @ [137:32] ==> public final fun copy(data: DummyContract.SingleOwnerState = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [137:46] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'listOf' @ [138:22] ==> public fun <T> listOf(element: StateAndRef<DummyContract.SingleOwnerState>): List<StateAndRef<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<SingleOwnerState>

'StateAndRef' @ [138:29] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<DummyContract.SingleOwnerState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> SingleOwnerState

'inState' @ [138:41] ==> val inState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'StateRef' @ [138:50] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [138:59] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [138:70] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'listOf' @ [139:23] ==> public fun <T> listOf(element: TransactionState<DummyContract.SingleOwnerState>): List<TransactionState<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<SingleOwnerState>

'outState' @ [139:30] ==> val outState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'emptyList' @ [140:24] ==> public fun <T> emptyList(): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'emptyList' @ [141:27] ==> public fun <T> emptyList(): List<Attachment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'SecureHash' @ [142:18] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [142:29] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'PrivacySalt' @ [144:40] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[DeserializedClassConstructorDescriptor]

'LedgerTransaction' @ [145:34] ==> public constructor LedgerTransaction(inputs: List<StateAndRef<ContractState>>, outputs: List<TransactionState<ContractState>>, commands: List<AuthenticatedObject<CommandData>>, attachments: List<Attachment>, id: SecureHash, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt) defined in net.corda.core.transactions.LedgerTransaction[DeserializedClassConstructorDescriptor]

'inputs' @ [146:17] ==> val inputs: List<StateAndRef<DummyContract.SingleOwnerState>> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'outputs' @ [147:17] ==> val outputs: List<TransactionState<DummyContract.SingleOwnerState>> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'commands' @ [148:17] ==> val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'attachments' @ [149:17] ==> val attachments: List<Attachment> defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'id' @ [150:17] ==> val id: SecureHash.SHA256 defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'notary' @ [151:17] ==> val notary: Party defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'timeWindow' @ [152:17] ==> val timeWindow: TimeWindow? defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'privacySalt' @ [153:17] ==> val privacySalt: PrivacySalt defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[LocalVariableDescriptor]

'assertFailsWith' @ [156:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): TransactionVerificationException.NotaryChangeInWrongTransactionType defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> NotaryChangeInWrongTransactionType

'buildTransaction' @ [156:96] ==> local final fun buildTransaction(): LedgerTransaction defined in net.corda.core.contracts.TransactionTests.`general transactions cannot change notary`[SimpleFunctionDescriptorImpl]

'Test' @ [159:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TransactionState' @ [161:27] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: DummyContract.SingleOwnerState, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> SingleOwnerState

'DummyContract' @ [161:44] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'SingleOwnerState' @ [161:58] ==> public constructor SingleOwnerState(magicNumber: Int = ..., owner: AbstractParty) defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[DeserializedClassConstructorDescriptor]

'ALICE' @ [161:78] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [161:86] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'WireTransaction' @ [162:34] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'emptyList' @ [163:26] ==> public fun <T> emptyList(): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'emptyList' @ [164:31] ==> public fun <T> emptyList(): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'listOf' @ [165:27] ==> public fun <T> listOf(element: TransactionState<DummyContract.SingleOwnerState>): List<TransactionState<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<SingleOwnerState>

'outputState' @ [165:34] ==> val outputState: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.TransactionTests.`transactions with identical contents must have different ids`[LocalVariableDescriptor]

'listOf' @ [166:28] ==> public fun <T> listOf(element: Command<TypeOnlyCommandData>): List<Command<TypeOnlyCommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<TypeOnlyCommandData>

'dummyCommand' @ [166:35] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'DUMMY_KEY_1' @ [166:48] ==> public val DUMMY_KEY_1: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [166:60] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'DUMMY_KEY_2' @ [166:68] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [166:80] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'PrivacySalt' @ [169:31] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[DeserializedClassConstructorDescriptor]

'buildTransaction' @ [172:24] ==> local final fun buildTransaction(): WireTransaction defined in net.corda.core.contracts.TransactionTests.`transactions with identical contents must have different ids`[SimpleFunctionDescriptorImpl]

'buildTransaction' @ [173:24] ==> local final fun buildTransaction(): WireTransaction defined in net.corda.core.contracts.TransactionTests.`transactions with identical contents must have different ids`[SimpleFunctionDescriptorImpl]

'assertNotEquals' @ [175:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'issueTx1' @ [175:25] ==> val issueTx1: WireTransaction defined in net.corda.core.contracts.TransactionTests.`transactions with identical contents must have different ids`[LocalVariableDescriptor]

'id' @ [175:34] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'issueTx2' @ [175:38] ==> val issueTx2: WireTransaction defined in net.corda.core.contracts.TransactionTests.`transactions with identical contents must have different ids`[LocalVariableDescriptor]

'id' @ [175:47] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

