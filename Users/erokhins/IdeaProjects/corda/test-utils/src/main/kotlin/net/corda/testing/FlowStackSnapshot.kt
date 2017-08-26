'Suspendable' @ [25:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'currentFiber' @ [28:32] ==> public open fun currentFiber(): raw (Fiber<(Any..Any?)>..Fiber<*>?) defined in co.paralleluniverse.fibers.Fiber[JavaMethodDescriptor]

'stackTrace' @ [28:47] ==> public final val <V : (Any..Any?)> Fiber<(Any..Any?)>.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'parkAndSerialize' @ [29:15] ==> public final fun parkAndSerialize(p0: ((raw (Fiber<(Any..Any?)>..Fiber<*>?), (ByteArraySerializer..ByteArraySerializer?)) -> Unit..((raw (Fiber<(Any..Any?)>..Fiber<*>?), (ByteArraySerializer..ByteArraySerializer?)) -> Unit)?)): Unit defined in co.paralleluniverse.fibers.Fiber[SamAdapterFunctionDescriptor]

'snapshot' @ [30:13] ==> var snapshot: FlowStackSnapshot? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot[LocalVariableDescriptor]

'extractStackSnapshotFromFiber' @ [30:24] ==> private final fun extractStackSnapshotFromFiber(fiber: Fiber<*>, stackTrace: List<StackTraceElement>, flowClass: Class<out FlowLogic<*>>): FlowStackSnapshot defined in net.corda.testing.FlowStackSnapshotFactoryImpl[SimpleFunctionDescriptorImpl]

'fiber' @ [30:54] ==> value-parameter fiber: raw (Fiber<(Any..Any?)>..Fiber<*>?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot.<anonymous>[ValueParameterDescriptorImpl]

'stackTrace' @ [30:61] ==> val stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot[LocalVariableDescriptor]

'toList' @ [30:72] ==> public fun <T> Array<out (StackTraceElement..StackTraceElement?)>.toList(): List<(StackTraceElement..StackTraceElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'flowClass' @ [30:82] ==> value-parameter flowClass: Class<out FlowLogic<*>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot[ValueParameterDescriptorImpl]

'unparkDeserialized' @ [31:19] ==> public open fun <V : (Any..Any?)> unparkDeserialized(p0: (Fiber<(Any..Any?)>..Fiber<(Any..Any?)>?), p1: (FiberScheduler..FiberScheduler?)): (Fiber<(Any..Any?)>..Fiber<(Any..Any?)>?) defined in co.paralleluniverse.fibers.Fiber[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Any

'fiber' @ [31:38] ==> value-parameter fiber: raw (Fiber<(Any..Any?)>..Fiber<*>?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot.<anonymous>[ValueParameterDescriptorImpl]

'fiber' @ [31:45] ==> value-parameter fiber: raw (Fiber<(Any..Any?)>..Fiber<*>?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot.<anonymous>[ValueParameterDescriptorImpl]

'scheduler' @ [31:51] ==> public final val <V : (Any..Any?)> Fiber<(Any..Any?)>.scheduler: (FiberScheduler..FiberScheduler?)[MyPropertyDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'snapshot' @ [35:33] ==> var snapshot: FlowStackSnapshot? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot[LocalVariableDescriptor]

'snapshot' @ [36:9] ==> var snapshot: FlowStackSnapshot? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot[LocalVariableDescriptor]

'temporarySnapshot' @ [37:16] ==> val temporarySnapshot: FlowStackSnapshot? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.getFlowStackSnapshot[LocalVariableDescriptor]

'getFlowStackSnapshot' @ [41:33] ==> @Suspendable public open fun getFlowStackSnapshot(flowClass: Class<out FlowLogic<*>>): FlowStackSnapshot defined in net.corda.testing.FlowStackSnapshotFactoryImpl[SimpleFunctionDescriptorImpl]

'flowClass' @ [41:54] ==> value-parameter flowClass: Class<out FlowLogic<*>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile[ValueParameterDescriptorImpl]

'JacksonSupport' @ [42:22] ==> public object JacksonSupport defined in net.corda.jackson[FakeCallableDescriptorForObject]

'createNonRpcMapper' @ [42:37] ==> @JvmStatic @JvmOverloads public final fun createNonRpcMapper(factory: JsonFactory = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[DeserializedSimpleFunctionDescriptor]

'apply' @ [42:58] ==> @InlineOnly public inline fun <T> ObjectMapper.apply(block: ObjectMapper.() -> Unit): ObjectMapper defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObjectMapper

'disable' @ [43:13] ==> public open fun disable(p0: (SerializationFeature..SerializationFeature?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'FAIL_ON_EMPTY_BEANS' @ [43:42] ==> enum entry FAIL_ON_EMPTY_BEANS defined in com.fasterxml.jackson.databind.SerializationFeature[FakeCallableDescriptorForObject]

'setSerializationInclusion' @ [44:13] ==> public open fun setSerializationInclusion(p0: (JsonInclude.Include..JsonInclude.Include?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'NON_NULL' @ [44:59] ==> enum entry NON_NULL defined in com.fasterxml.jackson.annotation.JsonInclude.Include[FakeCallableDescriptorForObject]

'createFile' @ [46:20] ==> private final fun createFile(baseDir: Path, flowId: StateMachineRunId): Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl[SimpleFunctionDescriptorImpl]

'baseDir' @ [46:31] ==> value-parameter baseDir: Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile[ValueParameterDescriptorImpl]

'flowId' @ [46:40] ==> value-parameter flowId: StateMachineRunId defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile[ValueParameterDescriptorImpl]

'file' @ [47:9] ==> val file: Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile[LocalVariableDescriptor]

'write' @ [47:14] ==> public inline fun Path.write(createDirs: Boolean = ..., vararg options: OpenOption = ..., block: (OutputStream) -> Unit): Unit defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'mapper' @ [48:13] ==> val mapper: ObjectMapper defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile[LocalVariableDescriptor]

'writeValue' @ [48:20] ==> public open fun writeValue(p0: (OutputStream..OutputStream?), p1: (Any..Any?)): Unit defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'it' @ [48:31] ==> value-parameter it: OutputStream defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile.<anonymous>[ValueParameterDescriptorImpl]

'filterOutStackDump' @ [48:35] ==> private final fun filterOutStackDump(flowStackSnapshot: FlowStackSnapshot): FlowStackSnapshot defined in net.corda.testing.FlowStackSnapshotFactoryImpl[SimpleFunctionDescriptorImpl]

'flowStackSnapshot' @ [48:54] ==> val flowStackSnapshot: FlowStackSnapshot defined in net.corda.testing.FlowStackSnapshotFactoryImpl.persistAsJsonFile[LocalVariableDescriptor]

'getFiberStack' @ [53:21] ==> private fun getFiberStack(fiber: Fiber<*>): Stack defined in net.corda.testing in file FlowStackSnapshot.kt[SimpleFunctionDescriptorImpl]

'fiber' @ [53:35] ==> value-parameter fiber: Fiber<*> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[ValueParameterDescriptorImpl]

'getObjectStack' @ [54:27] ==> private fun getObjectStack(stack: Stack): Array<Any?> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'stack' @ [54:42] ==> val stack: Stack defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'toList' @ [54:49] ==> public fun <T> Array<out Any?>.toList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'getFrameOffsets' @ [55:28] ==> private fun getFrameOffsets(stack: Stack): List<Pair<Int, Int>> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'stack' @ [55:44] ==> val stack: Stack defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'frameOffsets' @ [56:28] ==> val frameOffsets: List<Pair<Int, Int>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'map' @ [56:41] ==> public inline fun <T, R> Iterable<Pair<Int, Int>>.map(transform: (Pair<Int, Int>) -> List<Any?>): List<List<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Int>
    <R> -> List<Any?>

'component1' @ [56:48] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [56:61] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'objectStack' @ [57:13] ==> val objectStack: List<Any?> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'subList' @ [57:25] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<Any?> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'frameOffset' @ [57:33] ==> val frameOffset: Int defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'frameOffset' @ [57:50] ==> val frameOffset: Int defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'frameSize' @ [57:64] ==> val frameSize: Int defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'removeConstructorStackTraceElements' @ [60:34] ==> private final fun removeConstructorStackTraceElements(stackTrace: List<StackTraceElement>): List<StackTraceElement> defined in net.corda.testing.FlowStackSnapshotFactoryImpl[SimpleFunctionDescriptorImpl]

'stackTrace' @ [60:70] ==> value-parameter stackTrace: List<StackTraceElement> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[ValueParameterDescriptorImpl]

'drop' @ [60:82] ==> public fun <T> Iterable<StackTraceElement>.drop(n: Int): List<StackTraceElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackTraceElement

'relevantStackTrace' @ [61:38] ==> val relevantStackTrace: List<StackTraceElement> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'map' @ [61:57] ==> public inline fun <T, R> Iterable<StackTraceElement>.map(transform: (StackTraceElement) -> Pair<StackTraceElement, Instrumented?>): List<Pair<StackTraceElement, Instrumented?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackTraceElement
    <R> -> Pair<StackTraceElement, Instrumented?>

'StackTraceElement' @ [62:27] ==> public constructor StackTraceElement(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Int) defined in java.lang.StackTraceElement[JavaClassConstructorDescriptor]

'it' @ [62:45] ==> value-parameter it: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [62:48] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'it' @ [62:59] ==> value-parameter it: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[ValueParameterDescriptorImpl]

'methodName' @ [62:62] ==> public final val StackTraceElement.methodName: (String..String?)[MyPropertyDescriptor]

'it' @ [62:74] ==> value-parameter it: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [62:77] ==> public final val StackTraceElement.fileName: (String..String?)[MyPropertyDescriptor]

'it' @ [62:87] ==> value-parameter it: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[ValueParameterDescriptorImpl]

'lineNumber' @ [62:90] ==> public final val StackTraceElement.lineNumber: Int[MyPropertyDescriptor]

'element' @ [63:13] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'element' @ [63:24] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'instrumentedAnnotation' @ [63:32] ==> private final val StackTraceElement.instrumentedAnnotation: Instrumented? defined in net.corda.testing.FlowStackSnapshotFactoryImpl[PropertyDescriptorImpl]

'frameObjects' @ [65:36] ==> val frameObjects: List<List<Any?>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'listIterator' @ [65:49] ==> public abstract fun listIterator(): ListIterator<List<Any?>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'stackTraceToAnnotation' @ [66:22] ==> val stackTraceToAnnotation: List<Pair<StackTraceElement, Instrumented?>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'reversed' @ [66:45] ==> public fun <T> Iterable<Pair<StackTraceElement, Instrumented?>>.reversed(): List<Pair<StackTraceElement, Instrumented?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StackTraceElement, Instrumented?>

'map' @ [66:56] ==> public inline fun <T, R> Iterable<Pair<StackTraceElement, Instrumented?>>.map(transform: (Pair<StackTraceElement, Instrumented?>) -> FlowStackSnapshot.Frame): List<FlowStackSnapshot.Frame> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StackTraceElement, Instrumented?>
    <R> -> Frame

'component1' @ [66:63] ==> public final operator fun component1(): StackTraceElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [66:72] ==> public final operator fun component2(): Instrumented? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (frameObjectsIterator.hasNext() && (annotation == null || !annotation.methodOptimized)) {
                frameObjectsIterator.next()
            } else {
                emptyList()
            }' @ [69:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Any?>, elseBranch: List<Any?>): List<Any?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Any?>

'frameObjectsIterator' @ [69:36] ==> val frameObjectsIterator: ListIterator<List<Any?>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'hasNext' @ [69:57] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'annotation' @ [69:71] ==> val annotation: Instrumented? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'!' @ [69:93] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotation' @ [69:94] ==> val annotation: Instrumented? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'methodOptimized' @ [69:105] ==> public final val methodOptimized: Boolean defined in co.paralleluniverse.fibers.Instrumented[JavaPropertyDescriptor]

'frameObjectsIterator' @ [70:17] ==> val frameObjectsIterator: ListIterator<List<Any?>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'next' @ [70:38] ==> public abstract fun next(): List<Any?> defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [72:17] ==> public fun <T> emptyList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'Frame' @ [74:13] ==> public constructor Frame(stackTraceElement: StackTraceElement, stackObjects: List<Any?>) defined in net.corda.core.flows.FlowStackSnapshot.Frame[DeserializedClassConstructorDescriptor]

'element' @ [74:19] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'stackObjects' @ [74:28] ==> val stackObjects: List<Any?> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber.<anonymous>[LocalVariableDescriptor]

'FlowStackSnapshot' @ [76:16] ==> public constructor FlowStackSnapshot(time: Instant, flowClass: String, stackFrames: List<FlowStackSnapshot.Frame>) defined in net.corda.core.flows.FlowStackSnapshot[DeserializedClassConstructorDescriptor]

'now' @ [76:42] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'flowClass' @ [76:49] ==> value-parameter flowClass: Class<out FlowLogic<*>> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[ValueParameterDescriptorImpl]

'name' @ [76:59] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowLogic<*>

'frames' @ [76:65] ==> val frames: List<FlowStackSnapshot.Frame> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.extractStackSnapshotFromFiber[LocalVariableDescriptor]

'forName' @ [80:15] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'className' @ [80:23] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'methods' @ [80:34] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'forEach' @ [80:42] ==> public inline fun <T> Array<out (Method..Method?)>.forEach(action: ((Method..Method?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [81:17] ==> value-parameter it: (Method..Method?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.<get-instrumentedAnnotation>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [81:20] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'methodName' @ [81:28] ==> public final val StackTraceElement.methodName: (String..String?)[MyPropertyDescriptor]

'it' @ [81:42] ==> value-parameter it: (Method..Method?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.<get-instrumentedAnnotation>.<anonymous>[ValueParameterDescriptorImpl]

'isAnnotationPresent' @ [81:45] ==> public open fun isAnnotationPresent(p0: (Class<out (Annotation..Annotation?)>..Class<out (Annotation..Annotation?)>?)): Boolean defined in java.lang.reflect.Method[JavaMethodDescriptor]

'Instrumented' @ [81:65] ==> public constructor Instrumented(methodOptimized: Boolean = ..., suspendableCallSites: IntArray = ..., methodStart: Int = ..., methodEnd: Int = ..., suspendableCallSiteNames: Array<String> = ..., suspendableCallSitesOffsetsAfterInstr: IntArray = ...) defined in co.paralleluniverse.fibers.Instrumented[JavaClassConstructorDescriptor]

'java' @ [81:85] ==> public val <T> KClass<Instrumented>.java: Class<Instrumented> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Instrumented

'it' @ [82:24] ==> value-parameter it: (Method..Method?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.<get-instrumentedAnnotation>.<anonymous>[ValueParameterDescriptorImpl]

'getAnnotation' @ [82:27] ==> public open fun <T : (Annotation..Annotation?)> getAnnotation(p0: (Class<(Instrumented..Instrumented?)>..Class<(Instrumented..Instrumented?)>?)): (Instrumented..Instrumented?) defined in java.lang.reflect.Method[JavaMethodDescriptor]
Inferred types:
    <T : (Annotation..Annotation?)> -> Instrumented

'Instrumented' @ [82:41] ==> public constructor Instrumented(methodOptimized: Boolean = ..., suspendableCallSites: IntArray = ..., methodStart: Int = ..., methodEnd: Int = ..., suspendableCallSiteNames: Array<String> = ..., suspendableCallSitesOffsetsAfterInstr: IntArray = ...) defined in co.paralleluniverse.fibers.Instrumented[JavaClassConstructorDescriptor]

'java' @ [82:61] ==> public val <T> KClass<Instrumented>.java: Class<Instrumented> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Instrumented

'ArrayList' @ [89:29] ==> public final fun <E> <init>(): ArrayList<StackTraceElement> /* = ArrayList<StackTraceElement> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> StackTraceElement

'stackTrace' @ [91:25] ==> value-parameter stackTrace: List<StackTraceElement> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[ValueParameterDescriptorImpl]

'element' @ [92:17] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'methodName' @ [92:25] ==> public final val StackTraceElement.methodName: (String..String?)[MyPropertyDescriptor]

'previousElement' @ [92:39] ==> var previousElement: StackTraceElement? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'methodName' @ [92:56] ==> public final val StackTraceElement.methodName: (String..String?)[MyPropertyDescriptor]

'element' @ [93:21] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'className' @ [93:29] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'previousElement' @ [93:42] ==> var previousElement: StackTraceElement? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'className' @ [93:59] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'element' @ [94:21] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'fileName' @ [94:29] ==> public final val StackTraceElement.fileName: (String..String?)[MyPropertyDescriptor]

'previousElement' @ [94:41] ==> var previousElement: StackTraceElement? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'fileName' @ [94:58] ==> public final val StackTraceElement.fileName: (String..String?)[MyPropertyDescriptor]

'newStackTrace' @ [97:13] ==> val newStackTrace: ArrayList<StackTraceElement> /* = ArrayList<StackTraceElement> */ defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'add' @ [97:27] ==> public open fun add(element: StackTraceElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [97:31] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'previousElement' @ [98:13] ==> var previousElement: StackTraceElement? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'element' @ [98:31] ==> val element: StackTraceElement defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'newStackTrace' @ [100:16] ==> val newStackTrace: ArrayList<StackTraceElement> /* = ArrayList<StackTraceElement> */ defined in net.corda.testing.FlowStackSnapshotFactoryImpl.removeConstructorStackTraceElements[LocalVariableDescriptor]

'flowStackSnapshot' @ [104:49] ==> value-parameter flowStackSnapshot: FlowStackSnapshot defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump[ValueParameterDescriptorImpl]

'stackFrames' @ [104:67] ==> public final val stackFrames: List<FlowStackSnapshot.Frame> defined in net.corda.core.flows.FlowStackSnapshot[DeserializedPropertyDescriptor]

'filter' @ [104:79] ==> public inline fun <T> Iterable<FlowStackSnapshot.Frame>.filter(predicate: (FlowStackSnapshot.Frame) -> Boolean): List<FlowStackSnapshot.Frame> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Frame

'!' @ [105:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'java' @ [105:38] ==> public val <T> KClass<FlowStateMachine<*>>.java: Class<FlowStateMachine<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowStateMachine<*>

'isAssignableFrom' @ [105:43] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'forName' @ [105:66] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [105:74] ==> value-parameter it: FlowStackSnapshot.Frame defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>[ValueParameterDescriptorImpl]

'stackTraceElement' @ [105:77] ==> public final val stackTraceElement: StackTraceElement defined in net.corda.core.flows.FlowStackSnapshot.Frame[DeserializedPropertyDescriptor]

'className' @ [105:95] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'framesFilteredByStackTraceElement' @ [107:39] ==> val framesFilteredByStackTraceElement: List<FlowStackSnapshot.Frame> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump[LocalVariableDescriptor]

'map' @ [107:73] ==> public inline fun <T, R> Iterable<FlowStackSnapshot.Frame>.map(transform: (FlowStackSnapshot.Frame) -> FlowStackSnapshot.Frame): List<FlowStackSnapshot.Frame> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Frame
    <R> -> Frame

'it' @ [108:13] ==> value-parameter it: FlowStackSnapshot.Frame defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [108:16] ==> public final fun copy(stackTraceElement: StackTraceElement = ..., stackObjects: List<Any?> = ...): FlowStackSnapshot.Frame defined in net.corda.core.flows.FlowStackSnapshot.Frame[DeserializedSimpleFunctionDescriptor]

'it' @ [108:36] ==> value-parameter it: FlowStackSnapshot.Frame defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>[ValueParameterDescriptorImpl]

'stackObjects' @ [108:39] ==> public final val stackObjects: List<Any?> defined in net.corda.core.flows.FlowStackSnapshot.Frame[DeserializedPropertyDescriptor]

'map' @ [108:52] ==> public inline fun <T, R> Iterable<Any?>.map(transform: (Any?) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> Any?

'if (it != null && (it is FlowLogic<*> || it is FlowStateMachine<*> || it is Fiber<*> || it is SerializeAsToken)) {
                    StackFrameDataToken(it::class.java.name)
                } else {
                    it
                }' @ [109:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'it' @ [109:21] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [109:36] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [109:58] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [109:87] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [109:105] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'StackFrameDataToken' @ [110:21] ==> public constructor StackFrameDataToken(className: String) defined in net.corda.core.flows.StackFrameDataToken[DeserializedClassConstructorDescriptor]

'it' @ [110:41] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [110:51] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'name' @ [110:56] ==> public final val <T : (Any..Any?)> Class<out Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'it' @ [112:21] ==> value-parameter it: Any? defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flowStackSnapshot' @ [116:16] ==> value-parameter flowStackSnapshot: FlowStackSnapshot defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump[ValueParameterDescriptorImpl]

'copy' @ [116:34] ==> public final fun copy(time: Instant = ..., flowClass: String = ..., stackFrames: List<FlowStackSnapshot.Frame> = ...): FlowStackSnapshot defined in net.corda.core.flows.FlowStackSnapshot[DeserializedSimpleFunctionDescriptor]

'framesFilteredByObjects' @ [116:53] ==> val framesFilteredByObjects: List<FlowStackSnapshot.Frame> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.filterOutStackDump[LocalVariableDescriptor]

'baseDir' @ [120:19] ==> value-parameter baseDir: Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[ValueParameterDescriptorImpl]

'now' @ [120:62] ==> public open fun now(): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'toString' @ [120:68] ==> public open fun toString(): String defined in java.time.LocalDate[JavaMethodDescriptor]

'flowId' @ [120:81] ==> value-parameter flowId: StateMachineRunId defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[ValueParameterDescriptorImpl]

'uuid' @ [120:88] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'toString' @ [120:93] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'ThreadLocalIndex' @ [121:21] ==> public companion object defined in net.corda.testing.FlowStackSnapshotFactoryImpl.ThreadLocalIndex[FakeCallableDescriptorForObject]

'currentIndex' @ [121:38] ==> public final val currentIndex: ThreadLocal<Int> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.ThreadLocalIndex.Companion[PropertyDescriptorImpl]

'get' @ [121:51] ==> public open fun get(): (Int..Int?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'if (index == 0) dir / "flowStackSnapshot.json" else dir / "flowStackSnapshot-$index.json"' @ [122:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Path, elseBranch: Path): Path[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Path

'index' @ [122:24] ==> val index: (Int..Int?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[LocalVariableDescriptor]

'dir' @ [122:36] ==> val dir: Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[LocalVariableDescriptor]

'dir' @ [122:72] ==> val dir: Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[LocalVariableDescriptor]

'index' @ [122:98] ==> val index: (Int..Int?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[LocalVariableDescriptor]

'ThreadLocalIndex' @ [123:9] ==> public companion object defined in net.corda.testing.FlowStackSnapshotFactoryImpl.ThreadLocalIndex[FakeCallableDescriptorForObject]

'currentIndex' @ [123:26] ==> public final val currentIndex: ThreadLocal<Int> defined in net.corda.testing.FlowStackSnapshotFactoryImpl.ThreadLocalIndex.Companion[PropertyDescriptorImpl]

'set' @ [123:39] ==> public open fun set(p0: (Int..Int?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'index' @ [123:43] ==> val index: (Int..Int?) defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[LocalVariableDescriptor]

'file' @ [124:16] ==> val file: Path defined in net.corda.testing.FlowStackSnapshotFactoryImpl.createFile[LocalVariableDescriptor]

'ThreadLocal<Int>' @ [129:41] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'java' @ [138:26] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'getDeclaredField' @ [138:31] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'name' @ [138:48] ==> value-parameter name: String defined in net.corda.testing.getField[ValueParameterDescriptorImpl]

'field' @ [139:5] ==> val field: (Field..Field?) defined in net.corda.testing.getField[LocalVariableDescriptor]

'isAccessible' @ [139:11] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [140:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'field' @ [141:12] ==> val field: (Field..Field?) defined in net.corda.testing.getField[LocalVariableDescriptor]

'get' @ [141:18] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'this' @ [141:22] ==> <this> defined in net.corda.testing.getField[ReceiverParameterDescriptorImpl]

'fiber' @ [145:12] ==> value-parameter fiber: Fiber<*> defined in net.corda.testing.getFiberStack[ValueParameterDescriptorImpl]

'getField' @ [145:18] ==> private inline fun <reified R, A> Fiber<out (Any..Any?)>.getField(name: String): Stack defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R> -> Fiber<out (kotlin.Any..kotlin.Any?)>
    <A> -> Stack

'stack' @ [149:12] ==> value-parameter stack: Stack defined in net.corda.testing.getObjectStack[ValueParameterDescriptorImpl]

'getField' @ [149:18] ==> private inline fun <reified R, A> Stack.getField(name: String): Array<Any?> defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R> -> Stack
    <A> -> Array<Any?>

'stack' @ [153:12] ==> value-parameter stack: Stack defined in net.corda.testing.getPrimitiveStack[ValueParameterDescriptorImpl]

'getField' @ [153:18] ==> private inline fun <reified R, A> Stack.getField(name: String): LongArray defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R> -> Stack
    <A> -> LongArray

'getPrimitiveStack' @ [160:26] ==> private fun getPrimitiveStack(stack: Stack): LongArray defined in net.corda.testing in file FlowStackSnapshot.kt[SimpleFunctionDescriptorImpl]

'stack' @ [160:44] ==> value-parameter stack: Stack defined in net.corda.testing.getFrameOffsets[ValueParameterDescriptorImpl]

'ArrayList' @ [161:19] ==> public final fun <E> <init>(): ArrayList<Pair<Int, Int>> /* = ArrayList<Pair<Int, Int>> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Pair<Int, Int>

'primitiveStack' @ [164:22] ==> val primitiveStack: LongArray defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'offset' @ [164:37] ==> var offset: Int defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'getNumSlots' @ [165:21] ==> private fun getNumSlots(record: Long): Int defined in net.corda.testing in file FlowStackSnapshot.kt[SimpleFunctionDescriptorImpl]

'record' @ [165:33] ==> val record: Long defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'if (slots > 0) {
            offsets.add(offset to slots)
            offset += slots + 1
        } else {
            break
        }' @ [166:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'slots' @ [166:13] ==> val slots: Int defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'offsets' @ [167:13] ==> val offsets: ArrayList<Pair<Int, Int>> /* = ArrayList<Pair<Int, Int>> */ defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'add' @ [167:21] ==> public open fun add(element: Pair<Int, Int>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'offset' @ [167:25] ==> var offset: Int defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'slots' @ [167:35] ==> val slots: Int defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'offset' @ [168:13] ==> var offset: Int defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'slots' @ [168:23] ==> val slots: Int defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'offsets' @ [173:12] ==> val offsets: ArrayList<Pair<Int, Int>> /* = ArrayList<Pair<Int, Int>> */ defined in net.corda.testing.getFrameOffsets[LocalVariableDescriptor]

'-' @ [176:31] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'getUnsignedBits' @ [179:12] ==> private fun getUnsignedBits(word: Long, offset: Int, length: Int): Long defined in net.corda.testing in file FlowStackSnapshot.kt[SimpleFunctionDescriptorImpl]

'record' @ [179:28] ==> value-parameter record: Long defined in net.corda.testing.getNumSlots[ValueParameterDescriptorImpl]

'toInt' @ [179:44] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'-' @ [183:13] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [183:18] ==> value-parameter length: Int defined in net.corda.testing.getUnsignedBits[ValueParameterDescriptorImpl]

'a' @ [184:13] ==> val a: Int defined in net.corda.testing.getUnsignedBits[LocalVariableDescriptor]

'offset' @ [184:17] ==> value-parameter offset: Int defined in net.corda.testing.getUnsignedBits[ValueParameterDescriptorImpl]

'word' @ [185:12] ==> value-parameter word: Long defined in net.corda.testing.getUnsignedBits[ValueParameterDescriptorImpl]

'ushr' @ [185:17] ==> public final infix fun ushr(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'b' @ [185:22] ==> val b: Int defined in net.corda.testing.getUnsignedBits[LocalVariableDescriptor]

'MASK_FULL' @ [185:29] ==> private val MASK_FULL: Long defined in net.corda.testing in file FlowStackSnapshot.kt[PropertyDescriptorImpl]

'ushr' @ [185:39] ==> public final infix fun ushr(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'a' @ [185:44] ==> val a: Int defined in net.corda.testing.getUnsignedBits[LocalVariableDescriptor]

