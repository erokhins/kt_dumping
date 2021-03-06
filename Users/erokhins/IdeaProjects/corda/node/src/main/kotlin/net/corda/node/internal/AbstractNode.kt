'VisibleForTesting' @ [107:29] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'ReusableLatch' @ [107:83] ==> public constructor ReusableLatch() defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [107:102] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'create' @ [123:61] ==> public open fun <B : (Any..Any?)> create(): (MutableClassToInstanceMap<(SerializeAsToken..SerializeAsToken?)>..MutableClassToInstanceMap<(SerializeAsToken..SerializeAsToken?)>?) defined in com.google.common.collect.MutableClassToInstanceMap[JavaMethodDescriptor]
Inferred types:
    <B : (Any..Any?)> -> SerializeAsToken

'ConcurrentHashMap' @ [124:33] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Class<out FlowLogic<*>>
    <V : (Any..Any?)> -> InitiatedFlowFactory<*>

'mutableSetOf' @ [125:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'_services' @ [127:46] ==> private final lateinit var _services: AbstractNode.ServiceHubInternalImpl defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'ArrayList' @ [136:31] ==> public final fun <E> <init>(): ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Function0<Any?>

'openFuture' @ [143:51] ==> public fun <V> openFuture(): OpenFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'_networkMapRegistrationFuture' @ [146:17] ==> protected final val _networkMapRegistrationFuture: OpenFuture<Unit> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'getValue' @ [149:61] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'load' @ [150:23] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(CordaPluginRegistry..CordaPluginRegistry?)>..Class<(CordaPluginRegistry..CordaPluginRegistry?)>?)): (ServiceLoader<(CordaPluginRegistry..CordaPluginRegistry?)>..ServiceLoader<(CordaPluginRegistry..CordaPluginRegistry?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.core.node.CordaPluginRegistry..net.corda.core.node.CordaPluginRegistry?)

'CordaPluginRegistry' @ [150:28] ==> public constructor CordaPluginRegistry() defined in net.corda.core.node.CordaPluginRegistry[DeserializedClassConstructorDescriptor]

'java' @ [150:55] ==> public val <T> KClass<CordaPluginRegistry>.java: Class<CordaPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaPluginRegistry

'toList' @ [150:61] ==> public fun <T> Iterable<(CordaPluginRegistry..CordaPluginRegistry?)>.toList(): List<(CordaPluginRegistry..CordaPluginRegistry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.CordaPluginRegistry..net.corda.core.node.CordaPluginRegistry?)

'Volatile' @ [154:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'getValue' @ [158:37] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'CordaRPCOpsImpl' @ [158:44] ==> public constructor CordaRPCOpsImpl(services: ServiceHubInternal, smm: StateMachineManager, database: CordaPersistence) defined in net.corda.node.internal.CordaRPCOpsImpl[ClassConstructorDescriptorImpl]

'services' @ [158:60] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'smm' @ [158:70] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'database' @ [158:75] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'configuration' @ [161:16] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'myLegalName' @ [161:30] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'locationOrNull' @ [161:42] ==> public val X500Name.locationOrNull: String? defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'let' @ [161:58] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> WorldMapLocation?): WorldMapLocation? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> WorldMapLocation?

'CityDatabase' @ [161:64] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'it' @ [161:77] ==> value-parameter it: String defined in net.corda.node.internal.AbstractNode.findMyLocation.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [165:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [165:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'started' @ [165:18] ==> @Volatile public final var started: Boolean defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'configuration' @ [167:13] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'devMode' @ [167:27] ==> public abstract val devMode: Boolean defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'log' @ [168:13] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'warn' @ [168:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'configuration' @ [169:13] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'configureWithDevSSLCertificate' @ [169:27] ==> public fun NodeConfiguration.configureWithDevSSLCertificate(): Unit defined in net.corda.node.services.config in file ConfigUtilities.kt[SimpleFunctionDescriptorImpl]

'validateKeystore' @ [171:9] ==> private final fun validateKeystore(): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'log' @ [173:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [173:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'initialiseDatabasePersistence' @ [176:9] ==> protected open fun initialiseDatabasePersistence(insideTransaction: () -> Unit): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'makeServices' @ [177:39] ==> private final fun makeServices(): MutableList<Any> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'smm' @ [179:13] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'StateMachineManager' @ [179:19] ==> public constructor StateMachineManager(serviceHub: ServiceHubInternal, checkpointStorage: CheckpointStorage, executor: AffinityExecutor, database: CordaPersistence, unfinishedFibers: ReusableLatch = ...) defined in net.corda.node.services.statemachine.StateMachineManager[ClassConstructorDescriptorImpl]

'services' @ [179:39] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'checkpointStorage' @ [180:21] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'serverThread' @ [181:21] ==> protected abstract val serverThread: AffinityExecutor defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'database' @ [182:21] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'busyNodeLatch' @ [183:21] ==> @VisibleForTesting public final val busyNodeLatch: ReusableLatch defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'smm' @ [185:13] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'tokenizableServices' @ [185:17] ==> internal final val tokenizableServices: ArrayList<Any> /* = ArrayList<Any> */ defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'addAll' @ [185:37] ==> public open fun addAll(elements: Collection<Any>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'tokenizableServices' @ [185:44] ==> val tokenizableServices: MutableList<Any> defined in net.corda.node.internal.AbstractNode.start.<anonymous>[LocalVariableDescriptor]

'serverThread' @ [187:17] ==> protected abstract val serverThread: AffinityExecutor defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'runOnStop' @ [188:17] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'shutdownAndAwaitTermination' @ [192:35] ==> @Beta @CanIgnoreReturnValue @GwtIncompatible public open fun shutdownAndAwaitTermination(p0: (ExecutorService..ExecutorService?), p1: Long, p2: (TimeUnit..TimeUnit?)): Boolean defined in com.google.common.util.concurrent.MoreExecutors[JavaMethodDescriptor]

'serverThread' @ [192:63] ==> protected abstract val serverThread: AffinityExecutor defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'SECONDS' @ [192:100] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'makeVaultObservers' @ [196:13] ==> private final fun makeVaultObservers(): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'checkpointStorage' @ [198:13] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'forEach' @ [198:31] ==> public abstract fun forEach(block: (Checkpoint) -> Boolean): Unit defined in net.corda.node.services.api.CheckpointStorage[SimpleFunctionDescriptorImpl]

'isPreviousCheckpointsPresent' @ [199:17] ==> public final var isPreviousCheckpointsPresent: Boolean defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'startMessagingService' @ [202:13] ==> protected abstract fun startMessagingService(rpcOps: RPCOps): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'rpcOps' @ [202:35] ==> public open val rpcOps: CordaRPCOps defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'installCoreFlows' @ [203:13] ==> private final fun installCoreFlows(): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'scanCordapps' @ [205:30] ==> private final fun scanCordapps(): ScanResult? defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'scanResult' @ [206:17] ==> val scanResult: ScanResult? defined in net.corda.node.internal.AbstractNode.start.<anonymous>[LocalVariableDescriptor]

'installCordaServices' @ [207:17] ==> private final fun installCordaServices(scanResult: ScanResult): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'scanResult' @ [207:38] ==> val scanResult: ScanResult? defined in net.corda.node.internal.AbstractNode.start.<anonymous>[LocalVariableDescriptor]

'registerInitiatedFlows' @ [208:17] ==> private final fun registerInitiatedFlows(scanResult: ScanResult): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'scanResult' @ [208:40] ==> val scanResult: ScanResult? defined in net.corda.node.internal.AbstractNode.start.<anonymous>[LocalVariableDescriptor]

'findRPCFlows' @ [209:17] ==> private final fun findRPCFlows(scanResult: ScanResult): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'scanResult' @ [209:30] ==> val scanResult: ScanResult? defined in net.corda.node.internal.AbstractNode.start.<anonymous>[LocalVariableDescriptor]

'runOnStop' @ [212:13] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'network' @ [212:26] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'stop' @ [212:35] ==> public abstract fun stop(): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'_networkMapRegistrationFuture' @ [213:13] ==> protected final val _networkMapRegistrationFuture: OpenFuture<Unit> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'captureLater' @ [213:43] ==> public open fun captureLater(f: CordaFuture<out Unit>): Unit defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'registerWithNetworkMapIfConfigured' @ [213:56] ==> private final fun registerWithNetworkMapIfConfigured(): CordaFuture<Unit> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'smm' @ [214:13] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'start' @ [214:17] ==> public final fun start(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'runOnStop' @ [216:13] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'smm' @ [216:28] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'stop' @ [216:32] ==> public final fun stop(allowedUnsuspendedFiberCount: Int = ...): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'acceptableLiveFiberCountOnStop' @ [216:37] ==> @VisibleForTesting protected open fun acceptableLiveFiberCountOnStop(): Int defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'_services' @ [217:13] ==> private final lateinit var _services: AbstractNode.ServiceHubInternalImpl defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'schedulerService' @ [217:23] ==> public open val schedulerService: NodeSchedulerService defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'start' @ [217:40] ==> public final fun start(): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'started' @ [219:9] ==> @Volatile public final var started: Boolean defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'Exception' @ [222:70] ==> public final fun <init>(p0: (Throwable..Throwable?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'cause' @ [222:80] ==> value-parameter cause: Throwable? defined in net.corda.node.internal.AbstractNode.ServiceInstantiationException.<init>[ValueParameterDescriptorImpl]

'clazz' @ [227:17] ==> value-parameter clazz: Class<*> defined in net.corda.node.internal.AbstractNode.installCordaServices.getServiceType[ValueParameterDescriptorImpl]

'getField' @ [227:23] ==> @CallerSensitive public open fun getField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'get' @ [227:40] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'log' @ [229:17] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'warn' @ [229:21] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'clazz' @ [229:29] ==> value-parameter clazz: Class<*> defined in net.corda.node.internal.AbstractNode.installCordaServices.getServiceType[ValueParameterDescriptorImpl]

'name' @ [229:35] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'scanResult' @ [234:9] ==> value-parameter scanResult: ScanResult defined in net.corda.node.internal.AbstractNode.installCordaServices[ValueParameterDescriptorImpl]

'getClassesWithAnnotation' @ [234:20] ==> private final fun <T : Any> ScanResult.getClassesWithAnnotation(type: KClass<SerializeAsToken>, annotation: KClass<out Annotation>): List<Class<out SerializeAsToken>> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SerializeAsToken

'CordaService' @ [234:70] ==> public constructor CordaService() defined in net.corda.core.node.services.CordaService[DeserializedClassConstructorDescriptor]

'filter' @ [235:18] ==> public inline fun <T> Iterable<Class<out SerializeAsToken>>.filter(predicate: (Class<out SerializeAsToken>) -> Boolean): List<Class<out SerializeAsToken>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out SerializeAsToken>

'getServiceType' @ [236:39] ==> local final fun getServiceType(clazz: Class<*>): ServiceType? defined in net.corda.node.internal.AbstractNode.installCordaServices[SimpleFunctionDescriptorImpl]

'it' @ [236:54] ==> value-parameter it: Class<out SerializeAsToken> defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[ValueParameterDescriptorImpl]

'if (serviceType != null && info.serviceIdentities(serviceType).isEmpty()) {
                        log.debug { "Ignoring ${it.name} as a Corda service since $serviceType is not one of our " +
                                "advertised services" }
                        false
                    } else {
                        true
                    }' @ [237:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'serviceType' @ [237:25] ==> val serviceType: ServiceType? defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[LocalVariableDescriptor]

'info' @ [237:48] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'serviceIdentities' @ [237:53] ==> public final fun serviceIdentities(type: ServiceType): List<Party> defined in net.corda.core.node.NodeInfo[DeserializedSimpleFunctionDescriptor]

'serviceType' @ [237:71] ==> val serviceType: ServiceType? defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [237:84] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [238:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'debug' @ [238:29] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'+' @ [238:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [238:49] ==> value-parameter it: Class<out SerializeAsToken> defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [238:52] ==> public final val <T : (Any..Any?)> Class<out SerializeAsToken>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out SerializeAsToken)

'serviceType' @ [238:84] ==> val serviceType: ServiceType? defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[LocalVariableDescriptor]

'forEach' @ [245:18] ==> @HidesMembers public inline fun <T> Iterable<Class<out SerializeAsToken>>.forEach(action: (Class<out SerializeAsToken>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out SerializeAsToken>

'installCordaService' @ [247:25] ==> public final fun <T : SerializeAsToken> installCordaService(serviceClass: Class<out SerializeAsToken>): SerializeAsToken defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : SerializeAsToken> -> Captured(out SerializeAsToken)

'it' @ [247:45] ==> value-parameter it: Class<out SerializeAsToken> defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [249:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'error' @ [249:29] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [249:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [249:38] ==> value-parameter it: Class<out SerializeAsToken> defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [249:41] ==> public final val <T : (Any..Any?)> Class<out SerializeAsToken>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out SerializeAsToken)

'java' @ [250:68] ==> public val <T> KClass<PluginServiceHub>.java: Class<PluginServiceHub> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PluginServiceHub

'name' @ [250:73] ==> public final val <T : (Any..Any?)> Class<PluginServiceHub>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PluginServiceHub

'log' @ [252:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'error' @ [252:29] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'it' @ [252:52] ==> value-parameter it: Class<out SerializeAsToken> defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [252:55] ==> public final val <T : (Any..Any?)> Class<out SerializeAsToken>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out SerializeAsToken)

'e' @ [252:85] ==> val e: AbstractNode.ServiceInstantiationException defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[LocalVariableDescriptor]

'cause' @ [252:87] ==> public open val cause: Throwable? defined in net.corda.node.internal.AbstractNode.ServiceInstantiationException[DeserializedPropertyDescriptor]

'log' @ [254:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'error' @ [254:29] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'it' @ [254:70] ==> value-parameter it: Class<out SerializeAsToken> defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [254:73] ==> public final val <T : (Any..Any?)> Class<out SerializeAsToken>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out SerializeAsToken)

'e' @ [254:81] ==> val e: Exception /* = Exception */ defined in net.corda.node.internal.AbstractNode.installCordaServices.<anonymous>[LocalVariableDescriptor]

'serviceClass' @ [264:9] ==> value-parameter serviceClass: Class<T> defined in net.corda.node.internal.AbstractNode.installCordaService[ValueParameterDescriptorImpl]

'requireAnnotation' @ [264:22] ==> private final inline fun <reified A : Annotation> Class<*>.requireAnnotation(): CordaService defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified A : Annotation> -> CordaService

'serviceClass' @ [265:27] ==> value-parameter serviceClass: Class<T> defined in net.corda.node.internal.AbstractNode.installCordaService[ValueParameterDescriptorImpl]

'getDeclaredConstructor' @ [265:40] ==> @CallerSensitive public open fun getDeclaredConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<(T..T?)>..Constructor<(T..T?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'java' @ [265:87] ==> public val <T> KClass<PluginServiceHub>.java: Class<PluginServiceHub> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PluginServiceHub

'apply' @ [265:93] ==> @InlineOnly public inline fun <T> (Constructor<(T..T?)>..Constructor<(T..T?)>?).apply(block: (Constructor<(T..T?)>..Constructor<(T..T?)>?).() -> Unit): (Constructor<(T..T?)>..Constructor<(T..T?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<(T..T?)>..java.lang.reflect.Constructor<(T..T?)>?)

'isAccessible' @ [265:101] ==> public final var <T : (Any..Any?)> Constructor<(T..T?)>.isAccessible: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'constructor' @ [267:13] ==> val constructor: (Constructor<(T..T?)>..Constructor<(T..T?)>?) defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'newInstance' @ [267:25] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (T..T?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'services' @ [267:37] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'ServiceInstantiationException' @ [269:19] ==> public constructor ServiceInstantiationException(cause: Throwable?) defined in net.corda.node.internal.AbstractNode.ServiceInstantiationException[ClassConstructorDescriptorImpl]

'e' @ [269:49] ==> val e: InvocationTargetException defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'cause' @ [269:51] ==> public open val cause: Throwable? defined in java.lang.reflect.InvocationTargetException[JavaPropertyDescriptor]

'cordappServices' @ [271:9] ==> private final val cordappServices: (MutableClassToInstanceMap<(SerializeAsToken..SerializeAsToken?)>..MutableClassToInstanceMap<(SerializeAsToken..SerializeAsToken?)>?) defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'putInstance' @ [271:25] ==> @CanIgnoreReturnValue public open fun <T : (SerializeAsToken..SerializeAsToken?)> putInstance(p0: (Class<(T..T?)>..Class<(T..T?)>?), p1: T?): (T..T?) defined in com.google.common.collect.MutableClassToInstanceMap[JavaMethodDescriptor]
Inferred types:
    <T : (SerializeAsToken..SerializeAsToken?)> -> (T..T?)

'serviceClass' @ [271:37] ==> value-parameter serviceClass: Class<T> defined in net.corda.node.internal.AbstractNode.installCordaService[ValueParameterDescriptorImpl]

'service' @ [271:51] ==> val service: (T..T?) defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'smm' @ [272:9] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'tokenizableServices' @ [272:13] ==> internal final val tokenizableServices: ArrayList<Any> /* = ArrayList<Any> */ defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'service' @ [272:36] ==> val service: (T..T?) defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'service' @ [274:13] ==> val service: (T..T?) defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'handleCustomNotaryService' @ [274:39] ==> private final fun handleCustomNotaryService(service: NotaryService): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'service' @ [274:65] ==> val service: (T..T?) defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'log' @ [276:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [276:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'serviceClass' @ [276:31] ==> value-parameter serviceClass: Class<T> defined in net.corda.node.internal.AbstractNode.installCordaService[ValueParameterDescriptorImpl]

'name' @ [276:44] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'service' @ [277:16] ==> val service: (T..T?) defined in net.corda.node.internal.AbstractNode.installCordaService[LocalVariableDescriptor]

'runOnStop' @ [281:9] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'service' @ [281:22] ==> value-parameter service: NotaryService defined in net.corda.node.internal.AbstractNode.handleCustomNotaryService[ValueParameterDescriptorImpl]

'stop' @ [281:31] ==> public abstract fun stop(): Unit defined in net.corda.core.node.services.NotaryService[DeserializedSimpleFunctionDescriptor]

'service' @ [282:9] ==> value-parameter service: NotaryService defined in net.corda.node.internal.AbstractNode.handleCustomNotaryService[ValueParameterDescriptorImpl]

'start' @ [282:17] ==> public abstract fun start(): Unit defined in net.corda.core.node.services.NotaryService[DeserializedSimpleFunctionDescriptor]

'installCoreFlow' @ [283:9] ==> @VisibleForTesting public final fun installCoreFlow(clientFlowClass: KClass<out FlowLogic<*>>, flowFactory: (Party) -> FlowLogic<*>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'NotaryFlow' @ [283:25] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [283:36] ==> public companion object defined in net.corda.core.flows.NotaryFlow.Client[FakeCallableDescriptorForObject]

'service' @ [283:51] ==> value-parameter service: NotaryService defined in net.corda.node.internal.AbstractNode.handleCustomNotaryService[ValueParameterDescriptorImpl]

'createServiceFlow' @ [283:60] ==> public abstract fun createServiceFlow(otherParty: Party): FlowLogic<Void?> defined in net.corda.core.node.services.NotaryService[DeserializedSimpleFunctionDescriptor]

'requireNotNull' @ [287:16] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: A?, lazyMessage: () -> Any): A defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> A

'getDeclaredAnnotation' @ [287:31] ==> public open fun <A : (Annotation..Annotation?)> getDeclaredAnnotation(p0: (Class<(A..A?)>..Class<(A..A?)>?)): (A..A?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <A : (Annotation..Annotation?)> -> (A..A?)

'java' @ [287:62] ==> public val <T> KClass<A>.java: Class<A> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> A

'name' @ [287:73] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'java' @ [287:116] ==> public val <T> KClass<A>.java: Class<A> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> A

'name' @ [287:121] ==> public final val <T : (Any..Any?)> Class<A>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'scanResult' @ [291:9] ==> value-parameter scanResult: ScanResult defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows[ValueParameterDescriptorImpl]

'getClassesWithAnnotation' @ [292:18] ==> private final fun <T : Any> ScanResult.getClassesWithAnnotation(type: KClass<FlowLogic<*>>, annotation: KClass<out Annotation>): List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> FlowLogic<*>

'FlowLogic' @ [292:43] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6921250a

'InitiatedBy' @ [292:61] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'groupBy' @ [294:18] ==> public inline fun <T, K> Iterable<Class<out FlowLogic<*>>>.groupBy(keySelector: (Class<out FlowLogic<*>>) -> Class<out FlowLogic<*>>): Map<Class<out FlowLogic<*>>, List<Class<out FlowLogic<*>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out FlowLogic<*>>
    <K> -> Class<out FlowLogic<*>>

'it' @ [294:28] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[ValueParameterDescriptorImpl]

'requireAnnotation' @ [294:31] ==> private final inline fun <reified A : Annotation> Class<*>.requireAnnotation(): InitiatedBy defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified A : Annotation> -> InitiatedBy

'value' @ [294:64] ==> public final val value: KClass<out FlowLogic<*>> defined in net.corda.core.flows.InitiatedBy[DeserializedPropertyDescriptor]

'java' @ [294:70] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out FlowLogic<*>)

'map' @ [295:18] ==> public inline fun <K, V, R> Map<out Class<out FlowLogic<*>>, List<Class<out FlowLogic<*>>>>.map(transform: (Map.Entry<Class<out FlowLogic<*>>, List<Class<out FlowLogic<*>>>>) -> Class<out FlowLogic<*>>): List<Class<out FlowLogic<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out FlowLogic<*>>
    <V> -> List<Class<out FlowLogic<*>>>
    <R> -> Class<out FlowLogic<*>>

'component1' @ [295:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Class<out FlowLogic<*>>, List<Class<out FlowLogic<*>>>>.component1(): Class<out FlowLogic<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out FlowLogic<*>>
    <V> -> List<Class<out FlowLogic<*>>>

'component2' @ [295:41] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Class<out FlowLogic<*>>, List<Class<out FlowLogic<*>>>>.component2(): List<Class<out FlowLogic<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out FlowLogic<*>>
    <V> -> List<Class<out FlowLogic<*>>>

'initiatedFlows' @ [296:34] ==> val initiatedFlows: List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'sortedWith' @ [296:49] ==> public fun <T> Iterable<Class<out FlowLogic<*>>>.sortedWith(comparator: Comparator<in Class<out FlowLogic<*>>> /* = Comparator<in Class<out FlowLogic<*>>> */): List<Class<out FlowLogic<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out FlowLogic<*>>

'FlowTypeHierarchyComparator' @ [296:60] ==> public constructor FlowTypeHierarchyComparator(initiatingFlow: Class<out FlowLogic<*>>) defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator[ClassConstructorDescriptorImpl]

'initiatingFlow' @ [296:88] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'sorted' @ [297:25] ==> val sorted: List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'size' @ [297:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'log' @ [298:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'warn' @ [298:29] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [298:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'initiatingFlow' @ [298:37] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'name' @ [298:52] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'sorted' @ [299:64] ==> val sorted: List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [299:71] ==> public fun <T> Iterable<Class<out FlowLogic<*>>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Class<out FlowLogic<*>>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out FlowLogic<*>>

'it' @ [299:86] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [299:89] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'sorted' @ [300:72] ==> val sorted: List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'name' @ [300:82] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'sorted' @ [302:21] ==> val sorted: List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'forEach' @ [304:18] ==> @HidesMembers public inline fun <T> Iterable<Class<out FlowLogic<*>>>.forEach(action: (Class<out FlowLogic<*>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out FlowLogic<*>>

'registerInitiatedFlowInternal' @ [306:25] ==> private final fun <F : FlowLogic<*>> registerInitiatedFlowInternal(initiatedFlow: Class<out FlowLogic<*>>, track: Boolean): Observable<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <F : FlowLogic<*>> -> Captured(out FlowLogic<*>)

'it' @ [306:55] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [308:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'error' @ [308:29] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [308:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [308:38] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [308:41] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'java' @ [309:57] ==> public val <T> KClass<Party>.java: Class<Party> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Party

'name' @ [309:62] ==> public final val <T : (Any..Any?)> Class<Party>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party

'log' @ [311:25] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'error' @ [311:29] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'it' @ [311:72] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [311:75] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'e' @ [311:83] ==> val e: Exception /* = Exception */ defined in net.corda.node.internal.AbstractNode.registerInitiatedFlows.<anonymous>[LocalVariableDescriptor]

'if (o1 == o2) {
                0
            } else if (o1.isAssignableFrom(o2)) {
                1
            } else if (o2.isAssignableFrom(o1)) {
                -1
            } else {
                throw IllegalArgumentException("${initiatingFlow.name} has been specified as the initiating flow by " +
                        "both ${o1.name} and ${o2.name}")
            }' @ [318:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'o1' @ [318:24] ==> value-parameter o1: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'o2' @ [318:30] ==> value-parameter o2: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'if (o1.isAssignableFrom(o2)) {
                1
            } else if (o2.isAssignableFrom(o1)) {
                -1
            } else {
                throw IllegalArgumentException("${initiatingFlow.name} has been specified as the initiating flow by " +
                        "both ${o1.name} and ${o2.name}")
            }' @ [320:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'o1' @ [320:24] ==> value-parameter o1: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [320:27] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'o2' @ [320:44] ==> value-parameter o2: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'if (o2.isAssignableFrom(o1)) {
                -1
            } else {
                throw IllegalArgumentException("${initiatingFlow.name} has been specified as the initiating flow by " +
                        "both ${o1.name} and ${o2.name}")
            }' @ [322:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'o2' @ [322:24] ==> value-parameter o2: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [322:27] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'o1' @ [322:44] ==> value-parameter o1: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'-' @ [323:17] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [325:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [325:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'initiatingFlow' @ [325:51] ==> public final val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator[PropertyDescriptorImpl]

'name' @ [325:66] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'o1' @ [326:33] ==> value-parameter o1: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'name' @ [326:36] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'o2' @ [326:48] ==> value-parameter o2: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.FlowTypeHierarchyComparator.compare[ValueParameterDescriptorImpl]

'name' @ [326:51] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'registerInitiatedFlowInternal' @ [337:16] ==> private final fun <F : FlowLogic<*>> registerInitiatedFlowInternal(initiatedFlow: Class<T>, track: Boolean): Observable<T> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <F : FlowLogic<*>> -> T

'initiatedFlowClass' @ [337:46] ==> value-parameter initiatedFlowClass: Class<T> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlow[ValueParameterDescriptorImpl]

'initiatedFlow' @ [341:20] ==> value-parameter initiatedFlow: Class<F> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[ValueParameterDescriptorImpl]

'getDeclaredConstructor' @ [341:34] ==> @CallerSensitive public open fun getDeclaredConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<(F..F?)>..Constructor<(F..F?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'java' @ [341:70] ==> public val <T> KClass<Party>.java: Class<Party> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Party

'apply' @ [341:76] ==> @InlineOnly public inline fun <T> (Constructor<(F..F?)>..Constructor<(F..F?)>?).apply(block: (Constructor<(F..F?)>..Constructor<(F..F?)>?).() -> Unit): (Constructor<(F..F?)>..Constructor<(F..F?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<(F..F?)>..java.lang.reflect.Constructor<(F..F?)>?)

'isAccessible' @ [341:84] ==> public final var <T : (Any..Any?)> Constructor<(F..F?)>.isAccessible: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (F..F?)

'initiatedFlow' @ [342:30] ==> value-parameter initiatedFlow: Class<F> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[ValueParameterDescriptorImpl]

'requireAnnotation' @ [342:44] ==> private final inline fun <reified A : Annotation> Class<*>.requireAnnotation(): InitiatedBy defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified A : Annotation> -> InitiatedBy

'value' @ [342:77] ==> public final val value: KClass<out FlowLogic<*>> defined in net.corda.core.flows.InitiatedBy[DeserializedPropertyDescriptor]

'java' @ [342:83] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out FlowLogic<*>)

'component1' @ [343:14] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [343:23] ==> public final operator fun component2(): Class<out FlowLogic<*>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'initiatingFlow' @ [343:46] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'flowVersionAndInitiatingClass' @ [343:61] ==> @Suppress public val Class<out FlowLogic<*>>.flowVersionAndInitiatingClass: Pair<Int, Class<out FlowLogic<*>>> defined in net.corda.node.services.statemachine in file FlowStateMachineImpl.kt[PropertyDescriptorImpl]

'require' @ [344:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classWithAnnotation' @ [344:17] ==> val classWithAnnotation: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'initiatingFlow' @ [344:40] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'InitiatedBy' @ [345:16] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'java' @ [345:35] ==> public val <T> KClass<InitiatedBy>.java: Class<InitiatedBy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiatedBy

'name' @ [345:40] ==> public final val <T : (Any..Any?)> Class<InitiatedBy>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InitiatedBy

'classWithAnnotation' @ [345:62] ==> val classWithAnnotation: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'name' @ [345:82] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'initiatingFlow' @ [345:98] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'name' @ [345:113] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'get' @ [347:29] ==> public open fun get(p0: (URI..URI?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'initiatedFlow' @ [347:33] ==> value-parameter initiatedFlow: Class<F> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[ValueParameterDescriptorImpl]

'protectionDomain' @ [347:47] ==> public final val <T : (Any..Any?)> Class<F>.protectionDomain: (ProtectionDomain..ProtectionDomain?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> F

'codeSource' @ [347:64] ==> public final val ProtectionDomain.codeSource: (CodeSource..CodeSource?)[MyPropertyDescriptor]

'location' @ [347:75] ==> public final val CodeSource.location: (URL..URL?)[MyPropertyDescriptor]

'toURI' @ [347:84] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'if (jarFile.isRegularFile() && jarFile.toString().endsWith(".jar")) {
            jarFile.fileName.toString().removeSuffix(".jar")
        } else {
            "<unknown>"
        }' @ [348:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'jarFile' @ [348:27] ==> val jarFile: (Path..Path?) defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'isRegularFile' @ [348:35] ==> public fun Path.isRegularFile(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'jarFile' @ [348:54] ==> val jarFile: (Path..Path?) defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'toString' @ [348:62] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [348:73] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'jarFile' @ [349:13] ==> val jarFile: (Path..Path?) defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'fileName' @ [349:21] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'toString' @ [349:30] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'removeSuffix' @ [349:41] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CorDapp' @ [353:48] ==> public constructor CorDapp<out F : FlowLogic<*>>(flowVersion: Int, appName: String, factory: (Party) -> (F..F?)) defined in net.corda.node.internal.InitiatedFlowFactory.CorDapp[ClassConstructorDescriptorImpl]
Inferred types:
    <out F : FlowLogic<*>> -> (F..F?)

'version' @ [353:56] ==> val version: Int defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'appName' @ [353:65] ==> val appName: String defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'ctor' @ [353:76] ==> val ctor: (Constructor<(F..F?)>..Constructor<(F..F?)>?) defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'newInstance' @ [353:81] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (F..F?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'it' @ [353:93] ==> value-parameter it: Party defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal.<anonymous>[ValueParameterDescriptorImpl]

'internalRegisterFlowFactory' @ [354:26] ==> @VisibleForTesting public final fun <F : FlowLogic<*>> internalRegisterFlowFactory(initiatingFlowClass: Class<out FlowLogic<*>>, flowFactory: InitiatedFlowFactory<F>, initiatedFlowClass: Class<F>, track: Boolean): Observable<F> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <F : FlowLogic<*>> -> F

'initiatingFlow' @ [354:54] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'flowFactory' @ [354:70] ==> val flowFactory: InitiatedFlowFactory.CorDapp<(F..F?)> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'initiatedFlow' @ [354:83] ==> value-parameter initiatedFlow: Class<F> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[ValueParameterDescriptorImpl]

'track' @ [354:98] ==> value-parameter track: Boolean defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[ValueParameterDescriptorImpl]

'log' @ [355:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [355:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'initiatingFlow' @ [355:32] ==> val initiatingFlow: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'name' @ [355:47] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'initiatedFlow' @ [355:67] ==> value-parameter initiatedFlow: Class<F> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[ValueParameterDescriptorImpl]

'name' @ [355:81] ==> public final val <T : (Any..Any?)> Class<F>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> F

'version' @ [355:97] ==> val version: Int defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'observable' @ [356:16] ==> val observable: Observable<F> defined in net.corda.node.internal.AbstractNode.registerInitiatedFlowInternal[LocalVariableDescriptor]

'VisibleForTesting' @ [359:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'if (track) {
            smm.changes.filter { it is StateMachineManager.Change.Add }.map { it.logic }.ofType(initiatedFlowClass)
        } else {
            Observable.empty()
        }' @ [364:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Observable<(F..F?)>..Observable<(F..F?)>?), elseBranch: (Observable<(F..F?)>..Observable<(F..F?)>?)): (Observable<(F..F?)>..Observable<(F..F?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (rx.Observable<(F..F?)>..rx.Observable<(F..F?)>?)

'track' @ [364:30] ==> value-parameter track: Boolean defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory[ValueParameterDescriptorImpl]

'smm' @ [365:13] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'changes' @ [365:17] ==> public final val changes: Observable<StateMachineManager.Change> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'filter' @ [365:25] ==> public final fun filter(p0: (((StateMachineManager.Change..StateMachineManager.Change?)) -> (Boolean..Boolean?)..(((StateMachineManager.Change..StateMachineManager.Change?)) -> (Boolean..Boolean?))?)): (Observable<(StateMachineManager.Change..StateMachineManager.Change?)>..Observable<(StateMachineManager.Change..StateMachineManager.Change?)>?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [365:34] ==> value-parameter it: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [365:73] ==> public final fun <R : (Any..Any?)> map(p0: (((StateMachineManager.Change..StateMachineManager.Change?)) -> (FlowLogic<*>..FlowLogic<*>?)..(((StateMachineManager.Change..StateMachineManager.Change?)) -> (FlowLogic<*>..FlowLogic<*>?))?)): (Observable<(FlowLogic<*>..FlowLogic<*>?)>..Observable<(FlowLogic<*>..FlowLogic<*>?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.core.flows.FlowLogic<*>..net.corda.core.flows.FlowLogic<*>?)

'it' @ [365:79] ==> value-parameter it: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [365:82] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[PropertyDescriptorImpl]

'ofType' @ [365:90] ==> public final fun <R : (Any..Any?)> ofType(p0: (Class<(F..F?)>..Class<(F..F?)>?)): (Observable<(F..F?)>..Observable<(F..F?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (F..F?)

'initiatedFlowClass' @ [365:97] ==> value-parameter initiatedFlowClass: Class<F> defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory[ValueParameterDescriptorImpl]

'empty' @ [367:24] ==> public open fun <T : (Any..Any?)> empty(): (Observable<(F..F?)>..Observable<(F..F?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (F..F?)

'flowFactories' @ [369:9] ==> private final val flowFactories: ConcurrentHashMap<Class<out FlowLogic<*>>, InitiatedFlowFactory<*>> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'initiatingFlowClass' @ [369:23] ==> value-parameter initiatingFlowClass: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory[ValueParameterDescriptorImpl]

'flowFactory' @ [369:46] ==> value-parameter flowFactory: InitiatedFlowFactory<F> defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory[ValueParameterDescriptorImpl]

'observable' @ [370:16] ==> val observable: (Observable<(F..F?)>..Observable<(F..F?)>?) defined in net.corda.node.internal.AbstractNode.internalRegisterFlowFactory[LocalVariableDescriptor]

'isPublic' @ [375:20] ==> public open fun isPublic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [375:29] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'!' @ [375:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocalClass' @ [375:44] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.isLocalClass: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'!' @ [375:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnonymousClass' @ [375:61] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.isAnonymousClass: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'!' @ [375:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMemberClass' @ [375:83] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.isMemberClass: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'isStatic' @ [375:100] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [375:109] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'_services' @ [378:9] ==> private final lateinit var _services: AbstractNode.ServiceHubInternalImpl defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'rpcFlows' @ [378:19] ==> public open val rpcFlows: ArrayList<Class<out FlowLogic<*>>> /* = ArrayList<Class<out FlowLogic<*>>> */ defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'scanResult' @ [378:31] ==> value-parameter scanResult: ScanResult defined in net.corda.node.internal.AbstractNode.findRPCFlows[ValueParameterDescriptorImpl]

'getClassesWithAnnotation' @ [379:18] ==> private final fun <T : Any> ScanResult.getClassesWithAnnotation(type: KClass<FlowLogic<*>>, annotation: KClass<out Annotation>): List<Class<out FlowLogic<*>>> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> FlowLogic<*>

'FlowLogic' @ [379:43] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6c2bf0ce

'StartableByRPC' @ [379:61] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'filter' @ [380:18] ==> public inline fun <T> Iterable<Class<out FlowLogic<*>>>.filter(predicate: (Class<out FlowLogic<*>>) -> Boolean): List<Class<out FlowLogic<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out FlowLogic<*>>

'it' @ [380:27] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.findRPCFlows.<anonymous>[ValueParameterDescriptorImpl]

'isUserInvokable' @ [380:30] ==> local final fun Class<out FlowLogic<*>>.isUserInvokable(): Boolean defined in net.corda.node.internal.AbstractNode.findRPCFlows[SimpleFunctionDescriptorImpl]

'listOf' @ [382:21] ==> public fun <T> listOf(element: Class<ContractUpgradeFlow<*, *>>): List<Class<ContractUpgradeFlow<*, *>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<ContractUpgradeFlow<*, *>>

'ContractUpgradeFlow' @ [383:29] ==> public companion object defined in net.corda.core.flows.ContractUpgradeFlow[FakeCallableDescriptorForObject]

'java' @ [383:56] ==> public val <T> KClass<ContractUpgradeFlow<*, *>>.java: Class<ContractUpgradeFlow<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ContractUpgradeFlow<*, *>

'VisibleForTesting' @ [392:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'require' @ [394:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'clientFlowClass' @ [394:17] ==> value-parameter clientFlowClass: KClass<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.installCoreFlow[ValueParameterDescriptorImpl]

'java' @ [394:33] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out FlowLogic<*>)

'flowVersionAndInitiatingClass' @ [394:38] ==> @Suppress public val Class<out FlowLogic<*>>.flowVersionAndInitiatingClass: Pair<Int, Class<out FlowLogic<*>>> defined in net.corda.node.services.statemachine in file FlowStateMachineImpl.kt[PropertyDescriptorImpl]

'first' @ [394:68] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'InitiatingFlow' @ [395:16] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'java' @ [395:38] ==> public val <T> KClass<InitiatingFlow>.java: Class<InitiatingFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiatingFlow

'name' @ [395:43] ==> public final val <T : (Any..Any?)> Class<InitiatingFlow>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InitiatingFlow

'flowFactories' @ [397:9] ==> private final val flowFactories: ConcurrentHashMap<Class<out FlowLogic<*>>, InitiatedFlowFactory<*>> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'clientFlowClass' @ [397:23] ==> value-parameter clientFlowClass: KClass<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.installCoreFlow[ValueParameterDescriptorImpl]

'java' @ [397:39] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out FlowLogic<*>)

'Core' @ [397:68] ==> public constructor Core<out F : FlowLogic<*>>(factory: (Party) -> FlowLogic<*>) defined in net.corda.node.internal.InitiatedFlowFactory.Core[ClassConstructorDescriptorImpl]
Inferred types:
    <out F : FlowLogic<*>> -> FlowLogic<*>

'flowFactory' @ [397:73] ==> value-parameter flowFactory: (Party) -> FlowLogic<*> defined in net.corda.node.internal.AbstractNode.installCoreFlow[ValueParameterDescriptorImpl]

'log' @ [398:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'debug' @ [398:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'clientFlowClass' @ [398:44] ==> value-parameter clientFlowClass: KClass<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.installCoreFlow[ValueParameterDescriptorImpl]

'java' @ [398:60] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out FlowLogic<*>)

'name' @ [398:65] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'installCoreFlow' @ [402:9] ==> @VisibleForTesting public final fun installCoreFlow(clientFlowClass: KClass<out FlowLogic<*>>, flowFactory: (Party) -> FlowLogic<*>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'BroadcastTransactionFlow' @ [402:25] ==> public constructor BroadcastTransactionFlow(notarisedTransaction: SignedTransaction, participants: NonEmptySet<Party>) defined in net.corda.core.flows.BroadcastTransactionFlow[DeserializedClassConstructorDescriptor]

'NotifyTransactionHandler' @ [402:60] ==> public constructor NotifyTransactionHandler(otherParty: Party) defined in net.corda.node.services.NotifyTransactionHandler[ClassConstructorDescriptorImpl]

'installCoreFlow' @ [403:9] ==> @VisibleForTesting public final fun installCoreFlow(clientFlowClass: KClass<out FlowLogic<*>>, flowFactory: (Party) -> FlowLogic<*>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'NotaryChangeFlow' @ [403:25] ==> public constructor NotaryChangeFlow<out T : ContractState>(originalState: StateAndRef<???>, newNotary: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.NotaryChangeFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@56d2215

'NotaryChangeHandler' @ [403:52] ==> public constructor NotaryChangeHandler(otherSide: Party) defined in net.corda.node.services.NotaryChangeHandler[ClassConstructorDescriptorImpl]

'installCoreFlow' @ [404:9] ==> @VisibleForTesting public final fun installCoreFlow(clientFlowClass: KClass<out FlowLogic<*>>, flowFactory: (Party) -> FlowLogic<*>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'ContractUpgradeFlow' @ [404:25] ==> public companion object defined in net.corda.core.flows.ContractUpgradeFlow[FakeCallableDescriptorForObject]

'ContractUpgradeHandler' @ [404:55] ==> public constructor ContractUpgradeHandler(otherSide: Party) defined in net.corda.node.services.ContractUpgradeHandler[ClassConstructorDescriptorImpl]

'installCoreFlow' @ [405:9] ==> @VisibleForTesting public final fun installCoreFlow(clientFlowClass: KClass<out FlowLogic<*>>, flowFactory: (Party) -> FlowLogic<*>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'TransactionKeyFlow' @ [405:25] ==> public companion object defined in net.corda.core.flows.TransactionKeyFlow[FakeCallableDescriptorForObject]

'TransactionKeyHandler' @ [405:54] ==> public constructor TransactionKeyHandler(otherSide: Party) defined in net.corda.node.services.TransactionKeyHandler[ClassConstructorDescriptorImpl]

'checkpointStorage' @ [413:9] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'DBCheckpointStorage' @ [413:29] ==> public constructor DBCheckpointStorage() defined in net.corda.node.services.persistence.DBCheckpointStorage[ClassConstructorDescriptorImpl]

'_services' @ [414:9] ==> private final lateinit var _services: AbstractNode.ServiceHubInternalImpl defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'ServiceHubInternalImpl' @ [414:21] ==> public constructor ServiceHubInternalImpl() defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[ClassConstructorDescriptorImpl]

'attachments' @ [415:9] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'NodeAttachmentService' @ [415:23] ==> public constructor NodeAttachmentService(metrics: MetricRegistry) defined in net.corda.node.services.persistence.NodeAttachmentService[ClassConstructorDescriptorImpl]

'services' @ [415:45] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'monitoringService' @ [415:54] ==> public abstract val monitoringService: MonitoringService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'metrics' @ [415:72] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'obtainIdentity' @ [416:29] ==> private final fun obtainIdentity(id: String, name: X500Name): PartyAndCertificate defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'configuration' @ [416:56] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'myLegalName' @ [416:70] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'network' @ [417:9] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'makeMessagingService' @ [417:19] ==> protected abstract fun makeMessagingService(legalIdentity: PartyAndCertificate): MessagingService defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'legalIdentity' @ [417:40] ==> val legalIdentity: PartyAndCertificate defined in net.corda.node.internal.AbstractNode.makeServices[LocalVariableDescriptor]

'info' @ [418:9] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'makeInfo' @ [418:16] ==> private final fun makeInfo(legalIdentity: PartyAndCertificate): NodeInfo defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'legalIdentity' @ [418:25] ==> val legalIdentity: PartyAndCertificate defined in net.corda.node.internal.AbstractNode.makeServices[LocalVariableDescriptor]

'mutableListOf' @ [420:35] ==> public fun <T> mutableListOf(vararg elements: Any): MutableList<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'attachments' @ [420:49] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'network' @ [420:62] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'services' @ [420:71] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'vaultService' @ [420:80] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'services' @ [420:94] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'vaultQueryService' @ [420:103] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'services' @ [421:17] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keyManagementService' @ [421:26] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'services' @ [421:48] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'identityService' @ [421:57] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'platformClock' @ [421:74] ==> public final val platformClock: Clock defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'services' @ [421:89] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'schedulerService' @ [421:98] ==> public abstract val schedulerService: SchedulerService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'makeAdvertisedServices' @ [422:9] ==> private final fun makeAdvertisedServices(tokenizableServices: MutableList<Any>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'tokenizableServices' @ [422:32] ==> val tokenizableServices: MutableList<Any> defined in net.corda.node.internal.AbstractNode.makeServices[LocalVariableDescriptor]

'tokenizableServices' @ [423:16] ==> val tokenizableServices: MutableList<Any> defined in net.corda.node.internal.AbstractNode.makeServices[LocalVariableDescriptor]

'DBTransactionStorage' @ [426:79] ==> public constructor DBTransactionStorage() defined in net.corda.node.services.persistence.DBTransactionStorage[ClassConstructorDescriptorImpl]

'getProperty' @ [429:34] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'if (scanPackage != null) {
            // Rather than looking in the plugins directory, figure out the classpath for the given package and scan that
            // instead. This is used in tests where we avoid having to package stuff up in jars and then having to move
            // them to the plugins directory for each node.
            check(configuration.devMode) { "Package scanning can only occur in dev mode" }
            val resource = scanPackage.replace('.', '/')
            javaClass.classLoader.getResources(resource)
                    .asSequence()
                    .map {
                        val uri = if (it.protocol == "jar") {
                            (it.openConnection() as JarURLConnection).jarFileURL.toURI()
                        } else {
                            URI(it.toExternalForm().removeSuffix(resource))
                        }
                        Paths.get(uri)
                    }
                    .toList()
        } else {
            val pluginsDir = configuration.baseDirectory / "plugins"
            if (!pluginsDir.exists()) return null
            pluginsDir.list {
                it.filter { it.isRegularFile() && it.toString().endsWith(".jar") }.collect(toList())
            }
        }' @ [430:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<(Path..Path?)>..List<(Path..Path?)>?), elseBranch: (List<(Path..Path?)>..List<(Path..Path?)>?)): (List<(Path..Path?)>..List<(Path..Path?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<(java.nio.file.Path..java.nio.file.Path?)>..kotlin.collections.List<(java.nio.file.Path..java.nio.file.Path?)>?)

'scanPackage' @ [430:25] ==> val scanPackage: (String..String?) defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'check' @ [434:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'configuration' @ [434:19] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'devMode' @ [434:33] ==> public abstract val devMode: Boolean defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'scanPackage' @ [435:28] ==> val scanPackage: (String..String?) defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'replace' @ [435:40] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'javaClass' @ [436:13] ==> public val <T : Any> AbstractNode.javaClass: Class<AbstractNode> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> AbstractNode

'classLoader' @ [436:23] ==> public final val <T : (Any..Any?)> Class<AbstractNode>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractNode

'getResources' @ [436:35] ==> public open fun getResources(p0: (String..String?)): (Enumeration<(URL..URL?)>..Enumeration<(URL..URL?)>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'resource' @ [436:48] ==> val resource: String defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'asSequence' @ [437:22] ==> @InlineOnly public inline fun <T> Enumeration<(URL..URL?)>.asSequence(): Sequence<(URL..URL?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)

'map' @ [438:22] ==> public fun <T, R> Sequence<(URL..URL?)>.map(transform: ((URL..URL?)) -> (Path..Path?)): Sequence<(Path..Path?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)
    <R> -> (java.nio.file.Path..java.nio.file.Path?)

'if (it.protocol == "jar") {
                            (it.openConnection() as JarURLConnection).jarFileURL.toURI()
                        } else {
                            URI(it.toExternalForm().removeSuffix(resource))
                        }' @ [439:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (URI..URI?), elseBranch: (URI..URI?)): (URI..URI?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.net.URI..java.net.URI?)

'it' @ [439:39] ==> value-parameter it: (URL..URL?) defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>[ValueParameterDescriptorImpl]

'protocol' @ [439:42] ==> public final val URL.protocol: (String..String?)[MyPropertyDescriptor]

'it' @ [440:30] ==> value-parameter it: (URL..URL?) defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>[ValueParameterDescriptorImpl]

'openConnection' @ [440:33] ==> public open fun openConnection(): (URLConnection..URLConnection?) defined in java.net.URL[JavaMethodDescriptor]

'jarFileURL' @ [440:71] ==> public final val JarURLConnection.jarFileURL: (URL..URL?)[MyPropertyDescriptor]

'toURI' @ [440:82] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'URI' @ [442:29] ==> public constructor URI(p0: (String..String?)) defined in java.net.URI[JavaClassConstructorDescriptor]

'it' @ [442:33] ==> value-parameter it: (URL..URL?) defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>[ValueParameterDescriptorImpl]

'toExternalForm' @ [442:36] ==> public open fun toExternalForm(): (String..String?) defined in java.net.URL[JavaMethodDescriptor]

'removeSuffix' @ [442:53] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resource' @ [442:66] ==> val resource: String defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'get' @ [444:31] ==> public open fun get(p0: (URI..URI?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'uri' @ [444:35] ==> val uri: (URI..URI?) defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>[LocalVariableDescriptor]

'toList' @ [446:22] ==> public fun <T> Sequence<(Path..Path?)>.toList(): List<(Path..Path?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.nio.file.Path..java.nio.file.Path?)

'configuration' @ [448:30] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'baseDirectory' @ [448:44] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'!' @ [449:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pluginsDir' @ [449:18] ==> val pluginsDir: Path defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'exists' @ [449:29] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'pluginsDir' @ [450:13] ==> val pluginsDir: Path defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'list' @ [450:24] ==> public inline fun <R> Path.list(block: (Stream<Path>) -> (MutableList<(Path..Path?)>..List<(Path..Path?)>?)): (MutableList<(Path..Path?)>..List<(Path..Path?)>?) defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> (kotlin.collections.MutableList<(java.nio.file.Path..java.nio.file.Path?)>..kotlin.collections.List<(java.nio.file.Path..java.nio.file.Path?)>?)

'it' @ [451:17] ==> value-parameter it: Stream<Path> defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [451:20] ==> public final fun filter(p0: (((Path..Path?)) -> Boolean..(((Path..Path?)) -> Boolean)?)): (Stream<(Path..Path?)>..Stream<(Path..Path?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]

'it' @ [451:29] ==> value-parameter it: (Path..Path?) defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isRegularFile' @ [451:32] ==> public fun Path.isRegularFile(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'it' @ [451:51] ==> value-parameter it: (Path..Path?) defined in net.corda.node.internal.AbstractNode.scanCordapps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [451:54] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [451:65] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'collect' @ [451:84] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (Path..Path?), out (Any..Any?), (MutableList<(Path..Path?)>..List<(Path..Path?)>?)>..Collector<in (Path..Path?), out (Any..Any?), (MutableList<(Path..Path?)>..List<(Path..Path?)>?)>?)): (MutableList<(Path..Path?)>..List<(Path..Path?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.collections.MutableList<(java.nio.file.Path..java.nio.file.Path?)>..kotlin.collections.List<(java.nio.file.Path..java.nio.file.Path?)>?)
    <A : (Any..Any?)> -> Captured(*)

'toList' @ [451:92] ==> public open fun <T : (Any..Any?)> toList(): (Collector<(Path..Path?), *, (MutableList<(Path..Path?)>..List<(Path..Path?)>?)>..Collector<(Path..Path?), *, (MutableList<(Path..Path?)>..List<(Path..Path?)>?)>?) defined in java.util.stream.Collectors[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.nio.file.Path..java.nio.file.Path?)

'log' @ [455:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [455:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'paths' @ [455:41] ==> val paths: (List<(Path..Path?)>..List<(Path..Path?)>?) defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'if (paths.isNotEmpty()) FastClasspathScanner().overrideClasspath(paths).scan() else null' @ [458:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScanResult?, elseBranch: ScanResult?): ScanResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScanResult?

'paths' @ [458:20] ==> val paths: (List<(Path..Path?)>..List<(Path..Path?)>?) defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'isNotEmpty' @ [458:26] ==> @InlineOnly public inline fun <T> Collection<(Path..Path?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.nio.file.Path..java.nio.file.Path?)

'FastClasspathScanner' @ [458:40] ==> public constructor FastClasspathScanner(vararg p0: (String..String?)) defined in io.github.lukehutch.fastclasspathscanner.FastClasspathScanner[JavaClassConstructorDescriptor]

'overrideClasspath' @ [458:63] ==> public open fun overrideClasspath(p0: (MutableIterable<*>..Iterable<*>?)): (FastClasspathScanner..FastClasspathScanner?) defined in io.github.lukehutch.fastclasspathscanner.FastClasspathScanner[JavaMethodDescriptor]

'paths' @ [458:81] ==> val paths: (List<(Path..Path?)>..List<(Path..Path?)>?) defined in net.corda.node.internal.AbstractNode.scanCordapps[LocalVariableDescriptor]

'scan' @ [458:88] ==> public open fun scan(): (ScanResult..ScanResult?) defined in io.github.lukehutch.fastclasspathscanner.FastClasspathScanner[JavaMethodDescriptor]

'forName' @ [465:23] ==> @CallerSensitive public open fun forName(p0: (String..String?), p1: Boolean, p2: (ClassLoader..ClassLoader?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'className' @ [465:31] ==> value-parameter className: String defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation.loadClass[ValueParameterDescriptorImpl]

'javaClass' @ [465:49] ==> public val <T : Any> ScanResult.javaClass: Class<ScanResult> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ScanResult

'classLoader' @ [465:59] ==> public final val <T : (Any..Any?)> Class<ScanResult>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScanResult

'asSubclass' @ [465:72] ==> public open fun <U : (Any..Any?)> asSubclass(p0: (Class<(T..T?)>..Class<(T..T?)>?)): (Class<out (T..T?)>..Class<out (T..T?)>?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> (T..T?)

'type' @ [465:83] ==> value-parameter type: KClass<T> defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation[ValueParameterDescriptorImpl]

'java' @ [465:88] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'log' @ [467:17] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'warn' @ [467:21] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'className' @ [467:31] ==> value-parameter className: String defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation.loadClass[ValueParameterDescriptorImpl]

'annotation' @ [467:61] ==> value-parameter annotation: KClass<out Annotation> defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation[ValueParameterDescriptorImpl]

'qualifiedName' @ [467:72] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'type' @ [467:114] ==> value-parameter type: KClass<T> defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation[ValueParameterDescriptorImpl]

'java' @ [467:119] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'name' @ [467:124] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'log' @ [470:17] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'warn' @ [470:21] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'className' @ [470:49] ==> value-parameter className: String defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation.loadClass[ValueParameterDescriptorImpl]

'e' @ [470:61] ==> val e: Exception /* = Exception */ defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation.loadClass[LocalVariableDescriptor]

'getNamesOfClassesWithAnnotation' @ [475:16] ==> public open fun getNamesOfClassesWithAnnotation(p0: (Class<*>..Class<*>?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in io.github.lukehutch.fastclasspathscanner.scanner.ScanResult[JavaMethodDescriptor]

'annotation' @ [475:48] ==> value-parameter annotation: KClass<out Annotation> defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation[ValueParameterDescriptorImpl]

'java' @ [475:59] ==> public val <T> KClass<out Annotation>.java: Class<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Annotation)

'mapNotNull' @ [476:18] ==> public inline fun <T, R : Any> Iterable<(String..String?)>.mapNotNull(transform: ((String..String?)) -> Class<out T>?): List<Class<out T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R : Any> -> Class<out T>

'loadClass' @ [476:31] ==> local final fun loadClass(className: String): Class<out T>? defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation[SimpleFunctionDescriptorImpl]

'it' @ [476:41] ==> value-parameter it: (String..String?) defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'filterNot' @ [477:18] ==> public inline fun <T> Iterable<Class<out T>>.filterNot(predicate: (Class<out T>) -> Boolean): List<Class<out T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out T>

'isAbstract' @ [477:30] ==> public open fun isAbstract(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [477:41] ==> value-parameter it: Class<out T> defined in net.corda.node.internal.AbstractNode.getClassesWithAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [477:44] ==> public final val <T : (Any..Any?)> Class<out T>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out T)

'VaultSoftLockManager' @ [481:9] ==> public constructor VaultSoftLockManager(vault: VaultService, smm: StateMachineManager) defined in net.corda.node.services.vault.VaultSoftLockManager[ClassConstructorDescriptorImpl]

'services' @ [481:30] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'vaultService' @ [481:39] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'smm' @ [481:53] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'ScheduledActivityObserver' @ [482:9] ==> public constructor ScheduledActivityObserver(services: ServiceHubInternal) defined in net.corda.node.services.events.ScheduledActivityObserver[ClassConstructorDescriptorImpl]

'services' @ [482:35] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'HibernateObserver' @ [483:9] ==> public constructor HibernateObserver(vaultUpdates: Observable<Vault.Update<ContractState>>, config: HibernateConfiguration) defined in net.corda.node.services.schema.HibernateObserver[ClassConstructorDescriptorImpl]

'services' @ [483:27] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'vaultService' @ [483:36] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'rawUpdates' @ [483:49] ==> public abstract val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'services' @ [483:61] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'database' @ [483:70] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'hibernateConfig' @ [483:79] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'makeServiceEntries' @ [487:40] ==> protected open fun makeServiceEntries(): List<ServiceEntry> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'advertisedServiceEntries' @ [488:30] ==> val advertisedServiceEntries: List<ServiceEntry> defined in net.corda.node.internal.AbstractNode.makeInfo[LocalVariableDescriptor]

'map' @ [488:55] ==> public inline fun <T, R> Iterable<ServiceEntry>.map(transform: (ServiceEntry) -> PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry
    <R> -> PartyAndCertificate

'it' @ [488:61] ==> value-parameter it: ServiceEntry defined in net.corda.node.internal.AbstractNode.makeInfo.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [488:64] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'legalIdentity' @ [488:77] ==> value-parameter legalIdentity: PartyAndCertificate defined in net.corda.node.internal.AbstractNode.makeInfo[ValueParameterDescriptorImpl]

'toNonEmptySet' @ [488:92] ==> public fun <T> Collection<PartyAndCertificate>.toNonEmptySet(): NonEmptySet<PartyAndCertificate> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'myAddresses' @ [489:25] ==> protected abstract fun myAddresses(): List<NetworkHostAndPort> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'NodeInfo' @ [490:16] ==> public constructor NodeInfo(addresses: List<NetworkHostAndPort>, legalIdentityAndCert: PartyAndCertificate, legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate>, platformVersion: Int, advertisedServices: List<ServiceEntry> = ..., worldMapLocation: WorldMapLocation? = ...) defined in net.corda.core.node.NodeInfo[DeserializedClassConstructorDescriptor]

'addresses' @ [490:25] ==> val addresses: List<NetworkHostAndPort> defined in net.corda.node.internal.AbstractNode.makeInfo[LocalVariableDescriptor]

'legalIdentity' @ [490:36] ==> value-parameter legalIdentity: PartyAndCertificate defined in net.corda.node.internal.AbstractNode.makeInfo[ValueParameterDescriptorImpl]

'allIdentities' @ [490:51] ==> val allIdentities: NonEmptySet<PartyAndCertificate> defined in net.corda.node.internal.AbstractNode.makeInfo[LocalVariableDescriptor]

'platformVersion' @ [490:66] ==> protected abstract val platformVersion: Int defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'advertisedServiceEntries' @ [490:83] ==> val advertisedServiceEntries: List<ServiceEntry> defined in net.corda.node.internal.AbstractNode.makeInfo[LocalVariableDescriptor]

'findMyLocation' @ [490:109] ==> public open fun findMyLocation(): WorldMapLocation? defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'advertisedServices' @ [498:16] ==> public final val advertisedServices: Set<ServiceInfo> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'map' @ [498:35] ==> public inline fun <T, R> Iterable<ServiceInfo>.map(transform: (ServiceInfo) -> ServiceEntry): List<ServiceEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo
    <R> -> ServiceEntry

'it' @ [499:29] ==> value-parameter it: ServiceInfo defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [499:32] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'id' @ [499:37] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'it' @ [500:31] ==> value-parameter it: ServiceInfo defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [500:34] ==> public final val name: X500Name? defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'X500Name' @ [500:42] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'configuration' @ [500:54] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'myLegalName' @ [500:68] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'serviceId' @ [500:85] ==> val serviceId: String defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[LocalVariableDescriptor]

'obtainIdentity' @ [501:28] ==> private final fun obtainIdentity(id: String, name: X500Name): PartyAndCertificate defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'serviceId' @ [501:43] ==> val serviceId: String defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[LocalVariableDescriptor]

'serviceName' @ [501:54] ==> val serviceName: X500Name defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[LocalVariableDescriptor]

'ServiceEntry' @ [502:13] ==> public constructor ServiceEntry(info: ServiceInfo, identity: PartyAndCertificate) defined in net.corda.core.node.ServiceEntry[DeserializedClassConstructorDescriptor]

'it' @ [502:26] ==> value-parameter it: ServiceInfo defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [502:30] ==> val identity: PartyAndCertificate defined in net.corda.node.internal.AbstractNode.makeServiceEntries.<anonymous>[LocalVariableDescriptor]

'VisibleForTesting' @ [506:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'loadKeyStore' @ [512:31] ==> @Throws public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'configuration' @ [512:44] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'sslKeystore' @ [512:58] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'configuration' @ [512:71] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keyStorePassword' @ [512:85] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'loadKeyStore' @ [513:38] ==> @Throws public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'configuration' @ [513:51] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'nodeKeystore' @ [513:65] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'configuration' @ [513:79] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keyStorePassword' @ [513:93] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'sslKeystore' @ [514:13] ==> val sslKeystore: KeyStore defined in net.corda.node.internal.AbstractNode.validateKeystore[LocalVariableDescriptor]

'containsAlias' @ [514:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'CORDA_CLIENT_TLS' @ [514:53] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'identitiesKeystore' @ [514:74] ==> val identitiesKeystore: KeyStore defined in net.corda.node.internal.AbstractNode.validateKeystore[LocalVariableDescriptor]

'containsAlias' @ [514:93] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'CORDA_CLIENT_CA' @ [514:121] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'log' @ [516:13] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'warn' @ [516:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'require' @ [521:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containCorrectKeys' @ [521:17] ==> val containCorrectKeys: Boolean defined in net.corda.node.internal.AbstractNode.validateKeystore[LocalVariableDescriptor]

'+' @ [522:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'loadKeyStore' @ [527:34] ==> @Throws public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'configuration' @ [527:47] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'sslKeystore' @ [527:61] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'configuration' @ [527:74] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keyStorePassword' @ [527:88] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'identitiesKeystore' @ [528:27] ==> val identitiesKeystore: KeyStore defined in net.corda.node.internal.AbstractNode.validateKeystore[LocalVariableDescriptor]

'getX509Certificate' @ [528:46] ==> public fun KeyStore.getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'CORDA_CLIENT_TLS' @ [528:79] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'subject' @ [528:97] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'require' @ [530:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tlsIdentity' @ [530:17] ==> val tlsIdentity: (X500Name..X500Name?) defined in net.corda.node.internal.AbstractNode.validateKeystore[LocalVariableDescriptor]

'configuration' @ [530:32] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'myLegalName' @ [530:46] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'configuration' @ [531:26] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'myLegalName' @ [531:40] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'tlsIdentity' @ [531:64] ==> val tlsIdentity: (X500Name..X500Name?) defined in net.corda.node.internal.AbstractNode.validateKeystore[LocalVariableDescriptor]

'Exception' @ [536:57] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'msg' @ [536:67] ==> value-parameter msg: String defined in net.corda.node.internal.AbstractNode.DatabaseConfigurationException.<init>[ValueParameterDescriptorImpl]

'configuration' @ [539:21] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'dataSourceProperties' @ [539:35] ==> public abstract val dataSourceProperties: Properties defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'if (props.isNotEmpty()) {
            this.database = configureDatabase(props, configuration.database, { _services.schemaService }, createIdentityService = { _services.identityService })
            // Now log the vendor string as this will also cause a connection to be tested eagerly.
            database.transaction {
                log.info("Connected to ${database.dataSource.connection.metaData.databaseProductName} database.")
            }
            this.database::close.let {
                dbCloser = it
                runOnStop += it
            }
            database.transaction {
                insideTransaction()
            }
        } else {
            throw DatabaseConfigurationException("There must be a database configured.")
        }' @ [540:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'props' @ [540:13] ==> val props: Properties defined in net.corda.node.internal.AbstractNode.initialiseDatabasePersistence[LocalVariableDescriptor]

'isNotEmpty' @ [540:19] ==> @InlineOnly public inline fun <K, V> Map<out (Any..Any?), (Any..Any?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.Any..kotlin.Any?)
    <V> -> (kotlin.Any..kotlin.Any?)

'this' @ [541:13] ==> <this> defined in net.corda.node.internal.AbstractNode[LazyClassReceiverParameterDescriptor]

'database' @ [541:18] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'configureDatabase' @ [541:29] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities in file CordaPersistence.kt[SimpleFunctionDescriptorImpl]

'props' @ [541:47] ==> val props: Properties defined in net.corda.node.internal.AbstractNode.initialiseDatabasePersistence[LocalVariableDescriptor]

'configuration' @ [541:54] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'database' @ [541:68] ==> public abstract val database: Properties? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'_services' @ [541:80] ==> private final lateinit var _services: AbstractNode.ServiceHubInternalImpl defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'schemaService' @ [541:90] ==> public open val schemaService: NodeSchemaService defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'_services' @ [541:133] ==> private final lateinit var _services: AbstractNode.ServiceHubInternalImpl defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'identityService' @ [541:143] ==> public open val identityService: IdentityService defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'database' @ [543:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'transaction' @ [543:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'log' @ [544:17] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [544:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'database' @ [544:42] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'dataSource' @ [544:51] ==> public final var dataSource: HikariDataSource defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'connection' @ [544:62] ==> public final val HikariDataSource.connection: (Connection..Connection?)[MyPropertyDescriptor]

'metaData' @ [544:73] ==> public final val Connection.metaData: (DatabaseMetaData..DatabaseMetaData?)[MyPropertyDescriptor]

'databaseProductName' @ [544:82] ==> public final val DatabaseMetaData.databaseProductName: (String..String?)[MyPropertyDescriptor]

'this' @ [546:13] ==> <this> defined in net.corda.node.internal.AbstractNode[LazyClassReceiverParameterDescriptor]

'database' @ [546:18] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'close' @ [546:28] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]

'let' @ [546:34] ==> @InlineOnly public inline fun <T, R> KFunction0<Unit>.let(block: (KFunction0<Unit>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction0<Unit>
    <R> -> Unit

'dbCloser' @ [547:17] ==> protected final var dbCloser: (() -> Any?)? defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'it' @ [547:28] ==> value-parameter it: KFunction0<Unit> defined in net.corda.node.internal.AbstractNode.initialiseDatabasePersistence.<anonymous>[ValueParameterDescriptorImpl]

'runOnStop' @ [548:17] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'it' @ [548:30] ==> value-parameter it: KFunction0<Unit> defined in net.corda.node.internal.AbstractNode.initialiseDatabasePersistence.<anonymous>[ValueParameterDescriptorImpl]

'database' @ [550:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'transaction' @ [550:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'invoke' @ [551:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'DatabaseConfigurationException' @ [554:19] ==> public constructor DatabaseConfigurationException(msg: String) defined in net.corda.node.internal.AbstractNode.DatabaseConfigurationException[ClassConstructorDescriptorImpl]

'info' @ [559:28] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'advertisedServices' @ [559:33] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'map' @ [559:52] ==> public inline fun <T, R> Iterable<ServiceEntry>.map(transform: (ServiceEntry) -> ServiceType): List<ServiceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry
    <R> -> ServiceType

'it' @ [559:58] ==> value-parameter it: ServiceEntry defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [559:61] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [559:66] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'in' @ [560:13] ==> public abstract fun contains(element: ServiceType): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'type' @ [560:31] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'serviceTypes' @ [560:39] ==> val serviceTypes: List<ServiceType> defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'makeNetworkMapService' @ [560:53] ==> protected open fun makeNetworkMapService(): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'serviceTypes' @ [561:33] ==> val serviceTypes: List<ServiceType> defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'singleOrNull' @ [561:46] ==> public inline fun <T> Iterable<ServiceType>.singleOrNull(predicate: (ServiceType) -> Boolean): ServiceType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceType

'it' @ [561:61] ==> value-parameter it: ServiceType defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices.<anonymous>[ValueParameterDescriptorImpl]

'isNotary' @ [561:64] ==> public final fun isNotary(): Boolean defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'notaryServiceType' @ [562:13] ==> val notaryServiceType: ServiceType? defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'makeCoreNotaryService' @ [563:27] ==> protected open fun makeCoreNotaryService(type: ServiceType): NotaryService? defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'notaryServiceType' @ [563:49] ==> val notaryServiceType: ServiceType? defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'if (service != null) {
                service.apply {
                    tokenizableServices.add(this)
                    runOnStop += this::stop
                    start()
                }
                installCoreFlow(NotaryFlow.Client::class, service::createServiceFlow)
            } else {
                log.info("Notary type ${notaryServiceType.id} does not match any built-in notary types. " +
                        "It is expected to be loaded via a CorDapp")
            }' @ [564:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'service' @ [564:17] ==> val service: NotaryService? defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'service' @ [565:17] ==> val service: NotaryService? defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'apply' @ [565:25] ==> @InlineOnly public inline fun <T> NotaryService.apply(block: NotaryService.() -> Unit): NotaryService defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryService

'tokenizableServices' @ [566:21] ==> value-parameter tokenizableServices: MutableList<Any> defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[ValueParameterDescriptorImpl]

'add' @ [566:41] ==> public abstract fun add(element: Any): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [566:45] ==> <this> defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices.<anonymous>[ReceiverParameterDescriptorImpl]

'runOnStop' @ [567:21] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'this' @ [567:34] ==> <this> defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices.<anonymous>[ReceiverParameterDescriptorImpl]

'stop' @ [567:40] ==> public abstract fun stop(): Unit defined in net.corda.core.node.services.NotaryService[DeserializedSimpleFunctionDescriptor]

'start' @ [568:21] ==> public abstract fun start(): Unit defined in net.corda.core.node.services.NotaryService[DeserializedSimpleFunctionDescriptor]

'installCoreFlow' @ [570:17] ==> @VisibleForTesting public final fun installCoreFlow(clientFlowClass: KClass<out FlowLogic<*>>, flowFactory: (Party) -> FlowLogic<*>): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'NotaryFlow' @ [570:33] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [570:44] ==> public companion object defined in net.corda.core.flows.NotaryFlow.Client[FakeCallableDescriptorForObject]

'service' @ [570:59] ==> val service: NotaryService? defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'createServiceFlow' @ [570:68] ==> public abstract fun createServiceFlow(otherParty: Party): FlowLogic<Void?> defined in net.corda.core.node.services.NotaryService[DeserializedSimpleFunctionDescriptor]

'log' @ [572:17] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [572:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [572:26] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'notaryServiceType' @ [572:41] ==> val notaryServiceType: ServiceType? defined in net.corda.node.internal.AbstractNode.makeAdvertisedServices[LocalVariableDescriptor]

'id' @ [572:59] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'services' @ [579:9] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'networkMapCache' @ [579:18] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'addNode' @ [579:34] ==> public abstract fun addNode(node: NodeInfo): Unit defined in net.corda.node.services.api.NetworkMapCacheInternal[SimpleFunctionDescriptorImpl]

'info' @ [579:42] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'if (networkMapAddress == null && inNodeNetworkMapService == null) {
            services.networkMapCache.runWithoutMapService()
            noNetworkMapConfigured()  // TODO This method isn't needed as runWithoutMapService sets the Future in the cache
        } else {
            registerWithNetworkMap()
        }' @ [581:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CordaFuture<Unit>, elseBranch: CordaFuture<Unit>): CordaFuture<Unit>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CordaFuture<Unit>

'networkMapAddress' @ [581:20] ==> protected abstract val networkMapAddress: SingleMessageRecipient? defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'inNodeNetworkMapService' @ [581:49] ==> public final var inNodeNetworkMapService: NetworkMapService? defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'services' @ [582:13] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'networkMapCache' @ [582:22] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'runWithoutMapService' @ [582:38] ==> @VisibleForTesting public abstract fun runWithoutMapService(): Unit defined in net.corda.node.services.api.NetworkMapCacheInternal[SimpleFunctionDescriptorImpl]

'noNetworkMapConfigured' @ [583:13] ==> protected open fun noNetworkMapConfigured(): CordaFuture<Unit> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'registerWithNetworkMap' @ [585:13] ==> protected open fun registerWithNetworkMap(): CordaFuture<Unit> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'require' @ [594:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'networkMapAddress' @ [594:17] ==> protected abstract val networkMapAddress: SingleMessageRecipient? defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'in' @ [594:46] ==> public abstract fun contains(element: ServiceType): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'type' @ [594:64] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'advertisedServices' @ [594:72] ==> public final val advertisedServices: Set<ServiceInfo> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'map' @ [594:91] ==> public inline fun <T, R> Iterable<ServiceInfo>.map(transform: (ServiceInfo) -> ServiceType): List<ServiceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo
    <R> -> ServiceType

'it' @ [594:97] ==> value-parameter it: ServiceInfo defined in net.corda.node.internal.AbstractNode.registerWithNetworkMap.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [594:100] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'networkMapAddress' @ [597:47] ==> protected abstract val networkMapAddress: SingleMessageRecipient? defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'network' @ [598:17] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'getAddressOfParty' @ [598:25] ==> public abstract fun getAddressOfParty(partyInfo: PartyInfo): MessageRecipients defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'Node' @ [598:53] ==> public constructor Node(node: NodeInfo) defined in net.corda.core.node.services.PartyInfo.Node[DeserializedClassConstructorDescriptor]

'info' @ [598:58] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'sendNetworkMapRegistration' @ [600:16] ==> private final fun sendNetworkMapRegistration(networkMapAddress: SingleMessageRecipient): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'address' @ [600:43] ==> val address: SingleMessageRecipient defined in net.corda.node.internal.AbstractNode.registerWithNetworkMap[LocalVariableDescriptor]

'flatMap' @ [600:52] ==> public fun <V, W> CordaFuture<out NetworkMapService.RegistrationResponse>.flatMap(transform: (NetworkMapService.RegistrationResponse) -> CordaFuture<out Unit>): CordaFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> RegistrationResponse
    <W> -> Unit

'component1' @ [600:63] ==> public final operator fun component1(): String? defined in net.corda.node.services.network.NetworkMapService.RegistrationResponse[SimpleFunctionDescriptorImpl]

'check' @ [601:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [601:19] ==> val error: String? defined in net.corda.node.internal.AbstractNode.registerWithNetworkMap.<anonymous>[LocalVariableDescriptor]

'error' @ [601:87] ==> val error: String? defined in net.corda.node.internal.AbstractNode.registerWithNetworkMap.<anonymous>[LocalVariableDescriptor]

'services' @ [603:13] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'networkMapCache' @ [603:22] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'addMapService' @ [603:38] ==> public abstract fun addMapService(network: MessagingService, networkMapAddress: SingleMessageRecipient, subscribe: Boolean, ifChangedSinceVer: Int? = ...): CordaFuture<Unit> defined in net.corda.node.services.api.NetworkMapCacheInternal[SimpleFunctionDescriptorImpl]

'network' @ [603:52] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'address' @ [603:61] ==> val address: SingleMessageRecipient defined in net.corda.node.internal.AbstractNode.registerWithNetworkMap[LocalVariableDescriptor]

'platformClock' @ [609:23] ==> public final val platformClock: Clock defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'instant' @ [609:37] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'instant' @ [610:23] ==> val instant: (Instant..Instant?) defined in net.corda.node.internal.AbstractNode.sendNetworkMapRegistration[LocalVariableDescriptor]

'DEFAULT_EXPIRATION_PERIOD' @ [610:51] ==> public final val DEFAULT_EXPIRATION_PERIOD: Period defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'NodeRegistration' @ [611:19] ==> public constructor NodeRegistration(node: NodeInfo, serial: Long, type: AddOrRemove, expires: Instant) defined in net.corda.node.services.network.NodeRegistration[ClassConstructorDescriptorImpl]

'info' @ [611:36] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'instant' @ [611:42] ==> val instant: (Instant..Instant?) defined in net.corda.node.internal.AbstractNode.sendNetworkMapRegistration[LocalVariableDescriptor]

'toEpochMilli' @ [611:50] ==> public open fun toEpochMilli(): Long defined in java.time.Instant[JavaMethodDescriptor]

'ADD' @ [611:66] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'expires' @ [611:71] ==> val expires: (Instant..Instant?) defined in net.corda.node.internal.AbstractNode.sendNetworkMapRegistration[LocalVariableDescriptor]

'RegistrationRequest' @ [612:23] ==> public constructor RegistrationRequest(wireReg: WireNodeRegistration, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.RegistrationRequest[ClassConstructorDescriptorImpl]

'reg' @ [612:43] ==> val reg: NodeRegistration defined in net.corda.node.internal.AbstractNode.sendNetworkMapRegistration[LocalVariableDescriptor]

'toWire' @ [612:47] ==> public final fun toWire(keyManager: KeyManagementService, publicKey: PublicKey): WireNodeRegistration defined in net.corda.node.services.network.NodeRegistration[SimpleFunctionDescriptorImpl]

'services' @ [612:54] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keyManagementService' @ [612:63] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'info' @ [612:85] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'legalIdentityAndCert' @ [612:90] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [612:111] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'network' @ [612:123] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'myAddress' @ [612:131] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[PropertyDescriptorImpl]

'network' @ [613:16] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'sendRequest' @ [613:24] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.messaging[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Any> -> RegistrationResponse

'REGISTER_TOPIC' @ [613:54] ==> public final val REGISTER_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'request' @ [613:70] ==> val request: NetworkMapService.RegistrationRequest defined in net.corda.node.internal.AbstractNode.sendNetworkMapRegistration[LocalVariableDescriptor]

'networkMapAddress' @ [613:79] ==> value-parameter networkMapAddress: SingleMessageRecipient defined in net.corda.node.internal.AbstractNode.sendNetworkMapRegistration[ValueParameterDescriptorImpl]

'IllegalStateException' @ [622:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [622:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'PersistentKeyManagementService' @ [627:16] ==> public constructor PersistentKeyManagementService(identityService: IdentityService, initialKeys: Set<KeyPair>) defined in net.corda.node.services.keys.PersistentKeyManagementService[ClassConstructorDescriptorImpl]

'identityService' @ [627:47] ==> value-parameter identityService: IdentityService defined in net.corda.node.internal.AbstractNode.makeKeyManagementService[ValueParameterDescriptorImpl]

'partyKeys' @ [627:64] ==> protected final val partyKeys: MutableSet<KeyPair> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'inNodeNetworkMapService' @ [631:9] ==> public final var inNodeNetworkMapService: NetworkMapService? defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'PersistentNetworkMapService' @ [631:35] ==> public constructor PersistentNetworkMapService(services: ServiceHubInternal, minimumPlatformVersion: Int) defined in net.corda.node.services.network.PersistentNetworkMapService[ClassConstructorDescriptorImpl]

'services' @ [631:63] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'configuration' @ [631:73] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'minimumPlatformVersion' @ [631:87] ==> public abstract val minimumPlatformVersion: Int defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'when (type) {
            SimpleNotaryService.type -> SimpleNotaryService(services)
            ValidatingNotaryService.type -> ValidatingNotaryService(services)
            RaftNonValidatingNotaryService.type -> RaftNonValidatingNotaryService(services)
            RaftValidatingNotaryService.type -> RaftValidatingNotaryService(services)
            BFTNonValidatingNotaryService.type -> BFTNonValidatingNotaryService(services)
            else -> null
        }' @ [635:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NotaryService?, entry1: NotaryService?, entry2: NotaryService?, entry3: NotaryService?, entry4: NotaryService?, entry5: NotaryService?): NotaryService?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NotaryService?

'type' @ [635:22] ==> value-parameter type: ServiceType defined in net.corda.node.internal.AbstractNode.makeCoreNotaryService[ValueParameterDescriptorImpl]

'SimpleNotaryService' @ [636:13] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [636:33] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[PropertyDescriptorImpl]

'SimpleNotaryService' @ [636:41] ==> public constructor SimpleNotaryService(services: ServiceHubInternal) defined in net.corda.node.services.transactions.SimpleNotaryService[ClassConstructorDescriptorImpl]

'services' @ [636:61] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'ValidatingNotaryService' @ [637:13] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [637:37] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[PropertyDescriptorImpl]

'ValidatingNotaryService' @ [637:45] ==> public constructor ValidatingNotaryService(services: ServiceHubInternal) defined in net.corda.node.services.transactions.ValidatingNotaryService[ClassConstructorDescriptorImpl]

'services' @ [637:69] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'RaftNonValidatingNotaryService' @ [638:13] ==> public companion object defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [638:44] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'RaftNonValidatingNotaryService' @ [638:52] ==> public constructor RaftNonValidatingNotaryService(services: ServiceHubInternal) defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[ClassConstructorDescriptorImpl]

'services' @ [638:83] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'RaftValidatingNotaryService' @ [639:13] ==> public companion object defined in net.corda.node.services.transactions.RaftValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [639:41] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.RaftValidatingNotaryService.Companion[PropertyDescriptorImpl]

'RaftValidatingNotaryService' @ [639:49] ==> public constructor RaftValidatingNotaryService(services: ServiceHubInternal) defined in net.corda.node.services.transactions.RaftValidatingNotaryService[ClassConstructorDescriptorImpl]

'services' @ [639:77] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'BFTNonValidatingNotaryService' @ [640:13] ==> public companion object defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [640:43] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'BFTNonValidatingNotaryService' @ [640:51] ==> public constructor BFTNonValidatingNotaryService(services: ServiceHubInternal, cluster: BFTSMaRt.Cluster = ...) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[ClassConstructorDescriptorImpl]

'services' @ [640:81] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'listOf' @ [648:54] ==> public fun <T> listOf(vararg elements: X509Certificate?): List<X509Certificate?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate?

'legalIdentity' @ [648:61] ==> value-parameter legalIdentity: PartyAndCertificate defined in net.corda.node.internal.AbstractNode.makeIdentityService[ValueParameterDescriptorImpl]

'certificate' @ [648:75] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'cert' @ [648:87] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'clientCa' @ [648:93] ==> value-parameter clientCa: CertificateAndKeyPair? defined in net.corda.node.internal.AbstractNode.makeIdentityService[ValueParameterDescriptorImpl]

'certificate' @ [648:103] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'cert' @ [648:116] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'filterNotNull' @ [649:18] ==> public fun <T : Any> Iterable<X509Certificate?>.filterNotNull(): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> X509Certificate

'toTypedArray' @ [650:18] ==> public inline fun <reified T> Collection<X509Certificate>.toTypedArray(): Array<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> X509Certificate

'InMemoryIdentityService' @ [651:23] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[ClassConstructorDescriptorImpl]

'setOf' @ [651:47] ==> public fun <T> setOf(element: PartyAndCertificate): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'info' @ [651:53] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'legalIdentityAndCert' @ [651:58] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'trustRoot' @ [651:93] ==> value-parameter trustRoot: X509Certificate defined in net.corda.node.internal.AbstractNode.makeIdentityService[ValueParameterDescriptorImpl]

'caCertificates' @ [651:122] ==> val caCertificates: Array<X509Certificate> defined in net.corda.node.internal.AbstractNode.makeIdentityService[LocalVariableDescriptor]

'services' @ [652:9] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'networkMapCache' @ [652:18] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'partyNodes' @ [652:34] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedPropertyDescriptor]

'forEach' @ [652:45] ==> @HidesMembers public inline fun <T> Iterable<NodeInfo>.forEach(action: (NodeInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'service' @ [652:55] ==> val service: InMemoryIdentityService defined in net.corda.node.internal.AbstractNode.makeIdentityService[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [652:63] ==> @Throws public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[SimpleFunctionDescriptorImpl]

'it' @ [652:89] ==> value-parameter it: NodeInfo defined in net.corda.node.internal.AbstractNode.makeIdentityService.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentityAndCert' @ [652:92] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'services' @ [653:9] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'networkMapCache' @ [653:18] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'changed' @ [653:34] ==> public abstract val changed: Observable<NetworkMapCache.MapChange> defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedPropertyDescriptor]

'subscribe' @ [653:42] ==> public final fun subscribe(p0: (((NetworkMapCache.MapChange..NetworkMapCache.MapChange?)) -> Unit..(((NetworkMapCache.MapChange..NetworkMapCache.MapChange?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'mapChange' @ [655:17] ==> value-parameter mapChange: (NetworkMapCache.MapChange..NetworkMapCache.MapChange?) defined in net.corda.node.internal.AbstractNode.makeIdentityService.<anonymous>[ValueParameterDescriptorImpl]

'service' @ [656:17] ==> val service: InMemoryIdentityService defined in net.corda.node.internal.AbstractNode.makeIdentityService[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [656:25] ==> @Throws public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[SimpleFunctionDescriptorImpl]

'mapChange' @ [656:51] ==> value-parameter mapChange: (NetworkMapCache.MapChange..NetworkMapCache.MapChange?) defined in net.corda.node.internal.AbstractNode.makeIdentityService.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [656:61] ==> public abstract val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [656:66] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'service' @ [659:16] ==> val service: InMemoryIdentityService defined in net.corda.node.internal.AbstractNode.makeIdentityService[LocalVariableDescriptor]

'runOnStop' @ [672:23] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'reversed' @ [672:33] ==> public fun <T> Iterable<() -> Any?>.reversed(): List<() -> Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Any?>

'invoke' @ [673:13] ==> public abstract operator fun invoke(): Any? defined in kotlin.Function0[FunctionInvokeDescriptor]

'runOnStop' @ [675:9] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'clear' @ [675:19] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'KeyStoreWrapper' @ [690:24] ==> public constructor KeyStoreWrapper(storePath: Path, storePassword: String) defined in net.corda.node.utilities.KeyStoreWrapper[ClassConstructorDescriptorImpl]

'configuration' @ [690:40] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'nodeKeystore' @ [690:54] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'configuration' @ [690:68] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keyStorePassword' @ [690:82] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'id' @ [691:33] ==> value-parameter id: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'id' @ [692:35] ==> value-parameter id: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'!' @ [694:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [694:14] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'containsAlias' @ [694:23] ==> public final fun containsAlias(alias: String): Boolean defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'privateKeyAlias' @ [694:37] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'configuration' @ [695:31] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'baseDirectory' @ [695:45] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'privateKeyAlias' @ [695:61] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'configuration' @ [696:35] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'baseDirectory' @ [696:49] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'id' @ [696:67] ==> value-parameter id: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'configuration' @ [697:36] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'baseDirectory' @ [697:50] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'compositeKeyAlias' @ [697:66] ==> val compositeKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'if (privKeyFile.exists()) {
                migrateKeysFromFile(keyStore, name, pubIdentityFile, privKeyFile, compositeKeyFile, privateKeyAlias, compositeKeyAlias)
            } else {
                log.info("$privateKeyAlias not found in key store ${configuration.nodeKeystore}, generating fresh key!")
                keyStore.saveNewKeyPair(name, privateKeyAlias, generateKeyPair())
            }' @ [701:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'privKeyFile' @ [701:17] ==> val privKeyFile: Path defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'exists' @ [701:29] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'migrateKeysFromFile' @ [702:17] ==> private final fun migrateKeysFromFile(keyStore: KeyStoreWrapper, serviceName: X500Name, pubKeyFile: Path, privKeyFile: Path, compositeKeyFile: Path, privateKeyAlias: String, compositeKeyAlias: String): Unit defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'keyStore' @ [702:37] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'name' @ [702:47] ==> value-parameter name: X500Name defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'pubIdentityFile' @ [702:53] ==> val pubIdentityFile: Path defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'privKeyFile' @ [702:70] ==> val privKeyFile: Path defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'compositeKeyFile' @ [702:83] ==> val compositeKeyFile: Path defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'privateKeyAlias' @ [702:101] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'compositeKeyAlias' @ [702:118] ==> val compositeKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'log' @ [704:17] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [704:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'privateKeyAlias' @ [704:28] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'configuration' @ [704:69] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'nodeKeystore' @ [704:83] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'keyStore' @ [705:17] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'saveNewKeyPair' @ [705:26] ==> public final fun saveNewKeyPair(serviceName: X500Name, privateKeyAlias: String, keyPair: KeyPair): Unit defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'name' @ [705:41] ==> value-parameter name: X500Name defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'privateKeyAlias' @ [705:47] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'generateKeyPair' @ [705:64] ==> protected open fun generateKeyPair(): KeyPair defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'component1' @ [709:14] ==> public final operator fun component1(): X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedSimpleFunctionDescriptor]

'component2' @ [709:24] ==> public final operator fun component2(): KeyPair defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [709:32] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'certificateAndKeyPair' @ [709:41] ==> public final fun certificateAndKeyPair(alias: String): CertificateAndKeyPair defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'privateKeyAlias' @ [709:63] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'if (keyStore.containsAlias(compositeKeyAlias)) {
            // Use composite key instead if it exists
            val certificate = keyStore.getCertificate(compositeKeyAlias)
            // We have to create the certificate chain for the composite key manually, this is because in order to store
            // the chain in key store we need a private key, however there is no corresponding private key for the composite key.
            Lists.asList(certificate, keyStore.getCertificateChain(X509Utilities.CORDA_CLIENT_CA))
        } else {
            keyStore.getCertificateChain(privateKeyAlias).let {
                check(it[0].toX509CertHolder() == x509Cert) { "Certificates from key store do not line up!" }
                it.asList()
            }
        }' @ [712:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<(Certificate..Certificate?)>..List<Certificate>?), elseBranch: (List<(Certificate..Certificate?)>..List<Certificate>?)): (List<(Certificate..Certificate?)>..List<Certificate>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<(java.security.cert.Certificate..java.security.cert.Certificate?)>..kotlin.collections.List<java.security.cert.Certificate>?)

'keyStore' @ [712:32] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'containsAlias' @ [712:41] ==> public final fun containsAlias(alias: String): Boolean defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'compositeKeyAlias' @ [712:55] ==> val compositeKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'keyStore' @ [714:31] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'getCertificate' @ [714:40] ==> public final fun getCertificate(alias: String): Certificate defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'compositeKeyAlias' @ [714:55] ==> val compositeKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'asList' @ [717:19] ==> public open fun <E : (Any..Any?)> asList(@Nullable p0: Certificate?, p1: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)): (MutableList<(Certificate..Certificate?)>..List<(Certificate..Certificate?)>?) defined in com.google.common.collect.Lists[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'certificate' @ [717:26] ==> val certificate: Certificate defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'keyStore' @ [717:39] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'getCertificateChain' @ [717:48] ==> public final fun getCertificateChain(alias: String): Array<out Certificate> defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'CORDA_CLIENT_CA' @ [717:82] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'keyStore' @ [719:13] ==> val keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'getCertificateChain' @ [719:22] ==> public final fun getCertificateChain(alias: String): Array<out Certificate> defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'privateKeyAlias' @ [719:42] ==> val privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'let' @ [719:59] ==> @InlineOnly public inline fun <T, R> Array<out Certificate>.let(block: (Array<out Certificate>) -> List<Certificate>): List<Certificate> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<out Certificate>
    <R> -> List<Certificate>

'check' @ [720:17] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [720:23] ==> value-parameter it: Array<out Certificate> defined in net.corda.node.internal.AbstractNode.obtainIdentity.<anonymous>[ValueParameterDescriptorImpl]

'toX509CertHolder' @ [720:29] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'x509Cert' @ [720:51] ==> val x509Cert: X509CertificateHolder defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'it' @ [721:17] ==> value-parameter it: Array<out Certificate> defined in net.corda.node.internal.AbstractNode.obtainIdentity.<anonymous>[ValueParameterDescriptorImpl]

'asList' @ [721:20] ==> public fun <T> Array<out Certificate>.asList(): List<Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Certificate

'certificates' @ [725:23] ==> val certificates: (List<(Certificate..Certificate?)>..List<Certificate>?) defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'toX509CertHolder' @ [725:39] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'subject' @ [725:58] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'subject' @ [726:13] ==> val subject: (X500Name..X500Name?) defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'name' @ [726:24] ==> value-parameter name: X500Name defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'ConfigurationException' @ [727:19] ==> public constructor ConfigurationException(message: String) defined in net.corda.node.internal.ConfigurationException[ClassConstructorDescriptorImpl]

'id' @ [727:57] ==> value-parameter id: String defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'name' @ [727:100] ==> value-parameter name: X500Name defined in net.corda.node.internal.AbstractNode.obtainIdentity[ValueParameterDescriptorImpl]

'subject' @ [727:109] ==> val subject: (X500Name..X500Name?) defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'partyKeys' @ [729:9] ==> protected final val partyKeys: MutableSet<KeyPair> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'keys' @ [729:22] ==> val keys: KeyPair defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'PartyAndCertificate' @ [730:16] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'getInstance' @ [730:55] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'generateCertPath' @ [730:75] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'certificates' @ [730:92] ==> val certificates: (List<(Certificate..Certificate?)>..List<Certificate>?) defined in net.corda.node.internal.AbstractNode.obtainIdentity[LocalVariableDescriptor]

'log' @ [736:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [736:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'privateKeyAlias' @ [736:30] ==> value-parameter privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'Crypto' @ [739:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'decodePublicKey' @ [739:32] ==> @JvmStatic public final fun decodePublicKey(encodedKey: ByteArray): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'pubKeyFile' @ [739:48] ==> value-parameter pubKeyFile: Path defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'readAll' @ [739:59] ==> public fun Path.readAll(): ByteArray defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [740:26] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'decodePrivateKey' @ [740:33] ==> @JvmStatic public final fun decodePrivateKey(encodedKey: ByteArray): PrivateKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'privKeyFile' @ [740:50] ==> value-parameter privKeyFile: Path defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'readAll' @ [740:62] ==> public fun Path.readAll(): ByteArray defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [741:9] ==> value-parameter keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'saveNewKeyPair' @ [741:18] ==> public final fun saveNewKeyPair(serviceName: X500Name, privateKeyAlias: String, keyPair: KeyPair): Unit defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'serviceName' @ [741:33] ==> value-parameter serviceName: X500Name defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'privateKeyAlias' @ [741:46] ==> value-parameter privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'KeyPair' @ [741:63] ==> public constructor KeyPair(p0: (PublicKey..PublicKey?), p1: (PrivateKey..PrivateKey?)) defined in java.security.KeyPair[JavaClassConstructorDescriptor]

'publicKey' @ [741:71] ==> val publicKey: PublicKey defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[LocalVariableDescriptor]

'privateKey' @ [741:82] ==> val privateKey: PrivateKey defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[LocalVariableDescriptor]

'compositeKeyFile' @ [743:13] ==> value-parameter compositeKeyFile: Path defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'exists' @ [743:30] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [744:13] ==> value-parameter keyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'savePublicKey' @ [744:22] ==> public final fun savePublicKey(serviceName: X500Name, pubKeyAlias: String, pubKey: PublicKey): Unit defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'serviceName' @ [744:36] ==> value-parameter serviceName: X500Name defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'compositeKeyAlias' @ [744:49] ==> value-parameter compositeKeyAlias: String defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'decodePublicKey' @ [744:75] ==> @JvmStatic public final fun decodePublicKey(encodedKey: ByteArray): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'compositeKeyFile' @ [744:91] ==> value-parameter compositeKeyFile: Path defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'readAll' @ [744:108] ==> public fun Path.readAll(): ByteArray defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'log' @ [746:9] ==> protected abstract val log: Logger defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [746:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'privateKeyAlias' @ [746:37] ==> value-parameter privateKeyAlias: String defined in net.corda.node.internal.AbstractNode.migrateKeysFromFile[ValueParameterDescriptorImpl]

'cryptoGenerateKeyPair' @ [749:44] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SingletonSerializeAsToken' @ [751:70] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'ArrayList' @ [753:33] ==> public final fun <E> <init>(): ArrayList<Class<out FlowLogic<*>>> /* = ArrayList<Class<out FlowLogic<*>>> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Class<out FlowLogic<*>>

'DBTransactionMappingStorage' @ [754:63] ==> public constructor DBTransactionMappingStorage() defined in net.corda.node.services.persistence.DBTransactionMappingStorage[ClassConstructorDescriptorImpl]

'DummyAuditService' @ [755:37] ==> public constructor DummyAuditService() defined in net.corda.node.services.api.DummyAuditService[ClassConstructorDescriptorImpl]

'MonitoringService' @ [756:42] ==> public constructor MonitoringService(metrics: MetricRegistry) defined in net.corda.node.services.api.MonitoringService[ClassConstructorDescriptorImpl]

'MetricRegistry' @ [756:60] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'makeTransactionStorage' @ [757:46] ==> protected open fun makeTransactionStorage(): WritableTransactionStorage defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'getValue' @ [758:52] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'makeTransactionVerifierService' @ [758:59] ==> protected abstract fun makeTransactionVerifierService(): TransactionVerifierService defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'getValue' @ [759:41] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'InMemoryNetworkMapCache' @ [759:48] ==> public constructor InMemoryNetworkMapCache(serviceHub: ServiceHub?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[ClassConstructorDescriptorImpl]

'this' @ [759:72] ==> <this> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[LazyClassReceiverParameterDescriptor]

'getValue' @ [760:38] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NodeVaultService' @ [760:45] ==> public constructor NodeVaultService(services: ServiceHub) defined in net.corda.node.services.vault.NodeVaultService[ClassConstructorDescriptorImpl]

'this' @ [760:62] ==> <this> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[LazyClassReceiverParameterDescriptor]

'getValue' @ [761:43] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'HibernateVaultQueryImpl' @ [762:13] ==> public constructor HibernateVaultQueryImpl(hibernateConfig: HibernateConfiguration, vault: VaultService) defined in net.corda.node.services.vault.HibernateVaultQueryImpl[ClassConstructorDescriptorImpl]

'database' @ [762:37] ==> public open val database: CordaPersistence defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'hibernateConfig' @ [762:46] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'vaultService' @ [762:63] ==> public open val vaultService: NodeVaultService defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'getValue' @ [767:46] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'makeKeyManagementService' @ [767:53] ==> protected open fun makeKeyManagementService(identityService: IdentityService): KeyManagementService defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'identityService' @ [767:78] ==> public open val identityService: IdentityService defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'getValue' @ [768:42] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NodeSchedulerService' @ [768:49] ==> public constructor NodeSchedulerService(services: ServiceHubInternal, schedulerTimerExecutor: Executor = ..., unfinishedSchedules: ReusableLatch = ..., serverThread: AffinityExecutor) defined in net.corda.node.services.events.NodeSchedulerService[ClassConstructorDescriptorImpl]

'this' @ [768:70] ==> <this> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[LazyClassReceiverParameterDescriptor]

'busyNodeLatch' @ [768:98] ==> @VisibleForTesting public final val busyNodeLatch: ReusableLatch defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'serverThread' @ [768:128] ==> protected abstract val serverThread: AffinityExecutor defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'getValue' @ [769:41] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KeyStoreWrapper' @ [770:30] ==> public constructor KeyStoreWrapper(storePath: Path, storePassword: String) defined in net.corda.node.utilities.KeyStoreWrapper[ClassConstructorDescriptorImpl]

'configuration' @ [770:46] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'trustStoreFile' @ [770:60] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'configuration' @ [770:76] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'trustStorePassword' @ [770:90] ==> public abstract val trustStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'KeyStoreWrapper' @ [771:30] ==> public constructor KeyStoreWrapper(storePath: Path, storePassword: String) defined in net.corda.node.utilities.KeyStoreWrapper[ClassConstructorDescriptorImpl]

'configuration' @ [771:46] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'nodeKeystore' @ [771:60] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'configuration' @ [771:74] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'keyStorePassword' @ [771:88] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'makeIdentityService' @ [772:13] ==> protected open fun makeIdentityService(trustRoot: X509Certificate, clientCa: CertificateAndKeyPair?, legalIdentity: PartyAndCertificate): IdentityService defined in net.corda.node.internal.AbstractNode[SimpleFunctionDescriptorImpl]

'trustStore' @ [773:21] ==> val trustStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.identityService.<anonymous>[LocalVariableDescriptor]

'getX509Certificate' @ [773:32] ==> public final fun getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'CORDA_ROOT_CA' @ [773:65] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'cert' @ [773:80] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'caKeyStore' @ [774:21] ==> val caKeyStore: KeyStoreWrapper defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.identityService.<anonymous>[LocalVariableDescriptor]

'certificateAndKeyPair' @ [774:32] ==> public final fun certificateAndKeyPair(alias: String): CertificateAndKeyPair defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'CORDA_CLIENT_CA' @ [774:68] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'info' @ [775:21] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'legalIdentityAndCert' @ [775:26] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'this@AbstractNode' @ [777:61] ==> <this> defined in net.corda.node.internal.AbstractNode[LazyClassReceiverParameterDescriptor]

'attachments' @ [777:79] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'network' @ [778:63] ==> public final lateinit var network: MessagingService defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'platformClock' @ [779:43] ==> public final val platformClock: Clock defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'info' @ [780:47] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'getValue' @ [781:39] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NodeSchemaService' @ [781:46] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[ClassConstructorDescriptorImpl]

'pluginRegistries' @ [781:64] ==> public open val pluginRegistries: List<CordaPluginRegistry> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'flatMap' @ [781:81] ==> public inline fun <T, R> Iterable<CordaPluginRegistry>.flatMap(transform: (CordaPluginRegistry) -> Iterable<MappedSchema>): List<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaPluginRegistry
    <R> -> MappedSchema

'it' @ [781:91] ==> value-parameter it: CordaPluginRegistry defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.schemaService.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'requiredSchemas' @ [781:94] ==> public open val requiredSchemas: Set<MappedSchema> defined in net.corda.core.node.CordaPluginRegistry[DeserializedPropertyDescriptor]

'toSet' @ [781:112] ==> public fun <T> Iterable<MappedSchema>.toSet(): Set<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'this@AbstractNode' @ [782:57] ==> <this> defined in net.corda.node.internal.AbstractNode[LazyClassReceiverParameterDescriptor]

'database' @ [782:75] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'this@AbstractNode' @ [783:63] ==> <this> defined in net.corda.node.internal.AbstractNode[LazyClassReceiverParameterDescriptor]

'configuration' @ [783:81] ==> public open val configuration: NodeConfiguration defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'require' @ [786:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [786:21] ==> value-parameter type: Class<T> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.cordaService[ValueParameterDescriptorImpl]

'isAnnotationPresent' @ [786:26] ==> public open fun isAnnotationPresent(p0: (Class<out (Annotation..Annotation?)>..Class<out (Annotation..Annotation?)>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'CordaService' @ [786:46] ==> public constructor CordaService() defined in net.corda.core.node.services.CordaService[DeserializedClassConstructorDescriptor]

'java' @ [786:66] ==> public val <T> KClass<CordaService>.java: Class<CordaService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaService

'type' @ [786:78] ==> value-parameter type: Class<T> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.cordaService[ValueParameterDescriptorImpl]

'name' @ [786:83] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'cordappServices' @ [787:20] ==> private final val cordappServices: (MutableClassToInstanceMap<(SerializeAsToken..SerializeAsToken?)>..MutableClassToInstanceMap<(SerializeAsToken..SerializeAsToken?)>?) defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'getInstance' @ [787:36] ==> public open fun <T : (SerializeAsToken..SerializeAsToken?)> getInstance(p0: (Class<(T..T?)>..Class<(T..T?)>?)): (T..T?) defined in com.google.common.collect.MutableClassToInstanceMap[JavaMethodDescriptor]
Inferred types:
    <T : (SerializeAsToken..SerializeAsToken?)> -> (T..T?)

'type' @ [787:48] ==> value-parameter type: Class<T> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.cordaService[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [787:63] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'type' @ [787:105] ==> value-parameter type: Class<T> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.cordaService[ValueParameterDescriptorImpl]

'name' @ [787:110] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'serverThread' @ [791:20] ==> protected abstract val serverThread: AffinityExecutor defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'fetchFrom' @ [791:33] ==> public open fun <T> fetchFrom(fetcher: () -> FlowStateMachineImpl<T>): FlowStateMachineImpl<T> defined in net.corda.node.utilities.AffinityExecutor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> FlowStateMachineImpl<T>

'smm' @ [791:45] ==> public final lateinit var smm: StateMachineManager defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'add' @ [791:49] ==> public final fun <T> add(logic: FlowLogic<T>, flowInitiator: FlowInitiator): FlowStateMachineImpl<T> defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'logic' @ [791:53] ==> value-parameter logic: FlowLogic<T> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.startFlow[ValueParameterDescriptorImpl]

'flowInitiator' @ [791:60] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.startFlow[ValueParameterDescriptorImpl]

'flowFactories' @ [795:20] ==> private final val flowFactories: ConcurrentHashMap<Class<out FlowLogic<*>>, InitiatedFlowFactory<*>> defined in net.corda.node.internal.AbstractNode[PropertyDescriptorImpl]

'initiatingFlowClass' @ [795:34] ==> value-parameter initiatingFlowClass: Class<out FlowLogic<*>> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.getFlowFactory[ValueParameterDescriptorImpl]

'database' @ [799:13] ==> public open val database: CordaPersistence defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'transaction' @ [799:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'super' @ [800:17] ==> <this> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[LazyClassReceiverParameterDescriptor]

'recordTransactions' @ [800:23] ==> public open fun recordTransactions(notifyVault: Boolean, txs: Iterable<SignedTransaction>): Unit defined in net.corda.node.services.api.ServiceHubInternal[SimpleFunctionDescriptorImpl]

'notifyVault' @ [800:42] ==> value-parameter notifyVault: Boolean defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.recordTransactions[ValueParameterDescriptorImpl]

'txs' @ [800:55] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl.recordTransactions[ValueParameterDescriptorImpl]

'database' @ [803:50] ==> public open val database: CordaPersistence defined in net.corda.node.internal.AbstractNode.ServiceHubInternalImpl[PropertyDescriptorImpl]

'createSession' @ [803:59] ==> public final fun createSession(): Connection defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]

