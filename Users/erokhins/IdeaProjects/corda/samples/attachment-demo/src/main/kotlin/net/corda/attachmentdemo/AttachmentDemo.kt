'OptionParser' @ [45:18] ==> public constructor OptionParser() defined in joptsimple.OptionParser[JavaClassConstructorDescriptor]

'parser' @ [47:19] ==> val parser: OptionParser defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'accepts' @ [47:26] ==> public open fun accepts(p0: (String..String?)): (OptionSpecBuilder..OptionSpecBuilder?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'withRequiredArg' @ [47:42] ==> public open fun withRequiredArg(): (ArgumentAcceptingOptionSpec<(String..String?)>..ArgumentAcceptingOptionSpec<(String..String?)>?) defined in joptsimple.OptionSpecBuilder[JavaMethodDescriptor]

'ofType' @ [47:60] ==> public final fun <T : (Any..Any?)> ofType(p0: (Class<(Role..Role?)>..Class<(Role..Role?)>?)): (ArgumentAcceptingOptionSpec<(Role..Role?)>..ArgumentAcceptingOptionSpec<(Role..Role?)>?) defined in joptsimple.ArgumentAcceptingOptionSpec[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.attachmentdemo.Role..net.corda.attachmentdemo.Role?)

'Role' @ [47:67] ==> private constructor Role() defined in net.corda.attachmentdemo.Role[ClassConstructorDescriptorImpl]

'java' @ [47:79] ==> public val <T> KClass<Role>.java: Class<Role> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Role

'required' @ [47:85] ==> public open fun required(): (ArgumentAcceptingOptionSpec<(Role..Role?)>..ArgumentAcceptingOptionSpec<(Role..Role?)>?) defined in joptsimple.ArgumentAcceptingOptionSpec[JavaMethodDescriptor]

'parser' @ [49:9] ==> val parser: OptionParser defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'parse' @ [49:16] ==> public open fun parse(vararg p0: (String..String?)): (OptionSet..OptionSet?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'args' @ [49:23] ==> value-parameter args: Array<String> defined in net.corda.attachmentdemo.main[ValueParameterDescriptorImpl]

'println' @ [51:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [51:17] ==> val e: Exception /* = Exception */ defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'message' @ [51:19] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'printHelp' @ [52:9] ==> private fun printHelp(parser: OptionParser): Unit defined in net.corda.attachmentdemo in file AttachmentDemo.kt[SimpleFunctionDescriptorImpl]

'parser' @ [52:19] ==> val parser: OptionParser defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'exitProcess' @ [53:9] ==> @InlineOnly public inline fun exitProcess(status: Int): Nothing defined in kotlin.system[DeserializedSimpleFunctionDescriptor]

'options' @ [56:16] ==> val options: (OptionSet..OptionSet?) defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'valueOf' @ [56:24] ==> public open fun <V : (Any..Any?)> valueOf(p0: (OptionSpec<(Role..Role?)>..OptionSpec<(Role..Role?)>?)): (Role..Role?) defined in joptsimple.OptionSet[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (net.corda.attachmentdemo.Role..net.corda.attachmentdemo.Role?)

'roleArg' @ [56:32] ==> val roleArg: (ArgumentAcceptingOptionSpec<(Role..Role?)>..ArgumentAcceptingOptionSpec<(Role..Role?)>?) defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'when (role) {
        Role.SENDER -> {
            val host = NetworkHostAndPort("localhost", 10006)
            println("Connecting to sender node ($host)")
            CordaRPCClient(host).start("demo", "demo").use {
                sender(it.proxy)
            }
        }
        Role.RECIPIENT -> {
            val host = NetworkHostAndPort("localhost", 10009)
            println("Connecting to the recipient node ($host)")
            CordaRPCClient(host).start("demo", "demo").use {
                recipient(it.proxy)
            }
        }
    }' @ [57:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'role' @ [57:11] ==> val role: Role defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'SENDER' @ [58:14] ==> enum entry SENDER defined in net.corda.attachmentdemo.Role[FakeCallableDescriptorForObject]

'NetworkHostAndPort' @ [59:24] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'println' @ [60:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'host' @ [60:50] ==> val host: NetworkHostAndPort defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'CordaRPCClient' @ [61:13] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'host' @ [61:28] ==> val host: NetworkHostAndPort defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'start' @ [61:34] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'use' @ [61:56] ==> @InlineOnly public inline fun <T : Closeable?, R> CordaRPCConnection.use(block: (CordaRPCConnection) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> CordaRPCConnection
    <R> -> Unit

'sender' @ [62:17] ==> public fun sender(rpc: CordaRPCOps, numOfClearBytes: Int = ...): Unit defined in net.corda.attachmentdemo in file AttachmentDemo.kt[SimpleFunctionDescriptorImpl]

'it' @ [62:24] ==> value-parameter it: CordaRPCConnection defined in net.corda.attachmentdemo.main.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [62:27] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'RECIPIENT' @ [65:14] ==> enum entry RECIPIENT defined in net.corda.attachmentdemo.Role[FakeCallableDescriptorForObject]

'NetworkHostAndPort' @ [66:24] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'println' @ [67:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'host' @ [67:57] ==> val host: NetworkHostAndPort defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'CordaRPCClient' @ [68:13] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'host' @ [68:28] ==> val host: NetworkHostAndPort defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'start' @ [68:34] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'use' @ [68:56] ==> @InlineOnly public inline fun <T : Closeable?, R> CordaRPCConnection.use(block: (CordaRPCConnection) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> CordaRPCConnection
    <R> -> Unit

'recipient' @ [69:17] ==> public fun recipient(rpc: CordaRPCOps): Unit defined in net.corda.attachmentdemo in file AttachmentDemo.kt[SimpleFunctionDescriptorImpl]

'it' @ [69:27] ==> value-parameter it: CordaRPCConnection defined in net.corda.attachmentdemo.main.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [69:30] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'component1' @ [77:10] ==> public final operator fun component1(): InputStream defined in net.corda.core.internal.InputStreamAndHash[DeserializedSimpleFunctionDescriptor]

'component2' @ [77:23] ==> public final operator fun component2(): SecureHash.SHA256 defined in net.corda.core.internal.InputStreamAndHash[DeserializedSimpleFunctionDescriptor]

'InputStreamAndHash' @ [77:31] ==> public companion object defined in net.corda.core.internal.InputStreamAndHash[FakeCallableDescriptorForObject]

'createInMemoryTestZip' @ [77:50] ==> public final fun createInMemoryTestZip(numOfExpectedBytes: Int, content: Byte): InputStreamAndHash defined in net.corda.core.internal.InputStreamAndHash.Companion[DeserializedSimpleFunctionDescriptor]

'numOfClearBytes' @ [77:72] ==> value-parameter numOfClearBytes: Int = ... defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'newScheduledThreadPool' @ [78:30] ==> public open fun newScheduledThreadPool(p0: Int): (ScheduledExecutorService..ScheduledExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'sender' @ [80:9] ==> private fun sender(rpc: CordaRPCOps, inputStream: InputStream, hash: SecureHash.SHA256, executor: ScheduledExecutorService): Unit defined in net.corda.attachmentdemo in file AttachmentDemo.kt[SimpleFunctionDescriptorImpl]

'rpc' @ [80:16] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'inputStream' @ [80:21] ==> val inputStream: InputStream defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'hash' @ [80:34] ==> val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'executor' @ [80:40] ==> val executor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'executor' @ [82:9] ==> val executor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'shutdown' @ [82:18] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ScheduledExecutorService[JavaMethodDescriptor]

'poll' @ [89:44] ==> public fun <A> poll(executorService: ScheduledExecutorService, pollName: String, pollInterval: Duration = ..., warnCount: Int = ..., check: () -> Party?): CordaFuture<Party> defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Party

'executor' @ [89:49] ==> value-parameter executor: ScheduledExecutorService defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'DUMMY_NOTARY' @ [89:59] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [89:72] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [89:77] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'rpc' @ [89:91] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'partyFromX500Name' @ [89:95] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [89:113] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [89:126] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'poll' @ [90:47] ==> public fun <A> poll(executorService: ScheduledExecutorService, pollName: String, pollInterval: Duration = ..., warnCount: Int = ..., check: () -> Party?): CordaFuture<Party> defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Party

'executor' @ [90:52] ==> value-parameter executor: ScheduledExecutorService defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'DUMMY_BANK_B' @ [90:62] ==> public val DUMMY_BANK_B: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [90:75] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [90:80] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'rpc' @ [90:94] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'partyFromX500Name' @ [90:98] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'DUMMY_BANK_B' @ [90:116] ==> public val DUMMY_BANK_B: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [90:129] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'!' @ [93:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rpc' @ [93:10] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'attachmentExists' @ [93:14] ==> public abstract fun attachmentExists(id: SecureHash): Boolean defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'hash' @ [93:31] ==> value-parameter hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'inputStream' @ [94:9] ==> value-parameter inputStream: InputStream defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'use' @ [94:21] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> Unit

'rpc' @ [95:22] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'uploadAttachment' @ [95:26] ==> public abstract fun uploadAttachment(jar: InputStream): SecureHash defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'it' @ [95:43] ==> value-parameter it: InputStream defined in net.corda.attachmentdemo.sender.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [96:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'hash' @ [96:21] ==> value-parameter hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'id' @ [96:29] ==> val id: SecureHash defined in net.corda.attachmentdemo.sender.<anonymous>[LocalVariableDescriptor]

'id' @ [96:45] ==> val id: SecureHash defined in net.corda.attachmentdemo.sender.<anonymous>[LocalVariableDescriptor]

'hash' @ [96:62] ==> value-parameter hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'require' @ [98:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rpc' @ [98:17] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'attachmentExists' @ [98:21] ==> public abstract fun attachmentExists(id: SecureHash): Boolean defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'hash' @ [98:38] ==> value-parameter hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'rpc' @ [101:22] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'startTrackedFlow' @ [101:26] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<SignedTransaction>> CordaRPCOps.startTrackedFlow(flowConstructor: ((Party..Party?), (Party..Party?), SecureHash.SHA256) -> AttachmentDemoFlow, arg0: (Party..Party?), arg1: (Party..Party?), arg2: SecureHash.SHA256): FlowProgressHandle<SignedTransaction> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction
    <A> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)
    <B> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)
    <C> -> SHA256
    <reified R : FlowLogic<T>> -> AttachmentDemoFlow

'AttachmentDemoFlow' @ [101:45] ==> public constructor AttachmentDemoFlow(otherSide: Party, notary: Party, hash: SecureHash.SHA256) defined in net.corda.attachmentdemo.AttachmentDemoFlow[ClassConstructorDescriptorImpl]

'otherSideFuture' @ [101:65] ==> val otherSideFuture: CordaFuture<Party> defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'get' @ [101:81] ==> public abstract fun get(): (Party..Party?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'notaryFuture' @ [101:88] ==> val notaryFuture: CordaFuture<Party> defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'get' @ [101:101] ==> public abstract fun get(): (Party..Party?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'hash' @ [101:108] ==> value-parameter hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.sender[ValueParameterDescriptorImpl]

'flowHandle' @ [102:5] ==> val flowHandle: FlowProgressHandle<SignedTransaction> defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'progress' @ [102:16] ==> public abstract val progress: Observable<String> defined in net.corda.core.messaging.FlowProgressHandle[DeserializedPropertyDescriptor]

'subscribe' @ [102:25] ==> public final fun subscribe(p0: (((String..String?)) -> Unit..(((String..String?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'println' @ [102:37] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'flowHandle' @ [103:15] ==> val flowHandle: FlowProgressHandle<SignedTransaction> defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'returnValue' @ [103:26] ==> public abstract val returnValue: CordaFuture<SignedTransaction> defined in net.corda.core.messaging.FlowProgressHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [103:38] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'println' @ [104:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stx' @ [104:21] ==> val stx: SignedTransaction defined in net.corda.attachmentdemo.sender[LocalVariableDescriptor]

'id' @ [104:25] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'StartableByRPC' @ [107:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [108:98] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [110:22] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [112:53] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'SIGNING' @ [112:69] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.attachmentdemo.AttachmentDemoFlow[FakeCallableDescriptorForObject]

'Suspendable' @ [114:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'TransactionBuilder' @ [117:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [117:38] ==> public final val notary: Party defined in net.corda.attachmentdemo.AttachmentDemoFlow[PropertyDescriptorImpl]

'ptx' @ [118:9] ==> val ptx: TransactionBuilder defined in net.corda.attachmentdemo.AttachmentDemoFlow.call[LocalVariableDescriptor]

'addOutputState' @ [118:13] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [118:47] ==> public constructor State(hash: SecureHash.SHA256) defined in net.corda.attachmentdemo.AttachmentContract.State[ClassConstructorDescriptorImpl]

'hash' @ [118:53] ==> public final val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.AttachmentDemoFlow[PropertyDescriptorImpl]

'ptx' @ [119:9] ==> val ptx: TransactionBuilder defined in net.corda.attachmentdemo.AttachmentDemoFlow.call[LocalVariableDescriptor]

'addAttachment' @ [119:13] ==> public final fun addAttachment(attachmentId: SecureHash): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'hash' @ [119:27] ==> public final val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.AttachmentDemoFlow[PropertyDescriptorImpl]

'progressTracker' @ [121:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.attachmentdemo.AttachmentDemoFlow[PropertyDescriptorImpl]

'currentStep' @ [121:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGNING' @ [121:39] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.attachmentdemo.AttachmentDemoFlow[FakeCallableDescriptorForObject]

'serviceHub' @ [124:19] ==> public final val serviceHub: ServiceHub defined in net.corda.attachmentdemo.AttachmentDemoFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [124:30] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'ptx' @ [124:53] ==> val ptx: TransactionBuilder defined in net.corda.attachmentdemo.AttachmentDemoFlow.call[LocalVariableDescriptor]

'subFlow' @ [126:16] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.attachmentdemo.AttachmentDemoFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [126:24] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [126:37] ==> val stx: SignedTransaction defined in net.corda.attachmentdemo.AttachmentDemoFlow.call[LocalVariableDescriptor]

'setOf' @ [126:42] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'otherSide' @ [126:48] ==> public final val otherSide: Party defined in net.corda.attachmentdemo.AttachmentDemoFlow[PropertyDescriptorImpl]

'single' @ [126:61] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'println' @ [131:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'rpc' @ [132:15] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.recipient[ValueParameterDescriptorImpl]

'verifiedTransactionsFeed' @ [132:19] ==> @RPCReturnsObservables public abstract fun verifiedTransactionsFeed(): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'updates' @ [132:46] ==> public final val updates: Observable<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'toBlocking' @ [132:54] ==> public final fun toBlocking(): (BlockingObservable<(SignedTransaction..SignedTransaction?)>..BlockingObservable<(SignedTransaction..SignedTransaction?)>?) defined in rx.Observable[JavaMethodDescriptor]

'first' @ [132:67] ==> public open fun first(): (SignedTransaction..SignedTransaction?) defined in rx.observables.BlockingObservable[JavaMethodDescriptor]

'stx' @ [133:15] ==> val stx: (SignedTransaction..SignedTransaction?) defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'tx' @ [133:19] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'if (wtx.attachments.isNotEmpty()) {
        if (wtx.outputs.isNotEmpty()) {
            val state = wtx.outputsOfType<AttachmentContract.State>().single()
            require(rpc.attachmentExists(state.hash))

            // Download the attachment via the Web endpoint.
            val connection = URL("http://localhost:10010/attachments/${state.hash}").openConnection() as HttpURLConnection
            try {
                require(connection.responseCode == SC_OK) { "HTTP status code was ${connection.responseCode}" }
                require(connection.contentType == APPLICATION_OCTET_STREAM) { "Content-Type header was ${connection.contentType}" }
                require(connection.contentLength > 1024) { "Attachment contains only ${connection.contentLength} bytes" }
                require(connection.getHeaderField(CONTENT_DISPOSITION) == "attachment; filename=\"${state.hash}.zip\"") {
                    "Content-Disposition header was ${connection.getHeaderField(CONTENT_DISPOSITION)}"
                }

                // Write out the entries inside this jar.
                println("Attachment JAR contains these entries:")
                JarInputStream(connection.inputStream).use { it ->
                    while (true) {
                        val e = it.nextJarEntry ?: break
                        println("Entry> ${e.name}")
                        it.closeEntry()
                    }
                }
            } finally {
                connection.disconnect()
            }
            println("File received - we're happy!\n\nFinal transaction is:\n\n${Emoji.renderIfSupported(wtx)}")
        } else {
            println("Error: no output state found in ${wtx.id}")
        }
    } else {
        println("Error: no attachments found in ${wtx.id}")
    }' @ [134:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'wtx' @ [134:9] ==> val wtx: WireTransaction defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'attachments' @ [134:13] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isNotEmpty' @ [134:25] ==> @InlineOnly public inline fun <T> Collection<SecureHash>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'if (wtx.outputs.isNotEmpty()) {
            val state = wtx.outputsOfType<AttachmentContract.State>().single()
            require(rpc.attachmentExists(state.hash))

            // Download the attachment via the Web endpoint.
            val connection = URL("http://localhost:10010/attachments/${state.hash}").openConnection() as HttpURLConnection
            try {
                require(connection.responseCode == SC_OK) { "HTTP status code was ${connection.responseCode}" }
                require(connection.contentType == APPLICATION_OCTET_STREAM) { "Content-Type header was ${connection.contentType}" }
                require(connection.contentLength > 1024) { "Attachment contains only ${connection.contentLength} bytes" }
                require(connection.getHeaderField(CONTENT_DISPOSITION) == "attachment; filename=\"${state.hash}.zip\"") {
                    "Content-Disposition header was ${connection.getHeaderField(CONTENT_DISPOSITION)}"
                }

                // Write out the entries inside this jar.
                println("Attachment JAR contains these entries:")
                JarInputStream(connection.inputStream).use { it ->
                    while (true) {
                        val e = it.nextJarEntry ?: break
                        println("Entry> ${e.name}")
                        it.closeEntry()
                    }
                }
            } finally {
                connection.disconnect()
            }
            println("File received - we're happy!\n\nFinal transaction is:\n\n${Emoji.renderIfSupported(wtx)}")
        } else {
            println("Error: no output state found in ${wtx.id}")
        }' @ [135:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'wtx' @ [135:13] ==> val wtx: WireTransaction defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'outputs' @ [135:17] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isNotEmpty' @ [135:25] ==> @InlineOnly public inline fun <T> Collection<TransactionState<ContractState>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'wtx' @ [136:25] ==> val wtx: WireTransaction defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'outputsOfType' @ [136:29] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<AttachmentContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [136:71] ==> public fun <T> List<AttachmentContract.State>.single(): AttachmentContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'require' @ [137:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rpc' @ [137:21] ==> value-parameter rpc: CordaRPCOps defined in net.corda.attachmentdemo.recipient[ValueParameterDescriptorImpl]

'attachmentExists' @ [137:25] ==> public abstract fun attachmentExists(id: SecureHash): Boolean defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'state' @ [137:42] ==> val state: AttachmentContract.State defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'hash' @ [137:48] ==> public final val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.AttachmentContract.State[PropertyDescriptorImpl]

'URL' @ [140:30] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'state' @ [140:72] ==> val state: AttachmentContract.State defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'hash' @ [140:78] ==> public final val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.AttachmentContract.State[PropertyDescriptorImpl]

'openConnection' @ [140:86] ==> public open fun openConnection(): (URLConnection..URLConnection?) defined in java.net.URL[JavaMethodDescriptor]

'require' @ [142:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'connection' @ [142:25] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'responseCode' @ [142:36] ==> public final val HttpURLConnection.responseCode: Int[MyPropertyDescriptor]

'SC_OK' @ [142:52] ==> public const final val SC_OK: Int defined in javax.servlet.http.HttpServletResponse[JavaPropertyDescriptor]

'connection' @ [142:85] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'responseCode' @ [142:96] ==> public final val HttpURLConnection.responseCode: Int[MyPropertyDescriptor]

'require' @ [143:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'connection' @ [143:25] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'contentType' @ [143:36] ==> public final val HttpURLConnection.contentType: (String..String?)[MyPropertyDescriptor]

'APPLICATION_OCTET_STREAM' @ [143:51] ==> public const final val APPLICATION_OCTET_STREAM: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'connection' @ [143:106] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'contentType' @ [143:117] ==> public final val HttpURLConnection.contentType: (String..String?)[MyPropertyDescriptor]

'require' @ [144:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'connection' @ [144:25] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'contentLength' @ [144:36] ==> public final val HttpURLConnection.contentLength: Int[MyPropertyDescriptor]

'connection' @ [144:88] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'contentLength' @ [144:99] ==> public final val HttpURLConnection.contentLength: Int[MyPropertyDescriptor]

'require' @ [145:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'connection' @ [145:25] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'getHeaderField' @ [145:36] ==> public open fun getHeaderField(p0: (String..String?)): (String..String?) defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'CONTENT_DISPOSITION' @ [145:51] ==> public const final val CONTENT_DISPOSITION: String defined in javax.ws.rs.core.HttpHeaders[JavaPropertyDescriptor]

'state' @ [145:101] ==> val state: AttachmentContract.State defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'hash' @ [145:107] ==> public final val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.AttachmentContract.State[PropertyDescriptorImpl]

'connection' @ [146:55] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'getHeaderField' @ [146:66] ==> public open fun getHeaderField(p0: (String..String?)): (String..String?) defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'CONTENT_DISPOSITION' @ [146:81] ==> public const final val CONTENT_DISPOSITION: String defined in javax.ws.rs.core.HttpHeaders[JavaPropertyDescriptor]

'println' @ [150:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'JarInputStream' @ [151:17] ==> public constructor JarInputStream(p0: (InputStream..InputStream?)) defined in java.util.jar.JarInputStream[JavaClassConstructorDescriptor]

'connection' @ [151:32] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'inputStream' @ [151:43] ==> public final val HttpURLConnection.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'use' @ [151:56] ==> @InlineOnly public inline fun <T : Closeable?, R> JarInputStream.use(block: (JarInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarInputStream
    <R> -> Unit

'it' @ [153:33] ==> value-parameter it: JarInputStream defined in net.corda.attachmentdemo.recipient.<anonymous>[ValueParameterDescriptorImpl]

'nextJarEntry' @ [153:36] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'println' @ [154:25] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [154:43] ==> val e: JarEntry defined in net.corda.attachmentdemo.recipient.<anonymous>[LocalVariableDescriptor]

'name' @ [154:45] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'it' @ [155:25] ==> value-parameter it: JarInputStream defined in net.corda.attachmentdemo.recipient.<anonymous>[ValueParameterDescriptorImpl]

'closeEntry' @ [155:28] ==> public open fun closeEntry(): Unit defined in java.util.jar.JarInputStream[JavaMethodDescriptor]

'connection' @ [159:17] ==> val connection: HttpURLConnection defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'disconnect' @ [159:28] ==> public abstract fun disconnect(): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'println' @ [161:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [161:81] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'renderIfSupported' @ [161:87] ==> public final fun renderIfSupported(obj: Any): String defined in net.corda.core.internal.Emoji[DeserializedSimpleFunctionDescriptor]

'wtx' @ [161:105] ==> val wtx: WireTransaction defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'println' @ [163:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'wtx' @ [163:56] ==> val wtx: WireTransaction defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'id' @ [163:60] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'println' @ [166:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'wtx' @ [166:51] ==> val wtx: WireTransaction defined in net.corda.attachmentdemo.recipient[LocalVariableDescriptor]

'id' @ [166:55] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'println' @ [171:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [175:9] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parser' @ [176:5] ==> value-parameter parser: OptionParser defined in net.corda.attachmentdemo.printHelp[ValueParameterDescriptorImpl]

'printHelpOn' @ [176:12] ==> public open fun printHelpOn(p0: (OutputStream..OutputStream?)): Unit defined in joptsimple.OptionParser[JavaMethodDescriptor]

'out' @ [176:31] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'tx' @ [181:21] ==> value-parameter tx: LedgerTransaction defined in net.corda.attachmentdemo.AttachmentContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [181:24] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<AttachmentContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [181:66] ==> public fun <T> List<AttachmentContract.State>.single(): AttachmentContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'tx' @ [182:26] ==> value-parameter tx: LedgerTransaction defined in net.corda.attachmentdemo.AttachmentContract.verify[ValueParameterDescriptorImpl]

'attachments' @ [182:29] ==> public final val attachments: List<Attachment> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'single' @ [182:41] ==> public fun <T> List<Attachment>.single(): Attachment defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'require' @ [183:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state' @ [183:17] ==> val state: AttachmentContract.State defined in net.corda.attachmentdemo.AttachmentContract.verify[LocalVariableDescriptor]

'hash' @ [183:23] ==> public final val hash: SecureHash.SHA256 defined in net.corda.attachmentdemo.AttachmentContract.State[PropertyDescriptorImpl]

'attachment' @ [183:31] ==> val attachment: Attachment defined in net.corda.attachmentdemo.AttachmentContract.verify[LocalVariableDescriptor]

'id' @ [183:42] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[DeserializedPropertyDescriptor]

'AttachmentContract' @ [187:43] ==> public constructor AttachmentContract() defined in net.corda.attachmentdemo.AttachmentContract[ClassConstructorDescriptorImpl]

'emptyList' @ [188:58] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

