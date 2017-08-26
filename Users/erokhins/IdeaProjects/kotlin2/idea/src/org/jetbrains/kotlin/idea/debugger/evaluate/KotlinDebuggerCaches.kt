'getManager' @ [59:58] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [59:69] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.<init>[ValueParameterDescriptorImpl]

'createCachedValue' @ [59:78] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)>?, p1: Boolean): CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.util.containers.MultiMap<kotlin.String, org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor>..com.intellij.util.containers.MultiMap<kotlin.String, org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor>?)

'Result' @ [61:37] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MultiMap<String, CompiledDataDescriptor>

'create' @ [62:34] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(String..String?), (KotlinDebuggerCaches.CompiledDataDescriptor..KotlinDebuggerCaches.CompiledDataDescriptor?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor..org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor?)

'MODIFICATION_COUNT' @ [62:67] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'getManager' @ [65:56] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [65:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.<init>[ValueParameterDescriptorImpl]

'createCachedValue' @ [65:76] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?)>?, p1: Boolean): CachedValue<(MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<com.intellij.psi.PsiElement, kotlin.collections.List<kotlin.String>>..kotlin.collections.MutableMap<com.intellij.psi.PsiElement, kotlin.collections.List<kotlin.String>>?)

'Result' @ [67:37] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: MutableMap<PsiElement, List<String>>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<PsiElement, List<String>>

'ConcurrentHashMap' @ [68:25] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> List<String>

'MODIFICATION_COUNT' @ [69:48] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'getManager' @ [72:57] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [72:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.<init>[ValueParameterDescriptorImpl]

'createCachedValue' @ [72:77] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)>?, p1: Boolean): CachedValue<(MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<com.intellij.psi.PsiElement, org.jetbrains.kotlin.codegen.state.KotlinTypeMapper>..kotlin.collections.MutableMap<com.intellij.psi.PsiElement, org.jetbrains.kotlin.codegen.state.KotlinTypeMapper>?)

'Result' @ [74:37] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: MutableMap<PsiElement, KotlinTypeMapper>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<PsiElement, KotlinTypeMapper>

'ConcurrentHashMap' @ [75:25] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> KotlinTypeMapper

'MODIFICATION_COUNT' @ [76:48] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'getManager' @ [79:54] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [79:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.<init>[ValueParameterDescriptorImpl]

'createCachedValue' @ [79:74] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(WeakBytecodeDebugInfoStorage..WeakBytecodeDebugInfoStorage?)>?, p1: Boolean): CachedValue<(WeakBytecodeDebugInfoStorage..WeakBytecodeDebugInfoStorage?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.debugger.WeakBytecodeDebugInfoStorage..org.jetbrains.kotlin.idea.debugger.WeakBytecodeDebugInfoStorage?)

'Result' @ [81:37] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: WeakBytecodeDebugInfoStorage?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WeakBytecodeDebugInfoStorage

'WeakBytecodeDebugInfoStorage' @ [82:25] ==> public constructor WeakBytecodeDebugInfoStorage() defined in org.jetbrains.kotlin.idea.debugger.WeakBytecodeDebugInfoStorage[ClassConstructorDescriptorImpl]

'MODIFICATION_COUNT' @ [83:48] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'!!' @ [87:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Logger?): Logger[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Logger

'getLogger' @ [87:34] ==> public open fun getLogger(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Logger..Logger?) defined in org.apache.log4j.Logger[JavaMethodDescriptor]

'KotlinDebuggerCaches' @ [87:44] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'java' @ [87:72] ==> public val <T> KClass<KotlinDebuggerCaches>.java: Class<KotlinDebuggerCaches> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinDebuggerCaches

'!!' @ [89:45] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinDebuggerCaches?): KotlinDebuggerCaches[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinDebuggerCaches

'getService' @ [89:60] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinDebuggerCaches..KotlinDebuggerCaches?)>): (KotlinDebuggerCaches..KotlinDebuggerCaches?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches..org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches?)

'project' @ [89:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getInstance[ValueParameterDescriptorImpl]

'KotlinDebuggerCaches' @ [89:80] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'java' @ [89:108] ==> public val <T> KClass<KotlinDebuggerCaches>.java: Class<KotlinDebuggerCaches> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinDebuggerCaches

'getInstance' @ [97:43] ==> public final fun getInstance(project: Project): KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'codeFragment' @ [97:55] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'project' @ [97:68] ==> public final val KtCodeFragment.project: Project[MyPropertyDescriptor]

'codeFragment' @ [99:27] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'importsToString' @ [99:40] ==> public open fun importsToString(): String defined in org.jetbrains.kotlin.psi.KtCodeFragment[DeserializedSimpleFunctionDescriptor]

'codeFragment' @ [99:62] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'text' @ [99:75] ==> public final val KtCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'synchronized' @ [101:26] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Collection<KotlinDebuggerCaches.CompiledDataDescriptor>): Collection<KotlinDebuggerCaches.CompiledDataDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Collection<CompiledDataDescriptor>

'evaluateExpressionCache' @ [101:75] ==> val evaluateExpressionCache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'cachedCompiledData' @ [101:99] ==> private final val cachedCompiledData: CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'evaluateExpressionCache' @ [102:29] ==> val evaluateExpressionCache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'cachedCompiledData' @ [102:53] ==> private final val cachedCompiledData: CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'value' @ [102:72] ==> public final val <T : (Any..Any?)> CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)>.value: (MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.util.containers.MultiMap<kotlin.String, org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor>..com.intellij.util.containers.MultiMap<kotlin.String, org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor>?)

'cache' @ [104:17] ==> val cache: MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData.<anonymous>[LocalVariableDescriptor]

'text' @ [104:23] ==> val text: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'cached' @ [107:26] ==> val cached: Collection<KotlinDebuggerCaches.CompiledDataDescriptor> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'firstOrNull' @ [107:33] ==> public inline fun <T> Iterable<KotlinDebuggerCaches.CompiledDataDescriptor>.firstOrNull(predicate: (KotlinDebuggerCaches.CompiledDataDescriptor) -> Boolean): KotlinDebuggerCaches.CompiledDataDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompiledDataDescriptor

'it' @ [108:17] ==> value-parameter it: KotlinDebuggerCaches.CompiledDataDescriptor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData.<anonymous>[ValueParameterDescriptorImpl]

'sourcePosition' @ [108:20] ==> public final val sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor[PropertyDescriptorImpl]

'sourcePosition' @ [108:38] ==> value-parameter sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'evaluateExpressionCache' @ [108:56] ==> val evaluateExpressionCache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'canBeEvaluatedInThisContext' @ [108:80] ==> private final fun canBeEvaluatedInThisContext(compiledData: KotlinDebuggerCaches.CompiledDataDescriptor, context: EvaluationContextImpl): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[SimpleFunctionDescriptorImpl]

'it' @ [108:108] ==> value-parameter it: KotlinDebuggerCaches.CompiledDataDescriptor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData.<anonymous>[ValueParameterDescriptorImpl]

'evaluationContext' @ [108:112] ==> value-parameter evaluationContext: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'answer' @ [110:17] ==> val answer: KotlinDebuggerCaches.CompiledDataDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'answer' @ [111:24] ==> val answer: KotlinDebuggerCaches.CompiledDataDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'invoke' @ [114:35] ==> public abstract operator fun invoke(p1: KtCodeFragment, p2: SourcePosition): KotlinDebuggerCaches.CompiledDataDescriptor defined in kotlin.Function2[FunctionInvokeDescriptor]

'codeFragment' @ [114:42] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'sourcePosition' @ [114:56] ==> value-parameter sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'LOG' @ [115:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[PropertyDescriptorImpl]

'debug' @ [115:17] ==> public open fun debug(p0: (Any..Any?)): Unit defined in org.apache.log4j.Logger[JavaMethodDescriptor]

'codeFragment' @ [115:47] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[ValueParameterDescriptorImpl]

'text' @ [115:60] ==> public final val KtCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'synchronized' @ [117:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'evaluateExpressionCache' @ [117:26] ==> val evaluateExpressionCache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'cachedCompiledData' @ [117:50] ==> private final val cachedCompiledData: CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'evaluateExpressionCache' @ [118:17] ==> val evaluateExpressionCache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'cachedCompiledData' @ [118:41] ==> private final val cachedCompiledData: CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'value' @ [118:60] ==> public final val <T : (Any..Any?)> CachedValue<(MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)>.value: (MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>..MultiMap<String, KotlinDebuggerCaches.CompiledDataDescriptor>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.util.containers.MultiMap<kotlin.String, org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor>..com.intellij.util.containers.MultiMap<kotlin.String, org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor>?)

'putValue' @ [118:66] ==> public open fun putValue(@Nullable p0: String?, p1: (KotlinDebuggerCaches.CompiledDataDescriptor..KotlinDebuggerCaches.CompiledDataDescriptor?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'text' @ [118:75] ==> val text: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'newCompiledData' @ [118:81] ==> val newCompiledData: KotlinDebuggerCaches.CompiledDataDescriptor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'newCompiledData' @ [121:20] ==> val newCompiledData: KotlinDebuggerCaches.CompiledDataDescriptor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateCompiledData[LocalVariableDescriptor]

'psiElement' @ [125:17] ==> value-parameter psiElement: T? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[ValueParameterDescriptorImpl]

'emptyList' @ [125:56] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'getInstance' @ [127:25] ==> public final fun getInstance(project: Project): KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'runReadAction' @ [127:37] ==> public fun <T> runReadAction(action: () -> Project): Project defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project

'psiElement' @ [127:53] ==> value-parameter psiElement: T? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[ValueParameterDescriptorImpl]

'project' @ [127:64] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'cache' @ [129:35] ==> val cache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'cachedClassNames' @ [129:41] ==> private final val cachedClassNames: CachedValue<(MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'value' @ [129:58] ==> public final val <T : (Any..Any?)> CachedValue<(MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?)>.value: (MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<com.intellij.psi.PsiElement, kotlin.collections.List<kotlin.String>>..kotlin.collections.MutableMap<com.intellij.psi.PsiElement, kotlin.collections.List<kotlin.String>>?)

'classNamesCache' @ [131:31] ==> val classNamesCache: (MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'psiElement' @ [131:47] ==> value-parameter psiElement: T? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[ValueParameterDescriptorImpl]

'cachedValue' @ [132:17] ==> val cachedValue: List<String>? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'cachedValue' @ [132:45] ==> val cachedValue: List<String>? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'invoke' @ [134:38] ==> public abstract operator fun invoke(p1: T): KotlinDebuggerCaches.ComputedClassNames defined in kotlin.Function1[FunctionInvokeDescriptor]

'psiElement' @ [134:45] ==> value-parameter psiElement: T? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[ValueParameterDescriptorImpl]

'computedClassNames' @ [136:17] ==> val computedClassNames: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'shouldBeCached' @ [136:36] ==> public final val shouldBeCached: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'classNamesCache' @ [137:17] ==> val classNamesCache: (MutableMap<PsiElement, List<String>>..MutableMap<PsiElement, List<String>>?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'psiElement' @ [137:33] ==> value-parameter psiElement: T? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[ValueParameterDescriptorImpl]

'computedClassNames' @ [137:47] ==> val computedClassNames: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'classNames' @ [137:66] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'computedClassNames' @ [140:20] ==> val computedClassNames: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrComputeClassNames[LocalVariableDescriptor]

'classNames' @ [140:39] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'getInstance' @ [144:25] ==> public final fun getInstance(project: Project): KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'runReadAction' @ [144:37] ==> public fun <T> runReadAction(action: () -> Project): Project defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project

'psiElement' @ [144:53] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[ValueParameterDescriptorImpl]

'project' @ [144:64] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'runReadAction' @ [146:24] ==> public fun <T> runReadAction(action: () -> KtFile): KtFile defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'psiElement' @ [146:40] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[ValueParameterDescriptorImpl]

'containingFile' @ [146:51] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'!=' @ [147:31] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.roots.OrderEntry[DeserializedSimpleFunctionDescriptor]

'findLibraryEntry' @ [147:43] ==> @Nullable public open fun findLibraryEntry(p0: (VirtualFile..VirtualFile?), p1: (Project..Project?)): OrderEntry? defined in com.intellij.openapi.roots.libraries.LibraryUtil[JavaMethodDescriptor]

'file' @ [147:60] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'virtualFile' @ [147:65] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [147:78] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'project' @ [147:83] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'if (!isInLibrary) file else psiElement' @ [149:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'!' @ [149:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInLibrary' @ [149:28] ==> val isInLibrary: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'file' @ [149:41] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'psiElement' @ [149:51] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[ValueParameterDescriptorImpl]

'cache' @ [151:36] ==> val cache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'cachedTypeMappers' @ [151:42] ==> private final val cachedTypeMappers: CachedValue<(MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'value' @ [151:60] ==> public final val <T : (Any..Any?)> CachedValue<(MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)>.value: (MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<com.intellij.psi.PsiElement, org.jetbrains.kotlin.codegen.state.KotlinTypeMapper>..kotlin.collections.MutableMap<com.intellij.psi.PsiElement, org.jetbrains.kotlin.codegen.state.KotlinTypeMapper>?)

'typeMappersCache' @ [153:31] ==> val typeMappersCache: (MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'key' @ [153:48] ==> val key: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'cachedValue' @ [154:17] ==> val cachedValue: KotlinTypeMapper? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'cachedValue' @ [154:45] ==> val cachedValue: KotlinTypeMapper? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'if (!isInLibrary) {
                createTypeMapperForSourceFile(file)
            }
            else {
                val element = getElementToCreateTypeMapperForLibraryFile(psiElement)
                createTypeMapperForLibraryFile(element, file)
            }' @ [156:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinTypeMapper, elseBranch: KotlinTypeMapper): KotlinTypeMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinTypeMapper

'!' @ [156:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInLibrary' @ [156:33] ==> val isInLibrary: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'createTypeMapperForSourceFile' @ [157:17] ==> private final fun createTypeMapperForSourceFile(file: KtFile): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'file' @ [157:47] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'getElementToCreateTypeMapperForLibraryFile' @ [160:31] ==> private final fun getElementToCreateTypeMapperForLibraryFile(element: PsiElement?): KtElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'psiElement' @ [160:74] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[ValueParameterDescriptorImpl]

'createTypeMapperForLibraryFile' @ [161:17] ==> private final fun createTypeMapperForLibraryFile(element: KtElement, file: KtFile): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'element' @ [161:48] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'file' @ [161:57] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'typeMappersCache' @ [164:13] ==> val typeMappersCache: (MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'key' @ [164:30] ==> val key: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'newValue' @ [164:37] ==> val newValue: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'newValue' @ [165:20] ==> val newValue: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrCreateTypeMapper[LocalVariableDescriptor]

'getInstance' @ [172:25] ==> public final fun getInstance(project: Project): KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'project' @ [172:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrReadDebugInfoFromBytecode[ValueParameterDescriptorImpl]

'cache' @ [173:20] ==> val cache: KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrReadDebugInfoFromBytecode[LocalVariableDescriptor]

'debugInfoCache' @ [173:26] ==> private final val debugInfoCache: CachedValue<(WeakBytecodeDebugInfoStorage..WeakBytecodeDebugInfoStorage?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'value' @ [173:41] ==> public final val <T : (Any..Any?)> CachedValue<(WeakBytecodeDebugInfoStorage..WeakBytecodeDebugInfoStorage?)>.value: (WeakBytecodeDebugInfoStorage..WeakBytecodeDebugInfoStorage?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.debugger.WeakBytecodeDebugInfoStorage..org.jetbrains.kotlin.idea.debugger.WeakBytecodeDebugInfoStorage?)

'BinaryCacheKey' @ [173:47] ==> public constructor BinaryCacheKey(project: Project, jvmName: JvmClassName, file: VirtualFile) defined in org.jetbrains.kotlin.idea.debugger.BinaryCacheKey[ClassConstructorDescriptorImpl]

'project' @ [173:62] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrReadDebugInfoFromBytecode[ValueParameterDescriptorImpl]

'jvmName' @ [173:71] ==> value-parameter jvmName: JvmClassName defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrReadDebugInfoFromBytecode[ValueParameterDescriptorImpl]

'file' @ [173:80] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getOrReadDebugInfoFromBytecode[ValueParameterDescriptorImpl]

'runReadAction' @ [177:17] ==> public fun <T> runReadAction(action: () -> KtElement): KtElement defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [177:33] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getElementToCreateTypeMapperForLibraryFile[ValueParameterDescriptorImpl]

'!!' @ [177:58] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtElement?): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtElement

'getParentOfType' @ [177:70] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtElement..KtElement?)>): KtElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'element' @ [177:86] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.getElementToCreateTypeMapperForLibraryFile[ValueParameterDescriptorImpl]

'java' @ [177:112] ==> public val <T> KClass<KtElement>.java: Class<KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'runInReadActionWithWriteActionPriorityWithPCE' @ [180:17] ==> public fun <T : Any> runInReadActionWithWriteActionPriorityWithPCE(f: () -> KotlinTypeMapper): KotlinTypeMapper defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinTypeMapper

'createTypeMapper' @ [181:21] ==> private final fun createTypeMapper(file: KtFile, analysisResult: AnalysisResult): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'file' @ [181:38] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapperForLibraryFile[ValueParameterDescriptorImpl]

'element' @ [181:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapperForLibraryFile[ValueParameterDescriptorImpl]

'analyzeAndGetResult' @ [181:52] ==> public fun KtElement.analyzeAndGetResult(): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'runInReadActionWithWriteActionPriorityWithPCE' @ [185:17] ==> public fun <T : Any> runInReadActionWithWriteActionPriorityWithPCE(f: () -> KotlinTypeMapper): KotlinTypeMapper defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinTypeMapper

'createTypeMapper' @ [186:21] ==> private final fun createTypeMapper(file: KtFile, analysisResult: AnalysisResult): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'file' @ [186:38] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapperForSourceFile[ValueParameterDescriptorImpl]

'file' @ [186:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapperForSourceFile[ValueParameterDescriptorImpl]

'analyzeFullyAndGetResult' @ [186:49] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'apply' @ [186:76] ==> @InlineOnly public inline fun <T> AnalysisResult.apply(block: AnalysisResult.() -> Unit): AnalysisResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnalysisResult

'AnalysisResult' @ [186:82] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'throwIfError' @ [186:98] ==> public final fun throwIfError(): Unit defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'GenerationState' @ [190:25] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'file' @ [191:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapper[ValueParameterDescriptorImpl]

'project' @ [191:26] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'THROW_EXCEPTION' @ [192:43] ==> @NotNull public final var THROW_EXCEPTION: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.ClassBuilderFactories[JavaPropertyDescriptor]

'analysisResult' @ [193:21] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapper[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [193:36] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [194:21] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapper[ValueParameterDescriptorImpl]

'bindingContext' @ [194:36] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'listOf' @ [195:21] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [195:28] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapper[ValueParameterDescriptorImpl]

'EMPTY' @ [196:43] ==> public final var EMPTY: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaPropertyDescriptor]

'state' @ [198:13] ==> val state: GenerationState defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapper[LocalVariableDescriptor]

'beforeCompile' @ [198:19] ==> public final fun beforeCompile(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'state' @ [199:20] ==> val state: GenerationState defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.createTypeMapper[LocalVariableDescriptor]

'typeMapper' @ [199:26] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'TestOnly' @ [202:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'getInstance' @ [203:13] ==> public final fun getInstance(project: Project): KotlinDebuggerCaches defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'file' @ [203:25] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.addTypeMapper[ValueParameterDescriptorImpl]

'project' @ [203:30] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'cachedTypeMappers' @ [203:39] ==> private final val cachedTypeMappers: CachedValue<(MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[PropertyDescriptorImpl]

'value' @ [203:57] ==> public final val <T : (Any..Any?)> CachedValue<(MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)>.value: (MutableMap<PsiElement, KotlinTypeMapper>..MutableMap<PsiElement, KotlinTypeMapper>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<com.intellij.psi.PsiElement, org.jetbrains.kotlin.codegen.state.KotlinTypeMapper>..kotlin.collections.MutableMap<com.intellij.psi.PsiElement, org.jetbrains.kotlin.codegen.state.KotlinTypeMapper>?)

'file' @ [203:63] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.addTypeMapper[ValueParameterDescriptorImpl]

'typeMapper' @ [203:71] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion.addTypeMapper[ValueParameterDescriptorImpl]

'FrameVisitor' @ [208:28] ==> public constructor FrameVisitor(context: EvaluationContextImpl) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[ClassConstructorDescriptorImpl]

'context' @ [208:41] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext[ValueParameterDescriptorImpl]

'compiledData' @ [209:16] ==> value-parameter compiledData: KotlinDebuggerCaches.CompiledDataDescriptor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext[ValueParameterDescriptorImpl]

'parameters' @ [209:29] ==> public final val parameters: KotlinDebuggerCaches.ParametersDescriptor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.CompiledDataDescriptor[PropertyDescriptorImpl]

'all' @ [209:40] ==> public inline fun <T> Iterable<KotlinDebuggerCaches.Parameter>.all(predicate: (KotlinDebuggerCaches.Parameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'component1' @ [210:18] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Parameter[SimpleFunctionDescriptorImpl]

'component2' @ [210:24] ==> public final operator fun component2(): KotlinType defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Parameter[SimpleFunctionDescriptorImpl]

'p' @ [210:35] ==> value-parameter p: KotlinDebuggerCaches.Parameter defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[ValueParameterDescriptorImpl]

'frameVisitor' @ [211:25] ==> val frameVisitor: FrameVisitor defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext[LocalVariableDescriptor]

'findValue' @ [211:38] ==> public final fun findValue(name: String, asmType: Type?, checkType: Boolean, failIfNotFound: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [211:48] ==> val name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'value' @ [212:17] ==> val value: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'value' @ [214:34] ==> val value: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'asmType' @ [214:40] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'getClassDescriptor' @ [214:48] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'context' @ [214:67] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext[ValueParameterDescriptorImpl]

'debugProcess' @ [214:75] ==> public final val EvaluationContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'searchScope' @ [214:88] ==> public final val DebugProcessImpl.searchScope: GlobalSearchScope[MyPropertyDescriptor]

'jetType' @ [215:40] ==> val jetType: KotlinType defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'constructor' @ [215:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [215:60] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'thisDescriptor' @ [216:24] ==> val thisDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'superClassDescriptor' @ [216:50] ==> val superClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'runReadAction' @ [216:82] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'isSubclass' @ [216:114] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'thisDescriptor' @ [216:125] ==> val thisDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'superClassDescriptor' @ [216:141] ==> val superClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.canBeEvaluatedInThisContext.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [227:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Parameter

'list' @ [230:13] ==> private final val list: ArrayList<KotlinDebuggerCaches.Parameter> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ParametersDescriptor[PropertyDescriptorImpl]

'add' @ [230:18] ==> public open fun add(element: KotlinDebuggerCaches.Parameter): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Parameter' @ [230:22] ==> public constructor Parameter(callText: String, type: KotlinType, value: Value? = ...) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Parameter[ClassConstructorDescriptorImpl]

'name' @ [230:32] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ParametersDescriptor.add[ValueParameterDescriptorImpl]

'jetType' @ [230:38] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ParametersDescriptor.add[ValueParameterDescriptorImpl]

'value' @ [230:47] ==> value-parameter value: Value? = ... defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ParametersDescriptor.add[ValueParameterDescriptorImpl]

'list' @ [233:35] ==> private final val list: ArrayList<KotlinDebuggerCaches.Parameter> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ParametersDescriptor[PropertyDescriptorImpl]

'iterator' @ [233:40] ==> public open fun iterator(): MutableIterator<KotlinDebuggerCaches.Parameter> defined in java.util.ArrayList[JavaMethodDescriptor]

'ComputedClassNames' @ [240:25] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[FakeCallableDescriptorForObject]

'Cached' @ [240:44] ==> public final fun Cached(classNames: List<String>): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[SimpleFunctionDescriptorImpl]

'emptyList' @ [240:51] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ComputedClassNames' @ [242:52] ==> public constructor ComputedClassNames(classNames: List<String>, shouldBeCached: Boolean) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[ClassConstructorDescriptorImpl]

'classNames' @ [242:71] ==> value-parameter classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion.Cached[ValueParameterDescriptorImpl]

'ComputedClassNames' @ [243:45] ==> public constructor ComputedClassNames(classNames: List<String>, shouldBeCached: Boolean) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[ClassConstructorDescriptorImpl]

'singletonList' @ [243:76] ==> public open fun <T : (Any..Any?)> singletonList(p0: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'className' @ [243:90] ==> value-parameter className: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion.Cached[ValueParameterDescriptorImpl]

'ComputedClassNames' @ [245:55] ==> public constructor ComputedClassNames(classNames: List<String>, shouldBeCached: Boolean) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[ClassConstructorDescriptorImpl]

'classNames' @ [245:74] ==> value-parameter classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion.NonCached[ValueParameterDescriptorImpl]

'ComputedClassNames' @ [248:26] ==> public constructor ComputedClassNames(classNames: List<String>, shouldBeCached: Boolean) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[ClassConstructorDescriptorImpl]

'classNames' @ [248:45] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'distinct' @ [248:56] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'shouldBeCached' @ [248:68] ==> public final val shouldBeCached: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'ComputedClassNames' @ [250:56] ==> public constructor ComputedClassNames(classNames: List<String>, shouldBeCached: Boolean) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[ClassConstructorDescriptorImpl]

'classNames' @ [251:17] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'other' @ [251:30] ==> value-parameter other: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.plus[ValueParameterDescriptorImpl]

'classNames' @ [251:36] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'shouldBeCached' @ [251:48] ==> public final val shouldBeCached: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'other' @ [251:66] ==> value-parameter other: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.plus[ValueParameterDescriptorImpl]

'shouldBeCached' @ [251:72] ==> public final val shouldBeCached: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'if (this == null) emptyList() else listOf(this)' @ [255:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'this' @ [255:36] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.toList[ReceiverParameterDescriptorImpl]

'emptyList' @ [255:50] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [255:67] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [255:74] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.toList[ReceiverParameterDescriptorImpl]

