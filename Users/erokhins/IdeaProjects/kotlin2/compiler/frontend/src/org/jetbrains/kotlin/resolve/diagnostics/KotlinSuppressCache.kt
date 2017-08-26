'create' @ [42:36] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): ExtensionPointName<(SuppressStringProvider..SuppressStringProvider?)> defined in com.intellij.openapi.extensions.ExtensionPointName[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SuppressStringProvider

'create' @ [51:36] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): ExtensionPointName<(DiagnosticSuppressor..DiagnosticSuppressor?)> defined in com.intellij.openapi.extensions.ExtensionPointName[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DiagnosticSuppressor

'getInstance' @ [56:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'DiagnosticsWithSuppression' @ [56:42] ==> public constructor DiagnosticsWithSuppression(@NotNull context: BindingContext, @NotNull diagnostics: (MutableCollection<(Diagnostic..Diagnostic?)>..Collection<(Diagnostic..Diagnostic?)>)) defined in org.jetbrains.kotlin.resolve.diagnostics.DiagnosticsWithSuppression[JavaClassConstructorDescriptor]

'java' @ [56:76] ==> public val <T> KClass<DiagnosticsWithSuppression>.java: Class<DiagnosticsWithSuppression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DiagnosticsWithSuppression

'ExtensionProvider' @ [58:56] ==> public companion object defined in org.jetbrains.kotlin.util.ExtensionProvider[FakeCallableDescriptorForObject]

'create' @ [58:74] ==> @JvmStatic public final fun <T> create(epName: ExtensionPointName<SuppressStringProvider>): ExtensionProvider<SuppressStringProvider> defined in org.jetbrains.kotlin.util.ExtensionProvider.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SuppressStringProvider

'EP_NAME' @ [58:104] ==> public final val EP_NAME: ExtensionPointName<SuppressStringProvider> defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressStringProvider.Companion[PropertyDescriptorImpl]

'ExtensionProvider' @ [59:42] ==> public companion object defined in org.jetbrains.kotlin.util.ExtensionProvider[FakeCallableDescriptorForObject]

'create' @ [59:60] ==> @JvmStatic public final fun <T> create(epName: ExtensionPointName<DiagnosticSuppressor>): ExtensionProvider<DiagnosticSuppressor> defined in org.jetbrains.kotlin.util.ExtensionProvider.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DiagnosticSuppressor

'EP_NAME' @ [59:88] ==> public final val EP_NAME: ExtensionPointName<DiagnosticSuppressor> defined in org.jetbrains.kotlin.resolve.diagnostics.DiagnosticSuppressor.Companion[PropertyDescriptorImpl]

'createConcurrentWeakValueMap' @ [62:46] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentWeakValueMap(): ConcurrentMap<(KtAnnotated..KtAnnotated?), (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtAnnotated
    <V : (Any..Any?)> -> Suppressor

'!' @ [64:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSuppressed' @ [64:72] ==> public final fun isSuppressed(diagnostic: Diagnostic): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'diagnostic' @ [64:85] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.filter.<anonymous>[ValueParameterDescriptorImpl]

'isSuppressed' @ [67:13] ==> private final fun isSuppressed(request: KotlinSuppressCache.SuppressRequest): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'StringSuppressRequest' @ [67:26] ==> public constructor StringSuppressRequest(element: PsiElement, severity: Severity, suppressKey: String) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.StringSuppressRequest[ClassConstructorDescriptorImpl]

'psiElement' @ [67:48] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'severity' @ [67:60] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'suppressionKey' @ [67:70] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'toLowerCase' @ [67:85] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isSuppressed' @ [69:57] ==> private final fun isSuppressed(request: KotlinSuppressCache.SuppressRequest): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'DiagnosticSuppressRequest' @ [69:70] ==> public constructor DiagnosticSuppressRequest(diagnostic: Diagnostic) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.DiagnosticSuppressRequest[ClassConstructorDescriptorImpl]

'diagnostic' @ [69:96] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'request' @ [74:23] ==> value-parameter request: KotlinSuppressCache.SuppressRequest defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'element' @ [74:31] ==> public abstract val element: PsiElement defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SuppressRequest[PropertyDescriptorImpl]

'!' @ [75:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [75:14] ==> val element: PsiElement defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'isValid' @ [75:22] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [77:20] ==> val element: PsiElement defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'containingFile' @ [77:28] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [78:13] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'file' @ [79:17] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'doNotAnalyze' @ [79:22] ==> public var KtFile.doNotAnalyze: String? defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[PropertyDescriptorImpl]

'request' @ [82:13] ==> value-parameter request: KotlinSuppressCache.SuppressRequest defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'DIAGNOSTIC_SUPPRESSORS' @ [83:32] ==> private final val DIAGNOSTIC_SUPPRESSORS: ExtensionProvider<DiagnosticSuppressor> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'get' @ [83:55] ==> public final fun get(): List<DiagnosticSuppressor> defined in org.jetbrains.kotlin.util.ExtensionProvider[SimpleFunctionDescriptorImpl]

'suppressor' @ [84:21] ==> val suppressor: DiagnosticSuppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'isSuppressed' @ [84:32] ==> public abstract fun isSuppressed(diagnostic: Diagnostic): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.DiagnosticSuppressor[SimpleFunctionDescriptorImpl]

'request' @ [84:45] ==> value-parameter request: KotlinSuppressCache.SuppressRequest defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'diagnostic' @ [84:53] ==> public final val diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.DiagnosticSuppressRequest[PropertyDescriptorImpl]

'?:' @ [88:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtAnnotated?, right: KtAnnotated): KtAnnotated[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtAnnotated

'getPsiOrStubParent' @ [88:42] ==> @Nullable public open fun <T : (KtElement..KtElement?)> getPsiOrStubParent(@NotNull element: PsiElement, @NotNull declarationClass: Class<(KtAnnotated..KtAnnotated?)>, strict: Boolean): KtAnnotated? defined in org.jetbrains.kotlin.psi.KtStubbedPsiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (KtElement..KtElement?)> -> (org.jetbrains.kotlin.psi.KtAnnotated..org.jetbrains.kotlin.psi.KtAnnotated?)

'element' @ [88:61] ==> val element: PsiElement defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'java' @ [88:89] ==> public val <T> KClass<KtAnnotated>.java: Class<KtAnnotated> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotated

'isSuppressedByAnnotated' @ [90:16] ==> protected final fun isSuppressedByAnnotated(suppressionKey: String, severity: Severity, annotated: KtAnnotated, debugDepth: Int): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'request' @ [90:40] ==> value-parameter request: KotlinSuppressCache.SuppressRequest defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'suppressKey' @ [90:48] ==> public abstract val suppressKey: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SuppressRequest[PropertyDescriptorImpl]

'request' @ [90:61] ==> value-parameter request: KotlinSuppressCache.SuppressRequest defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[ValueParameterDescriptorImpl]

'severity' @ [90:69] ==> public abstract val severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SuppressRequest[PropertyDescriptorImpl]

'annotated' @ [90:79] ==> val annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressed[LocalVariableDescriptor]

'LOG' @ [124:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'isDebugEnabled' @ [124:17] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'LOG' @ [125:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'debug' @ [125:17] ==> public open fun debug(@NotNull p0: String, @NotNull vararg p1: (Any..Any?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'annotated' @ [125:38] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'name' @ [125:48] ==> public final val KtAnnotated.name: String?[MyPropertyDescriptor]

'LOG' @ [126:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'debug' @ [126:17] ==> public open fun debug(@NotNull p0: String, @NotNull vararg p1: (Any..Any?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugDepth' @ [126:34] ==> value-parameter debugDepth: Int defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'LOG' @ [127:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'debug' @ [127:17] ==> public open fun debug(@NotNull p0: String, @NotNull vararg p1: (Any..Any?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'suppressors' @ [127:39] ==> private final val suppressors: ConcurrentMap<(KtAnnotated..KtAnnotated?), (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'size' @ [127:51] ==> public abstract val size: Int defined in java.util.concurrent.ConcurrentMap[DeserializedPropertyDescriptor]

'getOrCreateSuppressor' @ [130:26] ==> private final fun getOrCreateSuppressor(annotated: KtAnnotated): KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'annotated' @ [130:48] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'suppressor' @ [131:13] ==> val suppressor: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'isSuppressed' @ [131:24] ==> public abstract fun isSuppressed(suppressionKey: String, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Suppressor[SimpleFunctionDescriptorImpl]

'suppressionKey' @ [131:37] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'severity' @ [131:53] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'?:' @ [133:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtAnnotated?, right: KtAnnotated): KtAnnotated[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtAnnotated

'getPsiOrStubParent' @ [133:47] ==> @Nullable public open fun <T : (KtElement..KtElement?)> getPsiOrStubParent(@NotNull element: PsiElement, @NotNull declarationClass: Class<(KtAnnotated..KtAnnotated?)>, strict: Boolean): KtAnnotated? defined in org.jetbrains.kotlin.psi.KtStubbedPsiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (KtElement..KtElement?)> -> (org.jetbrains.kotlin.psi.KtAnnotated..org.jetbrains.kotlin.psi.KtAnnotated?)

'suppressor' @ [133:66] ==> val suppressor: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'annotatedElement' @ [133:77] ==> public final val annotatedElement: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Suppressor[PropertyDescriptorImpl]

'java' @ [133:114] ==> public val <T> KClass<KtAnnotated>.java: Class<KtAnnotated> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotated

'isSuppressedByAnnotated' @ [135:26] ==> protected final fun isSuppressedByAnnotated(suppressionKey: String, severity: Severity, annotated: KtAnnotated, debugDepth: Int): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'suppressionKey' @ [135:50] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'severity' @ [135:66] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'annotatedAbove' @ [135:76] ==> val annotatedAbove: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'debugDepth' @ [135:92] ==> value-parameter debugDepth: Int defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'suppressors' @ [136:31] ==> private final val suppressors: ConcurrentMap<(KtAnnotated..KtAnnotated?), (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'annotatedAbove' @ [136:43] ==> val annotatedAbove: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'suppressorAbove' @ [137:13] ==> val suppressorAbove: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'suppressorAbove' @ [137:40] ==> val suppressorAbove: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'dominates' @ [137:56] ==> public abstract fun dominates(other: KotlinSuppressCache.Suppressor): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Suppressor[SimpleFunctionDescriptorImpl]

'suppressor' @ [137:66] ==> val suppressor: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'suppressors' @ [138:13] ==> private final val suppressors: ConcurrentMap<(KtAnnotated..KtAnnotated?), (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'put' @ [138:25] ==> public abstract fun put(key: (KtAnnotated..KtAnnotated?), value: (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)): KotlinSuppressCache.Suppressor? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'annotated' @ [138:29] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[ValueParameterDescriptorImpl]

'suppressorAbove' @ [138:40] ==> val suppressorAbove: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'suppressed' @ [141:16] ==> val suppressed: Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.isSuppressedByAnnotated[LocalVariableDescriptor]

'suppressors' @ [145:39] ==> private final val suppressors: ConcurrentMap<(KtAnnotated..KtAnnotated?), (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'annotated' @ [145:51] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[ValueParameterDescriptorImpl]

'suppressor' @ [146:13] ==> var suppressor: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'getSuppressingStrings' @ [147:27] ==> private final fun getSuppressingStrings(annotated: KtAnnotated): Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'annotated' @ [147:49] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[ValueParameterDescriptorImpl]

'suppressor' @ [148:13] ==> var suppressor: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'when {
                strings.isEmpty() -> EmptySuppressor(annotated)
                strings.size == 1 -> SingularSuppressor(annotated, strings.iterator().next())
                else -> MultiSuppressor(annotated, strings)
            }' @ [148:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinSuppressCache.Suppressor?, entry1: KotlinSuppressCache.Suppressor?, entry2: KotlinSuppressCache.Suppressor?): KotlinSuppressCache.Suppressor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Suppressor?

'strings' @ [149:17] ==> val strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'isEmpty' @ [149:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'EmptySuppressor' @ [149:38] ==> public constructor EmptySuppressor(annotated: KtAnnotated) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.EmptySuppressor[ClassConstructorDescriptorImpl]

'annotated' @ [149:54] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[ValueParameterDescriptorImpl]

'strings' @ [150:17] ==> val strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'size' @ [150:25] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'SingularSuppressor' @ [150:38] ==> public constructor SingularSuppressor(annotated: KtAnnotated, string: String) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor[ClassConstructorDescriptorImpl]

'annotated' @ [150:57] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[ValueParameterDescriptorImpl]

'strings' @ [150:68] ==> val strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'iterator' @ [150:76] ==> public abstract fun iterator(): Iterator<String> defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'next' @ [150:87] ==> public abstract operator fun next(): String defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'MultiSuppressor' @ [151:25] ==> public constructor MultiSuppressor(annotated: KtAnnotated, strings: Set<String>) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor[ClassConstructorDescriptorImpl]

'annotated' @ [151:41] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[ValueParameterDescriptorImpl]

'strings' @ [151:52] ==> val strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'suppressors' @ [153:13] ==> private final val suppressors: ConcurrentMap<(KtAnnotated..KtAnnotated?), (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'put' @ [153:25] ==> public abstract fun put(key: (KtAnnotated..KtAnnotated?), value: (KotlinSuppressCache.Suppressor..KotlinSuppressCache.Suppressor?)): KotlinSuppressCache.Suppressor? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'annotated' @ [153:29] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[ValueParameterDescriptorImpl]

'suppressor' @ [153:40] ==> var suppressor: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'suppressor' @ [155:16] ==> var suppressor: KotlinSuppressCache.Suppressor? defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getOrCreateSuppressor[LocalVariableDescriptor]

'builder' @ [161:36] ==> public open fun <E : (Any..Any?)> builder(): (ImmutableSet.Builder<(String..String?)>..ImmutableSet.Builder<(String..String?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'getSuppressionAnnotations' @ [162:38] ==> public abstract fun getSuppressionAnnotations(annotated: KtAnnotated): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'annotated' @ [162:64] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getSuppressingStrings[ValueParameterDescriptorImpl]

'processAnnotation' @ [163:13] ==> private final fun processAnnotation(builder: ImmutableSet.Builder<String>, annotationDescriptor: AnnotationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[SimpleFunctionDescriptorImpl]

'builder' @ [163:31] ==> val builder: (ImmutableSet.Builder<(String..String?)>..ImmutableSet.Builder<(String..String?)>?) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getSuppressingStrings[LocalVariableDescriptor]

'annotationDescriptor' @ [163:40] ==> val annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getSuppressingStrings[LocalVariableDescriptor]

'builder' @ [166:16] ==> val builder: (ImmutableSet.Builder<(String..String?)>..ImmutableSet.Builder<(String..String?)>?) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.getSuppressingStrings[LocalVariableDescriptor]

'build' @ [166:24] ==> public open fun build(): (ImmutableSet<(String..String?)>..ImmutableSet<(String..String?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'ADDITIONAL_SUPPRESS_STRING_PROVIDERS' @ [170:40] ==> private final val ADDITIONAL_SUPPRESS_STRING_PROVIDERS: ExtensionProvider<SuppressStringProvider> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[PropertyDescriptorImpl]

'get' @ [170:77] ==> public final fun get(): List<SuppressStringProvider> defined in org.jetbrains.kotlin.util.ExtensionProvider[SimpleFunctionDescriptorImpl]

'builder' @ [171:13] ==> value-parameter builder: ImmutableSet.Builder<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[ValueParameterDescriptorImpl]

'addAll' @ [171:21] ==> @CanIgnoreReturnValue public open fun addAll(p0: (MutableIterable<(String..String?)>..Iterable<(String..String?)>?)): (ImmutableSet.Builder<(String..String?)>..ImmutableSet.Builder<(String..String?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'suppressStringProvider' @ [171:28] ==> val suppressStringProvider: SuppressStringProvider defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[LocalVariableDescriptor]

'annotationDescriptor' @ [171:51] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[ValueParameterDescriptorImpl]

'annotationDescriptor' @ [174:13] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[ValueParameterDescriptorImpl]

'fqName' @ [174:34] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'FQ_NAMES' @ [174:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'suppress' @ [174:68] ==> public final val suppress: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotationDescriptor' @ [177:28] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[ValueParameterDescriptorImpl]

'allValueArguments' @ [177:49] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'values' @ [177:67] ==> public abstract val values: Collection<ConstantValue<*>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'arrayValue' @ [178:18] ==> val arrayValue: ConstantValue<*> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[LocalVariableDescriptor]

'arrayValue' @ [179:31] ==> val arrayValue: ConstantValue<*> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[LocalVariableDescriptor]

'value' @ [179:42] ==> public open val value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[DeserializedPropertyDescriptor]

'value' @ [180:25] ==> val value: ConstantValue<*> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[LocalVariableDescriptor]

'builder' @ [181:25] ==> value-parameter builder: ImmutableSet.Builder<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[ValueParameterDescriptorImpl]

'add' @ [181:33] ==> @CanIgnoreReturnValue public open fun add(p0: (String..String?)): (ImmutableSet.Builder<(String..String?)>..ImmutableSet.Builder<(String..String?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'value' @ [181:37] ==> val value: ConstantValue<*> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.processAnnotation[LocalVariableDescriptor]

'value' @ [181:43] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[DeserializedPropertyDescriptor]

'toLowerCase' @ [181:49] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [190:20] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion.getDiagnosticSuppressKey[ValueParameterDescriptorImpl]

'factory' @ [190:31] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [190:39] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'toLowerCase' @ [190:44] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'strings' @ [194:17] ==> value-parameter strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion.isSuppressedByStrings[ValueParameterDescriptorImpl]

'contains' @ [194:25] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'severity' @ [194:49] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion.isSuppressedByStrings[ValueParameterDescriptorImpl]

'WARNING' @ [194:70] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'strings' @ [196:20] ==> value-parameter strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion.isSuppressedByStrings[ValueParameterDescriptorImpl]

'contains' @ [196:28] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'key' @ [196:37] ==> value-parameter key: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion.isSuppressedByStrings[ValueParameterDescriptorImpl]

'Suppressor' @ [208:61] ==> protected constructor Suppressor(annotatedElement: KtAnnotated) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Suppressor[ClassConstructorDescriptorImpl]

'annotated' @ [208:72] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.EmptySuppressor.<init>[ValueParameterDescriptorImpl]

'other' @ [211:62] ==> value-parameter other: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.EmptySuppressor.dominates[ValueParameterDescriptorImpl]

'Suppressor' @ [214:92] ==> protected constructor Suppressor(annotatedElement: KtAnnotated) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Suppressor[ClassConstructorDescriptorImpl]

'annotated' @ [214:103] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.<init>[ValueParameterDescriptorImpl]

'isSuppressed' @ [216:20] ==> public open fun isSuppressed(suppressionKey: String, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor[SimpleFunctionDescriptorImpl]

'getDiagnosticSuppressKey' @ [216:33] ==> public final fun getDiagnosticSuppressKey(diagnostic: Diagnostic): String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [216:58] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'diagnostic' @ [216:71] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'severity' @ [216:82] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'isSuppressedByStrings' @ [220:20] ==> public final fun isSuppressedByStrings(key: String, strings: Set<String>, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion[SimpleFunctionDescriptorImpl]

'suppressionKey' @ [220:42] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'of' @ [220:71] ==> public open fun <E : (Any..Any?)> of(p0: (String..String?)): (ImmutableSet<(String..String?)>..ImmutableSet<(String..String?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'string' @ [220:74] ==> private final val string: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor[PropertyDescriptorImpl]

'severity' @ [220:83] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'other' @ [224:20] ==> value-parameter other: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.dominates[ValueParameterDescriptorImpl]

'other' @ [224:49] ==> value-parameter other: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.dominates[ValueParameterDescriptorImpl]

'other' @ [224:80] ==> value-parameter other: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor.dominates[ValueParameterDescriptorImpl]

'string' @ [224:86] ==> private final val string: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor[PropertyDescriptorImpl]

'string' @ [224:96] ==> private final val string: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.SingularSuppressor[PropertyDescriptorImpl]

'Suppressor' @ [228:95] ==> protected constructor Suppressor(annotatedElement: KtAnnotated) defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Suppressor[ClassConstructorDescriptorImpl]

'annotated' @ [228:106] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor.<init>[ValueParameterDescriptorImpl]

'isSuppressed' @ [230:20] ==> public open fun isSuppressed(suppressionKey: String, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor[SimpleFunctionDescriptorImpl]

'getDiagnosticSuppressKey' @ [230:33] ==> public final fun getDiagnosticSuppressKey(diagnostic: Diagnostic): String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [230:58] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'diagnostic' @ [230:71] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'severity' @ [230:82] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'isSuppressedByStrings' @ [234:20] ==> public final fun isSuppressedByStrings(key: String, strings: Set<String>, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion[SimpleFunctionDescriptorImpl]

'suppressionKey' @ [234:42] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'strings' @ [234:58] ==> private final val strings: Set<String> defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor[PropertyDescriptorImpl]

'severity' @ [234:67] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor.isSuppressed[ValueParameterDescriptorImpl]

'other' @ [239:20] ==> value-parameter other: KotlinSuppressCache.Suppressor defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.MultiSuppressor.dominates[ValueParameterDescriptorImpl]

'diagnostic' @ [255:51] ==> public final val diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.DiagnosticSuppressRequest[PropertyDescriptorImpl]

'psiElement' @ [255:62] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagnostic' @ [256:49] ==> public final val diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.DiagnosticSuppressRequest[PropertyDescriptorImpl]

'severity' @ [256:60] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'getDiagnosticSuppressKey' @ [257:50] ==> public final fun getDiagnosticSuppressKey(diagnostic: Diagnostic): String defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [257:75] ==> public final val diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache.DiagnosticSuppressRequest[PropertyDescriptorImpl]

'KotlinSuppressCache' @ [261:66] ==> public constructor KotlinSuppressCache() defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[ClassConstructorDescriptorImpl]

'context' @ [263:26] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache[PropertyDescriptorImpl]

'get' @ [263:34] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [263:53] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotated' @ [263:80] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'if (descriptor != null) {
            descriptor.annotations.toList()
        }
        else {
            annotated.annotationEntries.mapNotNull { context.get(BindingContext.ANNOTATION, it) }
        }' @ [265:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<AnnotationDescriptor>, elseBranch: List<AnnotationDescriptor>): List<AnnotationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<AnnotationDescriptor>

'descriptor' @ [265:20] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache.getSuppressionAnnotations[LocalVariableDescriptor]

'descriptor' @ [266:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache.getSuppressionAnnotations[LocalVariableDescriptor]

'annotations' @ [266:24] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'toList' @ [266:36] ==> public fun <T> Iterable<AnnotationDescriptor>.toList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'annotated' @ [269:13] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'annotationEntries' @ [269:23] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'mapNotNull' @ [269:41] ==> public inline fun <T, R : Any> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.mapNotNull(transform: ((KtAnnotationEntry..KtAnnotationEntry?)) -> AnnotationDescriptor?): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <R : Any> -> AnnotationDescriptor

'context' @ [269:54] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache[PropertyDescriptorImpl]

'get' @ [269:62] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?), key: (KtAnnotationEntry..KtAnnotationEntry?)): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor..org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor?)

'ANNOTATION' @ [269:81] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [269:93] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.diagnostics.BindingContextSuppressCache.getSuppressionAnnotations.<anonymous>[ValueParameterDescriptorImpl]

