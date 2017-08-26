'ConcurrentHashMap' @ [26:104] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> WeakClassLoaderBox
    <V : (Any..Any?)> -> WeakReference<RuntimeModuleData>

'WeakReference' @ [29:43] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (ClassLoader..ClassLoader?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassLoader

'classLoader' @ [29:57] ==> value-parameter classLoader: ClassLoader defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox.<init>[ValueParameterDescriptorImpl]

'identityHashCode' @ [32:40] ==> public open fun identityHashCode(p0: (Any..Any?)): Int defined in java.lang.System[JavaMethodDescriptor]

'classLoader' @ [32:57] ==> value-parameter classLoader: ClassLoader defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox.<init>[ValueParameterDescriptorImpl]

'classLoader' @ [35:44] ==> value-parameter classLoader: ClassLoader defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox.<init>[ValueParameterDescriptorImpl]

'other' @ [38:13] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox.equals[ValueParameterDescriptorImpl]

'ref' @ [38:44] ==> public final val ref: WeakReference<ClassLoader> defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox[PropertyDescriptorImpl]

'get' @ [38:48] ==> public open fun get(): ClassLoader? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'other' @ [38:58] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox.equals[ValueParameterDescriptorImpl]

'ref' @ [38:64] ==> public final val ref: WeakReference<ClassLoader> defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox[PropertyDescriptorImpl]

'get' @ [38:68] ==> public open fun get(): ClassLoader? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'identityHashCode' @ [41:13] ==> public final val identityHashCode: Int defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox[PropertyDescriptorImpl]

'ref' @ [44:13] ==> public final val ref: WeakReference<ClassLoader> defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox[PropertyDescriptorImpl]

'get' @ [44:17] ==> public open fun get(): ClassLoader? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'toString' @ [44:24] ==> public open fun toString(): String defined in java.lang.ClassLoader[DeserializedSimpleFunctionDescriptor]

'this' @ [48:23] ==> <this> defined in kotlin.reflect.jvm.internal.getOrCreateModule[ReceiverParameterDescriptorImpl]

'safeClassLoader' @ [48:28] ==> public val Class<*>.safeClassLoader: ClassLoader defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'WeakClassLoaderBox' @ [50:15] ==> public constructor WeakClassLoaderBox(classLoader: ClassLoader) defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox[ClassConstructorDescriptorImpl]

'classLoader' @ [50:34] ==> val classLoader: ClassLoader defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'moduleByClassLoader' @ [52:18] ==> private val moduleByClassLoader: ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[PropertyDescriptorImpl]

'key' @ [52:38] ==> val key: WeakClassLoaderBox defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'cached' @ [53:9] ==> val cached: WeakReference<RuntimeModuleData>? defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'cached' @ [54:9] ==> val cached: WeakReference<RuntimeModuleData>? defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'get' @ [54:16] ==> public open fun get(): RuntimeModuleData? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'let' @ [54:23] ==> @InlineOnly public inline fun <T, R> RuntimeModuleData.let(block: (RuntimeModuleData) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RuntimeModuleData
    <R> -> Nothing

'it' @ [54:36] ==> value-parameter it: RuntimeModuleData defined in kotlin.reflect.jvm.internal.getOrCreateModule.<anonymous>[ValueParameterDescriptorImpl]

'moduleByClassLoader' @ [55:9] ==> private val moduleByClassLoader: ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[PropertyDescriptorImpl]

'remove' @ [55:29] ==> public abstract fun remove(p0: (Any..Any?), p1: (Any..Any?)): Boolean defined in java.util.concurrent.ConcurrentMap[JavaMethodDescriptor]

'key' @ [55:36] ==> val key: WeakClassLoaderBox defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'cached' @ [55:41] ==> val cached: WeakReference<RuntimeModuleData>? defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'RuntimeModuleData' @ [58:18] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[FakeCallableDescriptorForObject]

'create' @ [58:36] ==> public final fun create(classLoader: ClassLoader): RuntimeModuleData defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData.Companion[SimpleFunctionDescriptorImpl]

'classLoader' @ [58:43] ==> val classLoader: ClassLoader defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'moduleByClassLoader' @ [61:23] ==> private val moduleByClassLoader: ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[PropertyDescriptorImpl]

'putIfAbsent' @ [61:43] ==> public abstract fun putIfAbsent(p0: (WeakClassLoaderBox..WeakClassLoaderBox?), p1: (WeakReference<RuntimeModuleData>..WeakReference<RuntimeModuleData>?)): (WeakReference<RuntimeModuleData>..WeakReference<RuntimeModuleData>?) defined in java.util.concurrent.ConcurrentMap[JavaMethodDescriptor]

'key' @ [61:55] ==> val key: WeakClassLoaderBox defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'WeakReference' @ [61:60] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (RuntimeModuleData..RuntimeModuleData?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RuntimeModuleData

'module' @ [61:74] ==> val module: RuntimeModuleData defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'ref' @ [62:17] ==> val ref: (WeakReference<RuntimeModuleData>..WeakReference<RuntimeModuleData>?) defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'module' @ [62:37] ==> val module: RuntimeModuleData defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'ref' @ [64:26] ==> val ref: (WeakReference<RuntimeModuleData>..WeakReference<RuntimeModuleData>?) defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'get' @ [64:30] ==> public open fun get(): RuntimeModuleData? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'result' @ [65:17] ==> val result: RuntimeModuleData? defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'result' @ [65:40] ==> val result: RuntimeModuleData? defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'moduleByClassLoader' @ [66:13] ==> private val moduleByClassLoader: ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[PropertyDescriptorImpl]

'remove' @ [66:33] ==> public abstract fun remove(p0: (Any..Any?), p1: (Any..Any?)): Boolean defined in java.util.concurrent.ConcurrentMap[JavaMethodDescriptor]

'key' @ [66:40] ==> val key: WeakClassLoaderBox defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'ref' @ [66:45] ==> val ref: (WeakReference<RuntimeModuleData>..WeakReference<RuntimeModuleData>?) defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'key' @ [70:9] ==> val key: WeakClassLoaderBox defined in kotlin.reflect.jvm.internal.getOrCreateModule[LocalVariableDescriptor]

'temporaryStrongRef' @ [70:13] ==> public final var temporaryStrongRef: ClassLoader? defined in kotlin.reflect.jvm.internal.WeakClassLoaderBox[PropertyDescriptorImpl]

'moduleByClassLoader' @ [75:5] ==> private val moduleByClassLoader: ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[PropertyDescriptorImpl]

'clear' @ [75:25] ==> public abstract fun clear(): Unit defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

