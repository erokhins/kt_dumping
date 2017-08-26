'KotlinQuickFixAction<KtTypeReference>' @ [32:79] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeReference

'element' @ [32:117] ==> value-parameter element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.<init>[ValueParameterDescriptorImpl]

'element' @ [36:31] ==> protected final val element: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix[PropertyDescriptorImpl]

'text' @ [36:40] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'currentTypeText' @ [37:36] ==> val currentTypeText: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.getText[LocalVariableDescriptor]

'renderTypeWithFqNameOnClash' @ [37:72] ==> public open fun renderTypeWithFqNameOnClash(p0: (KotlinType..KotlinType?), p1: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'type' @ [37:100] ==> private final val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix[PropertyDescriptorImpl]

'currentTypeText' @ [37:106] ==> val currentTypeText: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.getText[LocalVariableDescriptor]

'element' @ [41:23] ==> protected final val element: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix[PropertyDescriptorImpl]

'element' @ [42:26] ==> val element: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.invoke[LocalVariableDescriptor]

'replaced' @ [42:34] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtTypeReference): KtTypeReference defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'KtPsiFactory' @ [42:43] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [42:56] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.invoke[ValueParameterDescriptorImpl]

'createType' @ [42:62] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE' @ [42:96] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [42:108] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [42:119] ==> private final val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix[PropertyDescriptorImpl]

'ShortenReferences' @ [43:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [43:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [43:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newTypeRef' @ [43:43] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactoryWithDelegate<KtTypeReference, KotlinType>' @ [46:24] ==> public constructor KotlinSingleIntentionActionFactoryWithDelegate<E : KtElement, D : Any>(actionPriority: IntentionActionPriority = ...) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtTypeReference
    <D : Any> -> KotlinType

'EXPECTED_PARAMETER_TYPE_MISMATCH' @ [48:24] ==> public final val EXPECTED_PARAMETER_TYPE_MISMATCH: (DiagnosticFactory1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [48:57] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [48:62] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.Companion.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [48:74] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>.psiElement: KtParameter[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typeReference' @ [48:85] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'EXPECTED_PARAMETER_TYPE_MISMATCH' @ [51:24] ==> public final val EXPECTED_PARAMETER_TYPE_MISMATCH: (DiagnosticFactory1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [51:57] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [51:62] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'a' @ [51:74] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>.a: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'ChangeTypeFix' @ [54:17] ==> public constructor ChangeTypeFix(element: KtTypeReference, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix[ClassConstructorDescriptorImpl]

'originalElement' @ [54:31] ==> value-parameter originalElement: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.Companion.createFix[ValueParameterDescriptorImpl]

'data' @ [54:48] ==> value-parameter data: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeTypeFix.Companion.createFix[ValueParameterDescriptorImpl]

