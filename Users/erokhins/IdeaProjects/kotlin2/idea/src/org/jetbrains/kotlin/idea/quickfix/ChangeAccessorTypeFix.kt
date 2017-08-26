'KotlinQuickFixAction<KtPropertyAccessor>' @ [35:60] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtPropertyAccessor) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtPropertyAccessor

'element' @ [35:101] ==> value-parameter element: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.<init>[ValueParameterDescriptorImpl]

'element' @ [37:14] ==> protected final val element: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[PropertyDescriptorImpl]

'property' @ [37:24] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'resolveToDescriptorIfAny' @ [37:33] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'type' @ [37:85] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'takeUnless' @ [37:91] ==> @InlineOnly @SinceKotlin public inline fun <T> KotlinType.takeUnless(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'KotlinType' @ [37:102] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'isError' @ [37:114] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'super' @ [39:82] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [39:88] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [39:100] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [39:109] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [39:117] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.isAvailable[ValueParameterDescriptorImpl]

'getType' @ [39:126] ==> private final fun getType(): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[SimpleFunctionDescriptorImpl]

'element' @ [44:23] ==> protected final val element: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[PropertyDescriptorImpl]

'getType' @ [45:20] ==> private final fun getType(): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[SimpleFunctionDescriptorImpl]

'familyName' @ [45:40] ==> public final val ChangeAccessorTypeFix.familyName: String[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [46:28] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [46:51] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [46:84] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [46:95] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.getText[LocalVariableDescriptor]

'if (element.isGetter) "getter" else "setter parameter"' @ [47:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [47:26] ==> val element: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.getText[LocalVariableDescriptor]

'isGetter' @ [47:34] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'target' @ [48:25] ==> val target: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.getText[LocalVariableDescriptor]

'renderedType' @ [48:41] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.getText[LocalVariableDescriptor]

'element' @ [52:23] ==> protected final val element: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[PropertyDescriptorImpl]

'getType' @ [53:20] ==> private final fun getType(): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [54:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [54:45] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[ValueParameterDescriptorImpl]

'createType' @ [54:51] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE' @ [54:85] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [54:97] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [54:108] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'if (element.isGetter) element.returnTypeReference else element.parameter!!.typeReference' @ [56:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeReference?, elseBranch: KtTypeReference?): KtTypeReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeReference?

'element' @ [56:33] ==> val element: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'isGetter' @ [56:41] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'element' @ [56:51] ==> val element: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'returnTypeReference' @ [56:59] ==> public final val KtPropertyAccessor.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [56:84] ==> val element: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'parameter' @ [56:92] ==> public final val KtPropertyAccessor.parameter: KtParameter?[MyPropertyDescriptor]

'typeReference' @ [56:104] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [58:31] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'replaced' @ [58:47] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtTypeReference): KtTypeReference defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'newTypeReference' @ [58:56] ==> val newTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [59:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [59:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [59:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'insertedTypeRef' @ [59:43] ==> val insertedTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [62:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [64:20] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [64:31] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [64:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtPropertyAccessor? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPropertyAccessor

'let' @ [64:90] ==> @InlineOnly public inline fun <T, R> KtPropertyAccessor.let(block: (KtPropertyAccessor) -> ChangeAccessorTypeFix): ChangeAccessorTypeFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyAccessor
    <R> -> ChangeAccessorTypeFix

'ChangeAccessorTypeFix' @ [64:96] ==> public constructor ChangeAccessorTypeFix(element: KtPropertyAccessor) defined in org.jetbrains.kotlin.idea.quickfix.ChangeAccessorTypeFix[ClassConstructorDescriptorImpl]

