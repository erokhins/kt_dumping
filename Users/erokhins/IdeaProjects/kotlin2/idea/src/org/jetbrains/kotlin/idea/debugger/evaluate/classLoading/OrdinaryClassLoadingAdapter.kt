'listOf' @ [37:43] ==> public fun <T> listOf(element: OrdinaryClassLoadingAdapter.ClassBytes): List<OrdinaryClassLoadingAdapter.ClassBytes> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassBytes

'ClassBytes' @ [37:50] ==> public constructor ClassBytes(name: String) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[ClassConstructorDescriptorImpl]

'hasAdditionalClasses' @ [41:17] ==> value-parameter hasAdditionalClasses: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.isApplicable[ValueParameterDescriptorImpl]

'hasLoops' @ [41:41] ==> value-parameter hasLoops: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.isApplicable[ValueParameterDescriptorImpl]

'context' @ [41:54] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.isApplicable[ValueParameterDescriptorImpl]

'classLoader' @ [41:62] ==> public final var EvaluationContextImpl.classLoader: ClassLoaderReference?[MyPropertyDescriptor]

'!' @ [41:85] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [41:86] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.isApplicable[ValueParameterDescriptorImpl]

'debugProcess' @ [41:94] ==> public final val EvaluationContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'isDexDebug' @ [41:107] ==> public fun DebugProcess.isDexDebug(): Boolean defined in org.jetbrains.kotlin.idea.debugger[SimpleFunctionDescriptorImpl]

'context' @ [45:23] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[ValueParameterDescriptorImpl]

'debugProcess' @ [45:31] ==> public final val EvaluationContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'getClassLoader' @ [48:31] ==> public open fun getClassLoader(p0: (EvaluationContext..EvaluationContext?), p1: (DebugProcess..DebugProcess?)): (ClassLoaderReference..ClassLoaderReference?) defined in com.intellij.debugger.impl.ClassLoadingUtils[JavaMethodDescriptor]

'context' @ [48:46] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[ValueParameterDescriptorImpl]

'process' @ [48:55] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'EvaluateException' @ [51:19] ==> public constructor EvaluateException(p0: (String..String?), p1: (Throwable..Throwable?)) defined in com.intellij.debugger.engine.evaluation.EvaluateException[JavaClassConstructorDescriptor]

'+' @ [51:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [51:82] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'e' @ [51:85] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'process' @ [54:23] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'virtualMachineProxy' @ [54:31] ==> public final val DebugProcessImpl.virtualMachineProxy: VirtualMachineProxyImpl[MyPropertyDescriptor]

'version' @ [54:51] ==> public open fun version(): (String..String?) defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'getVersion' @ [55:41] ==> @Deprecated public open fun getVersion(@NotNull p0: String): (JavaSdkVersion..JavaSdkVersion?) defined in com.intellij.openapi.projectRoots.JdkVersionUtil[JavaMethodDescriptor]

'version' @ [55:52] ==> val version: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'!' @ [57:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isJavaVersionAtLeast' @ [57:25] ==> public open fun isJavaVersionAtLeast(p0: (String..String?)): Boolean defined in com.intellij.openapi.util.SystemInfo[JavaMethodDescriptor]

'sdkVersion' @ [57:46] ==> val sdkVersion: (JavaSdkVersion..JavaSdkVersion?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'description' @ [57:57] ==> public final val JavaSdkVersion.description: String[MyPropertyDescriptor]

'EvaluateException' @ [58:19] ==> public constructor EvaluateException(p0: (String..String?)) defined in com.intellij.debugger.engine.evaluation.EvaluateException[JavaClassConstructorDescriptor]

'+' @ [59:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'sdkVersion' @ [59:59] ==> val sdkVersion: (JavaSdkVersion..JavaSdkVersion?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'description' @ [59:70] ==> public final val JavaSdkVersion.description: String[MyPropertyDescriptor]

'sdkVersion' @ [60:66] ==> val sdkVersion: (JavaSdkVersion..JavaSdkVersion?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'description' @ [60:77] ==> public final val JavaSdkVersion.description: String[MyPropertyDescriptor]

'JAVA_RUNTIME_VERSION' @ [61:56] ==> public const final val JAVA_RUNTIME_VERSION: (String..String?) defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'defineClasses' @ [65:13] ==> private final fun defineClasses(classes: Collection<ClassToLoad>, context: EvaluationContextImpl, process: DebugProcessImpl, classLoader: ClassLoaderReference): Unit defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter[SimpleFunctionDescriptorImpl]

'classes' @ [65:27] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[ValueParameterDescriptorImpl]

'context' @ [65:36] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[ValueParameterDescriptorImpl]

'process' @ [65:45] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'classLoader' @ [65:54] ==> val classLoader: (ClassLoaderReference..ClassLoaderReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'EvaluateException' @ [68:19] ==> public constructor EvaluateException(p0: (String..String?), p1: (Throwable..Throwable?)) defined in com.intellij.debugger.engine.evaluation.EvaluateException[JavaClassConstructorDescriptor]

'+' @ [68:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [68:74] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'e' @ [68:77] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'ClassLoaderHandler' @ [71:16] ==> public constructor ClassLoaderHandler(reference: ClassLoaderReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoaderHandler[ClassConstructorDescriptorImpl]

'classLoader' @ [71:35] ==> val classLoader: (ClassLoaderReference..ClassLoaderReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.loadClasses[LocalVariableDescriptor]

'if (classes.size == 1) {
            // No need in loading lambda superclass if there're no lambdas
            classes
        }
        else {
            val lambdaSuperclasses = LAMBDA_SUPERCLASSES.map {
                ClassToLoad(it.name, it.name.replace('.', '/') + ".class", it.bytes)
            }
            lambdaSuperclasses + classes
        }' @ [80:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<ClassToLoad>, elseBranch: Collection<ClassToLoad>): Collection<ClassToLoad>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<ClassToLoad>

'classes' @ [80:33] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[ValueParameterDescriptorImpl]

'size' @ [80:41] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'classes' @ [82:13] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[ValueParameterDescriptorImpl]

'LAMBDA_SUPERCLASSES' @ [85:38] ==> private final val LAMBDA_SUPERCLASSES: List<OrdinaryClassLoadingAdapter.ClassBytes> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.Companion[PropertyDescriptorImpl]

'map' @ [85:58] ==> public inline fun <T, R> Iterable<OrdinaryClassLoadingAdapter.ClassBytes>.map(transform: (OrdinaryClassLoadingAdapter.ClassBytes) -> ClassToLoad): List<ClassToLoad> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassBytes
    <R> -> ClassToLoad

'ClassToLoad' @ [86:17] ==> public constructor ClassToLoad(className: String, relativeFileName: String, bytes: ByteArray) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassToLoad[ClassConstructorDescriptorImpl]

'it' @ [86:29] ==> value-parameter it: OrdinaryClassLoadingAdapter.ClassBytes defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:32] ==> public final val name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[PropertyDescriptorImpl]

'it' @ [86:38] ==> value-parameter it: OrdinaryClassLoadingAdapter.ClassBytes defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:41] ==> public final val name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[PropertyDescriptorImpl]

'replace' @ [86:46] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [86:76] ==> value-parameter it: OrdinaryClassLoadingAdapter.ClassBytes defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses.<anonymous>[ValueParameterDescriptorImpl]

'bytes' @ [86:79] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[PropertyDescriptorImpl]

'lambdaSuperclasses' @ [88:13] ==> val lambdaSuperclasses: List<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[LocalVariableDescriptor]

'classes' @ [88:34] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[ValueParameterDescriptorImpl]

'component1' @ [91:15] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassToLoad[SimpleFunctionDescriptorImpl]

'component2' @ [91:26] ==> public final operator fun component2(): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassToLoad[SimpleFunctionDescriptorImpl]

'component3' @ [91:29] ==> public final operator fun component3(): ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassToLoad[SimpleFunctionDescriptorImpl]

'classesToLoad' @ [91:39] ==> val classesToLoad: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[LocalVariableDescriptor]

'changeSuperToMagicAccessor' @ [92:56] ==> public open fun changeSuperToMagicAccessor(bytes: (ByteArray..ByteArray?)): (ByteArray..ByteArray?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.CompilingEvaluatorUtils[JavaMethodDescriptor]

'bytes' @ [92:83] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[LocalVariableDescriptor]

'defineClass' @ [93:13] ==> public final fun defineClass(name: String, bytes: ByteArray, context: EvaluationContextImpl, process: DebugProcessImpl, classLoader: ClassLoaderReference): Unit defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter[SimpleFunctionDescriptorImpl]

'className' @ [93:25] ==> val className: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[LocalVariableDescriptor]

'patchedBytes' @ [93:36] ==> val patchedBytes: (ByteArray..ByteArray?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[LocalVariableDescriptor]

'context' @ [93:50] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[ValueParameterDescriptorImpl]

'process' @ [93:59] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[ValueParameterDescriptorImpl]

'classLoader' @ [93:68] ==> value-parameter classLoader: ClassLoaderReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClasses[ValueParameterDescriptorImpl]

'process' @ [105:22] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'virtualMachineProxy' @ [105:30] ==> public final val DebugProcessImpl.virtualMachineProxy: VirtualMachineProxyImpl[MyPropertyDescriptor]

'classLoader' @ [106:35] ==> value-parameter classLoader: ClassLoaderReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'referenceType' @ [106:47] ==> public abstract fun referenceType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.ClassLoaderReference[JavaMethodDescriptor]

'classLoaderType' @ [107:32] ==> val classLoaderType: ClassType defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'concreteMethodByName' @ [107:48] ==> public abstract fun concreteMethodByName(p0: (String..String?), p1: (String..String?)): (Method..Method?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'vm' @ [108:27] ==> val vm: VirtualMachineProxyImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'mirrorOf' @ [108:30] ==> public open fun mirrorOf(p0: (String..String?)): (StringReference..StringReference?) defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'name' @ [108:39] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'keep' @ [110:29] ==> public open fun keep(p0: (Value..Value?), p1: (EvaluationContext..EvaluationContext?)): Unit defined in com.intellij.debugger.impl.DebuggerUtilsEx[JavaMethodDescriptor]

'nameObj' @ [110:34] ==> val nameObj: (StringReference..StringReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'context' @ [110:43] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'process' @ [112:13] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'invokeMethod' @ [112:21] ==> public open fun invokeMethod(@NotNull p0: EvaluationContext, @NotNull p1: ObjectReference, @NotNull p2: Method, @NotNull p3: (MutableList<out (Value..Value?)>..List<(Value..Value?)>)): (Value..Value?) defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'context' @ [113:21] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'classLoader' @ [113:30] ==> value-parameter classLoader: ClassLoaderReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'defineMethod' @ [113:43] ==> val defineMethod: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'listOf' @ [114:21] ==> public fun <T> listOf(vararg elements: (Value..Value?)): List<(Value..Value?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Value..com.sun.jdi.Value?)

'nameObj' @ [114:28] ==> val nameObj: (StringReference..StringReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'mirrorOfByteArray' @ [114:37] ==> public open fun mirrorOfByteArray(bytes: ByteArray, context: EvaluationContextImpl, process: DebugProcessImpl): ArrayReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter[SimpleFunctionDescriptorImpl]

'bytes' @ [114:55] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'context' @ [114:62] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'process' @ [114:71] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'vm' @ [114:81] ==> val vm: VirtualMachineProxyImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'mirrorOf' @ [114:84] ==> public open fun mirrorOf(p0: Int): (IntegerValue..IntegerValue?) defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'vm' @ [114:97] ==> val vm: VirtualMachineProxyImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'mirrorOf' @ [114:100] ==> public open fun mirrorOf(p0: Int): (IntegerValue..IntegerValue?) defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'bytes' @ [114:109] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'size' @ [114:115] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'EvaluateException' @ [117:19] ==> public constructor EvaluateException(p0: (String..String?), p1: (Throwable..Throwable?)) defined in com.intellij.debugger.engine.evaluation.EvaluateException[JavaClassConstructorDescriptor]

'name' @ [117:58] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[ValueParameterDescriptorImpl]

'e' @ [117:76] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'e' @ [117:80] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.defineClass[LocalVariableDescriptor]

'lazy' @ [123:33] ==> public fun <T> lazy(initializer: () -> ByteArray): Lazy<ByteArray> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'this' @ [124:31] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[LazyClassReceiverParameterDescriptor]

'java' @ [124:43] ==> public val <T> KClass<out OrdinaryClassLoadingAdapter.ClassBytes>.java: Class<out OrdinaryClassLoadingAdapter.ClassBytes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassBytes

'classLoader' @ [124:48] ==> public final val <T : (Any..Any?)> Class<out OrdinaryClassLoadingAdapter.ClassBytes>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassBytes

'getResourceAsStream' @ [124:60] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'name' @ [124:80] ==> public final val name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[PropertyDescriptorImpl]

'replace' @ [124:85] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'EvaluateException' @ [125:40] ==> public constructor EvaluateException(p0: (String..String?)) defined in com.intellij.debugger.engine.evaluation.EvaluateException[JavaClassConstructorDescriptor]

'name' @ [125:74] ==> public final val name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes[PropertyDescriptorImpl]

'inputStream' @ [127:13] ==> val inputStream: InputStream defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes.bytes.<anonymous>[LocalVariableDescriptor]

'use' @ [127:25] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> ByteArray): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> ByteArray

'it' @ [128:17] ==> value-parameter it: InputStream defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter.ClassBytes.bytes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [128:20] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

