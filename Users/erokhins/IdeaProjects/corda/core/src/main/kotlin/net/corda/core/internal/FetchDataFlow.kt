'FlowLogic<FetchDataFlow.Result<T>>' @ [43:45] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Result<T>

'CordaSerializable' @ [45:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'IllegalArgumentException' @ [46:95] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CordaSerializable' @ [48:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'IllegalArgumentException' @ [49:81] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'FlowException' @ [51:53] ==> public constructor FlowException() defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [53:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [56:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Request' @ [58:88] ==> private constructor Request() defined in net.corda.core.internal.FetchDataFlow.Request[ClassConstructorDescriptorImpl]

'Request' @ [59:22] ==> private constructor Request() defined in net.corda.core.internal.FetchDataFlow.Request[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [62:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Suspendable' @ [67:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [68:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'HashNotFound' @ [68:13] ==> public constructor HashNotFound(requested: SecureHash) defined in net.corda.core.internal.FetchDataFlow.HashNotFound[ClassConstructorDescriptorImpl]

'component1' @ [71:14] ==> public final operator fun component1(): List<T> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [71:24] ==> public final operator fun component2(): List<SecureHash> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'loadWhatWeHave' @ [71:35] ==> private final fun loadWhatWeHave(): Pair<List<T>, List<SecureHash>> defined in net.corda.core.internal.FetchDataFlow[SimpleFunctionDescriptorImpl]

'if (toFetch.isEmpty()) {
            Result(fromDisk, emptyList())
        } else {
            logger.info("Requesting ${toFetch.size} dependency(s) for verification from ${otherSide.name}")

            // TODO: Support "large message" response streaming so response sizes are not limited by RAM.
            // We can then switch to requesting items in large batches to minimise the latency penalty.
            // This is blocked by bugs ARTEMIS-1278 and ARTEMIS-1279. For now we limit attachments and txns to 10mb each
            // and don't request items in batch, which is a performance loss, but works around the issue. We have
            // configured Artemis to not fragment messages up to 10mb so we can send 10mb messages without problems.
            // Above that, we start losing authentication data on the message fragments and take exceptions in the
            // network layer.
            val maybeItems = ArrayList<W>(toFetch.size)
            for (hash in toFetch) {
                // We skip the validation here (with unwrap { it }) because we will do it below in validateFetchResponse.
                // The only thing checked is the object type. It is a protocol violation to send results out of order.
                maybeItems += sendAndReceive<List<W>>(otherSide, Request.Data(NonEmptySet.of(hash), dataType)).unwrap { it }
            }
            // Check for a buggy/malicious peer answering with something that we didn't ask for.
            val downloaded = validateFetchResponse(UntrustworthyData(maybeItems), toFetch)
            logger.info("Fetched ${downloaded.size} elements from ${otherSide.name}")
            maybeWriteToDisk(downloaded)
            Result(fromDisk, downloaded)
        }' @ [73:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FetchDataFlow.Result<T>, elseBranch: FetchDataFlow.Result<T>): FetchDataFlow.Result<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result<T>

'toFetch' @ [73:20] ==> val toFetch: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'isEmpty' @ [73:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Result' @ [74:13] ==> public constructor Result<out T : NamedByHash>(fromDisk: List<T>, downloaded: List<T>) defined in net.corda.core.internal.FetchDataFlow.Result[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : NamedByHash> -> T

'fromDisk' @ [74:20] ==> val fromDisk: List<T> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'emptyList' @ [74:30] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'logger' @ [76:13] ==> public final val logger: Logger defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'info' @ [76:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'toFetch' @ [76:39] ==> val toFetch: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'size' @ [76:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'otherSide' @ [76:91] ==> protected final val otherSide: Party defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'name' @ [76:101] ==> public final val name: X500Name defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'ArrayList' @ [85:30] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> W

'toFetch' @ [85:43] ==> val toFetch: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'size' @ [85:51] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'toFetch' @ [86:26] ==> val toFetch: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'maybeItems' @ [89:17] ==> val maybeItems: ArrayList<W> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'sendAndReceive' @ [89:31] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<List<W>> defined in net.corda.core.internal.FetchDataFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<W>

'otherSide' @ [89:55] ==> protected final val otherSide: Party defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'Data' @ [89:74] ==> public constructor Data(hashes: NonEmptySet<SecureHash>, dataType: FetchDataFlow.DataType) defined in net.corda.core.internal.FetchDataFlow.Request.Data[ClassConstructorDescriptorImpl]

'of' @ [89:91] ==> @JvmStatic public final fun <T> of(element: SecureHash): NonEmptySet<SecureHash> defined in net.corda.core.utilities.NonEmptySet.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SecureHash

'hash' @ [89:94] ==> val hash: SecureHash defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'dataType' @ [89:101] ==> protected final val dataType: FetchDataFlow.DataType defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'unwrap' @ [89:112] ==> @Suppress public inline fun <T, R> UntrustworthyData<List<W>>.unwrap(validator: (List<W>) -> List<W>): List<W> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<W>
    <R> -> List<W>

'it' @ [89:121] ==> value-parameter it: List<W> defined in net.corda.core.internal.FetchDataFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'validateFetchResponse' @ [92:30] ==> private/*private to this*/ final fun validateFetchResponse(maybeItems: UntrustworthyData<ArrayList<W>>, requests: List<SecureHash>): List<T> defined in net.corda.core.internal.FetchDataFlow[SimpleFunctionDescriptorImpl]

'UntrustworthyData' @ [92:52] ==> public constructor UntrustworthyData<out T>(fromUntrustedWorld: ArrayList<W>) defined in net.corda.core.utilities.UntrustworthyData[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> ArrayList<W>

'maybeItems' @ [92:70] ==> val maybeItems: ArrayList<W> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'toFetch' @ [92:83] ==> val toFetch: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'logger' @ [93:13] ==> public final val logger: Logger defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'info' @ [93:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'downloaded' @ [93:36] ==> val downloaded: List<T> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'size' @ [93:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'otherSide' @ [93:69] ==> protected final val otherSide: Party defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'name' @ [93:79] ==> public final val name: X500Name defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'maybeWriteToDisk' @ [94:13] ==> protected open fun maybeWriteToDisk(downloaded: List<T>): Unit defined in net.corda.core.internal.FetchDataFlow[SimpleFunctionDescriptorImpl]

'downloaded' @ [94:30] ==> val downloaded: List<T> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'Result' @ [95:13] ==> public constructor Result<out T : NamedByHash>(fromDisk: List<T>, downloaded: List<T>) defined in net.corda.core.internal.FetchDataFlow.Result[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : NamedByHash> -> T

'fromDisk' @ [95:20] ==> val fromDisk: List<T> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'downloaded' @ [95:30] ==> val downloaded: List<T> defined in net.corda.core.internal.FetchDataFlow.call[LocalVariableDescriptor]

'ArrayList' @ [104:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'ArrayList' @ [105:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'requests' @ [106:22] ==> protected final val requests: Set<SecureHash> defined in net.corda.core.internal.FetchDataFlow[PropertyDescriptorImpl]

'load' @ [107:23] ==> protected abstract fun load(txid: SecureHash): T? defined in net.corda.core.internal.FetchDataFlow[SimpleFunctionDescriptorImpl]

'txid' @ [107:28] ==> val txid: SecureHash defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'if (stx == null)
                toFetch += txid
            else
                fromDisk += stx' @ [108:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stx' @ [108:17] ==> val stx: T? defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'toFetch' @ [109:17] ==> val toFetch: ArrayList<SecureHash> defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'txid' @ [109:28] ==> val txid: SecureHash defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'fromDisk' @ [111:17] ==> val fromDisk: ArrayList<T> defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'stx' @ [111:29] ==> val stx: T? defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'Pair' @ [113:16] ==> public constructor Pair<out A, out B>(first: ArrayList<T>, second: ArrayList<SecureHash>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ArrayList<T>
    <out B> -> ArrayList<SecureHash>

'fromDisk' @ [113:21] ==> val fromDisk: ArrayList<T> defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'toFetch' @ [113:31] ==> val toFetch: ArrayList<SecureHash> defined in net.corda.core.internal.FetchDataFlow.loadWhatWeHave[LocalVariableDescriptor]

'Suppress' @ [118:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'wire' @ [119:46] ==> value-parameter wire: W defined in net.corda.core.internal.FetchDataFlow.convert[ValueParameterDescriptorImpl]

'maybeItems' @ [123:16] ==> value-parameter maybeItems: UntrustworthyData<ArrayList<W>> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse[ValueParameterDescriptorImpl]

'unwrap' @ [123:27] ==> @Suppress public inline fun <T, R> UntrustworthyData<ArrayList<W>>.unwrap(validator: (ArrayList<W>) -> List<T>): List<T> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ArrayList<W>
    <R> -> List<T>

'response' @ [124:17] ==> value-parameter response: ArrayList<W> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [124:26] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'requests' @ [124:34] ==> value-parameter requests: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse[ValueParameterDescriptorImpl]

'size' @ [124:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'DownloadedVsRequestedSizeMismatch' @ [125:23] ==> public constructor DownloadedVsRequestedSizeMismatch(requested: Int, got: Int) defined in net.corda.core.internal.FetchDataFlow.DownloadedVsRequestedSizeMismatch[ClassConstructorDescriptorImpl]

'requests' @ [125:57] ==> value-parameter requests: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse[ValueParameterDescriptorImpl]

'size' @ [125:66] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'response' @ [125:72] ==> value-parameter response: ArrayList<W> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [125:81] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'response' @ [126:27] ==> value-parameter response: ArrayList<W> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [126:36] ==> public inline fun <T, R> Iterable<W>.map(transform: (W) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> W
    <R> -> T

'convert' @ [126:42] ==> @Suppress protected open fun convert(wire: W): T defined in net.corda.core.internal.FetchDataFlow[SimpleFunctionDescriptorImpl]

'it' @ [126:50] ==> value-parameter it: W defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [129:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [129:26] ==> public final operator fun component2(): T defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'answers' @ [129:35] ==> val answers: List<T> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[LocalVariableDescriptor]

'withIndex' @ [129:43] ==> public fun <T> Iterable<T>.withIndex(): Iterable<IndexedValue<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'item' @ [130:21] ==> val item: T defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[LocalVariableDescriptor]

'id' @ [130:26] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.NamedByHash[PropertyDescriptorImpl]

'requests' @ [130:32] ==> value-parameter requests: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse[ValueParameterDescriptorImpl]

'index' @ [130:41] ==> val index: Int defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[LocalVariableDescriptor]

'DownloadedVsRequestedDataMismatch' @ [131:27] ==> public constructor DownloadedVsRequestedDataMismatch(requested: SecureHash, got: SecureHash) defined in net.corda.core.internal.FetchDataFlow.DownloadedVsRequestedDataMismatch[ClassConstructorDescriptorImpl]

'requests' @ [131:61] ==> value-parameter requests: List<SecureHash> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse[ValueParameterDescriptorImpl]

'index' @ [131:70] ==> val index: Int defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[LocalVariableDescriptor]

'item' @ [131:78] ==> val item: T defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[LocalVariableDescriptor]

'id' @ [131:83] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.NamedByHash[PropertyDescriptorImpl]

'answers' @ [133:13] ==> val answers: List<T> defined in net.corda.core.internal.FetchDataFlow.validateFetchResponse.<anonymous>[LocalVariableDescriptor]

'FetchDataFlow<Attachment, ByteArray>' @ [144:48] ==> private constructor FetchDataFlow<T : NamedByHash, in W : Any>(requests: Set<SecureHash>, otherSide: Party, dataType: FetchDataFlow.DataType) defined in net.corda.core.internal.FetchDataFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <T : NamedByHash> -> Attachment
    <in W : Any> -> ByteArray

'requests' @ [144:85] ==> value-parameter requests: Set<SecureHash> defined in net.corda.core.internal.FetchAttachmentsFlow.<init>[ValueParameterDescriptorImpl]

'otherSide' @ [144:95] ==> value-parameter otherSide: Party defined in net.corda.core.internal.FetchAttachmentsFlow.<init>[ValueParameterDescriptorImpl]

'ATTACHMENT' @ [144:115] ==> enum entry ATTACHMENT defined in net.corda.core.internal.FetchDataFlow.DataType[FakeCallableDescriptorForObject]

'serviceHub' @ [146:56] ==> public final val serviceHub: ServiceHub defined in net.corda.core.internal.FetchAttachmentsFlow[PropertyDescriptorImpl]

'attachments' @ [146:67] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'openAttachment' @ [146:79] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[SimpleFunctionDescriptorImpl]

'txid' @ [146:94] ==> value-parameter txid: SecureHash defined in net.corda.core.internal.FetchAttachmentsFlow.load[ValueParameterDescriptorImpl]

'FetchedAttachment' @ [148:57] ==> public constructor FetchedAttachment(dataLoader: () -> ByteArray) defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment[ClassConstructorDescriptorImpl]

'wire' @ [148:77] ==> value-parameter wire: ByteArray defined in net.corda.core.internal.FetchAttachmentsFlow.convert[ValueParameterDescriptorImpl]

'downloaded' @ [151:28] ==> value-parameter downloaded: List<Attachment> defined in net.corda.core.internal.FetchAttachmentsFlow.maybeWriteToDisk[ValueParameterDescriptorImpl]

'serviceHub' @ [152:13] ==> public final val serviceHub: ServiceHub defined in net.corda.core.internal.FetchAttachmentsFlow[PropertyDescriptorImpl]

'attachments' @ [152:24] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'importAttachment' @ [152:36] ==> @Throws public abstract fun importAttachment(jar: InputStream): SecureHash defined in net.corda.core.node.services.AttachmentStorage[SimpleFunctionDescriptorImpl]

'attachment' @ [152:53] ==> val attachment: Attachment defined in net.corda.core.internal.FetchAttachmentsFlow.maybeWriteToDisk[LocalVariableDescriptor]

'open' @ [152:64] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'AbstractAttachment' @ [156:68] ==> public constructor AbstractAttachment(dataLoader: () -> ByteArray) defined in net.corda.core.contracts.AbstractAttachment[ClassConstructorDescriptorImpl]

'dataLoader' @ [156:87] ==> value-parameter dataLoader: () -> ByteArray defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment.<init>[ValueParameterDescriptorImpl]

'getValue' @ [157:40] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'attachmentData' @ [157:47] ==> protected final val attachmentData: ByteArray defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment[PropertyDescriptorImpl]

'sha256' @ [157:62] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

'FetchedAttachment' @ [160:72] ==> public constructor FetchedAttachment(dataLoader: () -> ByteArray) defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment[ClassConstructorDescriptorImpl]

'context' @ [160:90] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment.Token.fromToken[ValueParameterDescriptorImpl]

'attachmentDataLoader' @ [160:98] ==> public final fun SerializeAsTokenContext.attachmentDataLoader(id: SecureHash): () -> ByteArray defined in net.corda.core.contracts.AbstractAttachment.Companion[SimpleFunctionDescriptorImpl]

'id' @ [160:119] ==> private final val id: SecureHash defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment.Token[PropertyDescriptorImpl]

'Token' @ [163:66] ==> public constructor Token(id: SecureHash) defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment.Token[ClassConstructorDescriptorImpl]

'id' @ [163:72] ==> public open val id: SecureHash defined in net.corda.core.internal.FetchAttachmentsFlow.FetchedAttachment[PropertyDescriptorImpl]

'FetchDataFlow<SignedTransaction, SignedTransaction>' @ [176:9] ==> private constructor FetchDataFlow<T : NamedByHash, in W : Any>(requests: Set<SecureHash>, otherSide: Party, dataType: FetchDataFlow.DataType) defined in net.corda.core.internal.FetchDataFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <T : NamedByHash> -> SignedTransaction
    <in W : Any> -> SignedTransaction

'requests' @ [176:61] ==> value-parameter requests: Set<SecureHash> defined in net.corda.core.internal.FetchTransactionsFlow.<init>[ValueParameterDescriptorImpl]

'otherSide' @ [176:71] ==> value-parameter otherSide: Party defined in net.corda.core.internal.FetchTransactionsFlow.<init>[ValueParameterDescriptorImpl]

'TRANSACTION' @ [176:91] ==> enum entry TRANSACTION defined in net.corda.core.internal.FetchDataFlow.DataType[FakeCallableDescriptorForObject]

'serviceHub' @ [178:63] ==> public final val serviceHub: ServiceHub defined in net.corda.core.internal.FetchTransactionsFlow[PropertyDescriptorImpl]

'validatedTransactions' @ [178:74] ==> public abstract val validatedTransactions: TransactionStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'getTransaction' @ [178:96] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.core.node.services.TransactionStorage[SimpleFunctionDescriptorImpl]

'txid' @ [178:111] ==> value-parameter txid: SecureHash defined in net.corda.core.internal.FetchTransactionsFlow.load[ValueParameterDescriptorImpl]

