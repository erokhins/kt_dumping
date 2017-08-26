'AndroidDexer' @ [26:16] ==> public companion object : ProjectExtensionDescriptor<AndroidDexer> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AndroidDexer[FakeCallableDescriptorForObject]

'getInstances' @ [26:29] ==> public final fun getInstances(project: Project): List<AndroidDexer> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AndroidDexer.Companion[DeserializedSimpleFunctionDescriptor]

'context' @ [26:42] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.dex[ValueParameterDescriptorImpl]

'project' @ [26:50] ==> public final val EvaluationContextImpl.project: (Project..Project?)[MyPropertyDescriptor]

'single' @ [26:59] ==> public fun <T> List<AndroidDexer>.single(): AndroidDexer defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidDexer

'dex' @ [26:68] ==> public abstract fun dex(classes: Collection<ClassToLoad>): ByteArray? defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AndroidDexer[SimpleFunctionDescriptorImpl]

'classes' @ [26:72] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.dex[ValueParameterDescriptorImpl]

'process' @ [30:31] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[ValueParameterDescriptorImpl]

'findClass' @ [30:39] ==> public open fun findClass(p0: (EvaluationContext..EvaluationContext?), p1: (String..String?), p2: (ClassLoaderReference..ClassLoaderReference?)): (ReferenceType..ReferenceType?) defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'context' @ [30:49] ==> value-parameter context: EvaluationContext defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[ValueParameterDescriptorImpl]

'context' @ [30:81] ==> value-parameter context: EvaluationContext defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[ValueParameterDescriptorImpl]

'classLoader' @ [30:89] ==> public final val EvaluationContext.classLoader: ClassLoaderReference?[MyPropertyDescriptor]

'byteBufferClass' @ [31:26] ==> val byteBufferClass: ClassType defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[LocalVariableDescriptor]

'concreteMethodByName' @ [31:42] ==> public abstract fun concreteMethodByName(p0: (String..String?), p1: (String..String?)): (Method..Method?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'error' @ [32:29] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'process' @ [34:16] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[ValueParameterDescriptorImpl]

'invokeMethod' @ [34:24] ==> public open fun invokeMethod(p0: (EvaluationContext..EvaluationContext?), p1: (ClassType..ClassType?), p2: (Method..Method?), p3: (MutableList<out (Value..Value?)>..List<(Value..Value?)>?)): (Value..Value?) defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'context' @ [34:37] ==> value-parameter context: EvaluationContext defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[ValueParameterDescriptorImpl]

'byteBufferClass' @ [34:46] ==> val byteBufferClass: ClassType defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[LocalVariableDescriptor]

'wrapMethod' @ [34:63] ==> val wrapMethod: Method defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[LocalVariableDescriptor]

'listOf' @ [34:75] ==> public fun <T> listOf(element: ArrayReference): List<ArrayReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayReference

'bytes' @ [34:82] ==> value-parameter bytes: ArrayReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.wrapToByteBuffer[ValueParameterDescriptorImpl]

'loadClass' @ [43:13] ==> public open fun loadClass(p0: (EvaluationContextImpl..EvaluationContextImpl?), p1: (String..String?), p2: (ClassLoaderReference..ClassLoaderReference?)): (ReferenceType..ReferenceType?) defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'context' @ [43:23] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.tryLoadClass[ValueParameterDescriptorImpl]

'fqName' @ [43:32] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.tryLoadClass[ValueParameterDescriptorImpl]

'classLoader' @ [43:40] ==> value-parameter classLoader: ClassLoaderReference? defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AbstractAndroidClassLoadingAdapter.tryLoadClass[ValueParameterDescriptorImpl]

