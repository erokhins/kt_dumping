'KotlinQuickFixAction<KtTypeReference>' @ [38:87] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeReference

'element' @ [38:125] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.<init>[ValueParameterDescriptorImpl]

'type' @ [40:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.<init>[ValueParameterDescriptorImpl]

'renderType' @ [40:46] ==> private final fun KotlinType.renderType(renderer: DescriptorRenderer): String defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix[SimpleFunctionDescriptorImpl]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [40:80] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'type' @ [41:40] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.<init>[ValueParameterDescriptorImpl]

'renderType' @ [41:45] ==> private final fun KotlinType.renderType(renderer: DescriptorRenderer): String defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix[SimpleFunctionDescriptorImpl]

'SOURCE_CODE' @ [41:79] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'targetTypeStringShort' @ [43:54] ==> private final val targetTypeStringShort: String defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix[PropertyDescriptorImpl]

'element' @ [47:23] ==> protected final val element: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix[PropertyDescriptorImpl]

'element' @ [48:24] ==> val element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.invoke[LocalVariableDescriptor]

'replaced' @ [48:32] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtTypeReference): KtTypeReference defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'KtPsiFactory' @ [48:41] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [48:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.invoke[ValueParameterDescriptorImpl]

'createType' @ [48:63] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'targetTypeStringLong' @ [48:74] ==> private final val targetTypeStringLong: String defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix[PropertyDescriptorImpl]

'ShortenReferences' @ [49:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [49:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [49:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'replaced' @ [49:43] ==> val replaced: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.invoke[LocalVariableDescriptor]

'buildString' @ [52:71] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [53:9] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'arguments' @ [54:9] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'dropLast' @ [54:19] ==> public fun <T> List<TypeProjection>.dropLast(n: Int): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'joinTo' @ [54:31] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<TypeProjection>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TypeProjection) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <A : Appendable /* = Appendable */> -> StringBuilder

'this@buildString' @ [54:38] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.renderType.<anonymous>[ReceiverParameterDescriptorImpl]

'renderer' @ [54:64] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.renderType[ValueParameterDescriptorImpl]

'renderType' @ [54:73] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [54:84] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.renderType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [54:87] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'append' @ [55:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [56:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderer' @ [56:16] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.renderType[ValueParameterDescriptorImpl]

'renderType' @ [56:25] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this@renderType' @ [56:36] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.renderType[ReceiverParameterDescriptorImpl]

'getReturnTypeFromFunctionType' @ [56:52] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'KotlinIntentionActionsFactory' @ [59:32] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'SUPERTYPE_IS_EXTENSION_FUNCTION_TYPE' @ [61:33] ==> public final val SUPERTYPE_IS_EXTENSION_FUNCTION_TYPE: (DiagnosticFactory0<(KtTypeReference..KtTypeReference?)>..DiagnosticFactory0<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [61:70] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [61:75] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[ValueParameterDescriptorImpl]

'casted' @ [62:27] ==> val casted: SimpleDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[LocalVariableDescriptor]

'psiElement' @ [62:34] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtTypeReference..KtTypeReference?)>.psiElement: KtTypeReference[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'element' @ [64:24] ==> val element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[LocalVariableDescriptor]

'analyze' @ [64:32] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [64:56] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'get' @ [64:65] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), p1: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [64:84] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [64:90] ==> val element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[LocalVariableDescriptor]

'emptyList' @ [64:109] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'!' @ [65:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [65:18] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[LocalVariableDescriptor]

'isExtensionFunctionType' @ [65:23] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'emptyList' @ [65:55] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'listOf' @ [67:20] ==> public fun <T> listOf(element: ConvertExtensionToFunctionTypeFix): List<ConvertExtensionToFunctionTypeFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConvertExtensionToFunctionTypeFix

'ConvertExtensionToFunctionTypeFix' @ [67:27] ==> public constructor ConvertExtensionToFunctionTypeFix(element: KtTypeReference, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix[ClassConstructorDescriptorImpl]

'element' @ [67:61] ==> val element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[LocalVariableDescriptor]

'type' @ [67:70] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionToFunctionTypeFix.Factory.doCreateActions[LocalVariableDescriptor]

