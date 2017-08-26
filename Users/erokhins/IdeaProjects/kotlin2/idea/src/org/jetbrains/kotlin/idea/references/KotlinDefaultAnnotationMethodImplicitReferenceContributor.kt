'AbstractKotlinReferenceContributor' @ [34:67] ==> public constructor AbstractKotlinReferenceContributor() defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor[DeserializedClassConstructorDescriptor]

'argument' @ [36:62] ==> private final val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[PropertyDescriptorImpl]

'getStrictParentOfType' @ [36:71] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'calleeExpression' @ [37:19] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [38:19] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'mainReference' @ [39:19] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [40:19] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'argument' @ [42:37] ==> private final val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[PropertyDescriptorImpl]

'EMPTY_RANGE' @ [44:54] ==> public final val EMPTY_RANGE: (TextRange..TextRange?) defined in com.intellij.openapi.util.TextRange[JavaPropertyDescriptor]

'resolveAnnotationCallee' @ [47:33] ==> private final fun resolveAnnotationCallee(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[SimpleFunctionDescriptorImpl]

'DEFAULT_REFERENCED_METHOD_NAME' @ [48:38] ==> @NonNls public const final val DEFAULT_REFERENCED_METHOD_NAME: String defined in com.intellij.psi.PsiAnnotation[JavaPropertyDescriptor]

'when (annotationPsi) {
                is PsiClass -> {
                    val signature = MethodSignatureUtil.createMethodSignature(
                            name, PsiType.EMPTY_ARRAY, PsiTypeParameter.EMPTY_ARRAY, PsiSubstitutor.EMPTY
                    )
                    MethodSignatureUtil.findMethodBySignature(annotationPsi, signature, false)
                }
                is KtPrimaryConstructor -> annotationPsi.containingClassOrObject?.findPropertyByName(name) as? KtParameter
                else -> null
            }' @ [49:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'annotationPsi' @ [49:26] ==> val annotationPsi: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.resolve[LocalVariableDescriptor]

'createMethodSignature' @ [51:57] ==> @NotNull public open fun createMethodSignature(@NonNls @NotNull p0: String, @NotNull p1: (Array<(PsiType..PsiType?)>..Array<out (PsiType..PsiType?)>), @NotNull p2: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>), @NotNull p3: PsiSubstitutor): MethodSignature defined in com.intellij.psi.util.MethodSignatureUtil[JavaMethodDescriptor]

'name' @ [52:29] ==> val name: String defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.resolve[LocalVariableDescriptor]

'EMPTY_ARRAY' @ [52:43] ==> public final val EMPTY_ARRAY: (Array<(PsiType..PsiType?)>..Array<out (PsiType..PsiType?)>?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'EMPTY_ARRAY' @ [52:73] ==> public final val EMPTY_ARRAY: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>?) defined in com.intellij.psi.PsiTypeParameter[JavaPropertyDescriptor]

'EMPTY' @ [52:101] ==> @NotNull public final val EMPTY: PsiSubstitutor defined in com.intellij.psi.PsiSubstitutor[JavaPropertyDescriptor]

'findMethodBySignature' @ [54:41] ==> @Nullable public open fun findMethodBySignature(@NotNull p0: PsiClass, @NotNull p1: MethodSignature, p2: Boolean): PsiMethod? defined in com.intellij.psi.util.MethodSignatureUtil[JavaMethodDescriptor]

'annotationPsi' @ [54:63] ==> val annotationPsi: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.resolve[LocalVariableDescriptor]

'signature' @ [54:78] ==> val signature: MethodSignature defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.resolve[LocalVariableDescriptor]

'annotationPsi' @ [56:44] ==> val annotationPsi: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.resolve[LocalVariableDescriptor]

'containingClassOrObject' @ [56:58] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'findPropertyByName' @ [56:83] ==> public fun KtClassOrObject.findPropertyByName(name: String): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'name' @ [56:102] ==> val name: String defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.resolve[LocalVariableDescriptor]

'DEFAULT_REFERENCED_METHOD_NAME' @ [61:57] ==> @NonNls public const final val DEFAULT_REFERENCED_METHOD_NAME: String defined in com.intellij.psi.PsiAnnotation[JavaPropertyDescriptor]

'KtPsiFactory' @ [64:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'argument' @ [64:43] ==> private final val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[PropertyDescriptorImpl]

'psiFactory' @ [65:31] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.handleElementRename[LocalVariableDescriptor]

'createArgument' @ [65:42] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argument' @ [66:21] ==> private final val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[PropertyDescriptorImpl]

'getArgumentExpression' @ [66:30] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'identifier' @ [67:26] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newElementName' @ [67:37] ==> value-parameter newElementName: String defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.handleElementRename[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [67:52] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'argument' @ [68:21] ==> private final val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[PropertyDescriptorImpl]

'getSpreadElement' @ [68:30] ==> public open fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [70:20] ==> private final val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[PropertyDescriptorImpl]

'replaced' @ [70:29] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'newArgument' @ [70:38] ==> val newArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.handleElementRename[LocalVariableDescriptor]

'IncorrectOperationException' @ [73:65] ==> public constructor IncorrectOperationException(@NonNls p0: (String..String?)) defined in com.intellij.util.IncorrectOperationException[JavaClassConstructorDescriptor]

'element' @ [76:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.isReferenceTo[ValueParameterDescriptorImpl]

'unwrapped' @ [76:37] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'unwrapped' @ [77:21] ==> val unwrapped: PsiElement? defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.isReferenceTo[LocalVariableDescriptor]

'unwrapped' @ [77:47] ==> val unwrapped: PsiElement? defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.isReferenceTo[LocalVariableDescriptor]

'unwrapped' @ [77:76] ==> val unwrapped: PsiElement? defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl.isReferenceTo[LocalVariableDescriptor]

'resolve' @ [77:89] ==> public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[SimpleFunctionDescriptorImpl]

'EMPTY_OBJECT_ARRAY' @ [80:48] ==> public final val EMPTY_OBJECT_ARRAY: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'registrar' @ [86:9] ==> value-parameter registrar: PsiReferenceRegistrar defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.registerReferenceProviders[ValueParameterDescriptorImpl]

'registerProvider' @ [86:19] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtValueArgument) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : KtElement> -> KtValueArgument

'it' @ [87:17] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.registerReferenceProviders.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [87:20] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'it' @ [88:35] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.registerReferenceProviders.<anonymous>[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [88:38] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtAnnotationEntry.() -> PsiElement?): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'valueArgumentList' @ [88:84] ==> public final val KtAnnotationEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'annotationEntry' @ [90:17] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.registerReferenceProviders.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [90:33] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'size' @ [90:48] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'ReferenceImpl' @ [92:13] ==> public constructor ReferenceImpl(argument: KtValueArgument) defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl[ClassConstructorDescriptorImpl]

'it' @ [92:27] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.references.KotlinDefaultAnnotationMethodImplicitReferenceContributor.registerReferenceProviders.<anonymous>[ValueParameterDescriptorImpl]

