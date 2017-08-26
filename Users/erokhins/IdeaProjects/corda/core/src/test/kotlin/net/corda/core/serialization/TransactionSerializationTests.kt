'TestCash' @ [18:53] ==> public constructor TestCash() defined in net.corda.core.serialization.TransactionSerializationTests.TestCash[ClassConstructorDescriptorImpl]

'TestDependencyInjectionBase' @ [20:39] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'TEST_PROGRAM_ID' @ [29:47] ==> public val TEST_PROGRAM_ID: TransactionSerializationTests.TestCash defined in net.corda.core.serialization in file TransactionSerializationTests.kt[PropertyDescriptorImpl]

'listOf' @ [31:25] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owner' @ [31:32] ==> public open val owner: AbstractParty defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.State[PropertyDescriptorImpl]

'CommandAndState' @ [33:66] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [33:91] ==> public constructor Move() defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [33:99] ==> public final fun copy(deposit: PartyAndReference = ..., amount: Amount<Currency> = ..., owner: AbstractParty = ...): TransactionSerializationTests.TestCash.State defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [33:112] ==> value-parameter newOwner: AbstractParty defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.State.withNewOwner[ValueParameterDescriptorImpl]

'TypeOnlyCommandData' @ [37:26] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'MINI_CORP' @ [43:22] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [43:32] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'generateStateRef' @ [44:24] ==> public fun generateStateRef(): StateRef defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'StateAndRef' @ [45:22] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<TransactionSerializationTests.TestCash.State>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'TransactionState' @ [45:34] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: TransactionSerializationTests.TestCash.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'State' @ [45:60] ==> public constructor State(deposit: PartyAndReference, amount: Amount<Currency>, owner: AbstractParty) defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.State[ClassConstructorDescriptorImpl]

'depositRef' @ [45:66] ==> public final val depositRef: PartyAndReference defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'POUNDS' @ [45:82] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [45:90] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [45:102] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'fakeStateRef' @ [45:117] ==> public final val fakeStateRef: StateRef defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'TransactionState' @ [46:23] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: TransactionSerializationTests.TestCash.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'State' @ [46:49] ==> public constructor State(deposit: PartyAndReference, amount: Amount<Currency>, owner: AbstractParty) defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.State[ClassConstructorDescriptorImpl]

'depositRef' @ [46:55] ==> public final val depositRef: PartyAndReference defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'POUNDS' @ [46:71] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [46:79] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [46:91] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionState' @ [47:23] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: TransactionSerializationTests.TestCash.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'State' @ [47:49] ==> public constructor State(deposit: PartyAndReference, amount: Amount<Currency>, owner: AbstractParty) defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.State[ClassConstructorDescriptorImpl]

'depositRef' @ [47:55] ==> public final val depositRef: PartyAndReference defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'POUNDS' @ [47:71] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [47:79] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [47:91] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [49:28] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [49:41] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [50:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY_KEY' @ [50:39] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'Before' @ [53:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'tx' @ [55:9] ==> public final lateinit var tx: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'TransactionBuilder' @ [55:14] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [55:33] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'withItems' @ [55:47] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [56:17] ==> public final val inputState: StateAndRef<TransactionSerializationTests.TestCash.State> defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'outputState' @ [56:29] ==> public final val outputState: TransactionState<TransactionSerializationTests.TestCash.State> defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'changeState' @ [56:42] ==> public final val changeState: TransactionState<TransactionSerializationTests.TestCash.State> defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'Command' @ [56:55] ==> public constructor Command<T : CommandData>(value: TransactionSerializationTests.TestCash.Commands.Move, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Move

'Move' @ [56:81] ==> public constructor Move() defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.Commands.Move[ClassConstructorDescriptorImpl]

'arrayListOf' @ [56:89] ==> public fun <T> arrayListOf(vararg elements: PublicKey): ArrayList<PublicKey> /* = ArrayList<PublicKey> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'MEGA_CORP' @ [56:101] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [56:111] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Test' @ [60:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'megaCorpServices' @ [62:19] ==> public final val megaCorpServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [62:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [62:59] ==> public final lateinit var tx: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'notaryServices' @ [63:19] ==> public final val notaryServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'addSignature' @ [63:34] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [63:47] ==> val ptx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.signWireTX[LocalVariableDescriptor]

'stx' @ [66:9] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.signWireTX[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [66:13] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'stx' @ [69:9] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.signWireTX[LocalVariableDescriptor]

'id' @ [69:13] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'bytes' @ [69:16] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'stx' @ [69:27] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.signWireTX[LocalVariableDescriptor]

'id' @ [69:31] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'bytes' @ [69:34] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'inc' @ [69:43] ==> public final operator fun inc(): Byte defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [70:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<SignatureException>, block: () -> Unit): SignatureException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> SignatureException

'SignatureException' @ [70:25] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'stx' @ [71:13] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.signWireTX[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [71:17] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [75:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'megaCorpServices' @ [77:19] ==> public final val megaCorpServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [77:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [77:59] ==> public final lateinit var tx: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'notaryServices' @ [78:19] ==> public final val notaryServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'addSignature' @ [78:34] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [78:47] ==> val ptx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys[LocalVariableDescriptor]

'assertFailsWith' @ [81:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [81:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'stx' @ [82:13] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys[LocalVariableDescriptor]

'copy' @ [82:17] ==> public final fun copy(txBits: SerializedBytes<CoreTransaction> = ..., sigs: List<TransactionSignature> = ...): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [82:29] ==> public fun <T> emptyList(): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'assertFailsWith' @ [86:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<SignatureException>, block: () -> Unit): SignatureException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> SignatureException

'SignatureException' @ [86:25] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'TransactionBuilder' @ [87:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [87:42] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'withItems' @ [87:56] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [87:66] ==> public final val inputState: StateAndRef<TransactionSerializationTests.TestCash.State> defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'outputState' @ [87:78] ==> public final val outputState: TransactionState<TransactionSerializationTests.TestCash.State> defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'changeState' @ [87:91] ==> public final val changeState: TransactionState<TransactionSerializationTests.TestCash.State> defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'Command' @ [88:21] ==> public constructor Command<T : CommandData>(data: TransactionSerializationTests.TestCash.Commands.Move, key: PublicKey) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Move

'Move' @ [88:47] ==> public constructor Move() defined in net.corda.core.serialization.TransactionSerializationTests.TestCash.Commands.Move[ClassConstructorDescriptorImpl]

'DUMMY_KEY_2' @ [88:55] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [88:67] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'notaryServices' @ [90:24] ==> public final val notaryServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [90:39] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx2' @ [90:62] ==> val tx2: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys.<anonymous>[LocalVariableDescriptor]

'MockServices' @ [91:33] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_KEY_2' @ [91:46] ==> public val DUMMY_KEY_2: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'dummyServices' @ [92:24] ==> val dummyServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys.<anonymous>[LocalVariableDescriptor]

'addSignature' @ [92:38] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx2' @ [92:51] ==> val ptx2: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys.<anonymous>[LocalVariableDescriptor]

'stx' @ [94:13] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys[LocalVariableDescriptor]

'copy' @ [94:17] ==> public final fun copy(txBits: SerializedBytes<CoreTransaction> = ..., sigs: List<TransactionSignature> = ...): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'stx2' @ [94:29] ==> val stx2: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.wrongKeys.<anonymous>[LocalVariableDescriptor]

'sigs' @ [94:34] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'verifyRequiredSignatures' @ [94:40] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tx' @ [100:9] ==> public final lateinit var tx: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'setTimeWindow' @ [100:12] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [100:26] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'seconds' @ [100:43] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'megaCorpServices' @ [101:19] ==> public final val megaCorpServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [101:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [101:59] ==> public final lateinit var tx: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'notaryServices' @ [102:19] ==> public final val notaryServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'addSignature' @ [102:34] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [102:47] ==> val ptx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.timeWindow[LocalVariableDescriptor]

'assertEquals' @ [103:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Instant?, actual: Instant?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Instant?

'TEST_TX_TIME' @ [103:22] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'stx' @ [103:36] ==> val stx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.timeWindow[LocalVariableDescriptor]

'tx' @ [103:40] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'timeWindow' @ [103:43] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'midpoint' @ [103:55] ==> public abstract val midpoint: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'Test' @ [106:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'megaCorpServices' @ [108:19] ==> public final val megaCorpServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [108:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [108:59] ==> public final lateinit var tx: TransactionBuilder defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'ptx' @ [109:9] ==> val ptx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'verifySignaturesExcept' @ [109:13] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'notaryServices' @ [109:36] ==> public final val notaryServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'key' @ [109:51] ==> public final val key: KeyPair defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'public' @ [109:55] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'ptx' @ [111:22] ==> val ptx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'serialize' @ [111:26] ==> public fun <T : Any> SignedTransaction.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<SignedTransaction> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'stored' @ [112:22] ==> val stored: SerializedBytes<SignedTransaction> defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'deserialize' @ [112:29] ==> public inline fun <reified T : Any> SerializedBytes<SignedTransaction>.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SignedTransaction defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SignedTransaction

'assertEquals' @ [114:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SignedTransaction, actual: SignedTransaction, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SignedTransaction

'loaded' @ [114:22] ==> val loaded: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'ptx' @ [114:30] ==> val ptx: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'notaryServices' @ [116:21] ==> public final val notaryServices: MockServices defined in net.corda.core.serialization.TransactionSerializationTests[PropertyDescriptorImpl]

'addSignature' @ [116:36] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'loaded' @ [116:49] ==> val loaded: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'final' @ [117:9] ==> val final: SignedTransaction defined in net.corda.core.serialization.TransactionSerializationTests.storeAndLoadWhenSigning[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [117:15] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

