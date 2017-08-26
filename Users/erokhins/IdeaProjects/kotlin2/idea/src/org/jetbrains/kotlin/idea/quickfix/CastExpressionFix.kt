'KotlinQuickFixAction<KtExpression>' @ [37:68] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [37:103] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [38:34] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [38:57] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [38:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [38:80] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [39:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [39:59] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [39:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [39:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'run' @ [40:41] ==> @InlineOnly public inline fun <T, R> CastExpressionFix.run(block: CastExpressionFix.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CastExpressionFix
    <R> -> Boolean

'element' @ [41:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'analyze' @ [41:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [41:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [41:71] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'element' @ [41:79] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'expressionType' @ [42:9] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.upOrDownCast.<anonymous>[LocalVariableDescriptor]

'type' @ [42:36] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'isSubtypeOf' @ [42:41] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [42:53] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.upOrDownCast.<anonymous>[LocalVariableDescriptor]

'expressionType' @ [42:72] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.upOrDownCast.<anonymous>[LocalVariableDescriptor]

'isSubtypeOf' @ [42:87] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [42:99] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'expressionType' @ [43:12] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.upOrDownCast.<anonymous>[LocalVariableDescriptor]

'type' @ [43:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.<init>[ValueParameterDescriptorImpl]

'makeNullable' @ [43:35] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [47:30] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[PropertyDescriptorImpl]

'let' @ [47:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> String

'it' @ [47:65] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [47:68] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'typePresentation' @ [47:80] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[PropertyDescriptorImpl]

'upOrDownCast' @ [50:15] ==> private final val upOrDownCast: Boolean defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[PropertyDescriptorImpl]

'super' @ [50:31] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [50:37] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [50:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [50:58] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [50:66] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [53:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [54:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [54:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [54:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [54:91] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[LocalVariableDescriptor]

'typeSourceCode' @ [54:100] ==> private final val typeSourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[PropertyDescriptorImpl]

'element' @ [55:29] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[LocalVariableDescriptor]

'replaced' @ [55:37] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expressionToInsert' @ [55:46] ==> val expressionToInsert: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [56:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [56:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [56:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'!!' @ [56:43] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtTypeReference?): KtTypeReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtTypeReference

'safeDeparenthesize' @ [56:54] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'newExpression' @ [56:73] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[LocalVariableDescriptor]

'right' @ [56:122] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'editor' @ [57:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [57:17] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [57:29] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newExpression' @ [57:42] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.invoke[LocalVariableDescriptor]

'endOffset' @ [57:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'KotlinSingleIntentionActionFactoryWithDelegate<KtExpression, KotlinType>' @ [60:30] ==> public constructor KotlinSingleIntentionActionFactoryWithDelegate<E : KtElement, D : Any>(actionPriority: IntentionActionPriority = ...) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtExpression
    <D : Any> -> KotlinType

'diagnostic' @ [61:69] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.Factory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [61:80] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'CastExpressionFix' @ [62:83] ==> public constructor CastExpressionFix(element: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[ClassConstructorDescriptorImpl]

'originalElement' @ [62:101] ==> value-parameter originalElement: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.Factory.createFix[ValueParameterDescriptorImpl]

'data' @ [62:118] ==> value-parameter data: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.Factory.createFix[ValueParameterDescriptorImpl]

'Factory' @ [65:40] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.Factory[ClassConstructorDescriptorImpl]

'SMARTCAST_IMPOSSIBLE' @ [66:93] ==> public final val SMARTCAST_IMPOSSIBLE: (DiagnosticFactory3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>..DiagnosticFactory3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [66:114] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'diagnostic' @ [66:119] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.SmartCastImpossibleFactory.extractFixData[ValueParameterDescriptorImpl]

'a' @ [66:131] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>.a: (KotlinType..KotlinType?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <C : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'Factory' @ [69:40] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.Factory[ClassConstructorDescriptorImpl]

'JAVA_TYPE_MISMATCH' @ [71:30] ==> public final val JAVA_TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'cast' @ [71:49] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [71:54] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix.GenericVarianceConversion.extractFixData[ValueParameterDescriptorImpl]

'b' @ [71:66] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.b: (KotlinType..KotlinType?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'asFlexibleType' @ [71:68] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [71:85] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

