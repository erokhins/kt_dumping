'getManager' @ [32:56] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [32:67] ==> public final val project: Project defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[PropertyDescriptorImpl]

'createCachedValue' @ [32:76] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(Any..Any?)>?, p1: Boolean): CachedValue<(Any..Any?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'doGetAndroidDexFile' @ [33:26] ==> private final fun doGetAndroidDexFile(): File? defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[SimpleFunctionDescriptorImpl]

'let' @ [33:49] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> (Any..Any?)): (Any..Any?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.Any..kotlin.Any?)

'AndroidDexWrapper' @ [34:41] ==> public constructor AndroidDexWrapper() defined in org.jetbrains.kotlin.android.debugger.AndroidDexWrapper[ClassConstructorDescriptorImpl]

'java' @ [34:66] ==> public val <T> KClass<AndroidDexWrapper>.java: Class<AndroidDexWrapper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AndroidDexWrapper

'canonicalName' @ [34:71] ==> public final val <T : (Any..Any?)> Class<AndroidDexWrapper>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidDexWrapper

'this' @ [35:30] ==> <this> defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[LazyClassReceiverParameterDescriptor]

'javaClass' @ [35:35] ==> public val <T : Any> AndroidDexerImpl.javaClass: Class<AndroidDexerImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> AndroidDexerImpl

'classLoader' @ [35:45] ==> public final val <T : (Any..Any?)> Class<AndroidDexerImpl>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidDexerImpl

'getResource' @ [35:57] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'androidDexWrapperName' @ [36:21] ==> val androidDexWrapperName: (String..String?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replace' @ [36:43] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'readBytes' @ [36:73] ==> public fun URL.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'URLClassLoader' @ [38:43] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [38:58] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'dexJarFile' @ [38:66] ==> value-parameter dexJarFile: File defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [38:77] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [38:85] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'this' @ [38:95] ==> <this> defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[LazyClassReceiverParameterDescriptor]

'java' @ [38:107] ==> public val <T> KClass<out AndroidDexerImpl>.java: Class<out AndroidDexerImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out AndroidDexerImpl)

'classLoader' @ [38:112] ==> public final val <T : (Any..Any?)> Class<out AndroidDexerImpl>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out AndroidDexerImpl)

'defineClass' @ [40:21] ==> protected/*protected and package*/ final fun defineClass(p0: (String..String?), p1: (ByteArray..ByteArray?), p2: Int, p3: Int, p4: (ProtectionDomain..ProtectionDomain?)): (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>.<no name provided>[JavaMethodDescriptor]

'androidDexWrapperName' @ [40:33] ==> val androidDexWrapperName: (String..String?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[LocalVariableDescriptor]

'classBytes' @ [40:56] ==> val classBytes: ByteArray defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[LocalVariableDescriptor]

'classBytes' @ [40:71] ==> val classBytes: ByteArray defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [40:82] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'forName' @ [44:19] ==> @CallerSensitive public open fun forName(p0: (String..String?), p1: Boolean, p2: (ClassLoader..ClassLoader?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'androidDexWrapperName' @ [44:27] ==> val androidDexWrapperName: (String..String?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[LocalVariableDescriptor]

'dexClassLoader' @ [44:56] ==> val dexClassLoader: <no name provided> defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newInstance' @ [44:72] ==> @CallerSensitive public open fun newInstance(): (Any..Any?) defined in java.lang.Class[JavaMethodDescriptor]

'createSingleDependency' @ [47:36] ==> public open fun <T : (Any..Any?)> createSingleDependency(@Nullable p0: Any?, @NotNull p1: Any): (CachedValueProvider.Result<(Any..Any?)>..CachedValueProvider.Result<(Any..Any?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'dexWrapper' @ [47:59] ==> val dexWrapper: Any? defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.cachedDexWrapper.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [47:102] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [47:114] ==> public final val project: Project defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[PropertyDescriptorImpl]

'cachedDexWrapper' @ [51:26] ==> private final val cachedDexWrapper: CachedValue<(Any..Any?)> defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[PropertyDescriptorImpl]

'value' @ [51:43] ==> public final val <T : (Any..Any?)> CachedValue<(Any..Any?)>.value: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'dexWrapper' @ [52:25] ==> val dexWrapper: (Any..Any?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.dex[LocalVariableDescriptor]

'java' @ [52:43] ==> public val <T> KClass<out (Any..Any?)>.java: Class<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (kotlin.Any..kotlin.Any?))

'methods' @ [52:48] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (kotlin.Any..kotlin.Any?))

'firstOrNull' @ [52:56] ==> public inline fun <T> Array<out (Method..Method?)>.firstOrNull(predicate: ((Method..Method?)) -> Boolean): Method? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [52:70] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.dex.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [52:73] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'dexMethod' @ [53:16] ==> val dexMethod: Method defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.dex[LocalVariableDescriptor]

'invoke' @ [53:26] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'dexWrapper' @ [53:33] ==> val dexWrapper: (Any..Any?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.dex[LocalVariableDescriptor]

'classes' @ [53:45] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.dex[ValueParameterDescriptorImpl]

'iterator' @ [57:24] ==> public final operator fun iterator(): Iterator<(Module..Module?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [57:38] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [57:50] ==> public final val project: Project defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl[PropertyDescriptorImpl]

'modules' @ [57:59] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'?:' @ [58:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: AndroidFacet?, right: AndroidFacet): AndroidFacet[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> AndroidFacet

'getInstance' @ [58:45] ==> @Nullable public open fun getInstance(@NotNull p0: Module): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'module' @ [58:57] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

'androidFacet' @ [59:27] ==> val androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

'sdkData' @ [59:40] ==> public final val AndroidFacet.sdkData: AndroidSdkData?[MyPropertyDescriptor]

'sdkData' @ [60:35] ==> val sdkData: AndroidSdkData defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

'getLatestBuildTool' @ [60:43] ==> @Nullable public open fun getLatestBuildTool(p0: Boolean): BuildToolInfo? defined in org.jetbrains.android.sdk.AndroidSdkData[JavaMethodDescriptor]

'sdkData' @ [61:38] ==> val sdkData: AndroidSdkData defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

'getLatestBuildTool' @ [61:46] ==> @Nullable public open fun getLatestBuildTool(p0: Boolean): BuildToolInfo? defined in org.jetbrains.android.sdk.AndroidSdkData[JavaMethodDescriptor]

'File' @ [64:25] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'latestBuildTool' @ [64:30] ==> val latestBuildTool: BuildToolInfo defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

'location' @ [64:46] ==> public final val BuildToolInfo.location: (File..File?)[MyPropertyDescriptor]

'dxJar' @ [65:17] ==> val dxJar: File defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

'exists' @ [65:23] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dxJar' @ [66:24] ==> val dxJar: File defined in org.jetbrains.kotlin.android.debugger.AndroidDexerImpl.doGetAndroidDexFile[LocalVariableDescriptor]

